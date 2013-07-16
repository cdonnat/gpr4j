grammar Gpr;

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

path_name
  : 
  STRING_LITERAL
  ;

//TODO add project_extension 
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
  ;

name
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
  | empty_declaration)*
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
  PACKAGE begin_package_name = simple_name
  IS 
  (simple_declarative_item)* 
  END end_package_name = simple_name SEMI_COLON
  ;
   
package_renaming
  :
  PACKAGE newPackageName = simple_name 
  RENAMES 
  projectName = simple_name DOT renamedPackage = simple_name SEMI_COLON
  ;
     
package_extension
  :
  PACKAGE begin_package_name = simple_name 
  EXTENDS 
  projectName = simple_name DOT extendedPackage = simple_name IS
  (simple_declarative_item)*
  END end_package_name = simple_name SEMI_COLON
  ;

typed_variable_declaration 
  :
  simple_name 
  COLON 
   name
   AFFECTATION_SIGN   
   string_expression
   SEMI_COLON
   ;
   
attribute_declaration
 :
 FOR 
 attribute_designator 
 USE
 expression 
 SEMI_COLON 
 ;
 
attribute_designator
  :
  att = simple_name
  | att = simple_name ( LPAR STRING_LITERAL RPAR )
  ; 
 
 attribute_reference
  :
  attribute_prefix APOSTROPHE simple_name 
    (LPAR STRING_LITERAL RPAR)? 
  ;
 
 attribute_prefix
  :
  PROJECT
  | project_name = simple_name
    (DOT package_name = simple_name)? 
  ;
 
external_value
  : 
  EXTERNAL
  LPAR 
  external_name = STRING_LITERAL
  (COMMA defaultValue = STRING_LITERAL)? 
  RPAR
  ; 

variable_declaration 
  :
  simple_name 
  AFFECTATION_SIGN
  expression
  SEMI_COLON
  ;

expression
  :
  first = term
  ( AMPERSAND other = term )* 
  ;

term
  : 
  string_expression 
  | string_list 
  ;
  
string_expression // TODO : complete rule
  :
  STRING_LITERAL #stringExpressionLiteral
  | name #stringExpressionVariableName
  | external_value #stringExpressionExternalValue
  | attribute_reference #stringExpressionAttributeReference
  ;

string_list // TODO : complete rule 
  :
  LPAR
  first=expression?
  ( COMMA other = expression)* 
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