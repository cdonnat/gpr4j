grammar Gpr;

@header {
package org.gpr4j.internal.grammar;

import java.util.ArrayList;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.model.Term;
import org.gpr4j.internal.utilities.StringUtilities;
}

@lexer::header {

package org.gpr4j.internal.grammar;
}

@lexer::members {
  private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();
 
    public List<RecognitionException> getExceptions() {
        return exceptions;
    }
 
    @Override
    public void reportError(RecognitionException e) {
        exceptions.add(e);
    }
} 

@parser::members {
 private Loader gprLoader = new Loader();
  private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();
 
    public List<RecognitionException> getExceptions() {
        return exceptions;
    }
 
    @Override
    public void reportError(RecognitionException e) {
        exceptions.add(e);
    }
 
 public GprParser(Loader gprLoader, TokenStream input) {
        this(input, new RecognizerSharedState());
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
    first_path=path_name {gprLoader.addProject($first_path.result);}
    (',' other_path=path_name {gprLoader.addProject($other_path.result);})*  
    ';';

path_name returns [String result] 
  : 
  STRING_LITERAL
  {result = $STRING_LITERAL.text.replaceAll("\"", "");}
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
  ';'
  {$begin_project_name.text.equals($end_project_name.text)}?
  ;

name returns [String result]
  :
  first = simple_name {$result = $first.text;} 
  ('.' other = simple_name {$result += "." + $other.text;})*
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
  simple_name {ArrayList<String> values = new ArrayList<String>();}
  IS 
  '(' 
  first = STRING_LITERAL { values.add(StringUtilities.RemoveQuotes($first.text)); } 
  (',' other = STRING_LITERAL {values.add(StringUtilities.RemoveQuotes($other.text));})* 
  ')'
  {gprLoader.addType ($simple_name.text, values); } 
  ';'
  ;

case_statement 
  :
  CASE name IS (case_item)* END CASE ';'
  ;

case_item
  :
  WHEN discrete_choice_list '=>'
  (case_statement
  | attribute_declaration
  | variable_declaration
  | empty_declaration)+
  ;
  
discrete_choice_list
  :
  STRING_LITERAL ( '|' STRING_LITERAL)* 
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
  END end_package_name = simple_name ';' {gprLoader.endPackage();}
  {$begin_pkg_name.text.equals($end_package_name.text)}?
  ;
   
package_renaming
  :
  PACKAGE newPackageName = simple_name 
  RENAMES 
  projectName = simple_name '.' renamedPackage = simple_name ';'
  {gprLoader.addPackageFrom($newPackageName.text, $projectName.text, $renamedPackage.text);} 
  ;
     
package_extension
  :
  PACKAGE begin_package_name = simple_name 
  EXTENDS 
  projectName = simple_name '.' extendedPackage = simple_name IS
  (simple_declarative_item)*
  END end_package_name = simple_name ';'
  {$begin_package_name.text.equals($end_package_name.text)}?
  {gprLoader.addPackageFrom($begin_package_name.text, $projectName.text, $extendedPackage.text);} 
  ;

typed_variable_declaration 
  :
  simple_name 
  ':' 
   name { gprLoader.setCurrentType($name.text); }
   ':='
   string_expression
   ';'
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
 ';'
 {gprLoader.addAttribute($attribute_designator.result, $expression.result);}
 ;
 
attribute_designator returns [String result]
  :
  att = simple_name {$result = $att.text;}
  | att = simple_name ( '(' STRING_LITERAL ')' ) {$result = $att.text + "(" + $STRING_LITERAL.text + ")";}
  ; 
 
 attribute_reference returns [Term result]
  :
  attribute_prefix '\'' simple_name 
    { String attributeName;
      if ($attribute_prefix.result.isEmpty()) { 
         attributeName = $simple_name.text;
      }
      else {
        attributeName = $attribute_prefix.result + "\'" + $simple_name.text;
      } 
    }
    ('(' STRING_LITERAL ')' { attributeName += "(" + $STRING_LITERAL.text + ")";})? 

   { result = gprLoader.getAttribute(attributeName).getValue(); }
  ;
 
 attribute_prefix returns [String result]
  :
  PROJECT  { result = ""; } 
  | project_name = simple_name  { result = $project_name.text; }
    ('.' package_name = simple_name {result += "." + $package_name.text;})? 
  ;
 
external_value returns [Term result] 
  : 
  EXTERNAL
  '(' 
  external_name = STRING_LITERAL
  (',' defaultValue = STRING_LITERAL)? 
  ')'
   {gprLoader.addExternalVariable(StringUtilities.RemoveQuotes($external_name.text), $defaultValue.text);}
   { $result = gprLoader.getExternalVariable(StringUtilities.RemoveQuotes($external_name.text)).getValue();}
  ; 

variable_declaration 
  :
  simple_name 
  ':='
  expression
  ';'
  {gprLoader.addVariable ($simple_name.text, $expression.result);}
  ;

expression returns [Term result]
  :
  first = term {result = $first.result;}
  ( '&' other = term {result = Term.Concat(result, $other.result);} )* 
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
  STRING_LITERAL {result = Term.CreateString($STRING_LITERAL.text);}
  | name {result = gprLoader.getVariable($name.result).getValue();}
  | external_value {result = $external_value.result;}
  | attribute_reference {result = $attribute_reference.result;}
  ;

string_list returns [Term result] // TODO : complete rule 
  :
  '(' {result = Term.CreateStringList(new ArrayList<String>());}
  first = expression? {if (first != null) {result = Term.Concat (result, $first.result);}} 
  ( ',' other = expression {result = Term.Concat(result, $other.result);}  )* 
  ')'
  ;

empty_declaration
  :
  NULL ';'
  ;
  
COMMENT
  :
  '--'
  ~(
    '\n'
    | '\r'
    | '\f'
   )*
  { $channel = HIDDEN; };
  
STRING_LITERAL  
  : 
  '"' 
  (STRING_ELEMENT)* 
  '"';
  
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
  |'\f' )+ { $channel = HIDDEN; };
  
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