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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_LITREF", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'What'", "'mechanism'", "'best'", "'explains'", "'}'", "'<'", "'incorporates'", "'>'", "'Models'", "'must'", "'replicate'", "'{{'", "','", "'}}'", "'supported'", "'by'", "'proposeResearchQuestion'", "'('", "')'", "'proposeRequirement'", "'AttackRequirement'", "'RedefineRequirement'", "'RetractRequirement'", "'supportRequirement'", "'proposeModel'", "'supportModel'", "'replaceModel'", "'counterModel'", "'AttackModel'", "'ReviseRequirement'", "'ProposeExperiment'", "'SupportExperiment'", "'AttackExperiment'", "'proposeAssumption'", "'RetractExperiment'", "'StudyDone'", "'NotConvinced'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_LITREF=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==29||(LA1_0>=32 && LA1_0<=49)) ) {
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
    // InternalAgentLang.g:107:1: ruleMove returns [EObject current=null] : (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced | this_ProposeAssumption_18= ruleProposeAssumption ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        EObject this_ProposeRQ_0 = null;

        EObject this_ProposeRequirement_1 = null;

        EObject this_AttackRequirement_2 = null;

        EObject this_RedefineRequirement_3 = null;

        EObject this_RetractRequirement_4 = null;

        EObject this_SupportRequirement_5 = null;

        EObject this_ProposeModel_6 = null;

        EObject this_SupportModel_7 = null;

        EObject this_ReplaceModel_8 = null;

        EObject this_CounterModel_9 = null;

        EObject this_AttackModel_10 = null;

        EObject this_ReviseRequirement_11 = null;

        EObject this_ProposeExperiment_12 = null;

        EObject this_SupportExperiment_13 = null;

        EObject this_AttackExperiment_14 = null;

        EObject this_RetractExperiment_15 = null;

        EObject this_StudyDone_16 = null;

        EObject this_NotConvinced_17 = null;

        EObject this_ProposeAssumption_18 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:113:2: ( (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced | this_ProposeAssumption_18= ruleProposeAssumption ) )
            // InternalAgentLang.g:114:2: (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced | this_ProposeAssumption_18= ruleProposeAssumption )
            {
            // InternalAgentLang.g:114:2: (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced | this_ProposeAssumption_18= ruleProposeAssumption )
            int alt2=19;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 36:
                {
                alt2=6;
                }
                break;
            case 37:
                {
                alt2=7;
                }
                break;
            case 38:
                {
                alt2=8;
                }
                break;
            case 39:
                {
                alt2=9;
                }
                break;
            case 40:
                {
                alt2=10;
                }
                break;
            case 41:
                {
                alt2=11;
                }
                break;
            case 42:
                {
                alt2=12;
                }
                break;
            case 43:
                {
                alt2=13;
                }
                break;
            case 44:
                {
                alt2=14;
                }
                break;
            case 45:
                {
                alt2=15;
                }
                break;
            case 47:
                {
                alt2=16;
                }
                break;
            case 48:
                {
                alt2=17;
                }
                break;
            case 49:
                {
                alt2=18;
                }
                break;
            case 46:
                {
                alt2=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAgentLang.g:115:3: this_ProposeRQ_0= ruleProposeRQ
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeRQParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeRQ_0=ruleProposeRQ();

                    state._fsp--;


                    			current = this_ProposeRQ_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAgentLang.g:124:3: this_ProposeRequirement_1= ruleProposeRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeRequirementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeRequirement_1=ruleProposeRequirement();

                    state._fsp--;


                    			current = this_ProposeRequirement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAgentLang.g:133:3: this_AttackRequirement_2= ruleAttackRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getAttackRequirementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttackRequirement_2=ruleAttackRequirement();

                    state._fsp--;


                    			current = this_AttackRequirement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAgentLang.g:142:3: this_RedefineRequirement_3= ruleRedefineRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getRedefineRequirementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RedefineRequirement_3=ruleRedefineRequirement();

                    state._fsp--;


                    			current = this_RedefineRequirement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAgentLang.g:151:3: this_RetractRequirement_4= ruleRetractRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getRetractRequirementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetractRequirement_4=ruleRetractRequirement();

                    state._fsp--;


                    			current = this_RetractRequirement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAgentLang.g:160:3: this_SupportRequirement_5= ruleSupportRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getSupportRequirementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupportRequirement_5=ruleSupportRequirement();

                    state._fsp--;


                    			current = this_SupportRequirement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAgentLang.g:169:3: this_ProposeModel_6= ruleProposeModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeModelParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeModel_6=ruleProposeModel();

                    state._fsp--;


                    			current = this_ProposeModel_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAgentLang.g:178:3: this_SupportModel_7= ruleSupportModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getSupportModelParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupportModel_7=ruleSupportModel();

                    state._fsp--;


                    			current = this_SupportModel_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAgentLang.g:187:3: this_ReplaceModel_8= ruleReplaceModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getReplaceModelParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReplaceModel_8=ruleReplaceModel();

                    state._fsp--;


                    			current = this_ReplaceModel_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAgentLang.g:196:3: this_CounterModel_9= ruleCounterModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getCounterModelParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CounterModel_9=ruleCounterModel();

                    state._fsp--;


                    			current = this_CounterModel_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAgentLang.g:205:3: this_AttackModel_10= ruleAttackModel
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getAttackModelParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttackModel_10=ruleAttackModel();

                    state._fsp--;


                    			current = this_AttackModel_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalAgentLang.g:214:3: this_ReviseRequirement_11= ruleReviseRequirement
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getReviseRequirementParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReviseRequirement_11=ruleReviseRequirement();

                    state._fsp--;


                    			current = this_ReviseRequirement_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalAgentLang.g:223:3: this_ProposeExperiment_12= ruleProposeExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeExperimentParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeExperiment_12=ruleProposeExperiment();

                    state._fsp--;


                    			current = this_ProposeExperiment_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalAgentLang.g:232:3: this_SupportExperiment_13= ruleSupportExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getSupportExperimentParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_SupportExperiment_13=ruleSupportExperiment();

                    state._fsp--;


                    			current = this_SupportExperiment_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalAgentLang.g:241:3: this_AttackExperiment_14= ruleAttackExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getAttackExperimentParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttackExperiment_14=ruleAttackExperiment();

                    state._fsp--;


                    			current = this_AttackExperiment_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalAgentLang.g:250:3: this_RetractExperiment_15= ruleRetractExperiment
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getRetractExperimentParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_RetractExperiment_15=ruleRetractExperiment();

                    state._fsp--;


                    			current = this_RetractExperiment_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalAgentLang.g:259:3: this_StudyDone_16= ruleStudyDone
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getStudyDoneParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_StudyDone_16=ruleStudyDone();

                    state._fsp--;


                    			current = this_StudyDone_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalAgentLang.g:268:3: this_NotConvinced_17= ruleNotConvinced
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getNotConvincedParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotConvinced_17=ruleNotConvinced();

                    state._fsp--;


                    			current = this_NotConvinced_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalAgentLang.g:277:3: this_ProposeAssumption_18= ruleProposeAssumption
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getProposeAssumptionParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProposeAssumption_18=ruleProposeAssumption();

                    state._fsp--;


                    			current = this_ProposeAssumption_18;
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


    // $ANTLR start "entryRuleResearchQuestion"
    // InternalAgentLang.g:289:1: entryRuleResearchQuestion returns [EObject current=null] : iv_ruleResearchQuestion= ruleResearchQuestion EOF ;
    public final EObject entryRuleResearchQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchQuestion = null;


        try {
            // InternalAgentLang.g:289:57: (iv_ruleResearchQuestion= ruleResearchQuestion EOF )
            // InternalAgentLang.g:290:2: iv_ruleResearchQuestion= ruleResearchQuestion EOF
            {
             newCompositeNode(grammarAccess.getResearchQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResearchQuestion=ruleResearchQuestion();

            state._fsp--;

             current =iv_ruleResearchQuestion; 
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
    // $ANTLR end "entryRuleResearchQuestion"


    // $ANTLR start "ruleResearchQuestion"
    // InternalAgentLang.g:296:1: ruleResearchQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleResearchQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_effect_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAgentLang.g:302:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalAgentLang.g:303:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalAgentLang.g:303:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalAgentLang.g:304:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            // InternalAgentLang.g:304:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:305:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:305:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:306:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getResearchQuestionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResearchQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getResearchQuestionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getResearchQuestionAccess().getWhatKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getResearchQuestionAccess().getMechanismKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getResearchQuestionAccess().getBestKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getResearchQuestionAccess().getExplainsKeyword_5());
            		
            // InternalAgentLang.g:342:3: ( (lv_effect_6_0= RULE_STRING ) )
            // InternalAgentLang.g:343:4: (lv_effect_6_0= RULE_STRING )
            {
            // InternalAgentLang.g:343:4: (lv_effect_6_0= RULE_STRING )
            // InternalAgentLang.g:344:5: lv_effect_6_0= RULE_STRING
            {
            lv_effect_6_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_effect_6_0, grammarAccess.getResearchQuestionAccess().getEffectSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResearchQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"effect",
            						lv_effect_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getResearchQuestionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleResearchQuestion"


    // $ANTLR start "entryRuleModel"
    // InternalAgentLang.g:368:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAgentLang.g:368:46: (iv_ruleModel= ruleModel EOF )
            // InternalAgentLang.g:369:2: iv_ruleModel= ruleModel EOF
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
    // InternalAgentLang.g:375:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'incorporates' otherlv_6= 'mechanism' ( (lv_mechanism_7_0= RULE_STRING ) ) otherlv_8= '>' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_mechanism_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAgentLang.g:381:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'incorporates' otherlv_6= 'mechanism' ( (lv_mechanism_7_0= RULE_STRING ) ) otherlv_8= '>' ) )
            // InternalAgentLang.g:382:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'incorporates' otherlv_6= 'mechanism' ( (lv_mechanism_7_0= RULE_STRING ) ) otherlv_8= '>' )
            {
            // InternalAgentLang.g:382:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'incorporates' otherlv_6= 'mechanism' ( (lv_mechanism_7_0= RULE_STRING ) ) otherlv_8= '>' )
            // InternalAgentLang.g:383:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'incorporates' otherlv_6= 'mechanism' ( (lv_mechanism_7_0= RULE_STRING ) ) otherlv_8= '>'
            {
            // InternalAgentLang.g:383:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:384:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:384:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:385:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalAgentLang.g:401:3: (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAgentLang.g:402:4: otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAgentLang.g:406:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalAgentLang.g:407:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalAgentLang.g:407:5: (lv_content_2_0= RULE_STRING )
                    // InternalAgentLang.g:408:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_content_2_0, grammarAccess.getModelAccess().getContentSTRINGTerminalRuleCall_1_1_0());
                    					

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

                    otherlv_3=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLessThanSignKeyword_2());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getIncorporatesKeyword_3());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getMechanismKeyword_4());
            		
            // InternalAgentLang.g:441:3: ( (lv_mechanism_7_0= RULE_STRING ) )
            // InternalAgentLang.g:442:4: (lv_mechanism_7_0= RULE_STRING )
            {
            // InternalAgentLang.g:442:4: (lv_mechanism_7_0= RULE_STRING )
            // InternalAgentLang.g:443:5: lv_mechanism_7_0= RULE_STRING
            {
            lv_mechanism_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_mechanism_7_0, grammarAccess.getModelAccess().getMechanismSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mechanism",
            						lv_mechanism_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getGreaterThanSignKeyword_6());
            		

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
    // InternalAgentLang.g:467:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalAgentLang.g:467:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalAgentLang.g:468:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalAgentLang.g:474:1: ruleRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_dataDescription_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalAgentLang.g:480:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' ) )
            // InternalAgentLang.g:481:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' )
            {
            // InternalAgentLang.g:481:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' )
            // InternalAgentLang.g:482:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>'
            {
            // InternalAgentLang.g:482:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:483:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:483:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:484:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalAgentLang.g:500:3: (otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAgentLang.g:501:4: otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAgentLang.g:505:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalAgentLang.g:506:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalAgentLang.g:506:5: (lv_content_2_0= RULE_STRING )
                    // InternalAgentLang.g:507:6: lv_content_2_0= RULE_STRING
                    {
                    lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_content_2_0, grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_1_1_0());
                    					

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

                    otherlv_3=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLessThanSignKeyword_2());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getModelsKeyword_3());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getMustKeyword_4());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getReplicateKeyword_5());
            		
            // InternalAgentLang.g:544:3: ( (lv_dataDescription_8_0= RULE_STRING ) )
            // InternalAgentLang.g:545:4: (lv_dataDescription_8_0= RULE_STRING )
            {
            // InternalAgentLang.g:545:4: (lv_dataDescription_8_0= RULE_STRING )
            // InternalAgentLang.g:546:5: lv_dataDescription_8_0= RULE_STRING
            {
            lv_dataDescription_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_dataDescription_8_0, grammarAccess.getRequirementAccess().getDataDescriptionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataDescription",
            						lv_dataDescription_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getGreaterThanSignKeyword_7());
            		

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


    // $ANTLR start "entryRuleAssumption"
    // InternalAgentLang.g:570:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // InternalAgentLang.g:570:51: (iv_ruleAssumption= ruleAssumption EOF )
            // InternalAgentLang.g:571:2: iv_ruleAssumption= ruleAssumption EOF
            {
             newCompositeNode(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssumption=ruleAssumption();

            state._fsp--;

             current =iv_ruleAssumption; 
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
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // InternalAgentLang.g:577:1: ruleAssumption returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleAssumption() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:583:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalAgentLang.g:584:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalAgentLang.g:584:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalAgentLang.g:585:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            // InternalAgentLang.g:585:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:586:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:586:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:587:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAssumptionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssumptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAssumptionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAgentLang.g:607:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:608:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:608:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:609:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_content_2_0, grammarAccess.getAssumptionAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssumptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssumptionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleExperiment"
    // InternalAgentLang.g:633:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalAgentLang.g:633:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalAgentLang.g:634:2: iv_ruleExperiment= ruleExperiment EOF
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
    // InternalAgentLang.g:640:1: ruleExperiment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:646:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalAgentLang.g:647:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalAgentLang.g:647:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalAgentLang.g:648:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            // InternalAgentLang.g:648:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:649:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:649:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:650:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAgentLang.g:670:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:671:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:671:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:672:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalAgentLang.g:696:1: entryRuleTheory returns [EObject current=null] : iv_ruleTheory= ruleTheory EOF ;
    public final EObject entryRuleTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheory = null;


        try {
            // InternalAgentLang.g:696:47: (iv_ruleTheory= ruleTheory EOF )
            // InternalAgentLang.g:697:2: iv_ruleTheory= ruleTheory EOF
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
    // InternalAgentLang.g:703:1: ruleTheory returns [EObject current=null] : (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReferenceTheory_1= ruleLiteratureReferenceTheory | this_MultiTheory_2= ruleMultiTheory ) ;
    public final EObject ruleTheory() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralTheory_0 = null;

        EObject this_LiteratureReferenceTheory_1 = null;

        EObject this_MultiTheory_2 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:709:2: ( (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReferenceTheory_1= ruleLiteratureReferenceTheory | this_MultiTheory_2= ruleMultiTheory ) )
            // InternalAgentLang.g:710:2: (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReferenceTheory_1= ruleLiteratureReferenceTheory | this_MultiTheory_2= ruleMultiTheory )
            {
            // InternalAgentLang.g:710:2: (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReferenceTheory_1= ruleLiteratureReferenceTheory | this_MultiTheory_2= ruleMultiTheory )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                case RULE_LITREF:
                    {
                    alt5=2;
                    }
                    break;
                case 24:
                    {
                    alt5=3;
                    }
                    break;
                case 12:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAgentLang.g:711:3: this_GeneralTheory_0= ruleGeneralTheory
                    {

                    			newCompositeNode(grammarAccess.getTheoryAccess().getGeneralTheoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralTheory_0=ruleGeneralTheory();

                    state._fsp--;


                    			current = this_GeneralTheory_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAgentLang.g:720:3: this_LiteratureReferenceTheory_1= ruleLiteratureReferenceTheory
                    {

                    			newCompositeNode(grammarAccess.getTheoryAccess().getLiteratureReferenceTheoryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteratureReferenceTheory_1=ruleLiteratureReferenceTheory();

                    state._fsp--;


                    			current = this_LiteratureReferenceTheory_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAgentLang.g:729:3: this_MultiTheory_2= ruleMultiTheory
                    {

                    			newCompositeNode(grammarAccess.getTheoryAccess().getMultiTheoryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiTheory_2=ruleMultiTheory();

                    state._fsp--;


                    			current = this_MultiTheory_2;
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
    // $ANTLR end "ruleTheory"


    // $ANTLR start "entryRuleMultiTheory"
    // InternalAgentLang.g:741:1: entryRuleMultiTheory returns [EObject current=null] : iv_ruleMultiTheory= ruleMultiTheory EOF ;
    public final EObject entryRuleMultiTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiTheory = null;


        try {
            // InternalAgentLang.g:741:52: (iv_ruleMultiTheory= ruleMultiTheory EOF )
            // InternalAgentLang.g:742:2: iv_ruleMultiTheory= ruleMultiTheory EOF
            {
             newCompositeNode(grammarAccess.getMultiTheoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiTheory=ruleMultiTheory();

            state._fsp--;

             current =iv_ruleMultiTheory; 
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
    // $ANTLR end "entryRuleMultiTheory"


    // $ANTLR start "ruleMultiTheory"
    // InternalAgentLang.g:748:1: ruleMultiTheory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{{' ( (lv_theories_2_0= ruleTheory ) ) (otherlv_3= ',' ( (lv_theories_4_0= ruleTheory ) ) )+ otherlv_5= '}}' ) ;
    public final EObject ruleMultiTheory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_theories_2_0 = null;

        EObject lv_theories_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:754:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{{' ( (lv_theories_2_0= ruleTheory ) ) (otherlv_3= ',' ( (lv_theories_4_0= ruleTheory ) ) )+ otherlv_5= '}}' ) )
            // InternalAgentLang.g:755:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{{' ( (lv_theories_2_0= ruleTheory ) ) (otherlv_3= ',' ( (lv_theories_4_0= ruleTheory ) ) )+ otherlv_5= '}}' )
            {
            // InternalAgentLang.g:755:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{{' ( (lv_theories_2_0= ruleTheory ) ) (otherlv_3= ',' ( (lv_theories_4_0= ruleTheory ) ) )+ otherlv_5= '}}' )
            // InternalAgentLang.g:756:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{{' ( (lv_theories_2_0= ruleTheory ) ) (otherlv_3= ',' ( (lv_theories_4_0= ruleTheory ) ) )+ otherlv_5= '}}'
            {
            // InternalAgentLang.g:756:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:757:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:757:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:758:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMultiTheoryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiTheoryAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
            		
            // InternalAgentLang.g:778:3: ( (lv_theories_2_0= ruleTheory ) )
            // InternalAgentLang.g:779:4: (lv_theories_2_0= ruleTheory )
            {
            // InternalAgentLang.g:779:4: (lv_theories_2_0= ruleTheory )
            // InternalAgentLang.g:780:5: lv_theories_2_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getMultiTheoryAccess().getTheoriesTheoryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_theories_2_0=ruleTheory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiTheoryRule());
            					}
            					add(
            						current,
            						"theories",
            						lv_theories_2_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAgentLang.g:797:3: (otherlv_3= ',' ( (lv_theories_4_0= ruleTheory ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAgentLang.g:798:4: otherlv_3= ',' ( (lv_theories_4_0= ruleTheory ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiTheoryAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAgentLang.g:802:4: ( (lv_theories_4_0= ruleTheory ) )
            	    // InternalAgentLang.g:803:5: (lv_theories_4_0= ruleTheory )
            	    {
            	    // InternalAgentLang.g:803:5: (lv_theories_4_0= ruleTheory )
            	    // InternalAgentLang.g:804:6: lv_theories_4_0= ruleTheory
            	    {

            	    						newCompositeNode(grammarAccess.getMultiTheoryAccess().getTheoriesTheoryParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_theories_4_0=ruleTheory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiTheoryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"theories",
            	    							lv_theories_4_0,
            	    							"uk.ac.kcl.inf.modelspeak.AgentLang.Theory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiTheoryAccess().getRightCurlyBracketRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMultiTheory"


    // $ANTLR start "entryRuleGeneralTheory"
    // InternalAgentLang.g:830:1: entryRuleGeneralTheory returns [EObject current=null] : iv_ruleGeneralTheory= ruleGeneralTheory EOF ;
    public final EObject entryRuleGeneralTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralTheory = null;


        try {
            // InternalAgentLang.g:830:54: (iv_ruleGeneralTheory= ruleGeneralTheory EOF )
            // InternalAgentLang.g:831:2: iv_ruleGeneralTheory= ruleGeneralTheory EOF
            {
             newCompositeNode(grammarAccess.getGeneralTheoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralTheory=ruleGeneralTheory();

            state._fsp--;

             current =iv_ruleGeneralTheory; 
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
    // $ANTLR end "entryRuleGeneralTheory"


    // $ANTLR start "ruleGeneralTheory"
    // InternalAgentLang.g:837:1: ruleGeneralTheory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleGeneralTheory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:843:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalAgentLang.g:844:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalAgentLang.g:844:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalAgentLang.g:845:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            // InternalAgentLang.g:845:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:846:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:846:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:847:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGeneralTheoryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralTheoryAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAgentLang.g:867:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:868:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:868:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:869:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_content_2_0, grammarAccess.getGeneralTheoryAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralTheoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralTheoryAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGeneralTheory"


    // $ANTLR start "entryRuleLiteratureReferenceTheory"
    // InternalAgentLang.g:893:1: entryRuleLiteratureReferenceTheory returns [EObject current=null] : iv_ruleLiteratureReferenceTheory= ruleLiteratureReferenceTheory EOF ;
    public final EObject entryRuleLiteratureReferenceTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteratureReferenceTheory = null;


        try {
            // InternalAgentLang.g:893:66: (iv_ruleLiteratureReferenceTheory= ruleLiteratureReferenceTheory EOF )
            // InternalAgentLang.g:894:2: iv_ruleLiteratureReferenceTheory= ruleLiteratureReferenceTheory EOF
            {
             newCompositeNode(grammarAccess.getLiteratureReferenceTheoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteratureReferenceTheory=ruleLiteratureReferenceTheory();

            state._fsp--;

             current =iv_ruleLiteratureReferenceTheory; 
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
    // $ANTLR end "entryRuleLiteratureReferenceTheory"


    // $ANTLR start "ruleLiteratureReferenceTheory"
    // InternalAgentLang.g:900:1: ruleLiteratureReferenceTheory returns [EObject current=null] : (this_LiteratureReference_0= ruleLiteratureReference | this_LiteratureReferenceForData_1= ruleLiteratureReferenceForData ) ;
    public final EObject ruleLiteratureReferenceTheory() throws RecognitionException {
        EObject current = null;

        EObject this_LiteratureReference_0 = null;

        EObject this_LiteratureReferenceForData_1 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:906:2: ( (this_LiteratureReference_0= ruleLiteratureReference | this_LiteratureReferenceForData_1= ruleLiteratureReferenceForData ) )
            // InternalAgentLang.g:907:2: (this_LiteratureReference_0= ruleLiteratureReference | this_LiteratureReferenceForData_1= ruleLiteratureReferenceForData )
            {
            // InternalAgentLang.g:907:2: (this_LiteratureReference_0= ruleLiteratureReference | this_LiteratureReferenceForData_1= ruleLiteratureReferenceForData )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_LITREF) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_STRING) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAgentLang.g:908:3: this_LiteratureReference_0= ruleLiteratureReference
                    {

                    			newCompositeNode(grammarAccess.getLiteratureReferenceTheoryAccess().getLiteratureReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteratureReference_0=ruleLiteratureReference();

                    state._fsp--;


                    			current = this_LiteratureReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAgentLang.g:917:3: this_LiteratureReferenceForData_1= ruleLiteratureReferenceForData
                    {

                    			newCompositeNode(grammarAccess.getLiteratureReferenceTheoryAccess().getLiteratureReferenceForDataParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteratureReferenceForData_1=ruleLiteratureReferenceForData();

                    state._fsp--;


                    			current = this_LiteratureReferenceForData_1;
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
    // $ANTLR end "ruleLiteratureReferenceTheory"


    // $ANTLR start "entryRuleLiteratureReference"
    // InternalAgentLang.g:929:1: entryRuleLiteratureReference returns [EObject current=null] : iv_ruleLiteratureReference= ruleLiteratureReference EOF ;
    public final EObject entryRuleLiteratureReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteratureReference = null;


        try {
            // InternalAgentLang.g:929:60: (iv_ruleLiteratureReference= ruleLiteratureReference EOF )
            // InternalAgentLang.g:930:2: iv_ruleLiteratureReference= ruleLiteratureReference EOF
            {
             newCompositeNode(grammarAccess.getLiteratureReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteratureReference=ruleLiteratureReference();

            state._fsp--;

             current =iv_ruleLiteratureReference; 
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
    // $ANTLR end "entryRuleLiteratureReference"


    // $ANTLR start "ruleLiteratureReference"
    // InternalAgentLang.g:936:1: ruleLiteratureReference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ref_1_0= RULE_LITREF ) ) ) ;
    public final EObject ruleLiteratureReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_ref_1_0=null;


        	enterRule();

        try {
            // InternalAgentLang.g:942:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ref_1_0= RULE_LITREF ) ) ) )
            // InternalAgentLang.g:943:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ref_1_0= RULE_LITREF ) ) )
            {
            // InternalAgentLang.g:943:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_ref_1_0= RULE_LITREF ) ) )
            // InternalAgentLang.g:944:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_ref_1_0= RULE_LITREF ) )
            {
            // InternalAgentLang.g:944:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:945:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:945:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:946:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLiteratureReferenceAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiteratureReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAgentLang.g:962:3: ( (lv_ref_1_0= RULE_LITREF ) )
            // InternalAgentLang.g:963:4: (lv_ref_1_0= RULE_LITREF )
            {
            // InternalAgentLang.g:963:4: (lv_ref_1_0= RULE_LITREF )
            // InternalAgentLang.g:964:5: lv_ref_1_0= RULE_LITREF
            {
            lv_ref_1_0=(Token)match(input,RULE_LITREF,FOLLOW_2); 

            					newLeafNode(lv_ref_1_0, grammarAccess.getLiteratureReferenceAccess().getRefLITREFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiteratureReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ref",
            						lv_ref_1_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.LITREF");
            				

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
    // $ANTLR end "ruleLiteratureReference"


    // $ANTLR start "entryRuleLiteratureReferenceForData"
    // InternalAgentLang.g:984:1: entryRuleLiteratureReferenceForData returns [EObject current=null] : iv_ruleLiteratureReferenceForData= ruleLiteratureReferenceForData EOF ;
    public final EObject entryRuleLiteratureReferenceForData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteratureReferenceForData = null;


        try {
            // InternalAgentLang.g:984:67: (iv_ruleLiteratureReferenceForData= ruleLiteratureReferenceForData EOF )
            // InternalAgentLang.g:985:2: iv_ruleLiteratureReferenceForData= ruleLiteratureReferenceForData EOF
            {
             newCompositeNode(grammarAccess.getLiteratureReferenceForDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteratureReferenceForData=ruleLiteratureReferenceForData();

            state._fsp--;

             current =iv_ruleLiteratureReferenceForData; 
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
    // $ANTLR end "entryRuleLiteratureReferenceForData"


    // $ANTLR start "ruleLiteratureReferenceForData"
    // InternalAgentLang.g:991:1: ruleLiteratureReferenceForData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= 'supported' otherlv_3= 'by' ( (lv_ref_4_0= ruleLiteratureReference ) ) ) ;
    public final EObject ruleLiteratureReferenceForData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_data_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_ref_4_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:997:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= 'supported' otherlv_3= 'by' ( (lv_ref_4_0= ruleLiteratureReference ) ) ) )
            // InternalAgentLang.g:998:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= 'supported' otherlv_3= 'by' ( (lv_ref_4_0= ruleLiteratureReference ) ) )
            {
            // InternalAgentLang.g:998:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= 'supported' otherlv_3= 'by' ( (lv_ref_4_0= ruleLiteratureReference ) ) )
            // InternalAgentLang.g:999:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_data_1_0= RULE_STRING ) ) otherlv_2= 'supported' otherlv_3= 'by' ( (lv_ref_4_0= ruleLiteratureReference ) )
            {
            // InternalAgentLang.g:999:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:1000:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:1000:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:1001:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLiteratureReferenceForDataAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiteratureReferenceForDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAgentLang.g:1017:3: ( (lv_data_1_0= RULE_STRING ) )
            // InternalAgentLang.g:1018:4: (lv_data_1_0= RULE_STRING )
            {
            // InternalAgentLang.g:1018:4: (lv_data_1_0= RULE_STRING )
            // InternalAgentLang.g:1019:5: lv_data_1_0= RULE_STRING
            {
            lv_data_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_data_1_0, grammarAccess.getLiteratureReferenceForDataAccess().getDataSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiteratureReferenceForDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"data",
            						lv_data_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getLiteratureReferenceForDataAccess().getSupportedKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getLiteratureReferenceForDataAccess().getByKeyword_3());
            		
            // InternalAgentLang.g:1043:3: ( (lv_ref_4_0= ruleLiteratureReference ) )
            // InternalAgentLang.g:1044:4: (lv_ref_4_0= ruleLiteratureReference )
            {
            // InternalAgentLang.g:1044:4: (lv_ref_4_0= ruleLiteratureReference )
            // InternalAgentLang.g:1045:5: lv_ref_4_0= ruleLiteratureReference
            {

            					newCompositeNode(grammarAccess.getLiteratureReferenceForDataAccess().getRefLiteratureReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_ref_4_0=ruleLiteratureReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiteratureReferenceForDataRule());
            					}
            					set(
            						current,
            						"ref",
            						lv_ref_4_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.LiteratureReference");
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
    // $ANTLR end "ruleLiteratureReferenceForData"


    // $ANTLR start "entryRuleProposeRQ"
    // InternalAgentLang.g:1066:1: entryRuleProposeRQ returns [EObject current=null] : iv_ruleProposeRQ= ruleProposeRQ EOF ;
    public final EObject entryRuleProposeRQ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeRQ = null;


        try {
            // InternalAgentLang.g:1066:50: (iv_ruleProposeRQ= ruleProposeRQ EOF )
            // InternalAgentLang.g:1067:2: iv_ruleProposeRQ= ruleProposeRQ EOF
            {
             newCompositeNode(grammarAccess.getProposeRQRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposeRQ=ruleProposeRQ();

            state._fsp--;

             current =iv_ruleProposeRQ; 
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
    // $ANTLR end "entryRuleProposeRQ"


    // $ANTLR start "ruleProposeRQ"
    // InternalAgentLang.g:1073:1: ruleProposeRQ returns [EObject current=null] : (otherlv_0= 'proposeResearchQuestion' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' ) ;
    public final EObject ruleProposeRQ() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rq_2_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1079:2: ( (otherlv_0= 'proposeResearchQuestion' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:1080:2: (otherlv_0= 'proposeResearchQuestion' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:1080:2: (otherlv_0= 'proposeResearchQuestion' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' )
            // InternalAgentLang.g:1081:3: otherlv_0= 'proposeResearchQuestion' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeRQAccess().getProposeResearchQuestionKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeRQAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1089:3: ( (lv_rq_2_0= ruleResearchQuestion ) )
            // InternalAgentLang.g:1090:4: (lv_rq_2_0= ruleResearchQuestion )
            {
            // InternalAgentLang.g:1090:4: (lv_rq_2_0= ruleResearchQuestion )
            // InternalAgentLang.g:1091:5: lv_rq_2_0= ruleResearchQuestion
            {

            					newCompositeNode(grammarAccess.getProposeRQAccess().getRqResearchQuestionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_rq_2_0=ruleResearchQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProposeRQRule());
            					}
            					set(
            						current,
            						"rq",
            						lv_rq_2_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.ResearchQuestion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeRQAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleProposeRQ"


    // $ANTLR start "entryRuleProposeRequirement"
    // InternalAgentLang.g:1116:1: entryRuleProposeRequirement returns [EObject current=null] : iv_ruleProposeRequirement= ruleProposeRequirement EOF ;
    public final EObject entryRuleProposeRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeRequirement = null;


        try {
            // InternalAgentLang.g:1116:59: (iv_ruleProposeRequirement= ruleProposeRequirement EOF )
            // InternalAgentLang.g:1117:2: iv_ruleProposeRequirement= ruleProposeRequirement EOF
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
    // InternalAgentLang.g:1123:1: ruleProposeRequirement returns [EObject current=null] : (otherlv_0= 'proposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleProposeRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_requirement_2_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:1129:2: ( (otherlv_0= 'proposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1130:2: (otherlv_0= 'proposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1130:2: (otherlv_0= 'proposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1131:3: otherlv_0= 'proposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeRequirementAccess().getProposeRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1139:3: ( (lv_requirement_2_0= ruleRequirement ) )
            // InternalAgentLang.g:1140:4: (lv_requirement_2_0= ruleRequirement )
            {
            // InternalAgentLang.g:1140:4: (lv_requirement_2_0= ruleRequirement )
            // InternalAgentLang.g:1141:5: lv_requirement_2_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getProposeRequirementAccess().getRequirementRequirementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1162:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:1163:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:1163:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:1164:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeRequirementRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_4, grammarAccess.getProposeRequirementAccess().getRqResearchQuestionCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProposeRequirementAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalAgentLang.g:1183:1: entryRuleAttackRequirement returns [EObject current=null] : iv_ruleAttackRequirement= ruleAttackRequirement EOF ;
    public final EObject entryRuleAttackRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackRequirement = null;


        try {
            // InternalAgentLang.g:1183:58: (iv_ruleAttackRequirement= ruleAttackRequirement EOF )
            // InternalAgentLang.g:1184:2: iv_ruleAttackRequirement= ruleAttackRequirement EOF
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
    // InternalAgentLang.g:1190:1: ruleAttackRequirement returns [EObject current=null] : (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1196:2: ( (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1197:2: (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1197:2: (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1198:3: otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackRequirementAccess().getAttackRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1206:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1207:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1207:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1208:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1223:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1224:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1224:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1225:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackRequirementAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1250:1: entryRuleRedefineRequirement returns [EObject current=null] : iv_ruleRedefineRequirement= ruleRedefineRequirement EOF ;
    public final EObject entryRuleRedefineRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefineRequirement = null;


        try {
            // InternalAgentLang.g:1250:60: (iv_ruleRedefineRequirement= ruleRedefineRequirement EOF )
            // InternalAgentLang.g:1251:2: iv_ruleRedefineRequirement= ruleRedefineRequirement EOF
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
    // InternalAgentLang.g:1257:1: ruleRedefineRequirement returns [EObject current=null] : (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1263:2: ( (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1264:2: (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1264:2: (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1265:3: otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRedefineRequirementAccess().getRedefineRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRedefineRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1273:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1274:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1274:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1275:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedefineRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getRedefineRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRedefineRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1290:3: ( (lv_newRequirement_4_0= ruleRequirement ) )
            // InternalAgentLang.g:1291:4: (lv_newRequirement_4_0= ruleRequirement )
            {
            // InternalAgentLang.g:1291:4: (lv_newRequirement_4_0= ruleRequirement )
            // InternalAgentLang.g:1292:5: lv_newRequirement_4_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getRedefineRequirementAccess().getNewRequirementRequirementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1317:1: entryRuleRetractRequirement returns [EObject current=null] : iv_ruleRetractRequirement= ruleRetractRequirement EOF ;
    public final EObject entryRuleRetractRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetractRequirement = null;


        try {
            // InternalAgentLang.g:1317:59: (iv_ruleRetractRequirement= ruleRetractRequirement EOF )
            // InternalAgentLang.g:1318:2: iv_ruleRetractRequirement= ruleRetractRequirement EOF
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
    // InternalAgentLang.g:1324:1: ruleRetractRequirement returns [EObject current=null] : (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleRetractRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1330:2: ( (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:1331:2: (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:1331:2: (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:1332:3: otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRetractRequirementAccess().getRetractRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRetractRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1340:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1341:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1341:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1342:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetractRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_2, grammarAccess.getRetractRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1361:1: entryRuleSupportRequirement returns [EObject current=null] : iv_ruleSupportRequirement= ruleSupportRequirement EOF ;
    public final EObject entryRuleSupportRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportRequirement = null;


        try {
            // InternalAgentLang.g:1361:59: (iv_ruleSupportRequirement= ruleSupportRequirement EOF )
            // InternalAgentLang.g:1362:2: iv_ruleSupportRequirement= ruleSupportRequirement EOF
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
    // InternalAgentLang.g:1368:1: ruleSupportRequirement returns [EObject current=null] : (otherlv_0= 'supportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1374:2: ( (otherlv_0= 'supportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1375:2: (otherlv_0= 'supportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1375:2: (otherlv_0= 'supportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1376:3: otherlv_0= 'supportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportRequirementAccess().getSupportRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1384:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1385:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1385:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1386:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1401:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1402:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1402:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1403:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportRequirementAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1428:1: entryRuleProposeModel returns [EObject current=null] : iv_ruleProposeModel= ruleProposeModel EOF ;
    public final EObject entryRuleProposeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeModel = null;


        try {
            // InternalAgentLang.g:1428:53: (iv_ruleProposeModel= ruleProposeModel EOF )
            // InternalAgentLang.g:1429:2: iv_ruleProposeModel= ruleProposeModel EOF
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
    // InternalAgentLang.g:1435:1: ruleProposeModel returns [EObject current=null] : (otherlv_0= 'proposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1441:2: ( (otherlv_0= 'proposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1442:2: (otherlv_0= 'proposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1442:2: (otherlv_0= 'proposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1443:3: otherlv_0= 'proposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeModelAccess().getProposeModelKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1451:3: ( (lv_model_2_0= ruleModel ) )
            // InternalAgentLang.g:1452:4: (lv_model_2_0= ruleModel )
            {
            // InternalAgentLang.g:1452:4: (lv_model_2_0= ruleModel )
            // InternalAgentLang.g:1453:5: lv_model_2_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getProposeModelAccess().getModelModelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1474:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:1475:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:1475:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:1476:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeModelRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_4, grammarAccess.getProposeModelAccess().getRequirementRequirementCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1495:1: entryRuleSupportModel returns [EObject current=null] : iv_ruleSupportModel= ruleSupportModel EOF ;
    public final EObject entryRuleSupportModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportModel = null;


        try {
            // InternalAgentLang.g:1495:53: (iv_ruleSupportModel= ruleSupportModel EOF )
            // InternalAgentLang.g:1496:2: iv_ruleSupportModel= ruleSupportModel EOF
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
    // InternalAgentLang.g:1502:1: ruleSupportModel returns [EObject current=null] : (otherlv_0= 'supportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1508:2: ( (otherlv_0= 'supportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1509:2: (otherlv_0= 'supportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1509:2: (otherlv_0= 'supportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1510:3: otherlv_0= 'supportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportModelAccess().getSupportModelKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1518:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1519:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1519:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1520:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1535:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1536:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1536:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1537:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportModelAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1562:1: entryRuleReplaceModel returns [EObject current=null] : iv_ruleReplaceModel= ruleReplaceModel EOF ;
    public final EObject entryRuleReplaceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceModel = null;


        try {
            // InternalAgentLang.g:1562:53: (iv_ruleReplaceModel= ruleReplaceModel EOF )
            // InternalAgentLang.g:1563:2: iv_ruleReplaceModel= ruleReplaceModel EOF
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
    // InternalAgentLang.g:1569:1: ruleReplaceModel returns [EObject current=null] : (otherlv_0= 'replaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1575:2: ( (otherlv_0= 'replaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1576:2: (otherlv_0= 'replaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1576:2: (otherlv_0= 'replaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1577:3: otherlv_0= 'replaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceModelAccess().getReplaceModelKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1585:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1586:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1586:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1587:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReplaceModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getReplaceModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getReplaceModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1602:3: ( (lv_newModel_4_0= ruleModel ) )
            // InternalAgentLang.g:1603:4: (lv_newModel_4_0= ruleModel )
            {
            // InternalAgentLang.g:1603:4: (lv_newModel_4_0= ruleModel )
            // InternalAgentLang.g:1604:5: lv_newModel_4_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getReplaceModelAccess().getNewModelModelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1629:1: entryRuleCounterModel returns [EObject current=null] : iv_ruleCounterModel= ruleCounterModel EOF ;
    public final EObject entryRuleCounterModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounterModel = null;


        try {
            // InternalAgentLang.g:1629:53: (iv_ruleCounterModel= ruleCounterModel EOF )
            // InternalAgentLang.g:1630:2: iv_ruleCounterModel= ruleCounterModel EOF
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
    // InternalAgentLang.g:1636:1: ruleCounterModel returns [EObject current=null] : (otherlv_0= 'counterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
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
            // InternalAgentLang.g:1642:2: ( (otherlv_0= 'counterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalAgentLang.g:1643:2: (otherlv_0= 'counterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalAgentLang.g:1643:2: (otherlv_0= 'counterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalAgentLang.g:1644:3: otherlv_0= 'counterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getCounterModelAccess().getCounterModelKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getCounterModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1652:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1653:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1653:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1654:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getCounterModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCounterModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1669:3: ( (lv_experiment_4_0= ruleExperiment ) )
            // InternalAgentLang.g:1670:4: (lv_experiment_4_0= ruleExperiment )
            {
            // InternalAgentLang.g:1670:4: (lv_experiment_4_0= ruleExperiment )
            // InternalAgentLang.g:1671:5: lv_experiment_4_0= ruleExperiment
            {

            					newCompositeNode(grammarAccess.getCounterModelAccess().getExperimentExperimentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getCounterModelAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1692:3: ( (otherlv_6= RULE_ID ) )
            // InternalAgentLang.g:1693:4: (otherlv_6= RULE_ID )
            {
            // InternalAgentLang.g:1693:4: (otherlv_6= RULE_ID )
            // InternalAgentLang.g:1694:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterModelRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_6, grammarAccess.getCounterModelAccess().getRequirementRequirementCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1713:1: entryRuleAttackModel returns [EObject current=null] : iv_ruleAttackModel= ruleAttackModel EOF ;
    public final EObject entryRuleAttackModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackModel = null;


        try {
            // InternalAgentLang.g:1713:52: (iv_ruleAttackModel= ruleAttackModel EOF )
            // InternalAgentLang.g:1714:2: iv_ruleAttackModel= ruleAttackModel EOF
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
    // InternalAgentLang.g:1720:1: ruleAttackModel returns [EObject current=null] : (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1726:2: ( (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1727:2: (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1727:2: (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1728:3: otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackModelAccess().getAttackModelKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1736:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1737:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1737:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1738:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1753:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1754:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1754:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1755:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackModelAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1780:1: entryRuleReviseRequirement returns [EObject current=null] : iv_ruleReviseRequirement= ruleReviseRequirement EOF ;
    public final EObject entryRuleReviseRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReviseRequirement = null;


        try {
            // InternalAgentLang.g:1780:58: (iv_ruleReviseRequirement= ruleReviseRequirement EOF )
            // InternalAgentLang.g:1781:2: iv_ruleReviseRequirement= ruleReviseRequirement EOF
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
    // InternalAgentLang.g:1787:1: ruleReviseRequirement returns [EObject current=null] : (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
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
            // InternalAgentLang.g:1793:2: ( (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalAgentLang.g:1794:2: (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalAgentLang.g:1794:2: (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalAgentLang.g:1795:3: otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getReviseRequirementAccess().getReviseRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getReviseRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1803:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1804:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1804:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1805:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getReviseRequirementAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getReviseRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1820:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:1821:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:1821:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:1822:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_4, grammarAccess.getReviseRequirementAccess().getRequirementRequirementCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getReviseRequirementAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1837:3: ( (lv_newRequirement_6_0= ruleRequirement ) )
            // InternalAgentLang.g:1838:4: (lv_newRequirement_6_0= ruleRequirement )
            {
            // InternalAgentLang.g:1838:4: (lv_newRequirement_6_0= ruleRequirement )
            // InternalAgentLang.g:1839:5: lv_newRequirement_6_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getReviseRequirementAccess().getNewRequirementRequirementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_7=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getReviseRequirementAccess().getCommaKeyword_7());
            		
            // InternalAgentLang.g:1860:3: ( (otherlv_8= RULE_ID ) )
            // InternalAgentLang.g:1861:4: (otherlv_8= RULE_ID )
            {
            // InternalAgentLang.g:1861:4: (otherlv_8= RULE_ID )
            // InternalAgentLang.g:1862:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_8, grammarAccess.getReviseRequirementAccess().getExperimentExperimentCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1881:1: entryRuleProposeExperiment returns [EObject current=null] : iv_ruleProposeExperiment= ruleProposeExperiment EOF ;
    public final EObject entryRuleProposeExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeExperiment = null;


        try {
            // InternalAgentLang.g:1881:58: (iv_ruleProposeExperiment= ruleProposeExperiment EOF )
            // InternalAgentLang.g:1882:2: iv_ruleProposeExperiment= ruleProposeExperiment EOF
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
    // InternalAgentLang.g:1888:1: ruleProposeExperiment returns [EObject current=null] : (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
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
            // InternalAgentLang.g:1894:2: ( (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalAgentLang.g:1895:2: (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalAgentLang.g:1895:2: (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalAgentLang.g:1896:3: otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeExperimentAccess().getProposeExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1904:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1905:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1905:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1906:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getProposeExperimentAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1921:3: ( (lv_experiment_4_0= ruleExperiment ) )
            // InternalAgentLang.g:1922:4: (lv_experiment_4_0= ruleExperiment )
            {
            // InternalAgentLang.g:1922:4: (lv_experiment_4_0= ruleExperiment )
            // InternalAgentLang.g:1923:5: lv_experiment_4_0= ruleExperiment
            {

            					newCompositeNode(grammarAccess.getProposeExperimentAccess().getExperimentExperimentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getProposeExperimentAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1944:3: ( (otherlv_6= RULE_ID ) )
            // InternalAgentLang.g:1945:4: (otherlv_6= RULE_ID )
            {
            // InternalAgentLang.g:1945:4: (otherlv_6= RULE_ID )
            // InternalAgentLang.g:1946:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeExperimentRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_6, grammarAccess.getProposeExperimentAccess().getRequirementRequirementCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:1965:1: entryRuleSupportExperiment returns [EObject current=null] : iv_ruleSupportExperiment= ruleSupportExperiment EOF ;
    public final EObject entryRuleSupportExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportExperiment = null;


        try {
            // InternalAgentLang.g:1965:58: (iv_ruleSupportExperiment= ruleSupportExperiment EOF )
            // InternalAgentLang.g:1966:2: iv_ruleSupportExperiment= ruleSupportExperiment EOF
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
    // InternalAgentLang.g:1972:1: ruleSupportExperiment returns [EObject current=null] : (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1978:2: ( (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1979:2: (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1979:2: (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1980:3: otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportExperimentAccess().getSupportExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1988:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1989:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1989:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1990:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:2005:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:2006:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:2006:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:2007:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportExperimentAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:2032:1: entryRuleAttackExperiment returns [EObject current=null] : iv_ruleAttackExperiment= ruleAttackExperiment EOF ;
    public final EObject entryRuleAttackExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackExperiment = null;


        try {
            // InternalAgentLang.g:2032:57: (iv_ruleAttackExperiment= ruleAttackExperiment EOF )
            // InternalAgentLang.g:2033:2: iv_ruleAttackExperiment= ruleAttackExperiment EOF
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
    // InternalAgentLang.g:2039:1: ruleAttackExperiment returns [EObject current=null] : (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:2045:2: ( (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:2046:2: (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:2046:2: (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:2047:3: otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackExperimentAccess().getAttackExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:2055:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:2056:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:2056:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:2057:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:2072:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:2073:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:2073:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:2074:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackExperimentAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleProposeAssumption"
    // InternalAgentLang.g:2099:1: entryRuleProposeAssumption returns [EObject current=null] : iv_ruleProposeAssumption= ruleProposeAssumption EOF ;
    public final EObject entryRuleProposeAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeAssumption = null;


        try {
            // InternalAgentLang.g:2099:58: (iv_ruleProposeAssumption= ruleProposeAssumption EOF )
            // InternalAgentLang.g:2100:2: iv_ruleProposeAssumption= ruleProposeAssumption EOF
            {
             newCompositeNode(grammarAccess.getProposeAssumptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposeAssumption=ruleProposeAssumption();

            state._fsp--;

             current =iv_ruleProposeAssumption; 
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
    // $ANTLR end "entryRuleProposeAssumption"


    // $ANTLR start "ruleProposeAssumption"
    // InternalAgentLang.g:2106:1: ruleProposeAssumption returns [EObject current=null] : (otherlv_0= 'proposeAssumption' otherlv_1= '(' ( (lv_assumption_2_0= ruleAssumption ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleProposeAssumption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_assumption_2_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:2112:2: ( (otherlv_0= 'proposeAssumption' otherlv_1= '(' ( (lv_assumption_2_0= ruleAssumption ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:2113:2: (otherlv_0= 'proposeAssumption' otherlv_1= '(' ( (lv_assumption_2_0= ruleAssumption ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:2113:2: (otherlv_0= 'proposeAssumption' otherlv_1= '(' ( (lv_assumption_2_0= ruleAssumption ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalAgentLang.g:2114:3: otherlv_0= 'proposeAssumption' otherlv_1= '(' ( (lv_assumption_2_0= ruleAssumption ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeAssumptionAccess().getProposeAssumptionKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeAssumptionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:2122:3: ( (lv_assumption_2_0= ruleAssumption ) )
            // InternalAgentLang.g:2123:4: (lv_assumption_2_0= ruleAssumption )
            {
            // InternalAgentLang.g:2123:4: (lv_assumption_2_0= ruleAssumption )
            // InternalAgentLang.g:2124:5: lv_assumption_2_0= ruleAssumption
            {

            					newCompositeNode(grammarAccess.getProposeAssumptionAccess().getAssumptionAssumptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_assumption_2_0=ruleAssumption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProposeAssumptionRule());
            					}
            					set(
            						current,
            						"assumption",
            						lv_assumption_2_0,
            						"uk.ac.kcl.inf.modelspeak.AgentLang.Assumption");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeAssumptionAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:2145:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:2146:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:2146:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:2147:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeAssumptionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_4, grammarAccess.getProposeAssumptionAccess().getModelModelCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProposeAssumptionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleProposeAssumption"


    // $ANTLR start "entryRuleRetractExperiment"
    // InternalAgentLang.g:2166:1: entryRuleRetractExperiment returns [EObject current=null] : iv_ruleRetractExperiment= ruleRetractExperiment EOF ;
    public final EObject entryRuleRetractExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetractExperiment = null;


        try {
            // InternalAgentLang.g:2166:58: (iv_ruleRetractExperiment= ruleRetractExperiment EOF )
            // InternalAgentLang.g:2167:2: iv_ruleRetractExperiment= ruleRetractExperiment EOF
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
    // InternalAgentLang.g:2173:1: ruleRetractExperiment returns [EObject current=null] : (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleRetractExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:2179:2: ( (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:2180:2: (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:2180:2: (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:2181:3: otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRetractExperimentAccess().getRetractExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRetractExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:2189:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:2190:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:2190:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:2191:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetractExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_2, grammarAccess.getRetractExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:2210:1: entryRuleStudyDone returns [EObject current=null] : iv_ruleStudyDone= ruleStudyDone EOF ;
    public final EObject entryRuleStudyDone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudyDone = null;


        try {
            // InternalAgentLang.g:2210:50: (iv_ruleStudyDone= ruleStudyDone EOF )
            // InternalAgentLang.g:2211:2: iv_ruleStudyDone= ruleStudyDone EOF
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
    // InternalAgentLang.g:2217:1: ruleStudyDone returns [EObject current=null] : ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleStudyDone() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:2223:2: ( ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalAgentLang.g:2224:2: ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalAgentLang.g:2224:2: ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' )
            // InternalAgentLang.g:2225:3: () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalAgentLang.g:2225:3: ()
            // InternalAgentLang.g:2226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStudyDoneAccess().getStudyDoneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getStudyDoneAccess().getStudyDoneKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getStudyDoneAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAgentLang.g:2248:1: entryRuleNotConvinced returns [EObject current=null] : iv_ruleNotConvinced= ruleNotConvinced EOF ;
    public final EObject entryRuleNotConvinced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotConvinced = null;


        try {
            // InternalAgentLang.g:2248:53: (iv_ruleNotConvinced= ruleNotConvinced EOF )
            // InternalAgentLang.g:2249:2: iv_ruleNotConvinced= ruleNotConvinced EOF
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
    // InternalAgentLang.g:2255:1: ruleNotConvinced returns [EObject current=null] : (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleNotConvinced() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:2261:2: ( (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:2262:2: (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:2262:2: (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:2263:3: otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getNotConvincedAccess().getNotConvincedKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getNotConvincedAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:2271:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:2272:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:2272:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:2273:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotConvincedRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_2, grammarAccess.getNotConvincedAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0003FFFF20000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});

}