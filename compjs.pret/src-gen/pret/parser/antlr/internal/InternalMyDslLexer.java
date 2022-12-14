package pret.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_RCHARIOT=5;
    public static final int RULE_VARIABLE=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'function' )
            // InternalMyDsl.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( ':' )
            // InternalMyDsl.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'read' )
            // InternalMyDsl.g:13:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '%' )
            // InternalMyDsl.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'write' )
            // InternalMyDsl.g:15:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( ',' )
            // InternalMyDsl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( ';' )
            // InternalMyDsl.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'nop' )
            // InternalMyDsl.g:18:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( ':=' )
            // InternalMyDsl.g:19:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'if' )
            // InternalMyDsl.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'then' )
            // InternalMyDsl.g:21:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'else' )
            // InternalMyDsl.g:22:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'fi' )
            // InternalMyDsl.g:23:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'while' )
            // InternalMyDsl.g:24:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'do' )
            // InternalMyDsl.g:25:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'od' )
            // InternalMyDsl.g:26:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'for' )
            // InternalMyDsl.g:27:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'foreach' )
            // InternalMyDsl.g:28:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'in' )
            // InternalMyDsl.g:29:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( '=?' )
            // InternalMyDsl.g:30:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'nil' )
            // InternalMyDsl.g:31:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '(' )
            // InternalMyDsl.g:32:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( ')' )
            // InternalMyDsl.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'hd' )
            // InternalMyDsl.g:34:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'tl' )
            // InternalMyDsl.g:35:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'cons' )
            // InternalMyDsl.g:36:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'list' )
            // InternalMyDsl.g:37:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1760:13: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )? )
            // InternalMyDsl.g:1760:15: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // InternalMyDsl.g:1760:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:1760:54: ( '!' | '?' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='!'||LA2_0=='?') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1762:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )? )
            // InternalMyDsl.g:1762:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('A','Z'); 
            // InternalMyDsl.g:1762:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:1762:56: ( '!' | '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='!'||LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_RCHARIOT"
    public final void mRULE_RCHARIOT() throws RecognitionException {
        try {
            int _type = RULE_RCHARIOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1764:15: ( '\\n' )
            // InternalMyDsl.g:1764:17: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RCHARIOT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1766:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1766:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1766:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1766:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1766:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1768:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1768:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1768:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1768:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1770:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1770:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1770:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1770:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1770:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:1770:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1770:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1770:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1770:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:1770:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1770:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1772:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1772:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1772:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1772:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1774:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1774:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1774:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1774:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMyDsl.g:1774:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1774:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1774:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:1774:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1776:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1776:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1776:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1778:16: ( . )
            // InternalMyDsl.g:1778:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_SYMBOL | RULE_VARIABLE | RULE_RCHARIOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=37;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMyDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:184: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:198: RULE_RCHARIOT
                {
                mRULE_RCHARIOT(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:212: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:220: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:229: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:241: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:257: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:273: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:281: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\43\1\46\1\43\1\uffff\1\43\2\uffff\6\43\1\36\2\uffff\4\43\1\75\1\76\1\36\2\uffff\3\36\2\uffff\1\43\1\105\2\43\4\uffff\1\43\1\uffff\2\43\2\uffff\2\43\1\114\1\115\1\43\1\117\1\43\1\121\1\122\3\uffff\1\123\2\43\1\75\7\uffff\1\43\1\uffff\1\130\3\43\1\134\1\135\2\uffff\1\43\1\uffff\1\43\3\uffff\4\43\1\uffff\1\144\2\43\2\uffff\1\147\1\150\1\151\1\152\2\43\1\uffff\1\155\1\156\4\uffff\2\43\2\uffff\1\43\1\162\1\163\2\uffff";
    static final String DFA16_eofS =
        "\164\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\6\60\1\77\2\uffff\5\60\1\11\1\101\2\uffff\2\0\1\52\2\uffff\1\60\1\41\2\60\4\uffff\1\60\1\uffff\2\60\2\uffff\2\60\2\41\1\60\1\41\1\60\2\41\3\uffff\1\41\3\60\7\uffff\1\60\1\uffff\1\41\3\60\2\41\2\uffff\1\60\1\uffff\1\60\3\uffff\4\60\1\uffff\1\41\2\60\2\uffff\4\41\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\1\77\2\uffff\5\172\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\4\172\4\uffff\1\172\1\uffff\2\172\2\uffff\11\172\3\uffff\4\172\7\uffff\1\172\1\uffff\6\172\2\uffff\1\172\1\uffff\1\172\3\uffff\4\172\1\uffff\3\172\2\uffff\6\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\7\uffff\1\26\1\27\7\uffff\1\37\1\40\3\uffff\1\44\1\45\4\uffff\1\34\1\37\1\11\1\2\1\uffff\1\4\2\uffff\1\6\1\7\11\uffff\1\24\1\26\1\27\4\uffff\1\35\1\36\1\44\1\40\1\41\1\42\1\43\1\uffff\1\15\6\uffff\1\12\1\23\1\uffff\1\31\1\uffff\1\17\1\20\1\30\4\uffff\1\21\3\uffff\1\10\1\25\6\uffff\1\3\2\uffff\1\13\1\14\1\32\1\33\2\uffff\1\5\1\16\3\uffff\1\22\1\1";
    static final String DFA16_specialS =
        "\1\0\31\uffff\1\2\1\1\130\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\36\1\35\1\26\2\36\1\35\22\36\1\35\1\36\1\32\2\36\1\4\1\36\1\33\1\17\1\20\2\36\1\6\2\36\1\34\12\31\1\2\1\7\1\36\1\16\3\36\32\25\3\36\1\27\1\30\1\36\2\24\1\22\1\14\1\13\1\1\1\24\1\21\1\11\2\24\1\23\1\24\1\10\1\15\2\24\1\3\1\24\1\12\2\24\1\5\3\24\uff85\36",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\10\42\1\40\5\42\1\41\5\42\1\37\5\42",
            "\1\45",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42\1\47\25\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\7\42\1\52\11\42\1\51\10\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\10\42\1\56\5\42\1\55\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\5\42\1\57\7\42\1\60\14\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\7\42\1\61\3\42\1\62\16\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\13\42\1\63\16\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\16\42\1\64\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\3\42\1\65\26\42",
            "\1\66",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\3\42\1\71\26\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\16\42\1\72\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\10\42\1\73\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\12\74\7\uffff\32\74\4\uffff\1\44\1\uffff\32\74",
            "\2\77\2\uffff\1\77\22\uffff\1\77",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\101",
            "\0\101",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15\42\1\104\14\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\21\42\1\106\10\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\107\31\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\10\42\1\110\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\10\42\1\111\21\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\17\42\1\112\12\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\13\42\1\113\16\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42\1\116\25\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\22\42\1\120\7\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "",
            "",
            "",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15\42\1\124\14\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\22\42\1\125\7\42",
            "\12\74\7\uffff\32\74\4\uffff\1\44\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\2\42\1\126\27\42",
            "",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\4\42\1\127\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\3\42\1\131\26\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23\42\1\132\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\13\42\1\133\16\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15\42\1\136\14\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42\1\137\25\42",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\22\42\1\140\7\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23\42\1\141\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23\42\1\142\6\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\143\31\42",
            "",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42\1\145\25\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42\1\146\25\42",
            "",
            "",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\10\42\1\153\21\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\2\42\1\154\27\42",
            "",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\16\42\1\157\13\42",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\7\42\1\160\22\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15\42\1\161\14\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "\1\43\16\uffff\12\42\5\uffff\1\43\1\uffff\32\42\4\uffff\1\44\1\uffff\32\42",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_SYMBOL | RULE_VARIABLE | RULE_RCHARIOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='f') ) {s = 1;}

                        else if ( (LA16_0==':') ) {s = 2;}

                        else if ( (LA16_0=='r') ) {s = 3;}

                        else if ( (LA16_0=='%') ) {s = 4;}

                        else if ( (LA16_0=='w') ) {s = 5;}

                        else if ( (LA16_0==',') ) {s = 6;}

                        else if ( (LA16_0==';') ) {s = 7;}

                        else if ( (LA16_0=='n') ) {s = 8;}

                        else if ( (LA16_0=='i') ) {s = 9;}

                        else if ( (LA16_0=='t') ) {s = 10;}

                        else if ( (LA16_0=='e') ) {s = 11;}

                        else if ( (LA16_0=='d') ) {s = 12;}

                        else if ( (LA16_0=='o') ) {s = 13;}

                        else if ( (LA16_0=='=') ) {s = 14;}

                        else if ( (LA16_0=='(') ) {s = 15;}

                        else if ( (LA16_0==')') ) {s = 16;}

                        else if ( (LA16_0=='h') ) {s = 17;}

                        else if ( (LA16_0=='c') ) {s = 18;}

                        else if ( (LA16_0=='l') ) {s = 19;}

                        else if ( ((LA16_0>='a' && LA16_0<='b')||LA16_0=='g'||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='p' && LA16_0<='q')||LA16_0=='s'||(LA16_0>='u' && LA16_0<='v')||(LA16_0>='x' && LA16_0<='z')) ) {s = 20;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')) ) {s = 21;}

                        else if ( (LA16_0=='\n') ) {s = 22;}

                        else if ( (LA16_0=='^') ) {s = 23;}

                        else if ( (LA16_0=='_') ) {s = 24;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 25;}

                        else if ( (LA16_0=='\"') ) {s = 26;}

                        else if ( (LA16_0=='\'') ) {s = 27;}

                        else if ( (LA16_0=='/') ) {s = 28;}

                        else if ( (LA16_0=='\t'||LA16_0=='\r'||LA16_0==' ') ) {s = 29;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='$')||LA16_0=='&'||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||LA16_0=='<'||(LA16_0>='>' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_27 = input.LA(1);

                        s = -1;
                        if ( ((LA16_27>='\u0000' && LA16_27<='\uFFFF')) ) {s = 65;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_26 = input.LA(1);

                        s = -1;
                        if ( ((LA16_26>='\u0000' && LA16_26<='\uFFFF')) ) {s = 65;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}