// $ANTLR 3.4 /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g 2013-03-21 21:43:33

package org.gpr4j.grammar;

import java.util.ArrayList;
import org.gpr4j.api.GprLoader;
import org.gpr4j.api.Symbol;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALL", "AT", "B", "C", "CASE", "COMMENT", "D", "DIGIT", "E", "END", "EXTENDS", "EXTERNAL", "F", "FOR", "G", "H", "I", "IDENTIFIER", "IS", "J", "K", "L", "LIMITED", "LOWER_CASE_LETTER", "M", "N", "NULL", "O", "OTHERS", "P", "PACKAGE", "PROJECT", "Q", "R", "RENAMES", "S", "STRING_ELEMENT", "STRING_LITERAL", "T", "TYPE", "U", "UPPER_CASE_LETTER", "USE", "V", "W", "WHEN", "WITH", "WS", "X", "Y", "Z", "'&'", "'('", "')'", "','", "'.'", "':'", "':='", "';'", "'=>'", "'\\''", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int A=4;
    public static final int ALL=5;
    public static final int AT=6;
    public static final int B=7;
    public static final int C=8;
    public static final int CASE=9;
    public static final int COMMENT=10;
    public static final int D=11;
    public static final int DIGIT=12;
    public static final int E=13;
    public static final int END=14;
    public static final int EXTENDS=15;
    public static final int EXTERNAL=16;
    public static final int F=17;
    public static final int FOR=18;
    public static final int G=19;
    public static final int H=20;
    public static final int I=21;
    public static final int IDENTIFIER=22;
    public static final int IS=23;
    public static final int J=24;
    public static final int K=25;
    public static final int L=26;
    public static final int LIMITED=27;
    public static final int LOWER_CASE_LETTER=28;
    public static final int M=29;
    public static final int N=30;
    public static final int NULL=31;
    public static final int O=32;
    public static final int OTHERS=33;
    public static final int P=34;
    public static final int PACKAGE=35;
    public static final int PROJECT=36;
    public static final int Q=37;
    public static final int R=38;
    public static final int RENAMES=39;
    public static final int S=40;
    public static final int STRING_ELEMENT=41;
    public static final int STRING_LITERAL=42;
    public static final int T=43;
    public static final int TYPE=44;
    public static final int U=45;
    public static final int UPPER_CASE_LETTER=46;
    public static final int USE=47;
    public static final int V=48;
    public static final int W=49;
    public static final int WHEN=50;
    public static final int WITH=51;
    public static final int WS=52;
    public static final int X=53;
    public static final int Y=54;
    public static final int Z=55;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public GprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return GprParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g"; }


     private GprLoader gprLoader = new GprLoader();
      private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();
     
        public List<RecognitionException> getExceptions() {
            return exceptions;
        }
     
        @Override
        public void reportError(RecognitionException e) {
            exceptions.add(e);
        }
     
     public GprParser(GprLoader gprLoader, TokenStream input) {
            this(input, new RecognizerSharedState());
            this.gprLoader = gprLoader;
        }



    // $ANTLR start "project"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:48:1: project : context_clause project_declaration EOF ;
    public final void project() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:49:3: ( context_clause project_declaration EOF )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:50:3: context_clause project_declaration EOF
            {
            pushFollow(FOLLOW_context_clause_in_project52);
            context_clause();

            state._fsp--;


            pushFollow(FOLLOW_project_declaration_in_project54);
            project_declaration();

            state._fsp--;


            match(input,EOF,FOLLOW_EOF_in_project56); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "project"



    // $ANTLR start "context_clause"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:53:1: context_clause : ( with_clause )* ;
    public final void context_clause() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:53:16: ( ( with_clause )* )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:53:18: ( with_clause )*
            {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:53:18: ( with_clause )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WITH) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:53:18: with_clause
            	    {
            	    pushFollow(FOLLOW_with_clause_in_context_clause67);
            	    with_clause();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "context_clause"



    // $ANTLR start "with_clause"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:55:1: with_clause : WITH first_path= path_name ( ',' other_path= path_name )* ';' ;
    public final void with_clause() throws RecognitionException {
        String first_path =null;

        String other_path =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:56:3: ( WITH first_path= path_name ( ',' other_path= path_name )* ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:56:5: WITH first_path= path_name ( ',' other_path= path_name )* ';'
            {
            match(input,WITH,FOLLOW_WITH_in_with_clause79); 

            pushFollow(FOLLOW_path_name_in_with_clause88);
            first_path=path_name();

            state._fsp--;


            gprLoader.addProject(first_path);

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:58:5: ( ',' other_path= path_name )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==59) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:58:6: ',' other_path= path_name
            	    {
            	    match(input,59,FOLLOW_59_in_with_clause97); 

            	    pushFollow(FOLLOW_path_name_in_with_clause101);
            	    other_path=path_name();

            	    state._fsp--;


            	    gprLoader.addProject(other_path);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,63,FOLLOW_63_in_with_clause113); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "with_clause"



    // $ANTLR start "path_name"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:61:1: path_name returns [String result] : STRING_LITERAL ;
    public final String path_name() throws RecognitionException {
        String result = null;


        Token STRING_LITERAL1=null;

        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:62:3: ( STRING_LITERAL )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:63:3: STRING_LITERAL
            {
            STRING_LITERAL1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_path_name131); 

            result = (STRING_LITERAL1!=null?STRING_LITERAL1.getText():null).replaceAll("\"", "");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "path_name"



    // $ANTLR start "project_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:67:1: project_declaration : simple_project_declaration ;
    public final void project_declaration() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:67:21: ( simple_project_declaration )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:67:23: simple_project_declaration
            {
            pushFollow(FOLLOW_simple_project_declaration_in_project_declaration146);
            simple_project_declaration();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "project_declaration"



    // $ANTLR start "simple_project_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:69:1: simple_project_declaration : PROJECT begin_project_name= name IS ( declarative_item )* END end_project_name= name ';' {...}?;
    public final void simple_project_declaration() throws RecognitionException {
        GprParser.name_return begin_project_name =null;

        GprParser.name_return end_project_name =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:70:3: ( PROJECT begin_project_name= name IS ( declarative_item )* END end_project_name= name ';' {...}?)
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:71:3: PROJECT begin_project_name= name IS ( declarative_item )* END end_project_name= name ';' {...}?
            {
            match(input,PROJECT,FOLLOW_PROJECT_in_simple_project_declaration160); 

            pushFollow(FOLLOW_name_in_simple_project_declaration167);
            begin_project_name=name();

            state._fsp--;


            match(input,IS,FOLLOW_IS_in_simple_project_declaration172); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:74:3: ( declarative_item )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CASE||LA3_0==FOR||LA3_0==IDENTIFIER||LA3_0==NULL||LA3_0==PACKAGE||LA3_0==TYPE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:74:3: declarative_item
            	    {
            	    pushFollow(FOLLOW_declarative_item_in_simple_project_declaration176);
            	    declarative_item();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_simple_project_declaration181); 

            pushFollow(FOLLOW_name_in_simple_project_declaration187);
            end_project_name=name();

            state._fsp--;


            match(input,63,FOLLOW_63_in_simple_project_declaration191); 

            if ( !(((begin_project_name!=null?input.toString(begin_project_name.start,begin_project_name.stop):null).equals((end_project_name!=null?input.toString(end_project_name.start,end_project_name.stop):null)))) ) {
                throw new FailedPredicateException(input, "simple_project_declaration", "$begin_project_name.text.equals($end_project_name.text)");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "simple_project_declaration"


    public static class name_return extends ParserRuleReturnScope {
        public String result;
    };


    // $ANTLR start "name"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:81:1: name returns [String result] : first= simple_name ( '.' other= simple_name )* ;
    public final GprParser.name_return name() throws RecognitionException {
        GprParser.name_return retval = new GprParser.name_return();
        retval.start = input.LT(1);


        GprParser.simple_name_return first =null;

        GprParser.simple_name_return other =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:82:3: (first= simple_name ( '.' other= simple_name )* )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:83:3: first= simple_name ( '.' other= simple_name )*
            {
            pushFollow(FOLLOW_simple_name_in_name218);
            first=simple_name();

            state._fsp--;


            retval.result = (first!=null?input.toString(first.start,first.stop):null);

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:84:3: ( '.' other= simple_name )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==60) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:84:4: '.' other= simple_name
            	    {
            	    match(input,60,FOLLOW_60_in_name226); 

            	    pushFollow(FOLLOW_simple_name_in_name232);
            	    other=simple_name();

            	    state._fsp--;


            	    retval.result += "." + (other!=null?input.toString(other.start,other.stop):null);

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class simple_name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "simple_name"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:87:1: simple_name : IDENTIFIER ;
    public final GprParser.simple_name_return simple_name() throws RecognitionException {
        GprParser.simple_name_return retval = new GprParser.simple_name_return();
        retval.start = input.LT(1);


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:88:3: ( IDENTIFIER )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:89:3: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simple_name253); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_name"



    // $ANTLR start "declarative_item"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:92:1: declarative_item : ( simple_declarative_item | typed_string_declaration | package_declaration );
    public final void declarative_item() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:93:3: ( simple_declarative_item | typed_string_declaration | package_declaration )
            int alt5=3;
            switch ( input.LA(1) ) {
            case CASE:
            case FOR:
            case IDENTIFIER:
            case NULL:
                {
                alt5=1;
                }
                break;
            case TYPE:
                {
                alt5=2;
                }
                break;
            case PACKAGE:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:94:3: simple_declarative_item
                    {
                    pushFollow(FOLLOW_simple_declarative_item_in_declarative_item269);
                    simple_declarative_item();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:95:5: typed_string_declaration
                    {
                    pushFollow(FOLLOW_typed_string_declaration_in_declarative_item276);
                    typed_string_declaration();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:96:5: package_declaration
                    {
                    pushFollow(FOLLOW_package_declaration_in_declarative_item282);
                    package_declaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declarative_item"



    // $ANTLR start "simple_declarative_item"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:99:1: simple_declarative_item : ( variable_declaration | typed_variable_declaration | attribute_declaration | case_statement | empty_declaration );
    public final void simple_declarative_item() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:100:3: ( variable_declaration | typed_variable_declaration | attribute_declaration | case_statement | empty_declaration )
            int alt6=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==62) ) {
                    alt6=1;
                }
                else if ( (LA6_1==61) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case FOR:
                {
                alt6=3;
                }
                break;
            case CASE:
                {
                alt6=4;
                }
                break;
            case NULL:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:101:3: variable_declaration
                    {
                    pushFollow(FOLLOW_variable_declaration_in_simple_declarative_item299);
                    variable_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:102:5: typed_variable_declaration
                    {
                    pushFollow(FOLLOW_typed_variable_declaration_in_simple_declarative_item305);
                    typed_variable_declaration();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:103:5: attribute_declaration
                    {
                    pushFollow(FOLLOW_attribute_declaration_in_simple_declarative_item311);
                    attribute_declaration();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:104:5: case_statement
                    {
                    pushFollow(FOLLOW_case_statement_in_simple_declarative_item317);
                    case_statement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:105:5: empty_declaration
                    {
                    pushFollow(FOLLOW_empty_declaration_in_simple_declarative_item323);
                    empty_declaration();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "simple_declarative_item"



    // $ANTLR start "typed_string_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:108:1: typed_string_declaration : TYPE simple_name IS '(' STRING_LITERAL ( ',' STRING_LITERAL )* ')' ';' ;
    public final void typed_string_declaration() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:109:3: ( TYPE simple_name IS '(' STRING_LITERAL ( ',' STRING_LITERAL )* ')' ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:110:3: TYPE simple_name IS '(' STRING_LITERAL ( ',' STRING_LITERAL )* ')' ';'
            {
            match(input,TYPE,FOLLOW_TYPE_in_typed_string_declaration339); 

            pushFollow(FOLLOW_simple_name_in_typed_string_declaration341);
            simple_name();

            state._fsp--;


            match(input,IS,FOLLOW_IS_in_typed_string_declaration343); 

            match(input,57,FOLLOW_57_in_typed_string_declaration345); 

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_typed_string_declaration347); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:110:42: ( ',' STRING_LITERAL )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==59) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:110:43: ',' STRING_LITERAL
            	    {
            	    match(input,59,FOLLOW_59_in_typed_string_declaration350); 

            	    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_typed_string_declaration352); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,58,FOLLOW_58_in_typed_string_declaration356); 

            match(input,63,FOLLOW_63_in_typed_string_declaration358); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "typed_string_declaration"



    // $ANTLR start "case_statement"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:113:1: case_statement : CASE name IS ( case_item )* END CASE ';' ;
    public final void case_statement() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:114:3: ( CASE name IS ( case_item )* END CASE ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:115:3: CASE name IS ( case_item )* END CASE ';'
            {
            match(input,CASE,FOLLOW_CASE_in_case_statement374); 

            pushFollow(FOLLOW_name_in_case_statement376);
            name();

            state._fsp--;


            match(input,IS,FOLLOW_IS_in_case_statement378); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:115:16: ( case_item )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WHEN) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:115:17: case_item
            	    {
            	    pushFollow(FOLLOW_case_item_in_case_statement381);
            	    case_item();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_case_statement385); 

            match(input,CASE,FOLLOW_CASE_in_case_statement387); 

            match(input,63,FOLLOW_63_in_case_statement389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "case_statement"



    // $ANTLR start "case_item"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:118:1: case_item : WHEN discrete_choice_list '=>' ( case_statement | attribute_declaration | variable_declaration | empty_declaration )+ ;
    public final void case_item() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:119:3: ( WHEN discrete_choice_list '=>' ( case_statement | attribute_declaration | variable_declaration | empty_declaration )+ )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:120:3: WHEN discrete_choice_list '=>' ( case_statement | attribute_declaration | variable_declaration | empty_declaration )+
            {
            match(input,WHEN,FOLLOW_WHEN_in_case_item404); 

            pushFollow(FOLLOW_discrete_choice_list_in_case_item406);
            discrete_choice_list();

            state._fsp--;


            match(input,64,FOLLOW_64_in_case_item408); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:121:3: ( case_statement | attribute_declaration | variable_declaration | empty_declaration )+
            int cnt9=0;
            loop9:
            do {
                int alt9=5;
                switch ( input.LA(1) ) {
                case CASE:
                    {
                    alt9=1;
                    }
                    break;
                case FOR:
                    {
                    alt9=2;
                    }
                    break;
                case IDENTIFIER:
                    {
                    alt9=3;
                    }
                    break;
                case NULL:
                    {
                    alt9=4;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:121:4: case_statement
            	    {
            	    pushFollow(FOLLOW_case_statement_in_case_item413);
            	    case_statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:122:5: attribute_declaration
            	    {
            	    pushFollow(FOLLOW_attribute_declaration_in_case_item419);
            	    attribute_declaration();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:123:5: variable_declaration
            	    {
            	    pushFollow(FOLLOW_variable_declaration_in_case_item425);
            	    variable_declaration();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:124:5: empty_declaration
            	    {
            	    pushFollow(FOLLOW_empty_declaration_in_case_item431);
            	    empty_declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "case_item"



    // $ANTLR start "discrete_choice_list"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:127:1: discrete_choice_list : ( STRING_LITERAL ( '|' STRING_LITERAL )* | OTHERS );
    public final void discrete_choice_list() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:128:3: ( STRING_LITERAL ( '|' STRING_LITERAL )* | OTHERS )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==STRING_LITERAL) ) {
                alt11=1;
            }
            else if ( (LA11_0==OTHERS) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:129:3: STRING_LITERAL ( '|' STRING_LITERAL )*
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_discrete_choice_list450); 

                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:129:18: ( '|' STRING_LITERAL )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==66) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:129:20: '|' STRING_LITERAL
                    	    {
                    	    match(input,66,FOLLOW_66_in_discrete_choice_list454); 

                    	    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_discrete_choice_list456); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:130:5: OTHERS
                    {
                    match(input,OTHERS,FOLLOW_OTHERS_in_discrete_choice_list465); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "discrete_choice_list"



    // $ANTLR start "package_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:133:1: package_declaration : ( package_spec | package_renaming | package_extension );
    public final void package_declaration() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:134:3: ( package_spec | package_renaming | package_extension )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==PACKAGE) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==IDENTIFIER) ) {
                    switch ( input.LA(3) ) {
                    case IS:
                        {
                        alt12=1;
                        }
                        break;
                    case RENAMES:
                        {
                        alt12=2;
                        }
                        break;
                    case EXTENDS:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:135:3: package_spec
                    {
                    pushFollow(FOLLOW_package_spec_in_package_declaration481);
                    package_spec();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:136:5: package_renaming
                    {
                    pushFollow(FOLLOW_package_renaming_in_package_declaration488);
                    package_renaming();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:137:5: package_extension
                    {
                    pushFollow(FOLLOW_package_extension_in_package_declaration495);
                    package_extension();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "package_declaration"



    // $ANTLR start "package_spec"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:140:1: package_spec : PACKAGE begin_pkg_name= simple_name IS ( simple_declarative_item )* END end_package_name= simple_name ';' {...}?;
    public final void package_spec() throws RecognitionException {
        GprParser.simple_name_return begin_pkg_name =null;

        GprParser.simple_name_return end_package_name =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:141:3: ( PACKAGE begin_pkg_name= simple_name IS ( simple_declarative_item )* END end_package_name= simple_name ';' {...}?)
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:142:3: PACKAGE begin_pkg_name= simple_name IS ( simple_declarative_item )* END end_package_name= simple_name ';' {...}?
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_package_spec512); 

            pushFollow(FOLLOW_simple_name_in_package_spec518);
            begin_pkg_name=simple_name();

            state._fsp--;


            gprLoader.beginPackage((begin_pkg_name!=null?input.toString(begin_pkg_name.start,begin_pkg_name.stop):null));

            match(input,IS,FOLLOW_IS_in_package_spec524); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:144:3: ( simple_declarative_item )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==CASE||LA13_0==FOR||LA13_0==IDENTIFIER||LA13_0==NULL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:144:4: simple_declarative_item
            	    {
            	    pushFollow(FOLLOW_simple_declarative_item_in_package_spec530);
            	    simple_declarative_item();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_package_spec537); 

            pushFollow(FOLLOW_simple_name_in_package_spec543);
            end_package_name=simple_name();

            state._fsp--;


            match(input,63,FOLLOW_63_in_package_spec545); 

            gprLoader.endPackage();

            if ( !(((begin_pkg_name!=null?input.toString(begin_pkg_name.start,begin_pkg_name.stop):null).equals((end_package_name!=null?input.toString(end_package_name.start,end_package_name.stop):null)))) ) {
                throw new FailedPredicateException(input, "package_spec", "$begin_pkg_name.text.equals($end_package_name.text)");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "package_spec"



    // $ANTLR start "package_renaming"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:149:1: package_renaming : PACKAGE newPackageName= simple_name RENAMES projectName= simple_name '.' renamedPackage= simple_name ';' ;
    public final void package_renaming() throws RecognitionException {
        GprParser.simple_name_return newPackageName =null;

        GprParser.simple_name_return projectName =null;

        GprParser.simple_name_return renamedPackage =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:150:3: ( PACKAGE newPackageName= simple_name RENAMES projectName= simple_name '.' renamedPackage= simple_name ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:151:3: PACKAGE newPackageName= simple_name RENAMES projectName= simple_name '.' renamedPackage= simple_name ';'
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_package_renaming569); 

            pushFollow(FOLLOW_simple_name_in_package_renaming575);
            newPackageName=simple_name();

            state._fsp--;


            match(input,RENAMES,FOLLOW_RENAMES_in_package_renaming580); 

            pushFollow(FOLLOW_simple_name_in_package_renaming589);
            projectName=simple_name();

            state._fsp--;


            match(input,60,FOLLOW_60_in_package_renaming591); 

            pushFollow(FOLLOW_simple_name_in_package_renaming597);
            renamedPackage=simple_name();

            state._fsp--;


            match(input,63,FOLLOW_63_in_package_renaming599); 

            gprLoader.addPackageFrom((newPackageName!=null?input.toString(newPackageName.start,newPackageName.stop):null), (projectName!=null?input.toString(projectName.start,projectName.stop):null), (renamedPackage!=null?input.toString(renamedPackage.start,renamedPackage.stop):null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "package_renaming"



    // $ANTLR start "package_extension"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:157:1: package_extension : PACKAGE begin_package_name= simple_name EXTENDS projectName= simple_name '.' extendedPackage= simple_name IS ( simple_declarative_item )* END end_package_name= simple_name ';' {...}?;
    public final void package_extension() throws RecognitionException {
        GprParser.simple_name_return begin_package_name =null;

        GprParser.simple_name_return projectName =null;

        GprParser.simple_name_return extendedPackage =null;

        GprParser.simple_name_return end_package_name =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:158:3: ( PACKAGE begin_package_name= simple_name EXTENDS projectName= simple_name '.' extendedPackage= simple_name IS ( simple_declarative_item )* END end_package_name= simple_name ';' {...}?)
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:159:3: PACKAGE begin_package_name= simple_name EXTENDS projectName= simple_name '.' extendedPackage= simple_name IS ( simple_declarative_item )* END end_package_name= simple_name ';' {...}?
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_package_extension624); 

            pushFollow(FOLLOW_simple_name_in_package_extension630);
            begin_package_name=simple_name();

            state._fsp--;


            match(input,EXTENDS,FOLLOW_EXTENDS_in_package_extension635); 

            pushFollow(FOLLOW_simple_name_in_package_extension644);
            projectName=simple_name();

            state._fsp--;


            match(input,60,FOLLOW_60_in_package_extension646); 

            pushFollow(FOLLOW_simple_name_in_package_extension652);
            extendedPackage=simple_name();

            state._fsp--;


            match(input,IS,FOLLOW_IS_in_package_extension654); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:162:3: ( simple_declarative_item )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==CASE||LA14_0==FOR||LA14_0==IDENTIFIER||LA14_0==NULL) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:162:4: simple_declarative_item
            	    {
            	    pushFollow(FOLLOW_simple_declarative_item_in_package_extension659);
            	    simple_declarative_item();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input,END,FOLLOW_END_in_package_extension665); 

            pushFollow(FOLLOW_simple_name_in_package_extension671);
            end_package_name=simple_name();

            state._fsp--;


            match(input,63,FOLLOW_63_in_package_extension673); 

            if ( !(((begin_package_name!=null?input.toString(begin_package_name.start,begin_package_name.stop):null).equals((end_package_name!=null?input.toString(end_package_name.start,end_package_name.stop):null)))) ) {
                throw new FailedPredicateException(input, "package_extension", "$begin_package_name.text.equals($end_package_name.text)");
            }

            gprLoader.addPackageFrom((begin_package_name!=null?input.toString(begin_package_name.start,begin_package_name.stop):null), (projectName!=null?input.toString(projectName.start,projectName.stop):null), (extendedPackage!=null?input.toString(extendedPackage.start,extendedPackage.stop):null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "package_extension"



    // $ANTLR start "typed_variable_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:168:1: typed_variable_declaration : simple_name ':' name ':=' string_expression ';' {...}?;
    public final void typed_variable_declaration() throws RecognitionException {
        GprParser.simple_name_return simple_name2 =null;

        Symbol string_expression3 =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:169:3: ( simple_name ':' name ':=' string_expression ';' {...}?)
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:170:3: simple_name ':' name ':=' string_expression ';' {...}?
            {
            pushFollow(FOLLOW_simple_name_in_typed_variable_declaration698);
            simple_name2=simple_name();

            state._fsp--;


            match(input,61,FOLLOW_61_in_typed_variable_declaration703); 

            pushFollow(FOLLOW_name_in_typed_variable_declaration708);
            name();

            state._fsp--;


            match(input,62,FOLLOW_62_in_typed_variable_declaration714); 

            pushFollow(FOLLOW_string_expression_in_typed_variable_declaration719);
            string_expression3=string_expression();

            state._fsp--;


            match(input,63,FOLLOW_63_in_typed_variable_declaration724); 

            if ( !((!gprLoader.variableIsDefined((simple_name2!=null?input.toString(simple_name2.start,simple_name2.stop):null)))) ) {
                throw new FailedPredicateException(input, "typed_variable_declaration", "!gprLoader.variableIsDefined($simple_name.text)");
            }

            gprLoader.addVariable ((simple_name2!=null?input.toString(simple_name2.start,simple_name2.stop):null), string_expression3);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "typed_variable_declaration"



    // $ANTLR start "attribute_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:180:1: attribute_declaration : FOR attribute_designator USE expression ';' ;
    public final void attribute_declaration() throws RecognitionException {
        String attribute_designator4 =null;

        Symbol expression5 =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:181:2: ( FOR attribute_designator USE expression ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:182:2: FOR attribute_designator USE expression ';'
            {
            match(input,FOR,FOLLOW_FOR_in_attribute_declaration751); 

            pushFollow(FOLLOW_attribute_designator_in_attribute_declaration755);
            attribute_designator4=attribute_designator();

            state._fsp--;


            match(input,USE,FOLLOW_USE_in_attribute_declaration759); 

            pushFollow(FOLLOW_expression_in_attribute_declaration762);
            expression5=expression();

            state._fsp--;


            match(input,63,FOLLOW_63_in_attribute_declaration766); 

            gprLoader.addAttribute(attribute_designator4, expression5);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "attribute_declaration"



    // $ANTLR start "attribute_designator"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:190:1: attribute_designator returns [String result] : (att= simple_name |att= simple_name ( '(' STRING_LITERAL ')' ) );
    public final String attribute_designator() throws RecognitionException {
        String result = null;


        Token STRING_LITERAL6=null;
        GprParser.simple_name_return att =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:191:3: (att= simple_name |att= simple_name ( '(' STRING_LITERAL ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENTIFIER) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==USE) ) {
                    alt15=1;
                }
                else if ( (LA15_1==57) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:192:3: att= simple_name
                    {
                    pushFollow(FOLLOW_simple_name_in_attribute_designator792);
                    att=simple_name();

                    state._fsp--;


                    result = (att!=null?input.toString(att.start,att.stop):null);

                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:193:5: att= simple_name ( '(' STRING_LITERAL ')' )
                    {
                    pushFollow(FOLLOW_simple_name_in_attribute_designator804);
                    att=simple_name();

                    state._fsp--;


                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:193:23: ( '(' STRING_LITERAL ')' )
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:193:25: '(' STRING_LITERAL ')'
                    {
                    match(input,57,FOLLOW_57_in_attribute_designator808); 

                    STRING_LITERAL6=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attribute_designator810); 

                    match(input,58,FOLLOW_58_in_attribute_designator812); 

                    }


                    result = (att!=null?input.toString(att.start,att.stop):null) + "(" + (STRING_LITERAL6!=null?STRING_LITERAL6.getText():null) + ")";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "attribute_designator"



    // $ANTLR start "attribute_reference"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:196:2: attribute_reference returns [Symbol result] : attribute_prefix '\\'' simple_name ( '(' STRING_LITERAL ')' )? ;
    public final Symbol attribute_reference() throws RecognitionException {
        Symbol result = null;


        Token STRING_LITERAL9=null;
        String attribute_prefix7 =null;

        GprParser.simple_name_return simple_name8 =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:197:3: ( attribute_prefix '\\'' simple_name ( '(' STRING_LITERAL ')' )? )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:198:3: attribute_prefix '\\'' simple_name ( '(' STRING_LITERAL ')' )?
            {
            pushFollow(FOLLOW_attribute_prefix_in_attribute_reference838);
            attribute_prefix7=attribute_prefix();

            state._fsp--;


            match(input,65,FOLLOW_65_in_attribute_reference840); 

            pushFollow(FOLLOW_simple_name_in_attribute_reference842);
            simple_name8=simple_name();

            state._fsp--;


             String attributeName;
                  if (attribute_prefix7.isEmpty()) { 
                     attributeName = (simple_name8!=null?input.toString(simple_name8.start,simple_name8.stop):null);
                  }
                  else {
                    attributeName = attribute_prefix7 + "\'" + (simple_name8!=null?input.toString(simple_name8.start,simple_name8.stop):null);
                  } 
                

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:207:5: ( '(' STRING_LITERAL ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==57) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:207:6: '(' STRING_LITERAL ')'
                    {
                    match(input,57,FOLLOW_57_in_attribute_reference856); 

                    STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_attribute_reference858); 

                    match(input,58,FOLLOW_58_in_attribute_reference860); 

                     attributeName += "(" + (STRING_LITERAL9!=null?STRING_LITERAL9.getText():null) + ")";

                    }
                    break;

            }


             result = gprLoader.getAttribute(attributeName); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "attribute_reference"



    // $ANTLR start "attribute_prefix"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:212:2: attribute_prefix returns [String result] : ( PROJECT |project_name= simple_name ( '.' package_name= simple_name )? );
    public final String attribute_prefix() throws RecognitionException {
        String result = null;


        GprParser.simple_name_return project_name =null;

        GprParser.simple_name_return package_name =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:213:3: ( PROJECT |project_name= simple_name ( '.' package_name= simple_name )? )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PROJECT) ) {
                alt18=1;
            }
            else if ( (LA18_0==IDENTIFIER) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:214:3: PROJECT
                    {
                    match(input,PROJECT,FOLLOW_PROJECT_in_attribute_prefix892); 

                     result = ""; 

                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:215:5: project_name= simple_name ( '.' package_name= simple_name )?
                    {
                    pushFollow(FOLLOW_simple_name_in_attribute_prefix906);
                    project_name=simple_name();

                    state._fsp--;


                     result = (project_name!=null?input.toString(project_name.start,project_name.stop):null); 

                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:216:5: ( '.' package_name= simple_name )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==60) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:216:6: '.' package_name= simple_name
                            {
                            match(input,60,FOLLOW_60_in_attribute_prefix916); 

                            pushFollow(FOLLOW_simple_name_in_attribute_prefix922);
                            package_name=simple_name();

                            state._fsp--;


                            result += "." + (package_name!=null?input.toString(package_name.start,package_name.stop):null);

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "attribute_prefix"



    // $ANTLR start "external_value"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:219:1: external_value returns [Symbol result] : EXTERNAL '(' STRING_LITERAL ( ',' defaultValue= STRING_LITERAL )? ')' ;
    public final Symbol external_value() throws RecognitionException {
        Symbol result = null;


        Token defaultValue=null;

        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:220:3: ( EXTERNAL '(' STRING_LITERAL ( ',' defaultValue= STRING_LITERAL )? ')' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:221:3: EXTERNAL '(' STRING_LITERAL ( ',' defaultValue= STRING_LITERAL )? ')'
            {
            match(input,EXTERNAL,FOLLOW_EXTERNAL_in_external_value949); 

            match(input,57,FOLLOW_57_in_external_value953); 

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_external_value958); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:224:3: ( ',' defaultValue= STRING_LITERAL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==59) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:224:4: ',' defaultValue= STRING_LITERAL
                    {
                    match(input,59,FOLLOW_59_in_external_value964); 

                    defaultValue=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_external_value970); 

                     result = Symbol.CreateString((defaultValue!=null?defaultValue.getText():null));

                    }
                    break;

            }


            match(input,58,FOLLOW_58_in_external_value979); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "external_value"



    // $ANTLR start "variable_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:228:1: variable_declaration : simple_name ':=' expression ';' ;
    public final void variable_declaration() throws RecognitionException {
        GprParser.simple_name_return simple_name10 =null;

        Symbol expression11 =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:229:3: ( simple_name ':=' expression ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:230:3: simple_name ':=' expression ';'
            {
            pushFollow(FOLLOW_simple_name_in_variable_declaration996);
            simple_name10=simple_name();

            state._fsp--;


            match(input,62,FOLLOW_62_in_variable_declaration1001); 

            pushFollow(FOLLOW_expression_in_variable_declaration1005);
            expression11=expression();

            state._fsp--;


            match(input,63,FOLLOW_63_in_variable_declaration1009); 

            gprLoader.addVariable ((simple_name10!=null?input.toString(simple_name10.start,simple_name10.stop):null), expression11);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "variable_declaration"



    // $ANTLR start "expression"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:237:1: expression returns [Symbol result] : first= term ( '&' other= term )* ;
    public final Symbol expression() throws RecognitionException {
        Symbol result = null;


        Symbol first =null;

        Symbol other =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:238:3: (first= term ( '&' other= term )* )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:239:3: first= term ( '&' other= term )*
            {
            pushFollow(FOLLOW_term_in_expression1036);
            first=term();

            state._fsp--;


            result = first;

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:240:3: ( '&' other= term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==56) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:240:5: '&' other= term
            	    {
            	    match(input,56,FOLLOW_56_in_expression1044); 

            	    pushFollow(FOLLOW_term_in_expression1050);
            	    other=term();

            	    state._fsp--;


            	    result = Symbol.Concat(result, other);

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "expression"



    // $ANTLR start "term"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:243:1: term returns [Symbol result] : ( string_expression | string_list );
    public final Symbol term() throws RecognitionException {
        Symbol result = null;


        Symbol string_expression12 =null;

        Symbol string_list13 =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:244:3: ( string_expression | string_list )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EXTERNAL||LA21_0==IDENTIFIER||LA21_0==PROJECT||LA21_0==STRING_LITERAL) ) {
                alt21=1;
            }
            else if ( (LA21_0==57) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:245:3: string_expression
                    {
                    pushFollow(FOLLOW_string_expression_in_term1076);
                    string_expression12=string_expression();

                    state._fsp--;


                    result = string_expression12;

                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:247:5: string_list
                    {
                    pushFollow(FOLLOW_string_list_in_term1089);
                    string_list13=string_list();

                    state._fsp--;


                    result = string_list13;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "term"



    // $ANTLR start "string_expression"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:251:1: string_expression returns [Symbol result] : ( STRING_LITERAL | name | external_value | attribute_reference );
    public final Symbol string_expression() throws RecognitionException {
        Symbol result = null;


        Token STRING_LITERAL14=null;
        GprParser.name_return name15 =null;

        Symbol external_value16 =null;

        Symbol attribute_reference17 =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:252:3: ( STRING_LITERAL | name | external_value | attribute_reference )
            int alt22=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt22=1;
                }
                break;
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case 60:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==IDENTIFIER) ) {
                        int LA22_7 = input.LA(4);

                        if ( (LA22_7==56||(LA22_7 >= 58 && LA22_7 <= 60)||LA22_7==63) ) {
                            alt22=2;
                        }
                        else if ( (LA22_7==65) ) {
                            alt22=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 7, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case 56:
                case 58:
                case 59:
                case 63:
                    {
                    alt22=2;
                    }
                    break;
                case 65:
                    {
                    alt22=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;

                }

                }
                break;
            case EXTERNAL:
                {
                alt22=3;
                }
                break;
            case PROJECT:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:253:3: STRING_LITERAL
                    {
                    STRING_LITERAL14=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_expression1118); 

                    result = Symbol.CreateString((STRING_LITERAL14!=null?STRING_LITERAL14.getText():null));

                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:254:5: name
                    {
                    pushFollow(FOLLOW_name_in_string_expression1126);
                    name15=name();

                    state._fsp--;


                    result = gprLoader.getVariable((name15!=null?name15.result:null));

                    }
                    break;
                case 3 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:255:5: external_value
                    {
                    pushFollow(FOLLOW_external_value_in_string_expression1134);
                    external_value16=external_value();

                    state._fsp--;


                    result = external_value16;

                    }
                    break;
                case 4 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:256:5: attribute_reference
                    {
                    pushFollow(FOLLOW_attribute_reference_in_string_expression1142);
                    attribute_reference17=attribute_reference();

                    state._fsp--;


                    result = attribute_reference17;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "string_expression"



    // $ANTLR start "string_list"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:259:1: string_list returns [Symbol result] : '(' (first= expression )? ( ',' other= expression )* ')' ;
    public final Symbol string_list() throws RecognitionException {
        Symbol result = null;


        Symbol first =null;

        Symbol other =null;


        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:260:3: ( '(' (first= expression )? ( ',' other= expression )* ')' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:261:3: '(' (first= expression )? ( ',' other= expression )* ')'
            {
            match(input,57,FOLLOW_57_in_string_list1164); 

            result = Symbol.CreateStringList(new ArrayList<String>());

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:262:9: (first= expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EXTERNAL||LA23_0==IDENTIFIER||LA23_0==PROJECT||LA23_0==STRING_LITERAL||LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:262:9: first= expression
                    {
                    pushFollow(FOLLOW_expression_in_string_list1174);
                    first=expression();

                    state._fsp--;


                    }
                    break;

            }


            if (first != null) {result = Symbol.Concat (result, first);}

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:263:3: ( ',' other= expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:263:5: ',' other= expression
            	    {
            	    match(input,59,FOLLOW_59_in_string_list1184); 

            	    pushFollow(FOLLOW_expression_in_string_list1190);
            	    other=expression();

            	    state._fsp--;


            	    result = Symbol.Concat(result, other);

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match(input,58,FOLLOW_58_in_string_list1201); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "string_list"



    // $ANTLR start "empty_declaration"
    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:267:1: empty_declaration : NULL ';' ;
    public final void empty_declaration() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:268:3: ( NULL ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:269:3: NULL ';'
            {
            match(input,NULL,FOLLOW_NULL_in_empty_declaration1216); 

            match(input,63,FOLLOW_63_in_empty_declaration1218); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "empty_declaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_context_clause_in_project52 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_project_declaration_in_project54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_project56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_clause_in_context_clause67 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_WITH_in_with_clause79 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_path_name_in_with_clause88 = new BitSet(new long[]{0x8800000000000000L});
    public static final BitSet FOLLOW_59_in_with_clause97 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_path_name_in_with_clause101 = new BitSet(new long[]{0x8800000000000000L});
    public static final BitSet FOLLOW_63_in_with_clause113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_path_name131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_project_declaration_in_project_declaration146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROJECT_in_simple_project_declaration160 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_name_in_simple_project_declaration167 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IS_in_simple_project_declaration172 = new BitSet(new long[]{0x0000100880444200L});
    public static final BitSet FOLLOW_declarative_item_in_simple_project_declaration176 = new BitSet(new long[]{0x0000100880444200L});
    public static final BitSet FOLLOW_END_in_simple_project_declaration181 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_name_in_simple_project_declaration187 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_simple_project_declaration191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_name218 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_name226 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_name232 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simple_name253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_declarative_item_in_declarative_item269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_string_declaration_in_declarative_item276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_declaration_in_declarative_item282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_declaration_in_simple_declarative_item299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typed_variable_declaration_in_simple_declarative_item305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_declaration_in_simple_declarative_item311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_statement_in_simple_declarative_item317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_empty_declaration_in_simple_declarative_item323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_typed_string_declaration339 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_typed_string_declaration341 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IS_in_typed_string_declaration343 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_typed_string_declaration345 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_typed_string_declaration347 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_typed_string_declaration350 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_typed_string_declaration352 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_typed_string_declaration356 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_typed_string_declaration358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_case_statement374 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_name_in_case_statement376 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IS_in_case_statement378 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_case_item_in_case_statement381 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_END_in_case_statement385 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CASE_in_case_statement387 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_case_statement389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_case_item404 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_discrete_choice_list_in_case_item406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_case_item408 = new BitSet(new long[]{0x0000000080440200L});
    public static final BitSet FOLLOW_case_statement_in_case_item413 = new BitSet(new long[]{0x0000000080440202L});
    public static final BitSet FOLLOW_attribute_declaration_in_case_item419 = new BitSet(new long[]{0x0000000080440202L});
    public static final BitSet FOLLOW_variable_declaration_in_case_item425 = new BitSet(new long[]{0x0000000080440202L});
    public static final BitSet FOLLOW_empty_declaration_in_case_item431 = new BitSet(new long[]{0x0000000080440202L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_discrete_choice_list450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_discrete_choice_list454 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_discrete_choice_list456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_OTHERS_in_discrete_choice_list465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_spec_in_package_declaration481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_renaming_in_package_declaration488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_extension_in_package_declaration495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_spec512 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_spec518 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IS_in_package_spec524 = new BitSet(new long[]{0x0000000080444200L});
    public static final BitSet FOLLOW_simple_declarative_item_in_package_spec530 = new BitSet(new long[]{0x0000000080444200L});
    public static final BitSet FOLLOW_END_in_package_spec537 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_spec543 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_package_spec545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_renaming569 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_renaming575 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RENAMES_in_package_renaming580 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_renaming589 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_package_renaming591 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_renaming597 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_package_renaming599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_package_extension624 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_extension630 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EXTENDS_in_package_extension635 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_extension644 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_package_extension646 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_extension652 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_IS_in_package_extension654 = new BitSet(new long[]{0x0000000080444200L});
    public static final BitSet FOLLOW_simple_declarative_item_in_package_extension659 = new BitSet(new long[]{0x0000000080444200L});
    public static final BitSet FOLLOW_END_in_package_extension665 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_package_extension671 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_package_extension673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_typed_variable_declaration698 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_typed_variable_declaration703 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_name_in_typed_variable_declaration708 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_typed_variable_declaration714 = new BitSet(new long[]{0x0000041000410000L});
    public static final BitSet FOLLOW_string_expression_in_typed_variable_declaration719 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_typed_variable_declaration724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_attribute_declaration751 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_attribute_designator_in_attribute_declaration755 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_USE_in_attribute_declaration759 = new BitSet(new long[]{0x0200041000410000L});
    public static final BitSet FOLLOW_expression_in_attribute_declaration762 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_attribute_declaration766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_attribute_designator792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_attribute_designator804 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_attribute_designator808 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attribute_designator810 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_attribute_designator812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_prefix_in_attribute_reference838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_attribute_reference840 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_attribute_reference842 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_attribute_reference856 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_attribute_reference858 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_attribute_reference860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROJECT_in_attribute_prefix892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_attribute_prefix906 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_attribute_prefix916 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_simple_name_in_attribute_prefix922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_external_value949 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_external_value953 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_external_value958 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_external_value964 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_external_value970 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_external_value979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_variable_declaration996 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_variable_declaration1001 = new BitSet(new long[]{0x0200041000410000L});
    public static final BitSet FOLLOW_expression_in_variable_declaration1005 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_variable_declaration1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression1036 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expression1044 = new BitSet(new long[]{0x0200041000410000L});
    public static final BitSet FOLLOW_term_in_expression1050 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_string_expression_in_term1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_list_in_term1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_expression1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_string_expression1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_value_in_string_expression1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_reference_in_string_expression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_string_list1164 = new BitSet(new long[]{0x0E00041000410000L});
    public static final BitSet FOLLOW_expression_in_string_list1174 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_string_list1184 = new BitSet(new long[]{0x0200041000410000L});
    public static final BitSet FOLLOW_expression_in_string_list1190 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_string_list1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_empty_declaration1216 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_empty_declaration1218 = new BitSet(new long[]{0x0000000000000002L});

}