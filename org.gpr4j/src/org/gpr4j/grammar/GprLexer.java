// $ANTLR 3.4 /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g 2013-03-22 01:16:17


package org.gpr4j.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class GprLexer extends Lexer {
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

      private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();
     
        public List<RecognitionException> getExceptions() {
            return exceptions;
        }
     
        @Override
        public void reportError(RecognitionException e) {
            exceptions.add(e);
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public GprLexer() {} 
    public GprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g"; }

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:19:7: ( '&' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:19:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:20:7: ( '(' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:21:7: ( ')' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:22:7: ( ',' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:23:7: ( '.' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:23:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:24:7: ( ':' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:25:7: ( ':=' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:25:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:26:7: ( ';' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:26:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:27:7: ( '=>' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:27:9: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:28:7: ( '\\'' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:28:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:29:7: ( '|' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:29:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:273:3: ( '--' (~ ( '\\n' | '\\r' | '\\f' ) )* )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:274:3: '--' (~ ( '\\n' | '\\r' | '\\f' ) )*
            {
            match("--"); 



            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:275:3: (~ ( '\\n' | '\\r' | '\\f' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||LA1_0=='\u000B'||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||input.LA(1)=='\u000B'||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:283:3: ( '\"' ( STRING_ELEMENT )* '\"' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:284:3: '\"' ( STRING_ELEMENT )* '\"'
            {
            match('\"'); 

            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:285:3: ( STRING_ELEMENT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\"') ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:285:4: STRING_ELEMENT
            	    {
            	    mSTRING_ELEMENT(); 


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:288:9: ( A L L )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:288:11: A L L
            {
            mA(); 


            mL(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:289:9: ( A T )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:289:11: A T
            {
            mA(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:290:9: ( C A S E )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:290:11: C A S E
            {
            mC(); 


            mA(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:291:9: ( E N D )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:291:11: E N D
            {
            mE(); 


            mN(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:292:9: ( F O R )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:292:11: F O R
            {
            mF(); 


            mO(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:293:9: ( I S )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:293:11: I S
            {
            mI(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "LIMITED"
    public final void mLIMITED() throws RecognitionException {
        try {
            int _type = LIMITED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:294:9: ( L I M I T E D )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:294:11: L I M I T E D
            {
            mL(); 


            mI(); 


            mM(); 


            mI(); 


            mT(); 


            mE(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMITED"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:295:9: ( N U L L )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:295:11: N U L L
            {
            mN(); 


            mU(); 


            mL(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OTHERS"
    public final void mOTHERS() throws RecognitionException {
        try {
            int _type = OTHERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:296:9: ( O T H E R S )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:296:11: O T H E R S
            {
            mO(); 


            mT(); 


            mH(); 


            mE(); 


            mR(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OTHERS"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:297:9: ( P A C K A G E )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:297:11: P A C K A G E
            {
            mP(); 


            mA(); 


            mC(); 


            mK(); 


            mA(); 


            mG(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "PROJECT"
    public final void mPROJECT() throws RecognitionException {
        try {
            int _type = PROJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:298:9: ( P R O J E C T )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:298:11: P R O J E C T
            {
            mP(); 


            mR(); 


            mO(); 


            mJ(); 


            mE(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROJECT"

    // $ANTLR start "RENAMES"
    public final void mRENAMES() throws RecognitionException {
        try {
            int _type = RENAMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:299:9: ( R E N A M E S )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:299:11: R E N A M E S
            {
            mR(); 


            mE(); 


            mN(); 


            mA(); 


            mM(); 


            mE(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RENAMES"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:300:9: ( T Y P E )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:300:11: T Y P E
            {
            mT(); 


            mY(); 


            mP(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:301:9: ( U S E )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:301:11: U S E
            {
            mU(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:302:9: ( W H E N )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:302:11: W H E N
            {
            mW(); 


            mH(); 


            mE(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:303:9: ( W I T H )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:303:11: W I T H
            {
            mW(); 


            mI(); 


            mT(); 


            mH(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:304:9: ( E X T E N D S )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:304:11: E X T E N D S
            {
            mE(); 


            mX(); 


            mT(); 


            mE(); 


            mN(); 


            mD(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "EXTERNAL"
    public final void mEXTERNAL() throws RecognitionException {
        try {
            int _type = EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:305:9: ( E X T E R N A L )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:305:11: E X T E R N A L
            {
            mE(); 


            mX(); 


            mT(); 


            mE(); 


            mR(); 


            mN(); 


            mA(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTERNAL"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:307:12: ( ( UPPER_CASE_LETTER | LOWER_CASE_LETTER ) ( ( '_' )? ( UPPER_CASE_LETTER | LOWER_CASE_LETTER | DIGIT ) )* )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:307:14: ( UPPER_CASE_LETTER | LOWER_CASE_LETTER ) ( ( '_' )? ( UPPER_CASE_LETTER | LOWER_CASE_LETTER | DIGIT ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:308:15: ( ( '_' )? ( UPPER_CASE_LETTER | LOWER_CASE_LETTER | DIGIT ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:308:16: ( '_' )? ( UPPER_CASE_LETTER | LOWER_CASE_LETTER | DIGIT )
            	    {
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:308:16: ( '_' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='_') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:308:17: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }


            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "UPPER_CASE_LETTER"
    public final void mUPPER_CASE_LETTER() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:310:28: ( 'A' .. 'Z' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPPER_CASE_LETTER"

    // $ANTLR start "LOWER_CASE_LETTER"
    public final void mLOWER_CASE_LETTER() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:311:28: ( 'a' .. 'z' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOWER_CASE_LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:312:16: ( '0' .. '9' )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING_ELEMENT"
    public final void mSTRING_ELEMENT() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:314:3: ( ( '\"' '\"' |~ ( '\"' | '\\n' | '\\r' ) ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:315:3: ( '\"' '\"' |~ ( '\"' | '\\n' | '\\r' ) )
            {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:315:3: ( '\"' '\"' |~ ( '\"' | '\\n' | '\\r' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:316:5: '\"' '\"'
                    {
                    match('\"'); 

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:317:7: ~ ( '\"' | '\\n' | '\\r' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_ELEMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:320:5: ( ( ' ' | '\\t' | '\\r' | '\\b' | '\\n' | '\\f' )+ )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:321:3: ( ' ' | '\\t' | '\\r' | '\\b' | '\\n' | '\\f' )+
            {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:321:3: ( ' ' | '\\t' | '\\r' | '\\b' | '\\n' | '\\f' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\b' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            	    {
            	    if ( (input.LA(1) >= '\b' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:328:11: ( ( 'a' | 'A' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:329:11: ( ( 'b' | 'B' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:330:11: ( ( 'c' | 'C' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:331:11: ( ( 'd' | 'D' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:332:11: ( ( 'e' | 'E' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:333:11: ( ( 'f' | 'F' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:334:11: ( ( 'g' | 'G' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:335:11: ( ( 'h' | 'H' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:336:11: ( ( 'i' | 'I' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:337:11: ( ( 'j' | 'J' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:338:11: ( ( 'k' | 'K' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:339:11: ( ( 'l' | 'L' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:340:11: ( ( 'm' | 'M' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:341:11: ( ( 'n' | 'N' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:342:11: ( ( 'o' | 'O' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:343:11: ( ( 'p' | 'P' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:344:11: ( ( 'q' | 'Q' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:345:11: ( ( 'r' | 'R' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:346:11: ( ( 's' | 'S' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:347:11: ( ( 't' | 'T' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:348:11: ( ( 'u' | 'U' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:349:11: ( ( 'v' | 'V' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:350:11: ( ( 'w' | 'W' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:351:11: ( ( 'x' | 'X' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:352:11: ( ( 'y' | 'Y' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:353:11: ( ( 'z' | 'Z' ) )
            // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    public void mTokens() throws RecognitionException {
        // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:8: ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | COMMENT | STRING_LITERAL | ALL | AT | CASE | END | FOR | IS | LIMITED | NULL | OTHERS | PACKAGE | PROJECT | RENAMES | TYPE | USE | WHEN | WITH | EXTENDS | EXTERNAL | IDENTIFIER | WS )
        int alt7=33;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:10: T__56
                {
                mT__56(); 


                }
                break;
            case 2 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:16: T__57
                {
                mT__57(); 


                }
                break;
            case 3 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:22: T__58
                {
                mT__58(); 


                }
                break;
            case 4 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:28: T__59
                {
                mT__59(); 


                }
                break;
            case 5 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:34: T__60
                {
                mT__60(); 


                }
                break;
            case 6 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:40: T__61
                {
                mT__61(); 


                }
                break;
            case 7 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:46: T__62
                {
                mT__62(); 


                }
                break;
            case 8 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:52: T__63
                {
                mT__63(); 


                }
                break;
            case 9 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:58: T__64
                {
                mT__64(); 


                }
                break;
            case 10 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:64: T__65
                {
                mT__65(); 


                }
                break;
            case 11 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:70: T__66
                {
                mT__66(); 


                }
                break;
            case 12 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:76: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 13 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:84: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 14 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:99: ALL
                {
                mALL(); 


                }
                break;
            case 15 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:103: AT
                {
                mAT(); 


                }
                break;
            case 16 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:106: CASE
                {
                mCASE(); 


                }
                break;
            case 17 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:111: END
                {
                mEND(); 


                }
                break;
            case 18 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:115: FOR
                {
                mFOR(); 


                }
                break;
            case 19 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:119: IS
                {
                mIS(); 


                }
                break;
            case 20 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:122: LIMITED
                {
                mLIMITED(); 


                }
                break;
            case 21 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:130: NULL
                {
                mNULL(); 


                }
                break;
            case 22 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:135: OTHERS
                {
                mOTHERS(); 


                }
                break;
            case 23 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:142: PACKAGE
                {
                mPACKAGE(); 


                }
                break;
            case 24 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:150: PROJECT
                {
                mPROJECT(); 


                }
                break;
            case 25 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:158: RENAMES
                {
                mRENAMES(); 


                }
                break;
            case 26 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:166: TYPE
                {
                mTYPE(); 


                }
                break;
            case 27 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:171: USE
                {
                mUSE(); 


                }
                break;
            case 28 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:175: WHEN
                {
                mWHEN(); 


                }
                break;
            case 29 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:180: WITH
                {
                mWITH(); 


                }
                break;
            case 30 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:185: EXTENDS
                {
                mEXTENDS(); 


                }
                break;
            case 31 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:193: EXTERNAL
                {
                mEXTERNAL(); 


                }
                break;
            case 32 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:202: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 33 :
                // /Users/Charles/Documents/workspace/gpr4j/org.gpr4j/src/org/gpr4j/grammar/Gpr.g:1:213: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\6\uffff\1\35\6\uffff\15\32\4\uffff\1\32\1\60\4\32\1\65\12\32\1"+
        "\100\1\uffff\1\32\1\102\1\32\1\104\1\uffff\7\32\1\114\2\32\1\uffff"+
        "\1\117\1\uffff\1\32\1\uffff\1\32\1\123\4\32\1\130\1\uffff\1\131"+
        "\1\132\1\uffff\3\32\1\uffff\4\32\3\uffff\3\32\1\145\3\32\1\151\1"+
        "\32\1\153\1\uffff\1\154\1\155\1\156\1\uffff\1\157\5\uffff";
    static final String DFA7_eofS =
        "\160\uffff";
    static final String DFA7_minS =
        "\1\10\5\uffff\1\75\6\uffff\1\114\1\101\1\116\1\117\1\123\1\111\1"+
        "\125\1\124\1\101\1\105\1\131\1\123\1\110\4\uffff\1\114\1\60\1\123"+
        "\1\104\1\124\1\122\1\60\1\115\1\114\1\110\1\103\1\117\1\116\1\120"+
        "\2\105\1\124\1\60\1\uffff\1\105\1\60\1\105\1\60\1\uffff\1\111\1"+
        "\114\1\105\1\113\1\112\1\101\1\105\1\60\1\116\1\110\1\uffff\1\60"+
        "\1\uffff\1\116\1\uffff\1\124\1\60\1\122\1\101\1\105\1\115\1\60\1"+
        "\uffff\2\60\1\uffff\1\104\1\116\1\105\1\uffff\1\123\1\107\1\103"+
        "\1\105\3\uffff\1\123\1\101\1\104\1\60\1\105\1\124\1\123\1\60\1\114"+
        "\1\60\1\uffff\3\60\1\uffff\1\60\5\uffff";
    static final String DFA7_maxS =
        "\1\174\5\uffff\1\75\6\uffff\1\164\1\141\1\170\1\157\1\163\1\151"+
        "\1\165\1\164\1\162\1\145\1\171\1\163\1\151\4\uffff\1\154\1\172\1"+
        "\163\1\144\1\164\1\162\1\172\1\155\1\154\1\150\1\143\1\157\1\156"+
        "\1\160\2\145\1\164\1\172\1\uffff\1\145\1\172\1\145\1\172\1\uffff"+
        "\1\151\1\154\1\145\1\153\1\152\1\141\1\145\1\172\1\156\1\150\1\uffff"+
        "\1\172\1\uffff\1\162\1\uffff\1\164\1\172\1\162\1\141\1\145\1\155"+
        "\1\172\1\uffff\2\172\1\uffff\1\144\1\156\1\145\1\uffff\1\163\1\147"+
        "\1\143\1\145\3\uffff\1\163\1\141\1\144\1\172\1\145\1\164\1\163\1"+
        "\172\1\154\1\172\1\uffff\3\172\1\uffff\1\172\5\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\15\uffff\1\40\1\41\1\7\1\6\22\uffff\1\17\4\uffff\1\23\12\uffff"+
        "\1\16\1\uffff\1\21\1\uffff\1\22\7\uffff\1\33\2\uffff\1\20\3\uffff"+
        "\1\25\4\uffff\1\32\1\34\1\35\12\uffff\1\26\3\uffff\1\36\1\uffff"+
        "\1\24\1\27\1\30\1\31\1\37";
    static final String DFA7_specialS =
        "\160\uffff}>";
    static final String[] DFA7_transitionS = {
            "\3\33\1\uffff\2\33\22\uffff\1\33\1\uffff\1\14\3\uffff\1\1\1"+
            "\11\1\2\1\3\2\uffff\1\4\1\13\1\5\13\uffff\1\6\1\7\1\uffff\1"+
            "\10\3\uffff\1\15\1\32\1\16\1\32\1\17\1\20\2\32\1\21\2\32\1\22"+
            "\1\32\1\23\1\24\1\25\1\32\1\26\1\32\1\27\1\30\1\32\1\31\3\32"+
            "\6\uffff\1\15\1\32\1\16\1\32\1\17\1\20\2\32\1\21\2\32\1\22\1"+
            "\32\1\23\1\24\1\25\1\32\1\26\1\32\1\27\1\30\1\32\1\31\3\32\1"+
            "\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\7\uffff\1\37\27\uffff\1\36\7\uffff\1\37",
            "\1\40\37\uffff\1\40",
            "\1\41\11\uffff\1\42\25\uffff\1\41\11\uffff\1\42",
            "\1\43\37\uffff\1\43",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\20\uffff\1\51\16\uffff\1\50\20\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\1\56\36\uffff\1\55\1\56",
            "",
            "",
            "",
            "",
            "\1\57\37\uffff\1\57",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\61\37\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\76\37\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\101\37\uffff\1\101",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\103\37\uffff\1\103",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\105\37\uffff\1\105",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\120\3\uffff\1\121\33\uffff\1\120\3\uffff\1\121",
            "",
            "\1\122\37\uffff\1\122",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "",
            "",
            "",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147",
            "\1\150\37\uffff\1\150",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\152\37\uffff\1\152",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | COMMENT | STRING_LITERAL | ALL | AT | CASE | END | FOR | IS | LIMITED | NULL | OTHERS | PACKAGE | PROJECT | RENAMES | TYPE | USE | WHEN | WITH | EXTENDS | EXTERNAL | IDENTIFIER | WS );";
        }
    }
 

}