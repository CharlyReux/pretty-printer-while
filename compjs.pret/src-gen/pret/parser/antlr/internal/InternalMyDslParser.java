package pret.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pret.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_RCHARIOT", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'=?'", "'nil'", "'('", "')'", "'hd'", "'tl'", "'cons'", "'list'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_programme_0_0= ruleProgram ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_programme_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_programme_0_0= ruleProgram ) ) )
            // InternalMyDsl.g:78:2: ( (lv_programme_0_0= ruleProgram ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_programme_0_0= ruleProgram ) )
            // InternalMyDsl.g:79:3: (lv_programme_0_0= ruleProgram )
            {
            // InternalMyDsl.g:79:3: (lv_programme_0_0= ruleProgram )
            // InternalMyDsl.g:80:4: lv_programme_0_0= ruleProgram
            {

            				newCompositeNode(grammarAccess.getModelAccess().getProgrammeProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_programme_0_0=ruleProgram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"programme",
            					lv_programme_0_0,
            					"pret.MyDsl.Program");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:107:1: ruleProgram returns [EObject current=null] : ( (lv_func_0_0= ruleFunction ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_func_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (lv_func_0_0= ruleFunction ) )+ )
            // InternalMyDsl.g:114:2: ( (lv_func_0_0= ruleFunction ) )+
            {
            // InternalMyDsl.g:114:2: ( (lv_func_0_0= ruleFunction ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:115:3: (lv_func_0_0= ruleFunction )
            	    {
            	    // InternalMyDsl.g:115:3: (lv_func_0_0= ruleFunction )
            	    // InternalMyDsl.g:116:4: lv_func_0_0= ruleFunction
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getFuncFunctionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_func_0_0=ruleFunction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"func",
            	    					lv_func_0_0,
            	    					"pret.MyDsl.Function");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:136:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:136:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:137:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:143:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_fname_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_fdef_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fname_1_0=null;
        Token otherlv_2=null;
        EObject lv_fdef_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'function' ( (lv_fname_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_fdef_3_0= ruleDefinition ) ) ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'function' ( (lv_fname_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_fdef_3_0= ruleDefinition ) ) )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'function' ( (lv_fname_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_fdef_3_0= ruleDefinition ) ) )
            // InternalMyDsl.g:151:3: otherlv_0= 'function' ( (lv_fname_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_fdef_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_fname_1_0= RULE_SYMBOL ) )
            // InternalMyDsl.g:156:4: (lv_fname_1_0= RULE_SYMBOL )
            {
            // InternalMyDsl.g:156:4: (lv_fname_1_0= RULE_SYMBOL )
            // InternalMyDsl.g:157:5: lv_fname_1_0= RULE_SYMBOL
            {
            lv_fname_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_5); 

            					newLeafNode(lv_fname_1_0, grammarAccess.getFunctionAccess().getFnameSYMBOLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fname",
            						lv_fname_1_0,
            						"pret.MyDsl.SYMBOL");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:177:3: ( (lv_fdef_3_0= ruleDefinition ) )
            // InternalMyDsl.g:178:4: (lv_fdef_3_0= ruleDefinition )
            {
            // InternalMyDsl.g:178:4: (lv_fdef_3_0= ruleDefinition )
            // InternalMyDsl.g:179:5: lv_fdef_3_0= ruleDefinition
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getFdefDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_fdef_3_0=ruleDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"fdef",
            						lv_fdef_3_0,
            						"pret.MyDsl.Definition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:200:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMyDsl.g:200:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMyDsl.g:201:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:207:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_defInput_1_0= ruleInput ) ) (this_RCHARIOT_2= RULE_RCHARIOT )* otherlv_3= '%' (this_RCHARIOT_4= RULE_RCHARIOT )* ( (lv_defCommands_5_0= ruleCommands ) ) (this_RCHARIOT_6= RULE_RCHARIOT )* otherlv_7= '%' otherlv_8= 'write' ( (lv_defOutput_9_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_RCHARIOT_2=null;
        Token otherlv_3=null;
        Token this_RCHARIOT_4=null;
        Token this_RCHARIOT_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_defInput_1_0 = null;

        EObject lv_defCommands_5_0 = null;

        EObject lv_defOutput_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:213:2: ( (otherlv_0= 'read' ( (lv_defInput_1_0= ruleInput ) ) (this_RCHARIOT_2= RULE_RCHARIOT )* otherlv_3= '%' (this_RCHARIOT_4= RULE_RCHARIOT )* ( (lv_defCommands_5_0= ruleCommands ) ) (this_RCHARIOT_6= RULE_RCHARIOT )* otherlv_7= '%' otherlv_8= 'write' ( (lv_defOutput_9_0= ruleOutput ) ) ) )
            // InternalMyDsl.g:214:2: (otherlv_0= 'read' ( (lv_defInput_1_0= ruleInput ) ) (this_RCHARIOT_2= RULE_RCHARIOT )* otherlv_3= '%' (this_RCHARIOT_4= RULE_RCHARIOT )* ( (lv_defCommands_5_0= ruleCommands ) ) (this_RCHARIOT_6= RULE_RCHARIOT )* otherlv_7= '%' otherlv_8= 'write' ( (lv_defOutput_9_0= ruleOutput ) ) )
            {
            // InternalMyDsl.g:214:2: (otherlv_0= 'read' ( (lv_defInput_1_0= ruleInput ) ) (this_RCHARIOT_2= RULE_RCHARIOT )* otherlv_3= '%' (this_RCHARIOT_4= RULE_RCHARIOT )* ( (lv_defCommands_5_0= ruleCommands ) ) (this_RCHARIOT_6= RULE_RCHARIOT )* otherlv_7= '%' otherlv_8= 'write' ( (lv_defOutput_9_0= ruleOutput ) ) )
            // InternalMyDsl.g:215:3: otherlv_0= 'read' ( (lv_defInput_1_0= ruleInput ) ) (this_RCHARIOT_2= RULE_RCHARIOT )* otherlv_3= '%' (this_RCHARIOT_4= RULE_RCHARIOT )* ( (lv_defCommands_5_0= ruleCommands ) ) (this_RCHARIOT_6= RULE_RCHARIOT )* otherlv_7= '%' otherlv_8= 'write' ( (lv_defOutput_9_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
            		
            // InternalMyDsl.g:219:3: ( (lv_defInput_1_0= ruleInput ) )
            // InternalMyDsl.g:220:4: (lv_defInput_1_0= ruleInput )
            {
            // InternalMyDsl.g:220:4: (lv_defInput_1_0= ruleInput )
            // InternalMyDsl.g:221:5: lv_defInput_1_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getDefInputInputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_defInput_1_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"defInput",
            						lv_defInput_1_0,
            						"pret.MyDsl.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:238:3: (this_RCHARIOT_2= RULE_RCHARIOT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_RCHARIOT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:239:4: this_RCHARIOT_2= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_2=(Token)match(input,RULE_RCHARIOT,FOLLOW_8); 

            	    				newLeafNode(this_RCHARIOT_2, grammarAccess.getDefinitionAccess().getRCHARIOTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getPercentSignKeyword_3());
            		
            // InternalMyDsl.g:248:3: (this_RCHARIOT_4= RULE_RCHARIOT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_RCHARIOT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:249:4: this_RCHARIOT_4= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_4=(Token)match(input,RULE_RCHARIOT,FOLLOW_9); 

            	    				newLeafNode(this_RCHARIOT_4, grammarAccess.getDefinitionAccess().getRCHARIOTTerminalRuleCall_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:254:3: ( (lv_defCommands_5_0= ruleCommands ) )
            // InternalMyDsl.g:255:4: (lv_defCommands_5_0= ruleCommands )
            {
            // InternalMyDsl.g:255:4: (lv_defCommands_5_0= ruleCommands )
            // InternalMyDsl.g:256:5: lv_defCommands_5_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getDefCommandsCommandsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_defCommands_5_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"defCommands",
            						lv_defCommands_5_0,
            						"pret.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:273:3: (this_RCHARIOT_6= RULE_RCHARIOT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_RCHARIOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:274:4: this_RCHARIOT_6= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_6=(Token)match(input,RULE_RCHARIOT,FOLLOW_8); 

            	    				newLeafNode(this_RCHARIOT_6, grammarAccess.getDefinitionAccess().getRCHARIOTTerminalRuleCall_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getPercentSignKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getDefinitionAccess().getWriteKeyword_8());
            		
            // InternalMyDsl.g:287:3: ( (lv_defOutput_9_0= ruleOutput ) )
            // InternalMyDsl.g:288:4: (lv_defOutput_9_0= ruleOutput )
            {
            // InternalMyDsl.g:288:4: (lv_defOutput_9_0= ruleOutput )
            // InternalMyDsl.g:289:5: lv_defOutput_9_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getDefOutputOutputParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_defOutput_9_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"defOutput",
            						lv_defOutput_9_0,
            						"pret.MyDsl.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalMyDsl.g:310:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalMyDsl.g:310:46: (iv_ruleInput= ruleInput EOF )
            // InternalMyDsl.g:311:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalMyDsl.g:317:1: ruleInput returns [EObject current=null] : ( ( (lv_vai_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vai_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_vai_0_0=null;
        Token otherlv_1=null;
        Token lv_vai_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:323:2: ( ( ( (lv_vai_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vai_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalMyDsl.g:324:2: ( ( (lv_vai_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vai_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalMyDsl.g:324:2: ( ( (lv_vai_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vai_2_0= RULE_VARIABLE ) ) )* )
            // InternalMyDsl.g:325:3: ( (lv_vai_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vai_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalMyDsl.g:325:3: ( (lv_vai_0_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:326:4: (lv_vai_0_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:326:4: (lv_vai_0_0= RULE_VARIABLE )
            // InternalMyDsl.g:327:5: lv_vai_0_0= RULE_VARIABLE
            {
            lv_vai_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_vai_0_0, grammarAccess.getInputAccess().getVaiVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vai",
            						lv_vai_0_0,
            						"pret.MyDsl.VARIABLE");
            				

            }


            }

            // InternalMyDsl.g:343:3: (otherlv_1= ',' ( (lv_vai_2_0= RULE_VARIABLE ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:344:4: otherlv_1= ',' ( (lv_vai_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:348:4: ( (lv_vai_2_0= RULE_VARIABLE ) )
            	    // InternalMyDsl.g:349:5: (lv_vai_2_0= RULE_VARIABLE )
            	    {
            	    // InternalMyDsl.g:349:5: (lv_vai_2_0= RULE_VARIABLE )
            	    // InternalMyDsl.g:350:6: lv_vai_2_0= RULE_VARIABLE
            	    {
            	    lv_vai_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_vai_2_0, grammarAccess.getInputAccess().getVaiVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vai",
            	    							lv_vai_2_0,
            	    							"pret.MyDsl.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalMyDsl.g:371:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalMyDsl.g:371:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalMyDsl.g:372:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalMyDsl.g:378:1: ruleOutput returns [EObject current=null] : ( ( (lv_vao_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vao_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_vao_0_0=null;
        Token otherlv_1=null;
        Token lv_vao_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:384:2: ( ( ( (lv_vao_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vao_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalMyDsl.g:385:2: ( ( (lv_vao_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vao_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalMyDsl.g:385:2: ( ( (lv_vao_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vao_2_0= RULE_VARIABLE ) ) )* )
            // InternalMyDsl.g:386:3: ( (lv_vao_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vao_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalMyDsl.g:386:3: ( (lv_vao_0_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:387:4: (lv_vao_0_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:387:4: (lv_vao_0_0= RULE_VARIABLE )
            // InternalMyDsl.g:388:5: lv_vao_0_0= RULE_VARIABLE
            {
            lv_vao_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_vao_0_0, grammarAccess.getOutputAccess().getVaoVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vao",
            						lv_vao_0_0,
            						"pret.MyDsl.VARIABLE");
            				

            }


            }

            // InternalMyDsl.g:404:3: (otherlv_1= ',' ( (lv_vao_2_0= RULE_VARIABLE ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:405:4: otherlv_1= ',' ( (lv_vao_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:409:4: ( (lv_vao_2_0= RULE_VARIABLE ) )
            	    // InternalMyDsl.g:410:5: (lv_vao_2_0= RULE_VARIABLE )
            	    {
            	    // InternalMyDsl.g:410:5: (lv_vao_2_0= RULE_VARIABLE )
            	    // InternalMyDsl.g:411:6: lv_vao_2_0= RULE_VARIABLE
            	    {
            	    lv_vao_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_vao_2_0, grammarAccess.getOutputAccess().getVaoVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vao",
            	    							lv_vao_2_0,
            	    							"pret.MyDsl.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalMyDsl.g:432:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalMyDsl.g:432:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalMyDsl.g:433:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalMyDsl.g:439:1: ruleCommands returns [EObject current=null] : ( ( (lv_LCommand_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_LCommand_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_LCommand_0_0 = null;

        EObject lv_LCommand_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:445:2: ( ( ( (lv_LCommand_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_LCommand_2_0= ruleCommand ) ) )* ) )
            // InternalMyDsl.g:446:2: ( ( (lv_LCommand_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_LCommand_2_0= ruleCommand ) ) )* )
            {
            // InternalMyDsl.g:446:2: ( ( (lv_LCommand_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_LCommand_2_0= ruleCommand ) ) )* )
            // InternalMyDsl.g:447:3: ( (lv_LCommand_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_LCommand_2_0= ruleCommand ) ) )*
            {
            // InternalMyDsl.g:447:3: ( (lv_LCommand_0_0= ruleCommand ) )
            // InternalMyDsl.g:448:4: (lv_LCommand_0_0= ruleCommand )
            {
            // InternalMyDsl.g:448:4: (lv_LCommand_0_0= ruleCommand )
            // InternalMyDsl.g:449:5: lv_LCommand_0_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getCommandsAccess().getLCommandCommandParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_LCommand_0_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandsRule());
            					}
            					add(
            						current,
            						"LCommand",
            						lv_LCommand_0_0,
            						"pret.MyDsl.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:466:3: (otherlv_1= ';' ( (lv_LCommand_2_0= ruleCommand ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:467:4: otherlv_1= ';' ( (lv_LCommand_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:471:4: ( (lv_LCommand_2_0= ruleCommand ) )
            	    // InternalMyDsl.g:472:5: (lv_LCommand_2_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:472:5: (lv_LCommand_2_0= ruleCommand )
            	    // InternalMyDsl.g:473:6: lv_LCommand_2_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getCommandsAccess().getLCommandCommandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_LCommand_2_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"LCommand",
            	    							lv_LCommand_2_0,
            	    							"pret.MyDsl.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:495:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:495:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:496:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:502:1: ruleCommand returns [EObject current=null] : ( ( (lv_eq_0_0= ruleEqual ) ) | ( (lv_if_1_0= ruleIf ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_fo_3_0= ruleFor ) ) | ( (lv_fore_4_0= ruleForeach ) ) | ( (lv_no_5_0= 'nop' ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_no_5_0=null;
        EObject lv_eq_0_0 = null;

        EObject lv_if_1_0 = null;

        EObject lv_wh_2_0 = null;

        EObject lv_fo_3_0 = null;

        EObject lv_fore_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:508:2: ( ( ( (lv_eq_0_0= ruleEqual ) ) | ( (lv_if_1_0= ruleIf ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_fo_3_0= ruleFor ) ) | ( (lv_fore_4_0= ruleForeach ) ) | ( (lv_no_5_0= 'nop' ) ) ) )
            // InternalMyDsl.g:509:2: ( ( (lv_eq_0_0= ruleEqual ) ) | ( (lv_if_1_0= ruleIf ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_fo_3_0= ruleFor ) ) | ( (lv_fore_4_0= ruleForeach ) ) | ( (lv_no_5_0= 'nop' ) ) )
            {
            // InternalMyDsl.g:509:2: ( ( (lv_eq_0_0= ruleEqual ) ) | ( (lv_if_1_0= ruleIf ) ) | ( (lv_wh_2_0= ruleWhile ) ) | ( (lv_fo_3_0= ruleFor ) ) | ( (lv_fore_4_0= ruleForeach ) ) | ( (lv_no_5_0= 'nop' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_VARIABLE:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 27:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:510:3: ( (lv_eq_0_0= ruleEqual ) )
                    {
                    // InternalMyDsl.g:510:3: ( (lv_eq_0_0= ruleEqual ) )
                    // InternalMyDsl.g:511:4: (lv_eq_0_0= ruleEqual )
                    {
                    // InternalMyDsl.g:511:4: (lv_eq_0_0= ruleEqual )
                    // InternalMyDsl.g:512:5: lv_eq_0_0= ruleEqual
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getEqEqualParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_eq_0_0=ruleEqual();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"eq",
                    						lv_eq_0_0,
                    						"pret.MyDsl.Equal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:530:3: ( (lv_if_1_0= ruleIf ) )
                    {
                    // InternalMyDsl.g:530:3: ( (lv_if_1_0= ruleIf ) )
                    // InternalMyDsl.g:531:4: (lv_if_1_0= ruleIf )
                    {
                    // InternalMyDsl.g:531:4: (lv_if_1_0= ruleIf )
                    // InternalMyDsl.g:532:5: lv_if_1_0= ruleIf
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getIfIfParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_if_1_0=ruleIf();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"if",
                    						lv_if_1_0,
                    						"pret.MyDsl.If");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:550:3: ( (lv_wh_2_0= ruleWhile ) )
                    {
                    // InternalMyDsl.g:550:3: ( (lv_wh_2_0= ruleWhile ) )
                    // InternalMyDsl.g:551:4: (lv_wh_2_0= ruleWhile )
                    {
                    // InternalMyDsl.g:551:4: (lv_wh_2_0= ruleWhile )
                    // InternalMyDsl.g:552:5: lv_wh_2_0= ruleWhile
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getWhWhileParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_wh_2_0=ruleWhile();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"wh",
                    						lv_wh_2_0,
                    						"pret.MyDsl.While");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:570:3: ( (lv_fo_3_0= ruleFor ) )
                    {
                    // InternalMyDsl.g:570:3: ( (lv_fo_3_0= ruleFor ) )
                    // InternalMyDsl.g:571:4: (lv_fo_3_0= ruleFor )
                    {
                    // InternalMyDsl.g:571:4: (lv_fo_3_0= ruleFor )
                    // InternalMyDsl.g:572:5: lv_fo_3_0= ruleFor
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getFoForParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fo_3_0=ruleFor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"fo",
                    						lv_fo_3_0,
                    						"pret.MyDsl.For");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:590:3: ( (lv_fore_4_0= ruleForeach ) )
                    {
                    // InternalMyDsl.g:590:3: ( (lv_fore_4_0= ruleForeach ) )
                    // InternalMyDsl.g:591:4: (lv_fore_4_0= ruleForeach )
                    {
                    // InternalMyDsl.g:591:4: (lv_fore_4_0= ruleForeach )
                    // InternalMyDsl.g:592:5: lv_fore_4_0= ruleForeach
                    {

                    					newCompositeNode(grammarAccess.getCommandAccess().getForeForeachParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fore_4_0=ruleForeach();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCommandRule());
                    					}
                    					set(
                    						current,
                    						"fore",
                    						lv_fore_4_0,
                    						"pret.MyDsl.Foreach");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:610:3: ( (lv_no_5_0= 'nop' ) )
                    {
                    // InternalMyDsl.g:610:3: ( (lv_no_5_0= 'nop' ) )
                    // InternalMyDsl.g:611:4: (lv_no_5_0= 'nop' )
                    {
                    // InternalMyDsl.g:611:4: (lv_no_5_0= 'nop' )
                    // InternalMyDsl.g:612:5: lv_no_5_0= 'nop'
                    {
                    lv_no_5_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_no_5_0, grammarAccess.getCommandAccess().getNoNopKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommandRule());
                    					}
                    					setWithLastConsumed(current, "no", lv_no_5_0, "nop");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleEqual"
    // InternalMyDsl.g:628:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalMyDsl.g:628:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalMyDsl.g:629:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalMyDsl.g:635:1: ruleEqual returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:641:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) ) )
            // InternalMyDsl.g:642:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            {
            // InternalMyDsl.g:642:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) ) )
            // InternalMyDsl.g:643:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exp_2_0= ruleExprs ) )
            {
            // InternalMyDsl.g:643:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalMyDsl.g:644:4: (lv_vars_0_0= ruleVars )
            {
            // InternalMyDsl.g:644:4: (lv_vars_0_0= ruleVars )
            // InternalMyDsl.g:645:5: lv_vars_0_0= ruleVars
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getVarsVarsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_vars_0_0=ruleVars();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"pret.MyDsl.Vars");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getColonEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:666:3: ( (lv_exp_2_0= ruleExprs ) )
            // InternalMyDsl.g:667:4: (lv_exp_2_0= ruleExprs )
            {
            // InternalMyDsl.g:667:4: (lv_exp_2_0= ruleExprs )
            // InternalMyDsl.g:668:5: lv_exp_2_0= ruleExprs
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getExpExprsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExprs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"pret.MyDsl.Exprs");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:689:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:689:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:690:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:696:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'then' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_iflc_4_0= ruleCommands ) ) ( (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) ) )? (this_RCHARIOT_8= RULE_RCHARIOT )* otherlv_9= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_RCHARIOT_3=null;
        Token this_RCHARIOT_5=null;
        Token otherlv_6=null;
        Token this_RCHARIOT_8=null;
        Token otherlv_9=null;
        EObject lv_exp_1_0 = null;

        EObject lv_iflc_4_0 = null;

        EObject lv_ellc_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:702:2: ( (otherlv_0= 'if' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'then' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_iflc_4_0= ruleCommands ) ) ( (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) ) )? (this_RCHARIOT_8= RULE_RCHARIOT )* otherlv_9= 'fi' ) )
            // InternalMyDsl.g:703:2: (otherlv_0= 'if' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'then' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_iflc_4_0= ruleCommands ) ) ( (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) ) )? (this_RCHARIOT_8= RULE_RCHARIOT )* otherlv_9= 'fi' )
            {
            // InternalMyDsl.g:703:2: (otherlv_0= 'if' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'then' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_iflc_4_0= ruleCommands ) ) ( (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) ) )? (this_RCHARIOT_8= RULE_RCHARIOT )* otherlv_9= 'fi' )
            // InternalMyDsl.g:704:3: otherlv_0= 'if' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'then' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_iflc_4_0= ruleCommands ) ) ( (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) ) )? (this_RCHARIOT_8= RULE_RCHARIOT )* otherlv_9= 'fi'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            // InternalMyDsl.g:708:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalMyDsl.g:709:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalMyDsl.g:709:4: (lv_exp_1_0= ruleExpression )
            // InternalMyDsl.g:710:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"pret.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
            		
            // InternalMyDsl.g:731:3: (this_RCHARIOT_3= RULE_RCHARIOT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_RCHARIOT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:732:4: this_RCHARIOT_3= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_3=(Token)match(input,RULE_RCHARIOT,FOLLOW_9); 

            	    				newLeafNode(this_RCHARIOT_3, grammarAccess.getIfAccess().getRCHARIOTTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:737:3: ( (lv_iflc_4_0= ruleCommands ) )
            // InternalMyDsl.g:738:4: (lv_iflc_4_0= ruleCommands )
            {
            // InternalMyDsl.g:738:4: (lv_iflc_4_0= ruleCommands )
            // InternalMyDsl.g:739:5: lv_iflc_4_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getIfAccess().getIflcCommandsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_iflc_4_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"iflc",
            						lv_iflc_4_0,
            						"pret.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:756:3: ( (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) ) )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:757:4: (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) )
                    {
                    // InternalMyDsl.g:757:4: (this_RCHARIOT_5= RULE_RCHARIOT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_RCHARIOT) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:758:5: this_RCHARIOT_5= RULE_RCHARIOT
                    	    {
                    	    this_RCHARIOT_5=(Token)match(input,RULE_RCHARIOT,FOLLOW_17); 

                    	    					newLeafNode(this_RCHARIOT_5, grammarAccess.getIfAccess().getRCHARIOTTerminalRuleCall_5_0());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseKeyword_5_1());
                    			
                    // InternalMyDsl.g:767:4: ( (lv_ellc_7_0= ruleCommands ) )
                    // InternalMyDsl.g:768:5: (lv_ellc_7_0= ruleCommands )
                    {
                    // InternalMyDsl.g:768:5: (lv_ellc_7_0= ruleCommands )
                    // InternalMyDsl.g:769:6: lv_ellc_7_0= ruleCommands
                    {

                    						newCompositeNode(grammarAccess.getIfAccess().getEllcCommandsParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_ellc_7_0=ruleCommands();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfRule());
                    						}
                    						set(
                    							current,
                    							"ellc",
                    							lv_ellc_7_0,
                    							"pret.MyDsl.Commands");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:787:3: (this_RCHARIOT_8= RULE_RCHARIOT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_RCHARIOT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:788:4: this_RCHARIOT_8= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_8=(Token)match(input,RULE_RCHARIOT,FOLLOW_18); 

            	    				newLeafNode(this_RCHARIOT_8, grammarAccess.getIfAccess().getRCHARIOTTerminalRuleCall_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getIfAccess().getFiKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalMyDsl.g:801:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalMyDsl.g:801:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalMyDsl.g:802:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalMyDsl.g:808:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_whcom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_RCHARIOT_3=null;
        Token this_RCHARIOT_5=null;
        Token otherlv_6=null;
        EObject lv_exp_1_0 = null;

        EObject lv_whcom_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:814:2: ( (otherlv_0= 'while' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_whcom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' ) )
            // InternalMyDsl.g:815:2: (otherlv_0= 'while' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_whcom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' )
            {
            // InternalMyDsl.g:815:2: (otherlv_0= 'while' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_whcom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' )
            // InternalMyDsl.g:816:3: otherlv_0= 'while' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_whcom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            // InternalMyDsl.g:820:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalMyDsl.g:821:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalMyDsl.g:821:4: (lv_exp_1_0= ruleExpression )
            // InternalMyDsl.g:822:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"pret.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
            		
            // InternalMyDsl.g:843:3: (this_RCHARIOT_3= RULE_RCHARIOT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_RCHARIOT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:844:4: this_RCHARIOT_3= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_3=(Token)match(input,RULE_RCHARIOT,FOLLOW_9); 

            	    				newLeafNode(this_RCHARIOT_3, grammarAccess.getWhileAccess().getRCHARIOTTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMyDsl.g:849:3: ( (lv_whcom_4_0= ruleCommands ) )
            // InternalMyDsl.g:850:4: (lv_whcom_4_0= ruleCommands )
            {
            // InternalMyDsl.g:850:4: (lv_whcom_4_0= ruleCommands )
            // InternalMyDsl.g:851:5: lv_whcom_4_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getWhcomCommandsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_whcom_4_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"whcom",
            						lv_whcom_4_0,
            						"pret.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:868:3: (this_RCHARIOT_5= RULE_RCHARIOT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_RCHARIOT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:869:4: this_RCHARIOT_5= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_5=(Token)match(input,RULE_RCHARIOT,FOLLOW_20); 

            	    				newLeafNode(this_RCHARIOT_5, grammarAccess.getWhileAccess().getRCHARIOTTerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getOdKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // InternalMyDsl.g:882:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalMyDsl.g:882:44: (iv_ruleFor= ruleFor EOF )
            // InternalMyDsl.g:883:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalMyDsl.g:889:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_focom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_RCHARIOT_3=null;
        Token this_RCHARIOT_5=null;
        Token otherlv_6=null;
        EObject lv_exp_1_0 = null;

        EObject lv_focom_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:895:2: ( (otherlv_0= 'for' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_focom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' ) )
            // InternalMyDsl.g:896:2: (otherlv_0= 'for' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_focom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' )
            {
            // InternalMyDsl.g:896:2: (otherlv_0= 'for' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_focom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od' )
            // InternalMyDsl.g:897:3: otherlv_0= 'for' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= 'do' (this_RCHARIOT_3= RULE_RCHARIOT )* ( (lv_focom_4_0= ruleCommands ) ) (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
            		
            // InternalMyDsl.g:901:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalMyDsl.g:902:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalMyDsl.g:902:4: (lv_exp_1_0= ruleExpression )
            // InternalMyDsl.g:903:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"pret.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
            		
            // InternalMyDsl.g:924:3: (this_RCHARIOT_3= RULE_RCHARIOT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_RCHARIOT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:925:4: this_RCHARIOT_3= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_3=(Token)match(input,RULE_RCHARIOT,FOLLOW_9); 

            	    				newLeafNode(this_RCHARIOT_3, grammarAccess.getForAccess().getRCHARIOTTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalMyDsl.g:930:3: ( (lv_focom_4_0= ruleCommands ) )
            // InternalMyDsl.g:931:4: (lv_focom_4_0= ruleCommands )
            {
            // InternalMyDsl.g:931:4: (lv_focom_4_0= ruleCommands )
            // InternalMyDsl.g:932:5: lv_focom_4_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getForAccess().getFocomCommandsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_focom_4_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"focom",
            						lv_focom_4_0,
            						"pret.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:949:3: (this_RCHARIOT_5= RULE_RCHARIOT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_RCHARIOT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:950:4: this_RCHARIOT_5= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_5=(Token)match(input,RULE_RCHARIOT,FOLLOW_20); 

            	    				newLeafNode(this_RCHARIOT_5, grammarAccess.getForAccess().getRCHARIOTTerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForAccess().getOdKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleForeach"
    // InternalMyDsl.g:963:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // InternalMyDsl.g:963:48: (iv_ruleForeach= ruleForeach EOF )
            // InternalMyDsl.g:964:2: iv_ruleForeach= ruleForeach EOF
            {
             newCompositeNode(grammarAccess.getForeachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeach=ruleForeach();

            state._fsp--;

             current =iv_ruleForeach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // InternalMyDsl.g:970:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_forevar_1_0= RULE_VARIABLE ) ) otherlv_2= 'in' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'do' (this_RCHARIOT_5= RULE_RCHARIOT )* ( (lv_forecom_6_0= ruleCommands ) ) (this_RCHARIOT_7= RULE_RCHARIOT )* otherlv_8= 'od' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_forevar_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_RCHARIOT_5=null;
        Token this_RCHARIOT_7=null;
        Token otherlv_8=null;
        EObject lv_exp_3_0 = null;

        EObject lv_forecom_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:976:2: ( (otherlv_0= 'foreach' ( (lv_forevar_1_0= RULE_VARIABLE ) ) otherlv_2= 'in' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'do' (this_RCHARIOT_5= RULE_RCHARIOT )* ( (lv_forecom_6_0= ruleCommands ) ) (this_RCHARIOT_7= RULE_RCHARIOT )* otherlv_8= 'od' ) )
            // InternalMyDsl.g:977:2: (otherlv_0= 'foreach' ( (lv_forevar_1_0= RULE_VARIABLE ) ) otherlv_2= 'in' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'do' (this_RCHARIOT_5= RULE_RCHARIOT )* ( (lv_forecom_6_0= ruleCommands ) ) (this_RCHARIOT_7= RULE_RCHARIOT )* otherlv_8= 'od' )
            {
            // InternalMyDsl.g:977:2: (otherlv_0= 'foreach' ( (lv_forevar_1_0= RULE_VARIABLE ) ) otherlv_2= 'in' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'do' (this_RCHARIOT_5= RULE_RCHARIOT )* ( (lv_forecom_6_0= ruleCommands ) ) (this_RCHARIOT_7= RULE_RCHARIOT )* otherlv_8= 'od' )
            // InternalMyDsl.g:978:3: otherlv_0= 'foreach' ( (lv_forevar_1_0= RULE_VARIABLE ) ) otherlv_2= 'in' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= 'do' (this_RCHARIOT_5= RULE_RCHARIOT )* ( (lv_forecom_6_0= ruleCommands ) ) (this_RCHARIOT_7= RULE_RCHARIOT )* otherlv_8= 'od'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:982:3: ( (lv_forevar_1_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:983:4: (lv_forevar_1_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:983:4: (lv_forevar_1_0= RULE_VARIABLE )
            // InternalMyDsl.g:984:5: lv_forevar_1_0= RULE_VARIABLE
            {
            lv_forevar_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_21); 

            					newLeafNode(lv_forevar_1_0, grammarAccess.getForeachAccess().getForevarVARIABLETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForeachRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forevar",
            						lv_forevar_1_0,
            						"pret.MyDsl.VARIABLE");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getForeachAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:1004:3: ( (lv_exp_3_0= ruleExpression ) )
            // InternalMyDsl.g:1005:4: (lv_exp_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1005:4: (lv_exp_3_0= ruleExpression )
            // InternalMyDsl.g:1006:5: lv_exp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForeachAccess().getExpExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_exp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"pret.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getDoKeyword_4());
            		
            // InternalMyDsl.g:1027:3: (this_RCHARIOT_5= RULE_RCHARIOT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_RCHARIOT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1028:4: this_RCHARIOT_5= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_5=(Token)match(input,RULE_RCHARIOT,FOLLOW_9); 

            	    				newLeafNode(this_RCHARIOT_5, grammarAccess.getForeachAccess().getRCHARIOTTerminalRuleCall_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMyDsl.g:1033:3: ( (lv_forecom_6_0= ruleCommands ) )
            // InternalMyDsl.g:1034:4: (lv_forecom_6_0= ruleCommands )
            {
            // InternalMyDsl.g:1034:4: (lv_forecom_6_0= ruleCommands )
            // InternalMyDsl.g:1035:5: lv_forecom_6_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getForeachAccess().getForecomCommandsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_forecom_6_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachRule());
            					}
            					set(
            						current,
            						"forecom",
            						lv_forecom_6_0,
            						"pret.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1052:3: (this_RCHARIOT_7= RULE_RCHARIOT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_RCHARIOT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1053:4: this_RCHARIOT_7= RULE_RCHARIOT
            	    {
            	    this_RCHARIOT_7=(Token)match(input,RULE_RCHARIOT,FOLLOW_20); 

            	    				newLeafNode(this_RCHARIOT_7, grammarAccess.getForeachAccess().getRCHARIOTTerminalRuleCall_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getForeachAccess().getOdKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleVars"
    // InternalMyDsl.g:1066:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalMyDsl.g:1066:45: (iv_ruleVars= ruleVars EOF )
            // InternalMyDsl.g:1067:2: iv_ruleVars= ruleVars EOF
            {
             newCompositeNode(grammarAccess.getVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;

             current =iv_ruleVars; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalMyDsl.g:1073:1: ruleVars returns [EObject current=null] : ( ( (lv_lvars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_lvars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_lvars_0_0=null;
        Token otherlv_1=null;
        Token lv_lvars_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1079:2: ( ( ( (lv_lvars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_lvars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalMyDsl.g:1080:2: ( ( (lv_lvars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_lvars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalMyDsl.g:1080:2: ( ( (lv_lvars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_lvars_2_0= RULE_VARIABLE ) ) )* )
            // InternalMyDsl.g:1081:3: ( (lv_lvars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_lvars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalMyDsl.g:1081:3: ( (lv_lvars_0_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:1082:4: (lv_lvars_0_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:1082:4: (lv_lvars_0_0= RULE_VARIABLE )
            // InternalMyDsl.g:1083:5: lv_lvars_0_0= RULE_VARIABLE
            {
            lv_lvars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_lvars_0_0, grammarAccess.getVarsAccess().getLvarsVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"lvars",
            						lv_lvars_0_0,
            						"pret.MyDsl.VARIABLE");
            				

            }


            }

            // InternalMyDsl.g:1099:3: (otherlv_1= ',' ( (lv_lvars_2_0= RULE_VARIABLE ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1100:4: otherlv_1= ',' ( (lv_lvars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1104:4: ( (lv_lvars_2_0= RULE_VARIABLE ) )
            	    // InternalMyDsl.g:1105:5: (lv_lvars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalMyDsl.g:1105:5: (lv_lvars_2_0= RULE_VARIABLE )
            	    // InternalMyDsl.g:1106:6: lv_lvars_2_0= RULE_VARIABLE
            	    {
            	    lv_lvars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_lvars_2_0, grammarAccess.getVarsAccess().getLvarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVarsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"lvars",
            	    							lv_lvars_2_0,
            	    							"pret.MyDsl.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // InternalMyDsl.g:1127:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalMyDsl.g:1127:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalMyDsl.g:1128:2: iv_ruleExprs= ruleExprs EOF
            {
             newCompositeNode(grammarAccess.getExprsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;

             current =iv_ruleExprs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalMyDsl.g:1134:1: ruleExprs returns [EObject current=null] : ( ( (lv_lexpr_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_lexpr_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lexpr_0_0 = null;

        EObject lv_lexpr_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1140:2: ( ( ( (lv_lexpr_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_lexpr_2_0= ruleExpression ) ) )* ) )
            // InternalMyDsl.g:1141:2: ( ( (lv_lexpr_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_lexpr_2_0= ruleExpression ) ) )* )
            {
            // InternalMyDsl.g:1141:2: ( ( (lv_lexpr_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_lexpr_2_0= ruleExpression ) ) )* )
            // InternalMyDsl.g:1142:3: ( (lv_lexpr_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_lexpr_2_0= ruleExpression ) ) )*
            {
            // InternalMyDsl.g:1142:3: ( (lv_lexpr_0_0= ruleExpression ) )
            // InternalMyDsl.g:1143:4: (lv_lexpr_0_0= ruleExpression )
            {
            // InternalMyDsl.g:1143:4: (lv_lexpr_0_0= ruleExpression )
            // InternalMyDsl.g:1144:5: lv_lexpr_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExprsAccess().getLexprExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_lexpr_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprsRule());
            					}
            					add(
            						current,
            						"lexpr",
            						lv_lexpr_0_0,
            						"pret.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1161:3: (otherlv_1= ',' ( (lv_lexpr_2_0= ruleExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1162:4: otherlv_1= ',' ( (lv_lexpr_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1166:4: ( (lv_lexpr_2_0= ruleExpression ) )
            	    // InternalMyDsl.g:1167:5: (lv_lexpr_2_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:1167:5: (lv_lexpr_2_0= ruleExpression )
            	    // InternalMyDsl.g:1168:6: lv_lexpr_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExprsAccess().getLexprExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_lexpr_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lexpr",
            	    							lv_lexpr_2_0,
            	    							"pret.MyDsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:1190:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:1190:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1191:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:1197:1: ruleExpression returns [EObject current=null] : ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expbg_0_0 = null;

        EObject lv_expbd_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1203:2: ( ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? ) )
            // InternalMyDsl.g:1204:2: ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? )
            {
            // InternalMyDsl.g:1204:2: ( ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )? )
            // InternalMyDsl.g:1205:3: ( (lv_expbg_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )?
            {
            // InternalMyDsl.g:1205:3: ( (lv_expbg_0_0= ruleExprBase ) )
            // InternalMyDsl.g:1206:4: (lv_expbg_0_0= ruleExprBase )
            {
            // InternalMyDsl.g:1206:4: (lv_expbg_0_0= ruleExprBase )
            // InternalMyDsl.g:1207:5: lv_expbg_0_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpbgExprBaseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_expbg_0_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"expbg",
            						lv_expbg_0_0,
            						"pret.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1224:3: (otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1225:4: otherlv_1= '=?' ( (lv_expbd_2_0= ruleExprBase ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getEqualsSignQuestionMarkKeyword_1_0());
                    			
                    // InternalMyDsl.g:1229:4: ( (lv_expbd_2_0= ruleExprBase ) )
                    // InternalMyDsl.g:1230:5: (lv_expbd_2_0= ruleExprBase )
                    {
                    // InternalMyDsl.g:1230:5: (lv_expbd_2_0= ruleExprBase )
                    // InternalMyDsl.g:1231:6: lv_expbd_2_0= ruleExprBase
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpbdExprBaseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expbd_2_0=ruleExprBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expbd",
                    							lv_expbd_2_0,
                    							"pret.MyDsl.ExprBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExprBase"
    // InternalMyDsl.g:1253:1: entryRuleExprBase returns [EObject current=null] : iv_ruleExprBase= ruleExprBase EOF ;
    public final EObject entryRuleExprBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBase = null;


        try {
            // InternalMyDsl.g:1253:49: (iv_ruleExprBase= ruleExprBase EOF )
            // InternalMyDsl.g:1254:2: iv_ruleExprBase= ruleExprBase EOF
            {
             newCompositeNode(grammarAccess.getExprBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprBase=ruleExprBase();

            state._fsp--;

             current =iv_ruleExprBase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBase"


    // $ANTLR start "ruleExprBase"
    // InternalMyDsl.g:1260:1: ruleExprBase returns [EObject current=null] : ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebl_5_0= ruleEBlist ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebh_7_0= ruleEBhd ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) ) ;
    public final EObject ruleExprBase() throws RecognitionException {
        EObject current = null;

        Token lv_ni_1_0=null;
        Token lv_v_2_0=null;
        Token lv_sy_3_0=null;
        EObject lv_ebt_4_0 = null;

        EObject lv_ebl_5_0 = null;

        EObject lv_ebc_6_0 = null;

        EObject lv_ebh_7_0 = null;

        EObject lv_ebs_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1266:2: ( ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebl_5_0= ruleEBlist ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebh_7_0= ruleEBhd ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) ) )
            // InternalMyDsl.g:1267:2: ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebl_5_0= ruleEBlist ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebh_7_0= ruleEBhd ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) )
            {
            // InternalMyDsl.g:1267:2: ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebl_5_0= ruleEBlist ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebh_7_0= ruleEBhd ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) )
            int alt22=8;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1268:3: ( () ( (lv_ni_1_0= 'nil' ) ) )
                    {
                    // InternalMyDsl.g:1268:3: ( () ( (lv_ni_1_0= 'nil' ) ) )
                    // InternalMyDsl.g:1269:4: () ( (lv_ni_1_0= 'nil' ) )
                    {
                    // InternalMyDsl.g:1269:4: ()
                    // InternalMyDsl.g:1270:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExprBaseAccess().getExprBaseAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1276:4: ( (lv_ni_1_0= 'nil' ) )
                    // InternalMyDsl.g:1277:5: (lv_ni_1_0= 'nil' )
                    {
                    // InternalMyDsl.g:1277:5: (lv_ni_1_0= 'nil' )
                    // InternalMyDsl.g:1278:6: lv_ni_1_0= 'nil'
                    {
                    lv_ni_1_0=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_ni_1_0, grammarAccess.getExprBaseAccess().getNiNilKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExprBaseRule());
                    						}
                    						setWithLastConsumed(current, "ni", lv_ni_1_0, "nil");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1292:3: ( (lv_v_2_0= RULE_VARIABLE ) )
                    {
                    // InternalMyDsl.g:1292:3: ( (lv_v_2_0= RULE_VARIABLE ) )
                    // InternalMyDsl.g:1293:4: (lv_v_2_0= RULE_VARIABLE )
                    {
                    // InternalMyDsl.g:1293:4: (lv_v_2_0= RULE_VARIABLE )
                    // InternalMyDsl.g:1294:5: lv_v_2_0= RULE_VARIABLE
                    {
                    lv_v_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    					newLeafNode(lv_v_2_0, grammarAccess.getExprBaseAccess().getVVARIABLETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprBaseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"v",
                    						lv_v_2_0,
                    						"pret.MyDsl.VARIABLE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1311:3: ( (lv_sy_3_0= RULE_SYMBOL ) )
                    {
                    // InternalMyDsl.g:1311:3: ( (lv_sy_3_0= RULE_SYMBOL ) )
                    // InternalMyDsl.g:1312:4: (lv_sy_3_0= RULE_SYMBOL )
                    {
                    // InternalMyDsl.g:1312:4: (lv_sy_3_0= RULE_SYMBOL )
                    // InternalMyDsl.g:1313:5: lv_sy_3_0= RULE_SYMBOL
                    {
                    lv_sy_3_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); 

                    					newLeafNode(lv_sy_3_0, grammarAccess.getExprBaseAccess().getSySYMBOLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprBaseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"sy",
                    						lv_sy_3_0,
                    						"pret.MyDsl.SYMBOL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1330:3: ( (lv_ebt_4_0= ruleEBtl ) )
                    {
                    // InternalMyDsl.g:1330:3: ( (lv_ebt_4_0= ruleEBtl ) )
                    // InternalMyDsl.g:1331:4: (lv_ebt_4_0= ruleEBtl )
                    {
                    // InternalMyDsl.g:1331:4: (lv_ebt_4_0= ruleEBtl )
                    // InternalMyDsl.g:1332:5: lv_ebt_4_0= ruleEBtl
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbtEBtlParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebt_4_0=ruleEBtl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebt",
                    						lv_ebt_4_0,
                    						"pret.MyDsl.EBtl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1350:3: ( (lv_ebl_5_0= ruleEBlist ) )
                    {
                    // InternalMyDsl.g:1350:3: ( (lv_ebl_5_0= ruleEBlist ) )
                    // InternalMyDsl.g:1351:4: (lv_ebl_5_0= ruleEBlist )
                    {
                    // InternalMyDsl.g:1351:4: (lv_ebl_5_0= ruleEBlist )
                    // InternalMyDsl.g:1352:5: lv_ebl_5_0= ruleEBlist
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEblEBlistParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebl_5_0=ruleEBlist();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebl",
                    						lv_ebl_5_0,
                    						"pret.MyDsl.EBlist");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1370:3: ( (lv_ebc_6_0= ruleEBcons ) )
                    {
                    // InternalMyDsl.g:1370:3: ( (lv_ebc_6_0= ruleEBcons ) )
                    // InternalMyDsl.g:1371:4: (lv_ebc_6_0= ruleEBcons )
                    {
                    // InternalMyDsl.g:1371:4: (lv_ebc_6_0= ruleEBcons )
                    // InternalMyDsl.g:1372:5: lv_ebc_6_0= ruleEBcons
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbcEBconsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebc_6_0=ruleEBcons();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebc",
                    						lv_ebc_6_0,
                    						"pret.MyDsl.EBcons");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1390:3: ( (lv_ebh_7_0= ruleEBhd ) )
                    {
                    // InternalMyDsl.g:1390:3: ( (lv_ebh_7_0= ruleEBhd ) )
                    // InternalMyDsl.g:1391:4: (lv_ebh_7_0= ruleEBhd )
                    {
                    // InternalMyDsl.g:1391:4: (lv_ebh_7_0= ruleEBhd )
                    // InternalMyDsl.g:1392:5: lv_ebh_7_0= ruleEBhd
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbhEBhdParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebh_7_0=ruleEBhd();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebh",
                    						lv_ebh_7_0,
                    						"pret.MyDsl.EBhd");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1410:3: ( (lv_ebs_8_0= ruleEBsy ) )
                    {
                    // InternalMyDsl.g:1410:3: ( (lv_ebs_8_0= ruleEBsy ) )
                    // InternalMyDsl.g:1411:4: (lv_ebs_8_0= ruleEBsy )
                    {
                    // InternalMyDsl.g:1411:4: (lv_ebs_8_0= ruleEBsy )
                    // InternalMyDsl.g:1412:5: lv_ebs_8_0= ruleEBsy
                    {

                    					newCompositeNode(grammarAccess.getExprBaseAccess().getEbsEBsyParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ebs_8_0=ruleEBsy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    					}
                    					set(
                    						current,
                    						"ebs",
                    						lv_ebs_8_0,
                    						"pret.MyDsl.EBsy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBase"


    // $ANTLR start "entryRuleEBsy"
    // InternalMyDsl.g:1433:1: entryRuleEBsy returns [EObject current=null] : iv_ruleEBsy= ruleEBsy EOF ;
    public final EObject entryRuleEBsy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBsy = null;


        try {
            // InternalMyDsl.g:1433:45: (iv_ruleEBsy= ruleEBsy EOF )
            // InternalMyDsl.g:1434:2: iv_ruleEBsy= ruleEBsy EOF
            {
             newCompositeNode(grammarAccess.getEBsyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBsy=ruleEBsy();

            state._fsp--;

             current =iv_ruleEBsy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBsy"


    // $ANTLR start "ruleEBsy"
    // InternalMyDsl.g:1440:1: ruleEBsy returns [EObject current=null] : (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleEBsy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sy_1_0=null;
        Token otherlv_3=null;
        EObject lv_le_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1446:2: ( (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:1447:2: (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:1447:2: (otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' )
            // InternalMyDsl.g:1448:3: otherlv_0= '(' ( (lv_sy_1_0= RULE_SYMBOL ) ) ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEBsyAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:1452:3: ( (lv_sy_1_0= RULE_SYMBOL ) )
            // InternalMyDsl.g:1453:4: (lv_sy_1_0= RULE_SYMBOL )
            {
            // InternalMyDsl.g:1453:4: (lv_sy_1_0= RULE_SYMBOL )
            // InternalMyDsl.g:1454:5: lv_sy_1_0= RULE_SYMBOL
            {
            lv_sy_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_14); 

            					newLeafNode(lv_sy_1_0, grammarAccess.getEBsyAccess().getSySYMBOLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEBsyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sy",
            						lv_sy_1_0,
            						"pret.MyDsl.SYMBOL");
            				

            }


            }

            // InternalMyDsl.g:1470:3: ( (lv_le_2_0= ruleLExpr ) )
            // InternalMyDsl.g:1471:4: (lv_le_2_0= ruleLExpr )
            {
            // InternalMyDsl.g:1471:4: (lv_le_2_0= ruleLExpr )
            // InternalMyDsl.g:1472:5: lv_le_2_0= ruleLExpr
            {

            					newCompositeNode(grammarAccess.getEBsyAccess().getLeLExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_le_2_0=ruleLExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBsyRule());
            					}
            					set(
            						current,
            						"le",
            						lv_le_2_0,
            						"pret.MyDsl.LExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEBsyAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBsy"


    // $ANTLR start "entryRuleEBhd"
    // InternalMyDsl.g:1497:1: entryRuleEBhd returns [EObject current=null] : iv_ruleEBhd= ruleEBhd EOF ;
    public final EObject entryRuleEBhd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBhd = null;


        try {
            // InternalMyDsl.g:1497:45: (iv_ruleEBhd= ruleEBhd EOF )
            // InternalMyDsl.g:1498:2: iv_ruleEBhd= ruleEBhd EOF
            {
             newCompositeNode(grammarAccess.getEBhdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBhd=ruleEBhd();

            state._fsp--;

             current =iv_ruleEBhd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBhd"


    // $ANTLR start "ruleEBhd"
    // InternalMyDsl.g:1504:1: ruleEBhd returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) ;
    public final EObject ruleEBhd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expb_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1510:2: ( (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:1511:2: (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:1511:2: (otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            // InternalMyDsl.g:1512:3: otherlv_0= '(' otherlv_1= 'hd' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEBhdAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEBhdAccess().getHdKeyword_1());
            		
            // InternalMyDsl.g:1520:3: ( (lv_expb_2_0= ruleExprBase ) )
            // InternalMyDsl.g:1521:4: (lv_expb_2_0= ruleExprBase )
            {
            // InternalMyDsl.g:1521:4: (lv_expb_2_0= ruleExprBase )
            // InternalMyDsl.g:1522:5: lv_expb_2_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getEBhdAccess().getExpbExprBaseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_expb_2_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBhdRule());
            					}
            					set(
            						current,
            						"expb",
            						lv_expb_2_0,
            						"pret.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEBhdAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBhd"


    // $ANTLR start "entryRuleEBtl"
    // InternalMyDsl.g:1547:1: entryRuleEBtl returns [EObject current=null] : iv_ruleEBtl= ruleEBtl EOF ;
    public final EObject entryRuleEBtl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBtl = null;


        try {
            // InternalMyDsl.g:1547:45: (iv_ruleEBtl= ruleEBtl EOF )
            // InternalMyDsl.g:1548:2: iv_ruleEBtl= ruleEBtl EOF
            {
             newCompositeNode(grammarAccess.getEBtlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBtl=ruleEBtl();

            state._fsp--;

             current =iv_ruleEBtl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBtl"


    // $ANTLR start "ruleEBtl"
    // InternalMyDsl.g:1554:1: ruleEBtl returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) ;
    public final EObject ruleEBtl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expb_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1560:2: ( (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:1561:2: (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:1561:2: (otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')' )
            // InternalMyDsl.g:1562:3: otherlv_0= '(' otherlv_1= 'tl' ( (lv_expb_2_0= ruleExprBase ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getEBtlAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEBtlAccess().getTlKeyword_1());
            		
            // InternalMyDsl.g:1570:3: ( (lv_expb_2_0= ruleExprBase ) )
            // InternalMyDsl.g:1571:4: (lv_expb_2_0= ruleExprBase )
            {
            // InternalMyDsl.g:1571:4: (lv_expb_2_0= ruleExprBase )
            // InternalMyDsl.g:1572:5: lv_expb_2_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getEBtlAccess().getExpbExprBaseParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_expb_2_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBtlRule());
            					}
            					set(
            						current,
            						"expb",
            						lv_expb_2_0,
            						"pret.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEBtlAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBtl"


    // $ANTLR start "entryRuleEBcons"
    // InternalMyDsl.g:1597:1: entryRuleEBcons returns [EObject current=null] : iv_ruleEBcons= ruleEBcons EOF ;
    public final EObject entryRuleEBcons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBcons = null;


        try {
            // InternalMyDsl.g:1597:47: (iv_ruleEBcons= ruleEBcons EOF )
            // InternalMyDsl.g:1598:2: iv_ruleEBcons= ruleEBcons EOF
            {
             newCompositeNode(grammarAccess.getEBconsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBcons=ruleEBcons();

            state._fsp--;

             current =iv_ruleEBcons; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBcons"


    // $ANTLR start "ruleEBcons"
    // InternalMyDsl.g:1604:1: ruleEBcons returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' ) ;
    public final EObject ruleEBcons() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lexpb_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1610:2: ( ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' ) )
            // InternalMyDsl.g:1611:2: ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' )
            {
            // InternalMyDsl.g:1611:2: ( () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')' )
            // InternalMyDsl.g:1612:3: () otherlv_1= '(' otherlv_2= 'cons' ( (lv_lexpb_3_0= ruleExprBase ) )* otherlv_4= ')'
            {
            // InternalMyDsl.g:1612:3: ()
            // InternalMyDsl.g:1613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBconsAccess().getEBconsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getEBconsAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEBconsAccess().getConsKeyword_2());
            		
            // InternalMyDsl.g:1627:3: ( (lv_lexpb_3_0= ruleExprBase ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_SYMBOL||LA23_0==RULE_VARIABLE||(LA23_0>=34 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1628:4: (lv_lexpb_3_0= ruleExprBase )
            	    {
            	    // InternalMyDsl.g:1628:4: (lv_lexpb_3_0= ruleExprBase )
            	    // InternalMyDsl.g:1629:5: lv_lexpb_3_0= ruleExprBase
            	    {

            	    					newCompositeNode(grammarAccess.getEBconsAccess().getLexpbExprBaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_lexpb_3_0=ruleExprBase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEBconsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lexpb",
            	    						lv_lexpb_3_0,
            	    						"pret.MyDsl.ExprBase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEBconsAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBcons"


    // $ANTLR start "entryRuleEBlist"
    // InternalMyDsl.g:1654:1: entryRuleEBlist returns [EObject current=null] : iv_ruleEBlist= ruleEBlist EOF ;
    public final EObject entryRuleEBlist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlist = null;


        try {
            // InternalMyDsl.g:1654:47: (iv_ruleEBlist= ruleEBlist EOF )
            // InternalMyDsl.g:1655:2: iv_ruleEBlist= ruleEBlist EOF
            {
             newCompositeNode(grammarAccess.getEBlistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBlist=ruleEBlist();

            state._fsp--;

             current =iv_ruleEBlist; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBlist"


    // $ANTLR start "ruleEBlist"
    // InternalMyDsl.g:1661:1: ruleEBlist returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'list' ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleEBlist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_le_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1667:2: ( (otherlv_0= '(' otherlv_1= 'list' ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:1668:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:1668:2: (otherlv_0= '(' otherlv_1= 'list' ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')' )
            // InternalMyDsl.g:1669:3: otherlv_0= '(' otherlv_1= 'list' ( (lv_le_2_0= ruleLExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlistAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEBlistAccess().getListKeyword_1());
            		
            // InternalMyDsl.g:1677:3: ( (lv_le_2_0= ruleLExpr ) )
            // InternalMyDsl.g:1678:4: (lv_le_2_0= ruleLExpr )
            {
            // InternalMyDsl.g:1678:4: (lv_le_2_0= ruleLExpr )
            // InternalMyDsl.g:1679:5: lv_le_2_0= ruleLExpr
            {

            					newCompositeNode(grammarAccess.getEBlistAccess().getLeLExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_le_2_0=ruleLExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBlistRule());
            					}
            					set(
            						current,
            						"le",
            						lv_le_2_0,
            						"pret.MyDsl.LExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEBlistAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBlist"


    // $ANTLR start "entryRuleLExpr"
    // InternalMyDsl.g:1704:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalMyDsl.g:1704:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalMyDsl.g:1705:2: iv_ruleLExpr= ruleLExpr EOF
            {
             newCompositeNode(grammarAccess.getLExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;

             current =iv_ruleLExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // InternalMyDsl.g:1711:1: ruleLExpr returns [EObject current=null] : ( ( (lv_Lexpb_0_0= ruleExprBase ) ) ( (lv_Lexpb_1_0= ruleExprBase ) )* ) ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_Lexpb_0_0 = null;

        EObject lv_Lexpb_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1717:2: ( ( ( (lv_Lexpb_0_0= ruleExprBase ) ) ( (lv_Lexpb_1_0= ruleExprBase ) )* ) )
            // InternalMyDsl.g:1718:2: ( ( (lv_Lexpb_0_0= ruleExprBase ) ) ( (lv_Lexpb_1_0= ruleExprBase ) )* )
            {
            // InternalMyDsl.g:1718:2: ( ( (lv_Lexpb_0_0= ruleExprBase ) ) ( (lv_Lexpb_1_0= ruleExprBase ) )* )
            // InternalMyDsl.g:1719:3: ( (lv_Lexpb_0_0= ruleExprBase ) ) ( (lv_Lexpb_1_0= ruleExprBase ) )*
            {
            // InternalMyDsl.g:1719:3: ( (lv_Lexpb_0_0= ruleExprBase ) )
            // InternalMyDsl.g:1720:4: (lv_Lexpb_0_0= ruleExprBase )
            {
            // InternalMyDsl.g:1720:4: (lv_Lexpb_0_0= ruleExprBase )
            // InternalMyDsl.g:1721:5: lv_Lexpb_0_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getLExprAccess().getLexpbExprBaseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_Lexpb_0_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLExprRule());
            					}
            					add(
            						current,
            						"Lexpb",
            						lv_Lexpb_0_0,
            						"pret.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1738:3: ( (lv_Lexpb_1_0= ruleExprBase ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_SYMBOL||LA24_0==RULE_VARIABLE||(LA24_0>=34 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1739:4: (lv_Lexpb_1_0= ruleExprBase )
            	    {
            	    // InternalMyDsl.g:1739:4: (lv_Lexpb_1_0= ruleExprBase )
            	    // InternalMyDsl.g:1740:5: lv_Lexpb_1_0= ruleExprBase
            	    {

            	    					newCompositeNode(grammarAccess.getLExprAccess().getLexpbExprBaseParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_Lexpb_1_0=ruleExprBase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLExprRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Lexpb",
            	    						lv_Lexpb_1_0,
            	    						"pret.MyDsl.ExprBase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLExpr"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\5\2\uffff";
    static final String dfa_3s = "\2\32\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\2";
    static final String dfa_5s = "\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\23\uffff\1\2\1\3",
            "\1\1\23\uffff\1\2\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "756:3: ( (this_RCHARIOT_5= RULE_RCHARIOT )* otherlv_6= 'else' ( (lv_ellc_7_0= ruleCommands ) ) )?";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_9s = "\1\43\3\uffff\1\50\5\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\1\4\1\5\1\6";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\3\1\uffff\1\2\33\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\6\40\uffff\1\5\1\7\1\11\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1267:2: ( ( () ( (lv_ni_1_0= 'nil' ) ) ) | ( (lv_v_2_0= RULE_VARIABLE ) ) | ( (lv_sy_3_0= RULE_SYMBOL ) ) | ( (lv_ebt_4_0= ruleEBtl ) ) | ( (lv_ebl_5_0= ruleEBlist ) ) | ( (lv_ebc_6_0= ruleEBcons ) ) | ( (lv_ebh_7_0= ruleEBhd ) ) | ( (lv_ebs_8_0= ruleEBsy ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000C8A00060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00000050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001C00000050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000052L});

}