package uk.ac.kcl.inf.modelspeak.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.modelspeak.services.TheoryStoreLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryStoreLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'}'", "'->'", "','", "'Theory'", "'Requirement'", "'Experiment'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTheoryStoreLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTheoryStoreLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTheoryStoreLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTheoryStoreLang.g"; }



     	private TheoryStoreLangGrammarAccess grammarAccess;

        public InternalTheoryStoreLangParser(TokenStream input, TheoryStoreLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TheoryStore";
       	}

       	@Override
       	protected TheoryStoreLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTheoryStore"
    // InternalTheoryStoreLang.g:64:1: entryRuleTheoryStore returns [EObject current=null] : iv_ruleTheoryStore= ruleTheoryStore EOF ;
    public final EObject entryRuleTheoryStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheoryStore = null;


        try {
            // InternalTheoryStoreLang.g:64:52: (iv_ruleTheoryStore= ruleTheoryStore EOF )
            // InternalTheoryStoreLang.g:65:2: iv_ruleTheoryStore= ruleTheoryStore EOF
            {
             newCompositeNode(grammarAccess.getTheoryStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheoryStore=ruleTheoryStore();

            state._fsp--;

             current =iv_ruleTheoryStore; 
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
    // $ANTLR end "entryRuleTheoryStore"


    // $ANTLR start "ruleTheoryStore"
    // InternalTheoryStoreLang.g:71:1: ruleTheoryStore returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleTheoryStore() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTheoryStoreLang.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalTheoryStoreLang.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalTheoryStoreLang.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=16 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTheoryStoreLang.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalTheoryStoreLang.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalTheoryStoreLang.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getTheoryStoreAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTheoryStoreRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"uk.ac.kcl.inf.modelspeak.TheoryStoreLang.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleTheoryStore"


    // $ANTLR start "entryRuleElement"
    // InternalTheoryStoreLang.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalTheoryStoreLang.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalTheoryStoreLang.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTheoryStoreLang.g:107:1: ruleElement returns [EObject current=null] : (this_Model_0= ruleModel | this_Theory_1= ruleTheory | this_Requirement_2= ruleRequirement | this_Experiment_3= ruleExperiment ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Model_0 = null;

        EObject this_Theory_1 = null;

        EObject this_Requirement_2 = null;

        EObject this_Experiment_3 = null;



        	enterRule();

        try {
            // InternalTheoryStoreLang.g:113:2: ( (this_Model_0= ruleModel | this_Theory_1= ruleTheory | this_Requirement_2= ruleRequirement | this_Experiment_3= ruleExperiment ) )
            // InternalTheoryStoreLang.g:114:2: (this_Model_0= ruleModel | this_Theory_1= ruleTheory | this_Requirement_2= ruleRequirement | this_Experiment_3= ruleExperiment )
            {
            // InternalTheoryStoreLang.g:114:2: (this_Model_0= ruleModel | this_Theory_1= ruleTheory | this_Requirement_2= ruleRequirement | this_Experiment_3= ruleExperiment )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTheoryStoreLang.g:115:3: this_Model_0= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_0=ruleModel();

                    state._fsp--;


                    			current = this_Model_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTheoryStoreLang.g:124:3: this_Theory_1= ruleTheory
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTheoryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Theory_1=ruleTheory();

                    state._fsp--;


                    			current = this_Theory_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTheoryStoreLang.g:133:3: this_Requirement_2= ruleRequirement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRequirementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Requirement_2=ruleRequirement();

                    state._fsp--;


                    			current = this_Requirement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTheoryStoreLang.g:142:3: this_Experiment_3= ruleExperiment
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getExperimentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Experiment_3=ruleExperiment();

                    state._fsp--;


                    			current = this_Experiment_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleModel"
    // InternalTheoryStoreLang.g:154:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTheoryStoreLang.g:154:46: (iv_ruleModel= ruleModel EOF )
            // InternalTheoryStoreLang.g:155:2: iv_ruleModel= ruleModel EOF
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
    // InternalTheoryStoreLang.g:161:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_content_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTheoryStoreLang.g:167:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? ) )
            // InternalTheoryStoreLang.g:168:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? )
            {
            // InternalTheoryStoreLang.g:168:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? )
            // InternalTheoryStoreLang.g:169:3: otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalTheoryStoreLang.g:173:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheoryStoreLang.g:174:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheoryStoreLang.g:174:4: (lv_name_1_0= RULE_ID )
            // InternalTheoryStoreLang.g:175:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTheoryStoreLang.g:195:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalTheoryStoreLang.g:196:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalTheoryStoreLang.g:196:4: (lv_content_3_0= RULE_STRING )
            // InternalTheoryStoreLang.g:197:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_content_3_0, grammarAccess.getModelAccess().getContentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalTheoryStoreLang.g:217:3: (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTheoryStoreLang.g:218:4: otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                    			
                    // InternalTheoryStoreLang.g:222:4: ( (otherlv_6= RULE_ID ) )
                    // InternalTheoryStoreLang.g:223:5: (otherlv_6= RULE_ID )
                    {
                    // InternalTheoryStoreLang.g:223:5: (otherlv_6= RULE_ID )
                    // InternalTheoryStoreLang.g:224:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalTheoryStoreLang.g:235:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTheoryStoreLang.g:236:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalTheoryStoreLang.g:240:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalTheoryStoreLang.g:241:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalTheoryStoreLang.g:241:6: (otherlv_8= RULE_ID )
                    	    // InternalTheoryStoreLang.g:242:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTheory"
    // InternalTheoryStoreLang.g:259:1: entryRuleTheory returns [EObject current=null] : iv_ruleTheory= ruleTheory EOF ;
    public final EObject entryRuleTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheory = null;


        try {
            // InternalTheoryStoreLang.g:259:47: (iv_ruleTheory= ruleTheory EOF )
            // InternalTheoryStoreLang.g:260:2: iv_ruleTheory= ruleTheory EOF
            {
             newCompositeNode(grammarAccess.getTheoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheory=ruleTheory();

            state._fsp--;

             current =iv_ruleTheory; 
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
    // $ANTLR end "entryRuleTheory"


    // $ANTLR start "ruleTheory"
    // InternalTheoryStoreLang.g:266:1: ruleTheory returns [EObject current=null] : (otherlv_0= 'Theory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? ) ;
    public final EObject ruleTheory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_content_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalTheoryStoreLang.g:272:2: ( (otherlv_0= 'Theory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? ) )
            // InternalTheoryStoreLang.g:273:2: (otherlv_0= 'Theory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? )
            {
            // InternalTheoryStoreLang.g:273:2: (otherlv_0= 'Theory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? )
            // InternalTheoryStoreLang.g:274:3: otherlv_0= 'Theory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTheoryAccess().getTheoryKeyword_0());
            		
            // InternalTheoryStoreLang.g:278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheoryStoreLang.g:279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheoryStoreLang.g:279:4: (lv_name_1_0= RULE_ID )
            // InternalTheoryStoreLang.g:280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTheoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTheoryStoreLang.g:300:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalTheoryStoreLang.g:301:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalTheoryStoreLang.g:301:4: (lv_content_3_0= RULE_STRING )
            // InternalTheoryStoreLang.g:302:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_content_3_0, grammarAccess.getTheoryAccess().getContentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTheoryAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalTheoryStoreLang.g:322:3: (otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTheoryStoreLang.g:323:4: otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTheoryAccess().getHyphenMinusGreaterThanSignKeyword_5_0());
                    			
                    // InternalTheoryStoreLang.g:327:4: ( (otherlv_6= RULE_ID ) )
                    // InternalTheoryStoreLang.g:328:5: (otherlv_6= RULE_ID )
                    {
                    // InternalTheoryStoreLang.g:328:5: (otherlv_6= RULE_ID )
                    // InternalTheoryStoreLang.g:329:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTheoryRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_6, grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalTheoryStoreLang.g:340:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTheoryStoreLang.g:341:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTheoryAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalTheoryStoreLang.g:345:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalTheoryStoreLang.g:346:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalTheoryStoreLang.g:346:6: (otherlv_8= RULE_ID )
                    	    // InternalTheoryStoreLang.g:347:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTheoryRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTheory"


    // $ANTLR start "entryRuleRequirement"
    // InternalTheoryStoreLang.g:364:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalTheoryStoreLang.g:364:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalTheoryStoreLang.g:365:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalTheoryStoreLang.g:371:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'Requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_content_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTheoryStoreLang.g:377:2: ( (otherlv_0= 'Requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalTheoryStoreLang.g:378:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalTheoryStoreLang.g:378:2: (otherlv_0= 'Requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalTheoryStoreLang.g:379:3: otherlv_0= 'Requirement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            // InternalTheoryStoreLang.g:383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheoryStoreLang.g:384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheoryStoreLang.g:384:4: (lv_name_1_0= RULE_ID )
            // InternalTheoryStoreLang.g:385:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTheoryStoreLang.g:405:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalTheoryStoreLang.g:406:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalTheoryStoreLang.g:406:4: (lv_content_3_0= RULE_STRING )
            // InternalTheoryStoreLang.g:407:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_content_3_0, grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleExperiment"
    // InternalTheoryStoreLang.g:431:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalTheoryStoreLang.g:431:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalTheoryStoreLang.g:432:2: iv_ruleExperiment= ruleExperiment EOF
            {
             newCompositeNode(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperiment=ruleExperiment();

            state._fsp--;

             current =iv_ruleExperiment; 
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
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // InternalTheoryStoreLang.g:438:1: ruleExperiment returns [EObject current=null] : (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_content_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalTheoryStoreLang.g:444:2: ( (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? ) )
            // InternalTheoryStoreLang.g:445:2: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? )
            {
            // InternalTheoryStoreLang.g:445:2: (otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? )
            // InternalTheoryStoreLang.g:446:3: otherlv_0= 'Experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_content_3_0= RULE_STRING ) ) otherlv_4= '}' otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentAccess().getExperimentKeyword_0());
            		
            // InternalTheoryStoreLang.g:450:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTheoryStoreLang.g:451:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTheoryStoreLang.g:451:4: (lv_name_1_0= RULE_ID )
            // InternalTheoryStoreLang.g:452:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTheoryStoreLang.g:472:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalTheoryStoreLang.g:473:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalTheoryStoreLang.g:473:4: (lv_content_3_0= RULE_STRING )
            // InternalTheoryStoreLang.g:474:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_content_3_0, grammarAccess.getExperimentAccess().getContentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalTheoryStoreLang.g:498:3: ( (otherlv_6= RULE_ID ) )
            // InternalTheoryStoreLang.g:499:4: (otherlv_6= RULE_ID )
            {
            // InternalTheoryStoreLang.g:499:4: (otherlv_6= RULE_ID )
            // InternalTheoryStoreLang.g:500:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_6, grammarAccess.getExperimentAccess().getModelModelCrossReference_6_0());
            				

            }


            }

            // InternalTheoryStoreLang.g:511:3: (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTheoryStoreLang.g:512:4: otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_7_0());
                    			
                    // InternalTheoryStoreLang.g:516:4: ( (otherlv_8= RULE_ID ) )
                    // InternalTheoryStoreLang.g:517:5: (otherlv_8= RULE_ID )
                    {
                    // InternalTheoryStoreLang.g:517:5: (otherlv_8= RULE_ID )
                    // InternalTheoryStoreLang.g:518:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_8, grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalTheoryStoreLang.g:529:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTheoryStoreLang.g:530:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getExperimentAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalTheoryStoreLang.g:534:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalTheoryStoreLang.g:535:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalTheoryStoreLang.g:535:6: (otherlv_10= RULE_ID )
                    	    // InternalTheoryStoreLang.g:536:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExperimentRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "ruleExperiment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000070802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});

}