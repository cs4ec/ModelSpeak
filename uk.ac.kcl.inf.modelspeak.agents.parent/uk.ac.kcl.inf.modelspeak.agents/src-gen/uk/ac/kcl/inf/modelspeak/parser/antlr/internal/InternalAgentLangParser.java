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
import uk.ac.kcl.inf.modelspeak.services.AgentLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAgentLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'ProposeRequirement'", "'('", "')'", "'AttackRequirement'", "','", "'RedefineRequirement'", "'RetractRequirement'", "'SupportRequirement'", "'ProposeModel'", "'SupportModel'", "'ReplaceModel'", "'CounterModel'", "'AttackModel'", "'ReviseRequirement'", "'ProposeExperiment'", "'SupportExperiment'", "'AttackExperiment'", "'RetractExperiment'", "'StudyDone'", "'NotConvinced'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAgentLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAgentLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAgentLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAgentLang.g"; }



     	private AgentLangGrammarAccess grammarAccess;

        public InternalAgentLangParser(TokenStream input, AgentLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected AgentLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalAgentLang.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalAgentLang.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalAgentLang.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalAgentLang.g:71:1: ruleGame returns [EObject current=null] : ( (lv_moves_0_0= ruleMove ) )* ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        EObject lv_moves_0_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:77:2: ( ( (lv_moves_0_0= ruleMove ) )* )
            // InternalAgentLang.g:78:2: ( (lv_moves_0_0= ruleMove ) )*
            {
            // InternalAgentLang.g:78:2: ( (lv_moves_0_0= ruleMove ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16||(LA1_0>=18 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAgentLang.g:79:3: (lv_moves_0_0= ruleMove )
            	    {
            	    // InternalAgentLang.g:79:3: (lv_moves_0_0= ruleMove )
            	    // InternalAgentLang.g:80:4: lv_moves_0_0= ruleMove
            	    {

            	    				newCompositeNode(grammarAccess.getGameAccess().getMovesMoveParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_moves_0_0=ruleMove();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGameRule());
            	    				}
            	    				add(
            	    					current,
            	    					"moves",
            	    					lv_moves_0_0,
            	    					"uk.ac.kcl.inf.modelspeak.AgentLang.Move");
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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleMove"
    // InternalAgentLang.g:100:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalAgentLang.g:100:45: (iv_ruleMove= ruleMove EOF )
            // InternalAgentLang.g:101:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalAgentLang.g:107:1: ruleMove returns [EObject current=null] : (this_ProposeRequirement_0= ruleProposeRequirement | this_AttackRequirement_1= ruleAttackRequirement | this_RedefineRequirement_2= ruleRedefineRequirement | this_RetractRequirement_3= ruleRetractRequirement | this_SupportRequirement_4= ruleSupportRequirement | this_ProposeModel_5= ruleProposeModel | this_SupportModel_6= ruleSupportModel | this_ReplaceModel_7= ruleReplaceModel | this_CounterModel_8= ruleCounterModel | this_AttackModel_9= ruleAttackModel | this_ReviseRequirement_10= ruleReviseRequirement | this_ProposeExperiment_11= ruleProposeExperiment | this_SupportExperiment_12= ruleSupportExperiment | this_AttackExperiment_13= ruleAttackExperiment | this_RetractExperiment_14= ruleRetractExperiment | this_StudyDone_15= ruleStudyDone | this_NotConvinced_16= ruleNotConvinced ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        EObject this_ProposeRequirement_0 = null;

        EObject this_AttackRequirement_1 = null;

        EObject this_RedefineRequirement_2 = null;

        EObject this_RetractRequirement_3 = null;

        EObject this_SupportRequirement_4 = null;

        EObject this_ProposeModel_5 = null;

        EObject this_SupportModel_6 = null;

        EObject this_ReplaceModel_7 = null;

        EObject this_CounterModel_8 = null;

        EObject this_AttackModel_9 = null;

        EObject this_ReviseRequirement_10 = null;

        EObject this_ProposeExperiment_11 = null;

        EObject this_SupportExperiment_12 = null;

        EObject this_AttackExperiment_13 = null;

        EObject this_RetractExperiment_14 = null;

        EObject this_StudyDone_15 = null;

        EObject this_NotConvinced_16 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:113:2: ( (this_ProposeRequirement_0= ruleProposeRequirement | this_AttackRequirement_1= ruleAttackRequirement | this_RedefineRequirement_2= ruleRedefineRequirement | this_RetractRequirement_3= ruleRetractRequirement | this_SupportRequirement_4= ruleSupportRequirement | this_ProposeModel_5= ruleProposeModel | this_SupportModel_6= ruleSupportModel | this_ReplaceModel_7= ruleReplaceModel | this_CounterModel_8= ruleCounterModel | this_AttackModel_9= ruleAttackModel | this_ReviseRequirement_10= ruleReviseRequirement | this_ProposeExperiment_11= ruleProposeExperiment | this_SupportExperiment_12= ruleSupportExperiment | this_AttackExperiment_13= ruleAttackExperiment | this_RetractExperiment_14= ruleRetractExperiment | this_StudyDone_15= ruleStudyDone | this_NotConvinced_16= ruleNotConvinced ) )
            // InternalAgentLang.g:114:2: (this_ProposeRequirement_0= ruleProposeRequirement | this_AttackRequirement_1= ruleAttackRequirement | this_RedefineRequirement_2= ruleRedefineRequirement | this_RetractRequirement_3= ruleRetractRequirement | this_SupportRequirement_4= ruleSupportRequirement | this_ProposeModel_5= ruleProposeModel | this_SupportModel_6= ruleSupportModel | this_ReplaceModel_7= ruleReplaceModel | this_CounterModel_8= ruleCounterModel | this_AttackModel_9= ruleAttackModel | this_ReviseRequirement_10= ruleReviseRequirement | this_ProposeExperiment_11= ruleProposeExperiment | this_SupportExperiment_12= ruleSupportExperiment | this_AttackExperiment_13= ruleAttackExperiment | this_RetractExperiment_14= ruleRetractExperiment | this_StudyDone_15= ruleStudyDone | this_NotConvinced_16= ruleNotConvinced )
            {
            // InternalAgentLang.g:114:2: (this_ProposeRequirement_0= ruleProposeRequirement | this_AttackRequirement_1= ruleAttackRequirement | this_RedefineRequirement_2= ruleRedefineRequirement | this_RetractRequirement_3= ruleRetractRequirement | this_SupportRequirement_4= ruleSupportRequirement | this_ProposeModel_5= ruleProposeModel | this_SupportModel_6= ruleSupportModel | this_ReplaceModel_7= ruleReplaceModel | this_CounterModel_8= ruleCounterModel | this_AttackModel_9= ruleAttackModel | this_ReviseRequirement_10= ruleReviseRequirement | this_ProposeExperiment_11= ruleProposeExperiment | this_SupportExperiment_12= ruleSupportExperiment | this_AttackExperiment_13= ruleAttackExperiment | this_RetractExperiment_14= ruleRetractExperiment | this_StudyDone_15= ruleStudyDone | this_NotConvinced_16= ruleNotConvinced )
            int alt2=17;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 23:
                {
                alt2=8;
                }
                break;
            case 24:
                {
                alt2=9;
                }
                break;
            case 25:
                {
                alt2=10;
                }
                break;
            case 26:
                {
                alt2=11;
                }
                break;
            case 27:
                {
                alt2=12;
                }
                break;
            case 28:
                {
                alt2=13;
                }
                break;
            case 29:
                {
                alt2=14;
                }
                break;
            case 30:
                {
                alt2=15;
                }
                break;
            case 31:
                {
                alt2=16;
                }
                break;
            case 32:
                {
                alt2=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAgentLang.g:115:3: this_ProposeRequirement_0= ruleProposeRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeRequirementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeRequirement_0=ruleProposeRequirement();

                    state._fsp--;


                    			current = this_ProposeRequirement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAgentLang.g:124:3: this_AttackRequirement_1= ruleAttackRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getAttackRequirementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttackRequirement_1=ruleAttackRequirement();

                    state._fsp--;


                    			current = this_AttackRequirement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAgentLang.g:133:3: this_RedefineRequirement_2= ruleRedefineRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getRedefineRequirementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RedefineRequirement_2=ruleRedefineRequirement();

                    state._fsp--;


                    			current = this_RedefineRequirement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAgentLang.g:142:3: this_RetractRequirement_3= ruleRetractRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getRetractRequirementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetractRequirement_3=ruleRetractRequirement();

                    state._fsp--;


                    			current = this_RetractRequirement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAgentLang.g:151:3: this_SupportRequirement_4= ruleSupportRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getSupportRequirementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupportRequirement_4=ruleSupportRequirement();

                    state._fsp--;


                    			current = this_SupportRequirement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAgentLang.g:160:3: this_ProposeModel_5= ruleProposeModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeModelParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeModel_5=ruleProposeModel();

                    state._fsp--;


                    			current = this_ProposeModel_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAgentLang.g:169:3: this_SupportModel_6= ruleSupportModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getSupportModelParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupportModel_6=ruleSupportModel();

                    state._fsp--;


                    			current = this_SupportModel_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAgentLang.g:178:3: this_ReplaceModel_7= ruleReplaceModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getReplaceModelParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReplaceModel_7=ruleReplaceModel();

                    state._fsp--;


                    			current = this_ReplaceModel_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAgentLang.g:187:3: this_CounterModel_8= ruleCounterModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getCounterModelParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_CounterModel_8=ruleCounterModel();

                    state._fsp--;


                    			current = this_CounterModel_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAgentLang.g:196:3: this_AttackModel_9= ruleAttackModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getAttackModelParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttackModel_9=ruleAttackModel();

                    state._fsp--;


                    			current = this_AttackModel_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAgentLang.g:205:3: this_ReviseRequirement_10= ruleReviseRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getReviseRequirementParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReviseRequirement_10=ruleReviseRequirement();

                    state._fsp--;


                    			current = this_ReviseRequirement_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalAgentLang.g:214:3: this_ProposeExperiment_11= ruleProposeExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeExperimentParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeExperiment_11=ruleProposeExperiment();

                    state._fsp--;


                    			current = this_ProposeExperiment_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalAgentLang.g:223:3: this_SupportExperiment_12= ruleSupportExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getSupportExperimentParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupportExperiment_12=ruleSupportExperiment();

                    state._fsp--;


                    			current = this_SupportExperiment_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalAgentLang.g:232:3: this_AttackExperiment_13= ruleAttackExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getAttackExperimentParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttackExperiment_13=ruleAttackExperiment();

                    state._fsp--;


                    			current = this_AttackExperiment_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalAgentLang.g:241:3: this_RetractExperiment_14= ruleRetractExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getRetractExperimentParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetractExperiment_14=ruleRetractExperiment();

                    state._fsp--;


                    			current = this_RetractExperiment_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalAgentLang.g:250:3: this_StudyDone_15= ruleStudyDone
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getStudyDoneParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_StudyDone_15=ruleStudyDone();

                    state._fsp--;


                    			current = this_StudyDone_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalAgentLang.g:259:3: this_NotConvinced_16= ruleNotConvinced
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getNotConvincedParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotConvinced_16=ruleNotConvinced();

                    state._fsp--;


                    			current = this_NotConvinced_16;
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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleModel"
    // InternalAgentLang.g:271:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAgentLang.g:271:46: (iv_ruleModel= ruleModel EOF )
            // InternalAgentLang.g:272:2: iv_ruleModel= ruleModel EOF
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
    // InternalAgentLang.g:278:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:284:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalAgentLang.g:285:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalAgentLang.g:285:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalAgentLang.g:286:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalAgentLang.g:286:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:287:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:287:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:288:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAgentLang.g:308:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:309:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:309:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:310:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_content_2_0, grammarAccess.getModelAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleRequirement"
    // InternalAgentLang.g:334:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalAgentLang.g:334:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalAgentLang.g:335:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalAgentLang.g:341:1: ruleRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:347:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalAgentLang.g:348:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalAgentLang.g:348:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalAgentLang.g:349:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalAgentLang.g:349:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:350:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:350:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:351:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAgentLang.g:371:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:372:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:372:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:373:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_content_2_0, grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getRightSquareBracketKeyword_3());
            		

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
    // InternalAgentLang.g:397:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalAgentLang.g:397:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalAgentLang.g:398:2: iv_ruleExperiment= ruleExperiment EOF
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
    // InternalAgentLang.g:404:1: ruleExperiment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:410:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalAgentLang.g:411:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalAgentLang.g:411:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalAgentLang.g:412:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalAgentLang.g:412:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:413:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:413:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:414:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExperimentAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAgentLang.g:434:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:435:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:435:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:436:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_content_2_0, grammarAccess.getExperimentAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExperimentAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleTheory"
    // InternalAgentLang.g:460:1: entryRuleTheory returns [EObject current=null] : iv_ruleTheory= ruleTheory EOF ;
    public final EObject entryRuleTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheory = null;


        try {
            // InternalAgentLang.g:460:47: (iv_ruleTheory= ruleTheory EOF )
            // InternalAgentLang.g:461:2: iv_ruleTheory= ruleTheory EOF
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
    // InternalAgentLang.g:467:1: ruleTheory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleTheory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:473:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalAgentLang.g:474:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalAgentLang.g:474:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalAgentLang.g:475:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalAgentLang.g:475:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:476:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:476:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:477:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTheoryAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAgentLang.g:497:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:498:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:498:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:499:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_content_2_0, grammarAccess.getTheoryAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTheoryAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleProposeRequirement"
    // InternalAgentLang.g:523:1: entryRuleProposeRequirement returns [EObject current=null] : iv_ruleProposeRequirement= ruleProposeRequirement EOF ;
    public final EObject entryRuleProposeRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeRequirement = null;


        try {
            // InternalAgentLang.g:523:59: (iv_ruleProposeRequirement= ruleProposeRequirement EOF )
            // InternalAgentLang.g:524:2: iv_ruleProposeRequirement= ruleProposeRequirement EOF
            {
             newCompositeNode(grammarAccess.getProposeRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposeRequirement=ruleProposeRequirement();

            state._fsp--;

             current =iv_ruleProposeRequirement; 
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
    // $ANTLR end "entryRuleProposeRequirement"


    // $ANTLR start "ruleProposeRequirement"
    // InternalAgentLang.g:530:1: ruleProposeRequirement returns [EObject current=null] : (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ')' ) ;
    public final EObject ruleProposeRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_requirement_2_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:536:2: ( (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:537:2: (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:537:2: (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ')' )
            // InternalAgentLang.g:538:3: otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeRequirementAccess().getProposeRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:546:3: ( (lv_requirement_2_0= ruleRequirement ) )
            // InternalAgentLang.g:547:4: (lv_requirement_2_0= ruleRequirement )
            {
            // InternalAgentLang.g:547:4: (lv_requirement_2_0= ruleRequirement )
            // InternalAgentLang.g:548:5: lv_requirement_2_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getProposeRequirementAccess().getRequirementRequirementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_requirement_2_0=ruleRequirement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProposeRequirementRule());
            					}
            					set(
            						current,
            						"requirement",
            						lv_requirement_2_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Requirement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeRequirementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleProposeRequirement"


    // $ANTLR start "entryRuleAttackRequirement"
    // InternalAgentLang.g:573:1: entryRuleAttackRequirement returns [EObject current=null] : iv_ruleAttackRequirement= ruleAttackRequirement EOF ;
    public final EObject entryRuleAttackRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackRequirement = null;


        try {
            // InternalAgentLang.g:573:58: (iv_ruleAttackRequirement= ruleAttackRequirement EOF )
            // InternalAgentLang.g:574:2: iv_ruleAttackRequirement= ruleAttackRequirement EOF
            {
             newCompositeNode(grammarAccess.getAttackRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttackRequirement=ruleAttackRequirement();

            state._fsp--;

             current =iv_ruleAttackRequirement; 
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
    // $ANTLR end "entryRuleAttackRequirement"


    // $ANTLR start "ruleAttackRequirement"
    // InternalAgentLang.g:580:1: ruleAttackRequirement returns [EObject current=null] : (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
    public final EObject ruleAttackRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_theory_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:586:2: ( (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:587:2: (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:587:2: (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:588:3: otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackRequirementAccess().getAttackRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:596:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:597:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:597:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:598:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:613:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:614:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:614:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:615:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackRequirementAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_theory_4_0=ruleTheory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttackRequirementRule());
            					}
            					set(
            						current,
            						"theory",
            						lv_theory_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttackRequirementAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAttackRequirement"


    // $ANTLR start "entryRuleRedefineRequirement"
    // InternalAgentLang.g:640:1: entryRuleRedefineRequirement returns [EObject current=null] : iv_ruleRedefineRequirement= ruleRedefineRequirement EOF ;
    public final EObject entryRuleRedefineRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefineRequirement = null;


        try {
            // InternalAgentLang.g:640:60: (iv_ruleRedefineRequirement= ruleRedefineRequirement EOF )
            // InternalAgentLang.g:641:2: iv_ruleRedefineRequirement= ruleRedefineRequirement EOF
            {
             newCompositeNode(grammarAccess.getRedefineRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedefineRequirement=ruleRedefineRequirement();

            state._fsp--;

             current =iv_ruleRedefineRequirement; 
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
    // $ANTLR end "entryRuleRedefineRequirement"


    // $ANTLR start "ruleRedefineRequirement"
    // InternalAgentLang.g:647:1: ruleRedefineRequirement returns [EObject current=null] : (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' ) ;
    public final EObject ruleRedefineRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_newRequirement_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:653:2: ( (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:654:2: (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:654:2: (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' )
            // InternalAgentLang.g:655:3: otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRedefineRequirementAccess().getRedefineRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRedefineRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:663:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:664:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:664:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:665:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedefineRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getRedefineRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRedefineRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:680:3: ( (lv_newRequirement_4_0= ruleRequirement ) )
            // InternalAgentLang.g:681:4: (lv_newRequirement_4_0= ruleRequirement )
            {
            // InternalAgentLang.g:681:4: (lv_newRequirement_4_0= ruleRequirement )
            // InternalAgentLang.g:682:5: lv_newRequirement_4_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getRedefineRequirementAccess().getNewRequirementRequirementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_newRequirement_4_0=ruleRequirement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedefineRequirementRule());
            					}
            					set(
            						current,
            						"newRequirement",
            						lv_newRequirement_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Requirement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRedefineRequirementAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleRedefineRequirement"


    // $ANTLR start "entryRuleRetractRequirement"
    // InternalAgentLang.g:707:1: entryRuleRetractRequirement returns [EObject current=null] : iv_ruleRetractRequirement= ruleRetractRequirement EOF ;
    public final EObject entryRuleRetractRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetractRequirement = null;


        try {
            // InternalAgentLang.g:707:59: (iv_ruleRetractRequirement= ruleRetractRequirement EOF )
            // InternalAgentLang.g:708:2: iv_ruleRetractRequirement= ruleRetractRequirement EOF
            {
             newCompositeNode(grammarAccess.getRetractRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetractRequirement=ruleRetractRequirement();

            state._fsp--;

             current =iv_ruleRetractRequirement; 
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
    // $ANTLR end "entryRuleRetractRequirement"


    // $ANTLR start "ruleRetractRequirement"
    // InternalAgentLang.g:714:1: ruleRetractRequirement returns [EObject current=null] : (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleRetractRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:720:2: ( (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:721:2: (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:721:2: (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:722:3: otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRetractRequirementAccess().getRetractRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRetractRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:730:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:731:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:731:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:732:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetractRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getRetractRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRetractRequirementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRetractRequirement"


    // $ANTLR start "entryRuleSupportRequirement"
    // InternalAgentLang.g:751:1: entryRuleSupportRequirement returns [EObject current=null] : iv_ruleSupportRequirement= ruleSupportRequirement EOF ;
    public final EObject entryRuleSupportRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportRequirement = null;


        try {
            // InternalAgentLang.g:751:59: (iv_ruleSupportRequirement= ruleSupportRequirement EOF )
            // InternalAgentLang.g:752:2: iv_ruleSupportRequirement= ruleSupportRequirement EOF
            {
             newCompositeNode(grammarAccess.getSupportRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupportRequirement=ruleSupportRequirement();

            state._fsp--;

             current =iv_ruleSupportRequirement; 
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
    // $ANTLR end "entryRuleSupportRequirement"


    // $ANTLR start "ruleSupportRequirement"
    // InternalAgentLang.g:758:1: ruleSupportRequirement returns [EObject current=null] : (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
    public final EObject ruleSupportRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_theory_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:764:2: ( (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:765:2: (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:765:2: (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:766:3: otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportRequirementAccess().getSupportRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:774:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:775:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:775:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:776:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:791:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:792:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:792:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:793:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportRequirementAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_theory_4_0=ruleTheory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupportRequirementRule());
            					}
            					set(
            						current,
            						"theory",
            						lv_theory_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSupportRequirementAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSupportRequirement"


    // $ANTLR start "entryRuleProposeModel"
    // InternalAgentLang.g:818:1: entryRuleProposeModel returns [EObject current=null] : iv_ruleProposeModel= ruleProposeModel EOF ;
    public final EObject entryRuleProposeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeModel = null;


        try {
            // InternalAgentLang.g:818:53: (iv_ruleProposeModel= ruleProposeModel EOF )
            // InternalAgentLang.g:819:2: iv_ruleProposeModel= ruleProposeModel EOF
            {
             newCompositeNode(grammarAccess.getProposeModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposeModel=ruleProposeModel();

            state._fsp--;

             current =iv_ruleProposeModel; 
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
    // $ANTLR end "entryRuleProposeModel"


    // $ANTLR start "ruleProposeModel"
    // InternalAgentLang.g:825:1: ruleProposeModel returns [EObject current=null] : (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleProposeModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_model_2_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:831:2: ( (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:832:2: (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:832:2: (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalAgentLang.g:833:3: otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeModelAccess().getProposeModelKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:841:3: ( (lv_model_2_0= ruleModel ) )
            // InternalAgentLang.g:842:4: (lv_model_2_0= ruleModel )
            {
            // InternalAgentLang.g:842:4: (lv_model_2_0= ruleModel )
            // InternalAgentLang.g:843:5: lv_model_2_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getProposeModelAccess().getModelModelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_model_2_0=ruleModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProposeModelRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_2_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Model");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:864:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:865:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:865:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:866:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeModelRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getProposeModelAccess().getRequirementRequirementCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProposeModelAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleProposeModel"


    // $ANTLR start "entryRuleSupportModel"
    // InternalAgentLang.g:885:1: entryRuleSupportModel returns [EObject current=null] : iv_ruleSupportModel= ruleSupportModel EOF ;
    public final EObject entryRuleSupportModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportModel = null;


        try {
            // InternalAgentLang.g:885:53: (iv_ruleSupportModel= ruleSupportModel EOF )
            // InternalAgentLang.g:886:2: iv_ruleSupportModel= ruleSupportModel EOF
            {
             newCompositeNode(grammarAccess.getSupportModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupportModel=ruleSupportModel();

            state._fsp--;

             current =iv_ruleSupportModel; 
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
    // $ANTLR end "entryRuleSupportModel"


    // $ANTLR start "ruleSupportModel"
    // InternalAgentLang.g:892:1: ruleSupportModel returns [EObject current=null] : (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
    public final EObject ruleSupportModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_theory_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:898:2: ( (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:899:2: (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:899:2: (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:900:3: otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportModelAccess().getSupportModelKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:908:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:909:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:909:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:910:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:925:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:926:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:926:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:927:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportModelAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_theory_4_0=ruleTheory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupportModelRule());
            					}
            					set(
            						current,
            						"theory",
            						lv_theory_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSupportModelAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSupportModel"


    // $ANTLR start "entryRuleReplaceModel"
    // InternalAgentLang.g:952:1: entryRuleReplaceModel returns [EObject current=null] : iv_ruleReplaceModel= ruleReplaceModel EOF ;
    public final EObject entryRuleReplaceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceModel = null;


        try {
            // InternalAgentLang.g:952:53: (iv_ruleReplaceModel= ruleReplaceModel EOF )
            // InternalAgentLang.g:953:2: iv_ruleReplaceModel= ruleReplaceModel EOF
            {
             newCompositeNode(grammarAccess.getReplaceModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReplaceModel=ruleReplaceModel();

            state._fsp--;

             current =iv_ruleReplaceModel; 
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
    // $ANTLR end "entryRuleReplaceModel"


    // $ANTLR start "ruleReplaceModel"
    // InternalAgentLang.g:959:1: ruleReplaceModel returns [EObject current=null] : (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' ) ;
    public final EObject ruleReplaceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_newModel_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:965:2: ( (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:966:2: (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:966:2: (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' )
            // InternalAgentLang.g:967:3: otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceModelAccess().getReplaceModelKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:975:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:976:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:976:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:977:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReplaceModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getReplaceModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getReplaceModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:992:3: ( (lv_newModel_4_0= ruleModel ) )
            // InternalAgentLang.g:993:4: (lv_newModel_4_0= ruleModel )
            {
            // InternalAgentLang.g:993:4: (lv_newModel_4_0= ruleModel )
            // InternalAgentLang.g:994:5: lv_newModel_4_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getReplaceModelAccess().getNewModelModelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_newModel_4_0=ruleModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReplaceModelRule());
            					}
            					set(
            						current,
            						"newModel",
            						lv_newModel_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Model");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReplaceModelAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleReplaceModel"


    // $ANTLR start "entryRuleCounterModel"
    // InternalAgentLang.g:1019:1: entryRuleCounterModel returns [EObject current=null] : iv_ruleCounterModel= ruleCounterModel EOF ;
    public final EObject entryRuleCounterModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounterModel = null;


        try {
            // InternalAgentLang.g:1019:53: (iv_ruleCounterModel= ruleCounterModel EOF )
            // InternalAgentLang.g:1020:2: iv_ruleCounterModel= ruleCounterModel EOF
            {
             newCompositeNode(grammarAccess.getCounterModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCounterModel=ruleCounterModel();

            state._fsp--;

             current =iv_ruleCounterModel; 
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
    // $ANTLR end "entryRuleCounterModel"


    // $ANTLR start "ruleCounterModel"
    // InternalAgentLang.g:1026:1: ruleCounterModel returns [EObject current=null] : (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleCounterModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_experiment_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1032:2: ( (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalAgentLang.g:1033:2: (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalAgentLang.g:1033:2: (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalAgentLang.g:1034:3: otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCounterModelAccess().getCounterModelKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCounterModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1042:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1043:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1043:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1044:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getCounterModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCounterModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1059:3: ( (lv_experiment_4_0= ruleExperiment ) )
            // InternalAgentLang.g:1060:4: (lv_experiment_4_0= ruleExperiment )
            {
            // InternalAgentLang.g:1060:4: (lv_experiment_4_0= ruleExperiment )
            // InternalAgentLang.g:1061:5: lv_experiment_4_0= ruleExperiment
            {

            					newCompositeNode(grammarAccess.getCounterModelAccess().getExperimentExperimentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_experiment_4_0=ruleExperiment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCounterModelRule());
            					}
            					set(
            						current,
            						"experiment",
            						lv_experiment_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Experiment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getCounterModelAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1082:3: ( (otherlv_6= RULE_ID ) )
            // InternalAgentLang.g:1083:4: (otherlv_6= RULE_ID )
            {
            // InternalAgentLang.g:1083:4: (otherlv_6= RULE_ID )
            // InternalAgentLang.g:1084:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterModelRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_6, grammarAccess.getCounterModelAccess().getRequirementRequirementCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCounterModelAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleCounterModel"


    // $ANTLR start "entryRuleAttackModel"
    // InternalAgentLang.g:1103:1: entryRuleAttackModel returns [EObject current=null] : iv_ruleAttackModel= ruleAttackModel EOF ;
    public final EObject entryRuleAttackModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackModel = null;


        try {
            // InternalAgentLang.g:1103:52: (iv_ruleAttackModel= ruleAttackModel EOF )
            // InternalAgentLang.g:1104:2: iv_ruleAttackModel= ruleAttackModel EOF
            {
             newCompositeNode(grammarAccess.getAttackModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttackModel=ruleAttackModel();

            state._fsp--;

             current =iv_ruleAttackModel; 
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
    // $ANTLR end "entryRuleAttackModel"


    // $ANTLR start "ruleAttackModel"
    // InternalAgentLang.g:1110:1: ruleAttackModel returns [EObject current=null] : (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
    public final EObject ruleAttackModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_theory_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1116:2: ( (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1117:2: (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1117:2: (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1118:3: otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackModelAccess().getAttackModelKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1126:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1127:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1127:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1128:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1143:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1144:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1144:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1145:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackModelAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_theory_4_0=ruleTheory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttackModelRule());
            					}
            					set(
            						current,
            						"theory",
            						lv_theory_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttackModelAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAttackModel"


    // $ANTLR start "entryRuleReviseRequirement"
    // InternalAgentLang.g:1170:1: entryRuleReviseRequirement returns [EObject current=null] : iv_ruleReviseRequirement= ruleReviseRequirement EOF ;
    public final EObject entryRuleReviseRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReviseRequirement = null;


        try {
            // InternalAgentLang.g:1170:58: (iv_ruleReviseRequirement= ruleReviseRequirement EOF )
            // InternalAgentLang.g:1171:2: iv_ruleReviseRequirement= ruleReviseRequirement EOF
            {
             newCompositeNode(grammarAccess.getReviseRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReviseRequirement=ruleReviseRequirement();

            state._fsp--;

             current =iv_ruleReviseRequirement; 
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
    // $ANTLR end "entryRuleReviseRequirement"


    // $ANTLR start "ruleReviseRequirement"
    // InternalAgentLang.g:1177:1: ruleReviseRequirement returns [EObject current=null] : (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleReviseRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_newRequirement_6_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1183:2: ( (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalAgentLang.g:1184:2: (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalAgentLang.g:1184:2: (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalAgentLang.g:1185:3: otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReviseRequirementAccess().getReviseRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getReviseRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1193:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1194:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1194:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1195:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getReviseRequirementAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getReviseRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1210:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:1211:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:1211:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:1212:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getReviseRequirementAccess().getRequirementRequirementCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getReviseRequirementAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1227:3: ( (lv_newRequirement_6_0= ruleRequirement ) )
            // InternalAgentLang.g:1228:4: (lv_newRequirement_6_0= ruleRequirement )
            {
            // InternalAgentLang.g:1228:4: (lv_newRequirement_6_0= ruleRequirement )
            // InternalAgentLang.g:1229:5: lv_newRequirement_6_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getReviseRequirementAccess().getNewRequirementRequirementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_newRequirement_6_0=ruleRequirement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReviseRequirementRule());
            					}
            					set(
            						current,
            						"newRequirement",
            						lv_newRequirement_6_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Requirement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getReviseRequirementAccess().getCommaKeyword_7());
            		
            // InternalAgentLang.g:1250:3: ( (otherlv_8= RULE_ID ) )
            // InternalAgentLang.g:1251:4: (otherlv_8= RULE_ID )
            {
            // InternalAgentLang.g:1251:4: (otherlv_8= RULE_ID )
            // InternalAgentLang.g:1252:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_8, grammarAccess.getReviseRequirementAccess().getExperimentExperimentCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getReviseRequirementAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleReviseRequirement"


    // $ANTLR start "entryRuleProposeExperiment"
    // InternalAgentLang.g:1271:1: entryRuleProposeExperiment returns [EObject current=null] : iv_ruleProposeExperiment= ruleProposeExperiment EOF ;
    public final EObject entryRuleProposeExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeExperiment = null;


        try {
            // InternalAgentLang.g:1271:58: (iv_ruleProposeExperiment= ruleProposeExperiment EOF )
            // InternalAgentLang.g:1272:2: iv_ruleProposeExperiment= ruleProposeExperiment EOF
            {
             newCompositeNode(grammarAccess.getProposeExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposeExperiment=ruleProposeExperiment();

            state._fsp--;

             current =iv_ruleProposeExperiment; 
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
    // $ANTLR end "entryRuleProposeExperiment"


    // $ANTLR start "ruleProposeExperiment"
    // InternalAgentLang.g:1278:1: ruleProposeExperiment returns [EObject current=null] : (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleProposeExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_experiment_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1284:2: ( (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalAgentLang.g:1285:2: (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalAgentLang.g:1285:2: (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalAgentLang.g:1286:3: otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeExperimentAccess().getProposeExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1294:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1295:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1295:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1296:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getProposeExperimentAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1311:3: ( (lv_experiment_4_0= ruleExperiment ) )
            // InternalAgentLang.g:1312:4: (lv_experiment_4_0= ruleExperiment )
            {
            // InternalAgentLang.g:1312:4: (lv_experiment_4_0= ruleExperiment )
            // InternalAgentLang.g:1313:5: lv_experiment_4_0= ruleExperiment
            {

            					newCompositeNode(grammarAccess.getProposeExperimentAccess().getExperimentExperimentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_experiment_4_0=ruleExperiment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProposeExperimentRule());
            					}
            					set(
            						current,
            						"experiment",
            						lv_experiment_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Experiment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getProposeExperimentAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1334:3: ( (otherlv_6= RULE_ID ) )
            // InternalAgentLang.g:1335:4: (otherlv_6= RULE_ID )
            {
            // InternalAgentLang.g:1335:4: (otherlv_6= RULE_ID )
            // InternalAgentLang.g:1336:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeExperimentRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_6, grammarAccess.getProposeExperimentAccess().getRequirementRequirementCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProposeExperimentAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleProposeExperiment"


    // $ANTLR start "entryRuleSupportExperiment"
    // InternalAgentLang.g:1355:1: entryRuleSupportExperiment returns [EObject current=null] : iv_ruleSupportExperiment= ruleSupportExperiment EOF ;
    public final EObject entryRuleSupportExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportExperiment = null;


        try {
            // InternalAgentLang.g:1355:58: (iv_ruleSupportExperiment= ruleSupportExperiment EOF )
            // InternalAgentLang.g:1356:2: iv_ruleSupportExperiment= ruleSupportExperiment EOF
            {
             newCompositeNode(grammarAccess.getSupportExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupportExperiment=ruleSupportExperiment();

            state._fsp--;

             current =iv_ruleSupportExperiment; 
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
    // $ANTLR end "entryRuleSupportExperiment"


    // $ANTLR start "ruleSupportExperiment"
    // InternalAgentLang.g:1362:1: ruleSupportExperiment returns [EObject current=null] : (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
    public final EObject ruleSupportExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_theory_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1368:2: ( (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1369:2: (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1369:2: (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1370:3: otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportExperimentAccess().getSupportExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1378:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1379:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1379:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1380:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1395:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1396:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1396:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1397:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportExperimentAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_theory_4_0=ruleTheory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupportExperimentRule());
            					}
            					set(
            						current,
            						"theory",
            						lv_theory_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSupportExperimentAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSupportExperiment"


    // $ANTLR start "entryRuleAttackExperiment"
    // InternalAgentLang.g:1422:1: entryRuleAttackExperiment returns [EObject current=null] : iv_ruleAttackExperiment= ruleAttackExperiment EOF ;
    public final EObject entryRuleAttackExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackExperiment = null;


        try {
            // InternalAgentLang.g:1422:57: (iv_ruleAttackExperiment= ruleAttackExperiment EOF )
            // InternalAgentLang.g:1423:2: iv_ruleAttackExperiment= ruleAttackExperiment EOF
            {
             newCompositeNode(grammarAccess.getAttackExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttackExperiment=ruleAttackExperiment();

            state._fsp--;

             current =iv_ruleAttackExperiment; 
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
    // $ANTLR end "entryRuleAttackExperiment"


    // $ANTLR start "ruleAttackExperiment"
    // InternalAgentLang.g:1429:1: ruleAttackExperiment returns [EObject current=null] : (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
    public final EObject ruleAttackExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_theory_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1435:2: ( (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1436:2: (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1436:2: (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1437:3: otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackExperimentAccess().getAttackExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1445:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1446:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1446:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1447:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1462:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1463:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1463:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1464:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackExperimentAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_theory_4_0=ruleTheory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttackExperimentRule());
            					}
            					set(
            						current,
            						"theory",
            						lv_theory_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttackExperimentAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAttackExperiment"


    // $ANTLR start "entryRuleRetractExperiment"
    // InternalAgentLang.g:1489:1: entryRuleRetractExperiment returns [EObject current=null] : iv_ruleRetractExperiment= ruleRetractExperiment EOF ;
    public final EObject entryRuleRetractExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetractExperiment = null;


        try {
            // InternalAgentLang.g:1489:58: (iv_ruleRetractExperiment= ruleRetractExperiment EOF )
            // InternalAgentLang.g:1490:2: iv_ruleRetractExperiment= ruleRetractExperiment EOF
            {
             newCompositeNode(grammarAccess.getRetractExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetractExperiment=ruleRetractExperiment();

            state._fsp--;

             current =iv_ruleRetractExperiment; 
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
    // $ANTLR end "entryRuleRetractExperiment"


    // $ANTLR start "ruleRetractExperiment"
    // InternalAgentLang.g:1496:1: ruleRetractExperiment returns [EObject current=null] : (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleRetractExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1502:2: ( (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:1503:2: (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:1503:2: (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:1504:3: otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRetractExperimentAccess().getRetractExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRetractExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1512:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1513:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1513:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1514:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetractExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getRetractExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRetractExperimentAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRetractExperiment"


    // $ANTLR start "entryRuleStudyDone"
    // InternalAgentLang.g:1533:1: entryRuleStudyDone returns [EObject current=null] : iv_ruleStudyDone= ruleStudyDone EOF ;
    public final EObject entryRuleStudyDone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudyDone = null;


        try {
            // InternalAgentLang.g:1533:50: (iv_ruleStudyDone= ruleStudyDone EOF )
            // InternalAgentLang.g:1534:2: iv_ruleStudyDone= ruleStudyDone EOF
            {
             newCompositeNode(grammarAccess.getStudyDoneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudyDone=ruleStudyDone();

            state._fsp--;

             current =iv_ruleStudyDone; 
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
    // $ANTLR end "entryRuleStudyDone"


    // $ANTLR start "ruleStudyDone"
    // InternalAgentLang.g:1540:1: ruleStudyDone returns [EObject current=null] : ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleStudyDone() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1546:2: ( ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalAgentLang.g:1547:2: ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalAgentLang.g:1547:2: ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' )
            // InternalAgentLang.g:1548:3: () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalAgentLang.g:1548:3: ()
            // InternalAgentLang.g:1549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStudyDoneAccess().getStudyDoneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getStudyDoneAccess().getStudyDoneKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getStudyDoneAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStudyDoneAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleStudyDone"


    // $ANTLR start "entryRuleNotConvinced"
    // InternalAgentLang.g:1571:1: entryRuleNotConvinced returns [EObject current=null] : iv_ruleNotConvinced= ruleNotConvinced EOF ;
    public final EObject entryRuleNotConvinced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotConvinced = null;


        try {
            // InternalAgentLang.g:1571:53: (iv_ruleNotConvinced= ruleNotConvinced EOF )
            // InternalAgentLang.g:1572:2: iv_ruleNotConvinced= ruleNotConvinced EOF
            {
             newCompositeNode(grammarAccess.getNotConvincedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotConvinced=ruleNotConvinced();

            state._fsp--;

             current =iv_ruleNotConvinced; 
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
    // $ANTLR end "entryRuleNotConvinced"


    // $ANTLR start "ruleNotConvinced"
    // InternalAgentLang.g:1578:1: ruleNotConvinced returns [EObject current=null] : (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleNotConvinced() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1584:2: ( (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:1585:2: (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:1585:2: (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:1586:3: otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNotConvincedAccess().getNotConvincedKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNotConvincedAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1594:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1595:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1595:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1596:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotConvincedRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getNotConvincedAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNotConvincedAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleNotConvinced"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001FFFD2002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});

}