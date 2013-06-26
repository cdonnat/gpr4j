grammar Gpr;

@parser::header {
import java.util.HashSet;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.model.Term;
import org.gpr4j.internal.utilities.StringUtilities;
}

@parser::members {
 private Loader gprLoader = new Loader();

 public GprParser(Loader gprLoader, CommonTokenStream input) {
        this(input);
        this.gprLoader = gprLoader;
    }
}
  
project
  :  
  context_clause project_declaration EOF
  ;

context_clause : with_clause*;

with_clause 
  : WITH 
    first_path=path_name
    (COMMA other_path=path_name)*  
    SEMI_COLON;

path_name returns [String result] 
  : 
  STRING_LITERAL
  ;

project_declaration : simple_project_declaration;

simple_project_declaration 
  : 
  PROJECT 
  begin_project_name=name 
  IS
  declarative_item*
  END
  end_project_name=name
  SEMI_COLON
  {$begin_project_name.text.equals($end_project_name.text)}?
  ;

name returns [String result]
  :
  first = simple_name
  (DOT other = simple_name)*
  ;
  
simple_name
  :
  IDENTIFIER
  ;

declarative_item 
  :
  simple_declarative_item 
  | typed_string_declaration
  | package_declaration
  ;
  
simple_declarative_item
  :
  variable_declaration
  | typed_variable_declaration
  | attribute_declaration
  | case_statement
  | empty_declaration
  ;

typed_string_declaration 
  :
  TYPE 
  simple_name
  IS 
  LPAR 
  first = STRING_LITERAL
  (COMMA other = STRING_LITERAL)* 
  RPAR
  SEMI_COLON
  ;

case_statement 
  :
  CASE name
  IS 
  (case_item)* 
  END CASE SEMI_COLON
  ;

case_item
  :
  WHEN discrete_choice_list RARROW
  (case_statement
  | attribute_declaration
  | variable_declaration
  | empty_declaration)+
  ;
  
discrete_choice_list
  :
  first=STRING_LITERAL 
  ( PIPE other=STRING_LITERAL )*
  | OTHERS
   ;

package_declaration 
  :
  package_spec
  | package_renaming
  | package_extension
  ;
  
package_spec
  :
  PACKAGE begin_pkg_name = simple_name {gprLoader.beginPackage($begin_pkg_name.text);}
  IS 
  (simple_declarative_item)* 
  END end_package_name = simple_name SEMI_COLON {gprLoader.endPackage();}
  {$begin_pkg_name.text.equals($end_package_name.text)}?
  ;
   
package_renaming
  :
  PACKAGE newPackageName = simple_name 
  RENAMES 
  projectName = simple_name DOT renamedPackage = simple_name SEMI_COLON
  {gprLoader.addPackageFrom($newPackageName.text, $projectName.text, $renamedPackage.text);} 
  ;
     
package_extension
  :
  PACKAGE begin_package_name = simple_name 
  EXTENDS 
  projectName = simple_name DOT extendedPackage = simple_name IS
  (simple_declarative_item)*
  END end_package_name = simple_name SEMI_COLON
  {$begin_package_name.text.equals($end_package_name.text)}?
  {gprLoader.addPackageFrom($begin_package_name.text, $projectName.text, $extendedPackage.text);} 
  ;

typed_variable_declaration 
  :
  simple_name 
  COLON 
   name { gprLoader.setCurrentType($name.text); }
   AFFECTATION_SIGN   
   string_expression
   SEMI_COLON
   {!gprLoader.variableIsDefined($simple_name.text)}?
   {gprLoader.addVariable ($simple_name.text, $string_expression.result);}
   {gprLoader.setCurrentType (null);}
   ;
   
attribute_declaration
 :
 FOR 
 attribute_designator 
 USE
 expression 
 SEMI_COLON 
 {gprLoader.addAttribute($attribute_designator.result, $expression.result);}
 ;
 
attribute_designator returns [String result]
  :
  att = simple_name {$result = $att.text;}
  | att = simple_name ( LPAR STRING_LITERAL RPAR ) {$result = $att.text + "(" + $STRING_LITERAL.text + ")";}
  ; 
 
 attribute_reference returns [Term result]
  :
  attribute_prefix APOSTROPHE simple_name 
    { String attributeName;
      if ($attribute_prefix.result.isEmpty()) { 
         attributeName = $simple_name.text;
      }
      else {
        attributeName = $attribute_prefix.result + "\'" + $simple_name.text;
      } 
    }
    (LPAR STRING_LITERAL RPAR { attributeName += "(" + $STRING_LITERAL.text + ")";})? 

   { $result = gprLoader.getAttribute(attributeName).getValue(); }
  ;
 
 attribute_prefix returns [String result]
  :
  PROJECT  { $result = ""; } 
  | project_name = simple_name  { $result = $project_name.text; }
    (DOT package_name = simple_name {$result += "." + $package_name.text;})? 
  ;
 
external_value returns [Term result] 
  : 
  EXTERNAL
  LPAR 
  external_name = STRING_LITERAL
  (COMMA defaultValue = STRING_LITERAL)? 
  RPAR
   {gprLoader.addExternalVariable(StringUtilities.RemoveQuotes($external_name.text), StringUtilities.RemoveQuotes($defaultValue.text));}
   { $result = gprLoader.getExternalVariable(StringUtilities.RemoveQuotes($external_name.text)).getValue();}
  ; 

variable_declaration 
  :
  simple_name 
  AFFECTATION_SIGN
  expression
  SEMI_COLON
  {gprLoader.addVariable ($simple_name.text, $expression.result);}
  ;

expression returns [Term result]
  :
  first = term {$result = $first.result;}
  ( AMPERSAND other = term {$result = Term.Concat($result, $other.result);} )* 
  ;

term returns [Term result]
  : 
  string_expression 
    {$result = $string_expression.result;}
  | string_list 
    {$result = $string_list.result;}
  ;
  
string_expression returns [Term result] // TODO : complete rule
  :
  STRING_LITERAL {$result = Term.CreateString($STRING_LITERAL.text);}
  | name {$result = gprLoader.getVariable($name.result).getValue();}
  | external_value {$result = $external_value.result;}
  | attribute_reference {$result = $attribute_reference.result;}
  ;

string_list returns [Term result] // TODO : complete rule 
  :
  LPAR {$result = Term.CreateStringList(new ArrayList<String>());}
  first=expression? {if ($first.text != null) {$result = Term.Concat ($result, $first.result);}} 
  ( COMMA other = expression {$result = Term.Concat($result, $other.result);}  )* 
  RPAR
  ;

empty_declaration
  :
  NULL SEMI_COLON
  ;
  
COMMENT
  :
  '--'
  ~(
    '\n'
    | '\r'
    | '\f'
   )*
  -> channel(HIDDEN);
  
STRING_LITERAL  
  : 
  '"' 
  (STRING_ELEMENT)* 
  '"';
  
COMMA: ',';
SEMI_COLON: ';';
DOT: '.';
LPAR: '(';
RPAR: ')';
RARROW: '=>';
PIPE: '|';
COLON: ':';
AFFECTATION_SIGN: ':=';
AMPERSAND: '&';
APOSTROPHE: '\'';

ALL     : A L L;
AT      : A T;
CASE    : C A S E;
END     : E N D;
FOR     : F O R;
IS      : I S;
LIMITED : L I M I T E D;
NULL    : N U L L;
OTHERS  : O T H E R S;
PACKAGE : P A C K A G E;
PROJECT : P R O J E C T;
RENAMES : R E N A M E S;
TYPE    : T Y P E;
USE     : U S E;
WHEN    : W H E N;
WITH    : W I T H;
EXTENDS : E X T E N D S;
EXTERNAL: E X T E R N A L;

IDENTIFIER : (UPPER_CASE_LETTER | LOWER_CASE_LETTER) 
              (('_')? (UPPER_CASE_LETTER | LOWER_CASE_LETTER | DIGIT))*;
                                 
fragment UPPER_CASE_LETTER : 'A'..'Z';
fragment LOWER_CASE_LETTER : 'a'..'z';
fragment DIGIT : '0'..'9' ;
fragment STRING_ELEMENT 
  :
  (
    '"' '"' 
    | ~( '"' | '\n' | '\r')
  )
  ;
WS  : 
  (' '
  |'\t'
  |'\r'
  |'\b'
  |'\n' 
  |'\f' )+ -> channel(HIDDEN);
  
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');