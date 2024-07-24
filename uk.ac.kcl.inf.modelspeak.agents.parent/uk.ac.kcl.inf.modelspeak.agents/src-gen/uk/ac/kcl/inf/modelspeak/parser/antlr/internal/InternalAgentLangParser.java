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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "'What'", "'mechanism'", "'best'", "'explains'", "']'", "'<'", "'Models'", "'must'", "'replicate'", "'>'", "'{'", "'}'", "'ProposeRQ'", "'('", "')'", "'ProposeRequirement'", "','", "'AttackRequirement'", "'RedefineRequirement'", "'RetractRequirement'", "'SupportRequirement'", "'ProposeModel'", "'SupportModel'", "'ReplaceModel'", "'CounterModel'", "'AttackModel'", "'ReviseRequirement'", "'ProposeExperiment'", "'SupportExperiment'", "'AttackExperiment'", "'RetractExperiment'", "'StudyDone'", "'NotConvinced'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
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

                if ( (LA1_0==24||LA1_0==27||(LA1_0>=29 && LA1_0<=44)) ) {
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
    // InternalAgentLang.g:107:1: ruleMove returns [EObject current=null] : (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced ) ;
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



        	enterRule();

        try {
            // InternalAgentLang.g:113:2: ( (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced ) )
            // InternalAgentLang.g:114:2: (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced )
            {
            // InternalAgentLang.g:114:2: (this_ProposeRQ_0= ruleProposeRQ | this_ProposeRequirement_1= ruleProposeRequirement | this_AttackRequirement_2= ruleAttackRequirement | this_RedefineRequirement_3= ruleRedefineRequirement | this_RetractRequirement_4= ruleRetractRequirement | this_SupportRequirement_5= ruleSupportRequirement | this_ProposeModel_6= ruleProposeModel | this_SupportModel_7= ruleSupportModel | this_ReplaceModel_8= ruleReplaceModel | this_CounterModel_9= ruleCounterModel | this_AttackModel_10= ruleAttackModel | this_ReviseRequirement_11= ruleReviseRequirement | this_ProposeExperiment_12= ruleProposeExperiment | this_SupportExperiment_13= ruleSupportExperiment | this_AttackExperiment_14= ruleAttackExperiment | this_RetractExperiment_15= ruleRetractExperiment | this_StudyDone_16= ruleStudyDone | this_NotConvinced_17= ruleNotConvinced )
            int alt2=18;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            case 32:
                {
                alt2=6;
                }
                break;
            case 33:
                {
                alt2=7;
                }
                break;
            case 34:
                {
                alt2=8;
                }
                break;
            case 35:
                {
                alt2=9;
                }
                break;
            case 36:
                {
                alt2=10;
                }
                break;
            case 37:
                {
                alt2=11;
                }
                break;
            case 38:
                {
                alt2=12;
                }
                break;
            case 39:
                {
                alt2=13;
                }
                break;
            case 40:
                {
                alt2=14;
                }
                break;
            case 41:
                {
                alt2=15;
                }
                break;
            case 42:
                {
                alt2=16;
                }
                break;
            case 43:
                {
                alt2=17;
                }
                break;
            case 44:
                {
                alt2=18;
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
    // InternalAgentLang.g:280:1: entryRuleResearchQuestion returns [EObject current=null] : iv_ruleResearchQuestion= ruleResearchQuestion EOF ;
    public final EObject entryRuleResearchQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResearchQuestion = null;


        try {
            // InternalAgentLang.g:280:57: (iv_ruleResearchQuestion= ruleResearchQuestion EOF )
            // InternalAgentLang.g:281:2: iv_ruleResearchQuestion= ruleResearchQuestion EOF
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
    // InternalAgentLang.g:287:1: ruleResearchQuestion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= ']' ) ;
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
            // InternalAgentLang.g:293:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= ']' ) )
            // InternalAgentLang.g:294:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= ']' )
            {
            // InternalAgentLang.g:294:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= ']' )
            // InternalAgentLang.g:295:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' otherlv_2= 'What' otherlv_3= 'mechanism' otherlv_4= 'best' otherlv_5= 'explains' ( (lv_effect_6_0= RULE_STRING ) ) otherlv_7= ']'
            {
            // InternalAgentLang.g:295:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:296:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:296:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:297:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getResearchQuestionAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getResearchQuestionAccess().getWhatKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getResearchQuestionAccess().getMechanismKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getResearchQuestionAccess().getBestKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getResearchQuestionAccess().getExplainsKeyword_5());
            		
            // InternalAgentLang.g:333:3: ( (lv_effect_6_0= RULE_STRING ) )
            // InternalAgentLang.g:334:4: (lv_effect_6_0= RULE_STRING )
            {
            // InternalAgentLang.g:334:4: (lv_effect_6_0= RULE_STRING )
            // InternalAgentLang.g:335:5: lv_effect_6_0= RULE_STRING
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

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getResearchQuestionAccess().getRightSquareBracketKeyword_7());
            		

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
    // InternalAgentLang.g:359:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAgentLang.g:359:46: (iv_ruleModel= ruleModel EOF )
            // InternalAgentLang.g:360:2: iv_ruleModel= ruleModel EOF
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
    // InternalAgentLang.g:366:1: ruleModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:372:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalAgentLang.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalAgentLang.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalAgentLang.g:374:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalAgentLang.g:374:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:375:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:375:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:376:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAgentLang.g:396:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:397:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:397:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:398:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAgentLang.g:422:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalAgentLang.g:422:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalAgentLang.g:423:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalAgentLang.g:429:1: ruleRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' ) ;
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
            // InternalAgentLang.g:435:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' ) )
            // InternalAgentLang.g:436:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' )
            {
            // InternalAgentLang.g:436:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>' )
            // InternalAgentLang.g:437:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )? otherlv_4= '<' otherlv_5= 'Models' otherlv_6= 'must' otherlv_7= 'replicate' ( (lv_dataDescription_8_0= RULE_STRING ) ) otherlv_9= '>'
            {
            // InternalAgentLang.g:437:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:438:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:438:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:439:5: lv_name_0_0= RULE_ID
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

            // InternalAgentLang.g:455:3: (otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAgentLang.g:456:4: otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAgentLang.g:460:4: ( (lv_content_2_0= RULE_STRING ) )
                    // InternalAgentLang.g:461:5: (lv_content_2_0= RULE_STRING )
                    {
                    // InternalAgentLang.g:461:5: (lv_content_2_0= RULE_STRING )
                    // InternalAgentLang.g:462:6: lv_content_2_0= RULE_STRING
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

                    otherlv_3=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getLessThanSignKeyword_2());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getModelsKeyword_3());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getMustKeyword_4());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getReplicateKeyword_5());
            		
            // InternalAgentLang.g:499:3: ( (lv_dataDescription_8_0= RULE_STRING ) )
            // InternalAgentLang.g:500:4: (lv_dataDescription_8_0= RULE_STRING )
            {
            // InternalAgentLang.g:500:4: (lv_dataDescription_8_0= RULE_STRING )
            // InternalAgentLang.g:501:5: lv_dataDescription_8_0= RULE_STRING
            {
            lv_dataDescription_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExperiment"
    // InternalAgentLang.g:525:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalAgentLang.g:525:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalAgentLang.g:526:2: iv_ruleExperiment= ruleExperiment EOF
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
    // InternalAgentLang.g:532:1: ruleExperiment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:538:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalAgentLang.g:539:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalAgentLang.g:539:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalAgentLang.g:540:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalAgentLang.g:540:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:541:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:541:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:542:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getExperimentAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAgentLang.g:562:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:563:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:563:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:564:5: lv_content_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

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
    // InternalAgentLang.g:588:1: entryRuleTheory returns [EObject current=null] : iv_ruleTheory= ruleTheory EOF ;
    public final EObject entryRuleTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTheory = null;


        try {
            // InternalAgentLang.g:588:47: (iv_ruleTheory= ruleTheory EOF )
            // InternalAgentLang.g:589:2: iv_ruleTheory= ruleTheory EOF
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
    // InternalAgentLang.g:595:1: ruleTheory returns [EObject current=null] : (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReference_1= ruleLiteratureReference ) ;
    public final EObject ruleTheory() throws RecognitionException {
        EObject current = null;

        EObject this_GeneralTheory_0 = null;

        EObject this_LiteratureReference_1 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:601:2: ( (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReference_1= ruleLiteratureReference ) )
            // InternalAgentLang.g:602:2: (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReference_1= ruleLiteratureReference )
            {
            // InternalAgentLang.g:602:2: (this_GeneralTheory_0= ruleGeneralTheory | this_LiteratureReference_1= ruleLiteratureReference )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else if ( (LA4_1==11) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAgentLang.g:603:3: this_GeneralTheory_0= ruleGeneralTheory
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
                    // InternalAgentLang.g:612:3: this_LiteratureReference_1= ruleLiteratureReference
                    {

                    			newCompositeNode(grammarAccess.getTheoryAccess().getLiteratureReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteratureReference_1=ruleLiteratureReference();

                    state._fsp--;


                    			current = this_LiteratureReference_1;
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


    // $ANTLR start "entryRuleGeneralTheory"
    // InternalAgentLang.g:624:1: entryRuleGeneralTheory returns [EObject current=null] : iv_ruleGeneralTheory= ruleGeneralTheory EOF ;
    public final EObject entryRuleGeneralTheory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralTheory = null;


        try {
            // InternalAgentLang.g:624:54: (iv_ruleGeneralTheory= ruleGeneralTheory EOF )
            // InternalAgentLang.g:625:2: iv_ruleGeneralTheory= ruleGeneralTheory EOF
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
    // InternalAgentLang.g:631:1: ruleGeneralTheory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) ;
    public final EObject ruleGeneralTheory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:637:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' ) )
            // InternalAgentLang.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            {
            // InternalAgentLang.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']' )
            // InternalAgentLang.g:639:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ']'
            {
            // InternalAgentLang.g:639:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:640:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:640:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:641:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGeneralTheoryAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAgentLang.g:661:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalAgentLang.g:662:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:662:4: (lv_content_2_0= RULE_STRING )
            // InternalAgentLang.g:663:5: lv_content_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralTheoryAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleLiteratureReference"
    // InternalAgentLang.g:687:1: entryRuleLiteratureReference returns [EObject current=null] : iv_ruleLiteratureReference= ruleLiteratureReference EOF ;
    public final EObject entryRuleLiteratureReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteratureReference = null;


        try {
            // InternalAgentLang.g:687:60: (iv_ruleLiteratureReference= ruleLiteratureReference EOF )
            // InternalAgentLang.g:688:2: iv_ruleLiteratureReference= ruleLiteratureReference EOF
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
    // InternalAgentLang.g:694:1: ruleLiteratureReference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleLiteratureReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_ref_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:700:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalAgentLang.g:701:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalAgentLang.g:701:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalAgentLang.g:702:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_ref_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            // InternalAgentLang.g:702:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAgentLang.g:703:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAgentLang.g:703:4: (lv_name_0_0= RULE_ID )
            // InternalAgentLang.g:704:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteratureReferenceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAgentLang.g:724:3: ( (lv_ref_2_0= RULE_STRING ) )
            // InternalAgentLang.g:725:4: (lv_ref_2_0= RULE_STRING )
            {
            // InternalAgentLang.g:725:4: (lv_ref_2_0= RULE_STRING )
            // InternalAgentLang.g:726:5: lv_ref_2_0= RULE_STRING
            {
            lv_ref_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_ref_2_0, grammarAccess.getLiteratureReferenceAccess().getRefSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiteratureReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ref",
            						lv_ref_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLiteratureReferenceAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleProposeRQ"
    // InternalAgentLang.g:750:1: entryRuleProposeRQ returns [EObject current=null] : iv_ruleProposeRQ= ruleProposeRQ EOF ;
    public final EObject entryRuleProposeRQ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeRQ = null;


        try {
            // InternalAgentLang.g:750:50: (iv_ruleProposeRQ= ruleProposeRQ EOF )
            // InternalAgentLang.g:751:2: iv_ruleProposeRQ= ruleProposeRQ EOF
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
    // InternalAgentLang.g:757:1: ruleProposeRQ returns [EObject current=null] : (otherlv_0= 'ProposeRQ' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' ) ;
    public final EObject ruleProposeRQ() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_rq_2_0 = null;



        	enterRule();

        try {
            // InternalAgentLang.g:763:2: ( (otherlv_0= 'ProposeRQ' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:764:2: (otherlv_0= 'ProposeRQ' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:764:2: (otherlv_0= 'ProposeRQ' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')' )
            // InternalAgentLang.g:765:3: otherlv_0= 'ProposeRQ' otherlv_1= '(' ( (lv_rq_2_0= ruleResearchQuestion ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeRQAccess().getProposeRQKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeRQAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:773:3: ( (lv_rq_2_0= ruleResearchQuestion ) )
            // InternalAgentLang.g:774:4: (lv_rq_2_0= ruleResearchQuestion )
            {
            // InternalAgentLang.g:774:4: (lv_rq_2_0= ruleResearchQuestion )
            // InternalAgentLang.g:775:5: lv_rq_2_0= ruleResearchQuestion
            {

            					newCompositeNode(grammarAccess.getProposeRQAccess().getRqResearchQuestionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:800:1: entryRuleProposeRequirement returns [EObject current=null] : iv_ruleProposeRequirement= ruleProposeRequirement EOF ;
    public final EObject entryRuleProposeRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeRequirement = null;


        try {
            // InternalAgentLang.g:800:59: (iv_ruleProposeRequirement= ruleProposeRequirement EOF )
            // InternalAgentLang.g:801:2: iv_ruleProposeRequirement= ruleProposeRequirement EOF
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
    // InternalAgentLang.g:807:1: ruleProposeRequirement returns [EObject current=null] : (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:813:2: ( (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:814:2: (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:814:2: (otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalAgentLang.g:815:3: otherlv_0= 'ProposeRequirement' otherlv_1= '(' ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeRequirementAccess().getProposeRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:823:3: ( (lv_requirement_2_0= ruleRequirement ) )
            // InternalAgentLang.g:824:4: (lv_requirement_2_0= ruleRequirement )
            {
            // InternalAgentLang.g:824:4: (lv_requirement_2_0= ruleRequirement )
            // InternalAgentLang.g:825:5: lv_requirement_2_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getProposeRequirementAccess().getRequirementRequirementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:846:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:847:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:847:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:848:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeRequirementRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_4, grammarAccess.getProposeRequirementAccess().getRqResearchQuestionCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:867:1: entryRuleAttackRequirement returns [EObject current=null] : iv_ruleAttackRequirement= ruleAttackRequirement EOF ;
    public final EObject entryRuleAttackRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackRequirement = null;


        try {
            // InternalAgentLang.g:867:58: (iv_ruleAttackRequirement= ruleAttackRequirement EOF )
            // InternalAgentLang.g:868:2: iv_ruleAttackRequirement= ruleAttackRequirement EOF
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
    // InternalAgentLang.g:874:1: ruleAttackRequirement returns [EObject current=null] : (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:880:2: ( (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:881:2: (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:881:2: (otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:882:3: otherlv_0= 'AttackRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackRequirementAccess().getAttackRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:890:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:891:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:891:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:892:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:907:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:908:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:908:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:909:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackRequirementAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:934:1: entryRuleRedefineRequirement returns [EObject current=null] : iv_ruleRedefineRequirement= ruleRedefineRequirement EOF ;
    public final EObject entryRuleRedefineRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefineRequirement = null;


        try {
            // InternalAgentLang.g:934:60: (iv_ruleRedefineRequirement= ruleRedefineRequirement EOF )
            // InternalAgentLang.g:935:2: iv_ruleRedefineRequirement= ruleRedefineRequirement EOF
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
    // InternalAgentLang.g:941:1: ruleRedefineRequirement returns [EObject current=null] : (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:947:2: ( (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:948:2: (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:948:2: (otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')' )
            // InternalAgentLang.g:949:3: otherlv_0= 'RedefineRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newRequirement_4_0= ruleRequirement ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRedefineRequirementAccess().getRedefineRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRedefineRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:957:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:958:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:958:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:959:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedefineRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getRedefineRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRedefineRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:974:3: ( (lv_newRequirement_4_0= ruleRequirement ) )
            // InternalAgentLang.g:975:4: (lv_newRequirement_4_0= ruleRequirement )
            {
            // InternalAgentLang.g:975:4: (lv_newRequirement_4_0= ruleRequirement )
            // InternalAgentLang.g:976:5: lv_newRequirement_4_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getRedefineRequirementAccess().getNewRequirementRequirementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1001:1: entryRuleRetractRequirement returns [EObject current=null] : iv_ruleRetractRequirement= ruleRetractRequirement EOF ;
    public final EObject entryRuleRetractRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetractRequirement = null;


        try {
            // InternalAgentLang.g:1001:59: (iv_ruleRetractRequirement= ruleRetractRequirement EOF )
            // InternalAgentLang.g:1002:2: iv_ruleRetractRequirement= ruleRetractRequirement EOF
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
    // InternalAgentLang.g:1008:1: ruleRetractRequirement returns [EObject current=null] : (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleRetractRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1014:2: ( (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:1015:2: (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:1015:2: (otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:1016:3: otherlv_0= 'RetractRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRetractRequirementAccess().getRetractRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRetractRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1024:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1025:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1025:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1026:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetractRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getRetractRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1045:1: entryRuleSupportRequirement returns [EObject current=null] : iv_ruleSupportRequirement= ruleSupportRequirement EOF ;
    public final EObject entryRuleSupportRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportRequirement = null;


        try {
            // InternalAgentLang.g:1045:59: (iv_ruleSupportRequirement= ruleSupportRequirement EOF )
            // InternalAgentLang.g:1046:2: iv_ruleSupportRequirement= ruleSupportRequirement EOF
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
    // InternalAgentLang.g:1052:1: ruleSupportRequirement returns [EObject current=null] : (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1058:2: ( (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1059:2: (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1059:2: (otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1060:3: otherlv_0= 'SupportRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportRequirementAccess().getSupportRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1068:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1069:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1069:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1070:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportRequirementAccess().getRequirementRequirementCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1085:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1086:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1086:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1087:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportRequirementAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1112:1: entryRuleProposeModel returns [EObject current=null] : iv_ruleProposeModel= ruleProposeModel EOF ;
    public final EObject entryRuleProposeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeModel = null;


        try {
            // InternalAgentLang.g:1112:53: (iv_ruleProposeModel= ruleProposeModel EOF )
            // InternalAgentLang.g:1113:2: iv_ruleProposeModel= ruleProposeModel EOF
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
    // InternalAgentLang.g:1119:1: ruleProposeModel returns [EObject current=null] : (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1125:2: ( (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1126:2: (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1126:2: (otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1127:3: otherlv_0= 'ProposeModel' otherlv_1= '(' ( (lv_model_2_0= ruleModel ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeModelAccess().getProposeModelKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1135:3: ( (lv_model_2_0= ruleModel ) )
            // InternalAgentLang.g:1136:4: (lv_model_2_0= ruleModel )
            {
            // InternalAgentLang.g:1136:4: (lv_model_2_0= ruleModel )
            // InternalAgentLang.g:1137:5: lv_model_2_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getProposeModelAccess().getModelModelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1158:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:1159:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:1159:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:1160:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeModelRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_4, grammarAccess.getProposeModelAccess().getRequirementRequirementCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1179:1: entryRuleSupportModel returns [EObject current=null] : iv_ruleSupportModel= ruleSupportModel EOF ;
    public final EObject entryRuleSupportModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportModel = null;


        try {
            // InternalAgentLang.g:1179:53: (iv_ruleSupportModel= ruleSupportModel EOF )
            // InternalAgentLang.g:1180:2: iv_ruleSupportModel= ruleSupportModel EOF
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
    // InternalAgentLang.g:1186:1: ruleSupportModel returns [EObject current=null] : (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1192:2: ( (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1193:2: (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1193:2: (otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1194:3: otherlv_0= 'SupportModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportModelAccess().getSupportModelKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1202:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1203:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1203:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1204:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1219:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1220:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1220:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1221:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportModelAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1246:1: entryRuleReplaceModel returns [EObject current=null] : iv_ruleReplaceModel= ruleReplaceModel EOF ;
    public final EObject entryRuleReplaceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceModel = null;


        try {
            // InternalAgentLang.g:1246:53: (iv_ruleReplaceModel= ruleReplaceModel EOF )
            // InternalAgentLang.g:1247:2: iv_ruleReplaceModel= ruleReplaceModel EOF
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
    // InternalAgentLang.g:1253:1: ruleReplaceModel returns [EObject current=null] : (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1259:2: ( (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1260:2: (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1260:2: (otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1261:3: otherlv_0= 'ReplaceModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_newModel_4_0= ruleModel ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReplaceModelAccess().getReplaceModelKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReplaceModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1269:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1270:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1270:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1271:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReplaceModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getReplaceModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getReplaceModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1286:3: ( (lv_newModel_4_0= ruleModel ) )
            // InternalAgentLang.g:1287:4: (lv_newModel_4_0= ruleModel )
            {
            // InternalAgentLang.g:1287:4: (lv_newModel_4_0= ruleModel )
            // InternalAgentLang.g:1288:5: lv_newModel_4_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getReplaceModelAccess().getNewModelModelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1313:1: entryRuleCounterModel returns [EObject current=null] : iv_ruleCounterModel= ruleCounterModel EOF ;
    public final EObject entryRuleCounterModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounterModel = null;


        try {
            // InternalAgentLang.g:1313:53: (iv_ruleCounterModel= ruleCounterModel EOF )
            // InternalAgentLang.g:1314:2: iv_ruleCounterModel= ruleCounterModel EOF
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
    // InternalAgentLang.g:1320:1: ruleCounterModel returns [EObject current=null] : (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
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
            // InternalAgentLang.g:1326:2: ( (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalAgentLang.g:1327:2: (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalAgentLang.g:1327:2: (otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalAgentLang.g:1328:3: otherlv_0= 'CounterModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getCounterModelAccess().getCounterModelKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCounterModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1336:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1337:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1337:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1338:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getCounterModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCounterModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1353:3: ( (lv_experiment_4_0= ruleExperiment ) )
            // InternalAgentLang.g:1354:4: (lv_experiment_4_0= ruleExperiment )
            {
            // InternalAgentLang.g:1354:4: (lv_experiment_4_0= ruleExperiment )
            // InternalAgentLang.g:1355:5: lv_experiment_4_0= ruleExperiment
            {

            					newCompositeNode(grammarAccess.getCounterModelAccess().getExperimentExperimentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getCounterModelAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1376:3: ( (otherlv_6= RULE_ID ) )
            // InternalAgentLang.g:1377:4: (otherlv_6= RULE_ID )
            {
            // InternalAgentLang.g:1377:4: (otherlv_6= RULE_ID )
            // InternalAgentLang.g:1378:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCounterModelRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_6, grammarAccess.getCounterModelAccess().getRequirementRequirementCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1397:1: entryRuleAttackModel returns [EObject current=null] : iv_ruleAttackModel= ruleAttackModel EOF ;
    public final EObject entryRuleAttackModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackModel = null;


        try {
            // InternalAgentLang.g:1397:52: (iv_ruleAttackModel= ruleAttackModel EOF )
            // InternalAgentLang.g:1398:2: iv_ruleAttackModel= ruleAttackModel EOF
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
    // InternalAgentLang.g:1404:1: ruleAttackModel returns [EObject current=null] : (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1410:2: ( (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1411:2: (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1411:2: (otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1412:3: otherlv_0= 'AttackModel' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackModelAccess().getAttackModelKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackModelAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1420:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1421:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1421:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1422:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackModelRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackModelAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackModelAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1437:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1438:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1438:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1439:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackModelAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1464:1: entryRuleReviseRequirement returns [EObject current=null] : iv_ruleReviseRequirement= ruleReviseRequirement EOF ;
    public final EObject entryRuleReviseRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReviseRequirement = null;


        try {
            // InternalAgentLang.g:1464:58: (iv_ruleReviseRequirement= ruleReviseRequirement EOF )
            // InternalAgentLang.g:1465:2: iv_ruleReviseRequirement= ruleReviseRequirement EOF
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
    // InternalAgentLang.g:1471:1: ruleReviseRequirement returns [EObject current=null] : (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
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
            // InternalAgentLang.g:1477:2: ( (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalAgentLang.g:1478:2: (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalAgentLang.g:1478:2: (otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalAgentLang.g:1479:3: otherlv_0= 'ReviseRequirement' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' ( (lv_newRequirement_6_0= ruleRequirement ) ) otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReviseRequirementAccess().getReviseRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReviseRequirementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1487:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1488:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1488:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1489:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getReviseRequirementAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getReviseRequirementAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1504:3: ( (otherlv_4= RULE_ID ) )
            // InternalAgentLang.g:1505:4: (otherlv_4= RULE_ID )
            {
            // InternalAgentLang.g:1505:4: (otherlv_4= RULE_ID )
            // InternalAgentLang.g:1506:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getReviseRequirementAccess().getRequirementRequirementCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getReviseRequirementAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1521:3: ( (lv_newRequirement_6_0= ruleRequirement ) )
            // InternalAgentLang.g:1522:4: (lv_newRequirement_6_0= ruleRequirement )
            {
            // InternalAgentLang.g:1522:4: (lv_newRequirement_6_0= ruleRequirement )
            // InternalAgentLang.g:1523:5: lv_newRequirement_6_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getReviseRequirementAccess().getNewRequirementRequirementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_7=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getReviseRequirementAccess().getCommaKeyword_7());
            		
            // InternalAgentLang.g:1544:3: ( (otherlv_8= RULE_ID ) )
            // InternalAgentLang.g:1545:4: (otherlv_8= RULE_ID )
            {
            // InternalAgentLang.g:1545:4: (otherlv_8= RULE_ID )
            // InternalAgentLang.g:1546:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReviseRequirementRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_8, grammarAccess.getReviseRequirementAccess().getExperimentExperimentCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1565:1: entryRuleProposeExperiment returns [EObject current=null] : iv_ruleProposeExperiment= ruleProposeExperiment EOF ;
    public final EObject entryRuleProposeExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposeExperiment = null;


        try {
            // InternalAgentLang.g:1565:58: (iv_ruleProposeExperiment= ruleProposeExperiment EOF )
            // InternalAgentLang.g:1566:2: iv_ruleProposeExperiment= ruleProposeExperiment EOF
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
    // InternalAgentLang.g:1572:1: ruleProposeExperiment returns [EObject current=null] : (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) ;
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
            // InternalAgentLang.g:1578:2: ( (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalAgentLang.g:1579:2: (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalAgentLang.g:1579:2: (otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' )
            // InternalAgentLang.g:1580:3: otherlv_0= 'ProposeExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_experiment_4_0= ruleExperiment ) ) otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getProposeExperimentAccess().getProposeExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProposeExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1588:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1589:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1589:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1590:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getProposeExperimentAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getProposeExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1605:3: ( (lv_experiment_4_0= ruleExperiment ) )
            // InternalAgentLang.g:1606:4: (lv_experiment_4_0= ruleExperiment )
            {
            // InternalAgentLang.g:1606:4: (lv_experiment_4_0= ruleExperiment )
            // InternalAgentLang.g:1607:5: lv_experiment_4_0= ruleExperiment
            {

            					newCompositeNode(grammarAccess.getProposeExperimentAccess().getExperimentExperimentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getProposeExperimentAccess().getCommaKeyword_5());
            		
            // InternalAgentLang.g:1628:3: ( (otherlv_6= RULE_ID ) )
            // InternalAgentLang.g:1629:4: (otherlv_6= RULE_ID )
            {
            // InternalAgentLang.g:1629:4: (otherlv_6= RULE_ID )
            // InternalAgentLang.g:1630:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProposeExperimentRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_6, grammarAccess.getProposeExperimentAccess().getRequirementRequirementCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1649:1: entryRuleSupportExperiment returns [EObject current=null] : iv_ruleSupportExperiment= ruleSupportExperiment EOF ;
    public final EObject entryRuleSupportExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportExperiment = null;


        try {
            // InternalAgentLang.g:1649:58: (iv_ruleSupportExperiment= ruleSupportExperiment EOF )
            // InternalAgentLang.g:1650:2: iv_ruleSupportExperiment= ruleSupportExperiment EOF
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
    // InternalAgentLang.g:1656:1: ruleSupportExperiment returns [EObject current=null] : (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1662:2: ( (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1663:2: (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1663:2: (otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1664:3: otherlv_0= 'SupportExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportExperimentAccess().getSupportExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1672:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1673:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1673:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1674:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getSupportExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSupportExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1689:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1690:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1690:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1691:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getSupportExperimentAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1716:1: entryRuleAttackExperiment returns [EObject current=null] : iv_ruleAttackExperiment= ruleAttackExperiment EOF ;
    public final EObject entryRuleAttackExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttackExperiment = null;


        try {
            // InternalAgentLang.g:1716:57: (iv_ruleAttackExperiment= ruleAttackExperiment EOF )
            // InternalAgentLang.g:1717:2: iv_ruleAttackExperiment= ruleAttackExperiment EOF
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
    // InternalAgentLang.g:1723:1: ruleAttackExperiment returns [EObject current=null] : (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) ;
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
            // InternalAgentLang.g:1729:2: ( (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' ) )
            // InternalAgentLang.g:1730:2: (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            {
            // InternalAgentLang.g:1730:2: (otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')' )
            // InternalAgentLang.g:1731:3: otherlv_0= 'AttackExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_theory_4_0= ruleTheory ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAttackExperimentAccess().getAttackExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1739:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1740:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1740:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1741:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_2, grammarAccess.getAttackExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAttackExperimentAccess().getCommaKeyword_3());
            		
            // InternalAgentLang.g:1756:3: ( (lv_theory_4_0= ruleTheory ) )
            // InternalAgentLang.g:1757:4: (lv_theory_4_0= ruleTheory )
            {
            // InternalAgentLang.g:1757:4: (lv_theory_4_0= ruleTheory )
            // InternalAgentLang.g:1758:5: lv_theory_4_0= ruleTheory
            {

            					newCompositeNode(grammarAccess.getAttackExperimentAccess().getTheoryTheoryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1783:1: entryRuleRetractExperiment returns [EObject current=null] : iv_ruleRetractExperiment= ruleRetractExperiment EOF ;
    public final EObject entryRuleRetractExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetractExperiment = null;


        try {
            // InternalAgentLang.g:1783:58: (iv_ruleRetractExperiment= ruleRetractExperiment EOF )
            // InternalAgentLang.g:1784:2: iv_ruleRetractExperiment= ruleRetractExperiment EOF
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
    // InternalAgentLang.g:1790:1: ruleRetractExperiment returns [EObject current=null] : (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleRetractExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1796:2: ( (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:1797:2: (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:1797:2: (otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:1798:3: otherlv_0= 'RetractExperiment' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRetractExperimentAccess().getRetractExperimentKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRetractExperimentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1806:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1807:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1807:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1808:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetractExperimentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getRetractExperimentAccess().getExperimentExperimentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1827:1: entryRuleStudyDone returns [EObject current=null] : iv_ruleStudyDone= ruleStudyDone EOF ;
    public final EObject entryRuleStudyDone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudyDone = null;


        try {
            // InternalAgentLang.g:1827:50: (iv_ruleStudyDone= ruleStudyDone EOF )
            // InternalAgentLang.g:1828:2: iv_ruleStudyDone= ruleStudyDone EOF
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
    // InternalAgentLang.g:1834:1: ruleStudyDone returns [EObject current=null] : ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleStudyDone() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1840:2: ( ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalAgentLang.g:1841:2: ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalAgentLang.g:1841:2: ( () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')' )
            // InternalAgentLang.g:1842:3: () otherlv_1= 'StudyDone' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalAgentLang.g:1842:3: ()
            // InternalAgentLang.g:1843:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStudyDoneAccess().getStudyDoneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getStudyDoneAccess().getStudyDoneKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getStudyDoneAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    // InternalAgentLang.g:1865:1: entryRuleNotConvinced returns [EObject current=null] : iv_ruleNotConvinced= ruleNotConvinced EOF ;
    public final EObject entryRuleNotConvinced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotConvinced = null;


        try {
            // InternalAgentLang.g:1865:53: (iv_ruleNotConvinced= ruleNotConvinced EOF )
            // InternalAgentLang.g:1866:2: iv_ruleNotConvinced= ruleNotConvinced EOF
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
    // InternalAgentLang.g:1872:1: ruleNotConvinced returns [EObject current=null] : (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleNotConvinced() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgentLang.g:1878:2: ( (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAgentLang.g:1879:2: (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAgentLang.g:1879:2: (otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAgentLang.g:1880:3: otherlv_0= 'NotConvinced' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getNotConvincedAccess().getNotConvincedKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getNotConvincedAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgentLang.g:1888:3: ( (otherlv_2= RULE_ID ) )
            // InternalAgentLang.g:1889:4: (otherlv_2= RULE_ID )
            {
            // InternalAgentLang.g:1889:4: (otherlv_2= RULE_ID )
            // InternalAgentLang.g:1890:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotConvincedRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_2, grammarAccess.getNotConvincedAccess().getModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00001FFFE9000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});

}