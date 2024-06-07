package org.xtext.example.modellingDialogue.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.modellingDialogue.services.TheoryStoreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTheoryStoreParser extends AbstractInternalContentAssistParser {
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


        public InternalTheoryStoreParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTheoryStoreParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTheoryStoreParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTheoryStore.g"; }


    	private TheoryStoreGrammarAccess grammarAccess;

    	public void setGrammarAccess(TheoryStoreGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTheoryStore"
    // InternalTheoryStore.g:53:1: entryRuleTheoryStore : ruleTheoryStore EOF ;
    public final void entryRuleTheoryStore() throws RecognitionException {
        try {
            // InternalTheoryStore.g:54:1: ( ruleTheoryStore EOF )
            // InternalTheoryStore.g:55:1: ruleTheoryStore EOF
            {
             before(grammarAccess.getTheoryStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleTheoryStore();

            state._fsp--;

             after(grammarAccess.getTheoryStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheoryStore"


    // $ANTLR start "ruleTheoryStore"
    // InternalTheoryStore.g:62:1: ruleTheoryStore : ( ( rule__TheoryStore__ElementsAssignment )* ) ;
    public final void ruleTheoryStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:66:2: ( ( ( rule__TheoryStore__ElementsAssignment )* ) )
            // InternalTheoryStore.g:67:2: ( ( rule__TheoryStore__ElementsAssignment )* )
            {
            // InternalTheoryStore.g:67:2: ( ( rule__TheoryStore__ElementsAssignment )* )
            // InternalTheoryStore.g:68:3: ( rule__TheoryStore__ElementsAssignment )*
            {
             before(grammarAccess.getTheoryStoreAccess().getElementsAssignment()); 
            // InternalTheoryStore.g:69:3: ( rule__TheoryStore__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=16 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTheoryStore.g:69:4: rule__TheoryStore__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TheoryStore__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTheoryStoreAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheoryStore"


    // $ANTLR start "entryRuleElement"
    // InternalTheoryStore.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalTheoryStore.g:79:1: ( ruleElement EOF )
            // InternalTheoryStore.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalTheoryStore.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalTheoryStore.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalTheoryStore.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalTheoryStore.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalTheoryStore.g:94:3: ( rule__Element__Alternatives )
            // InternalTheoryStore.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleModel"
    // InternalTheoryStore.g:103:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTheoryStore.g:104:1: ( ruleModel EOF )
            // InternalTheoryStore.g:105:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTheoryStore.g:112:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:116:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalTheoryStore.g:117:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalTheoryStore.g:117:2: ( ( rule__Model__Group__0 ) )
            // InternalTheoryStore.g:118:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalTheoryStore.g:119:3: ( rule__Model__Group__0 )
            // InternalTheoryStore.g:119:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTheory"
    // InternalTheoryStore.g:128:1: entryRuleTheory : ruleTheory EOF ;
    public final void entryRuleTheory() throws RecognitionException {
        try {
            // InternalTheoryStore.g:129:1: ( ruleTheory EOF )
            // InternalTheoryStore.g:130:1: ruleTheory EOF
            {
             before(grammarAccess.getTheoryRule()); 
            pushFollow(FOLLOW_1);
            ruleTheory();

            state._fsp--;

             after(grammarAccess.getTheoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTheory"


    // $ANTLR start "ruleTheory"
    // InternalTheoryStore.g:137:1: ruleTheory : ( ( rule__Theory__Group__0 ) ) ;
    public final void ruleTheory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:141:2: ( ( ( rule__Theory__Group__0 ) ) )
            // InternalTheoryStore.g:142:2: ( ( rule__Theory__Group__0 ) )
            {
            // InternalTheoryStore.g:142:2: ( ( rule__Theory__Group__0 ) )
            // InternalTheoryStore.g:143:3: ( rule__Theory__Group__0 )
            {
             before(grammarAccess.getTheoryAccess().getGroup()); 
            // InternalTheoryStore.g:144:3: ( rule__Theory__Group__0 )
            // InternalTheoryStore.g:144:4: rule__Theory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTheory"


    // $ANTLR start "entryRuleRequirement"
    // InternalTheoryStore.g:153:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalTheoryStore.g:154:1: ( ruleRequirement EOF )
            // InternalTheoryStore.g:155:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalTheoryStore.g:162:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:166:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // InternalTheoryStore.g:167:2: ( ( rule__Requirement__Group__0 ) )
            {
            // InternalTheoryStore.g:167:2: ( ( rule__Requirement__Group__0 ) )
            // InternalTheoryStore.g:168:3: ( rule__Requirement__Group__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup()); 
            // InternalTheoryStore.g:169:3: ( rule__Requirement__Group__0 )
            // InternalTheoryStore.g:169:4: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleExperiment"
    // InternalTheoryStore.g:178:1: entryRuleExperiment : ruleExperiment EOF ;
    public final void entryRuleExperiment() throws RecognitionException {
        try {
            // InternalTheoryStore.g:179:1: ( ruleExperiment EOF )
            // InternalTheoryStore.g:180:1: ruleExperiment EOF
            {
             before(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_1);
            ruleExperiment();

            state._fsp--;

             after(grammarAccess.getExperimentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // InternalTheoryStore.g:187:1: ruleExperiment : ( ( rule__Experiment__Group__0 ) ) ;
    public final void ruleExperiment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:191:2: ( ( ( rule__Experiment__Group__0 ) ) )
            // InternalTheoryStore.g:192:2: ( ( rule__Experiment__Group__0 ) )
            {
            // InternalTheoryStore.g:192:2: ( ( rule__Experiment__Group__0 ) )
            // InternalTheoryStore.g:193:3: ( rule__Experiment__Group__0 )
            {
             before(grammarAccess.getExperimentAccess().getGroup()); 
            // InternalTheoryStore.g:194:3: ( rule__Experiment__Group__0 )
            // InternalTheoryStore.g:194:4: rule__Experiment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalTheoryStore.g:202:1: rule__Element__Alternatives : ( ( ruleModel ) | ( ruleTheory ) | ( ruleRequirement ) | ( ruleExperiment ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:206:1: ( ( ruleModel ) | ( ruleTheory ) | ( ruleRequirement ) | ( ruleExperiment ) )
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
                    // InternalTheoryStore.g:207:2: ( ruleModel )
                    {
                    // InternalTheoryStore.g:207:2: ( ruleModel )
                    // InternalTheoryStore.g:208:3: ruleModel
                    {
                     before(grammarAccess.getElementAccess().getModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleModel();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTheoryStore.g:213:2: ( ruleTheory )
                    {
                    // InternalTheoryStore.g:213:2: ( ruleTheory )
                    // InternalTheoryStore.g:214:3: ruleTheory
                    {
                     before(grammarAccess.getElementAccess().getTheoryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTheory();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTheoryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTheoryStore.g:219:2: ( ruleRequirement )
                    {
                    // InternalTheoryStore.g:219:2: ( ruleRequirement )
                    // InternalTheoryStore.g:220:3: ruleRequirement
                    {
                     before(grammarAccess.getElementAccess().getRequirementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRequirement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRequirementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTheoryStore.g:225:2: ( ruleExperiment )
                    {
                    // InternalTheoryStore.g:225:2: ( ruleExperiment )
                    // InternalTheoryStore.g:226:3: ruleExperiment
                    {
                     before(grammarAccess.getElementAccess().getExperimentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExperiment();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getExperimentParserRuleCall_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalTheoryStore.g:235:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:239:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalTheoryStore.g:240:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalTheoryStore.g:247:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:251:1: ( ( 'Model' ) )
            // InternalTheoryStore.g:252:1: ( 'Model' )
            {
            // InternalTheoryStore.g:252:1: ( 'Model' )
            // InternalTheoryStore.g:253:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalTheoryStore.g:262:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:266:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalTheoryStore.g:267:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalTheoryStore.g:274:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:278:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalTheoryStore.g:279:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalTheoryStore.g:279:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalTheoryStore.g:280:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalTheoryStore.g:281:2: ( rule__Model__NameAssignment_1 )
            // InternalTheoryStore.g:281:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalTheoryStore.g:289:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:293:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalTheoryStore.g:294:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalTheoryStore.g:301:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:305:1: ( ( '{' ) )
            // InternalTheoryStore.g:306:1: ( '{' )
            {
            // InternalTheoryStore.g:306:1: ( '{' )
            // InternalTheoryStore.g:307:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalTheoryStore.g:316:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:320:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalTheoryStore.g:321:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalTheoryStore.g:328:1: rule__Model__Group__3__Impl : ( ( rule__Model__ContentAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:332:1: ( ( ( rule__Model__ContentAssignment_3 ) ) )
            // InternalTheoryStore.g:333:1: ( ( rule__Model__ContentAssignment_3 ) )
            {
            // InternalTheoryStore.g:333:1: ( ( rule__Model__ContentAssignment_3 ) )
            // InternalTheoryStore.g:334:2: ( rule__Model__ContentAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getContentAssignment_3()); 
            // InternalTheoryStore.g:335:2: ( rule__Model__ContentAssignment_3 )
            // InternalTheoryStore.g:335:3: rule__Model__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalTheoryStore.g:343:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:347:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalTheoryStore.g:348:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalTheoryStore.g:355:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:359:1: ( ( '}' ) )
            // InternalTheoryStore.g:360:1: ( '}' )
            {
            // InternalTheoryStore.g:360:1: ( '}' )
            // InternalTheoryStore.g:361:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalTheoryStore.g:370:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:374:1: ( rule__Model__Group__5__Impl )
            // InternalTheoryStore.g:375:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalTheoryStore.g:381:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:385:1: ( ( ( rule__Model__Group_5__0 )? ) )
            // InternalTheoryStore.g:386:1: ( ( rule__Model__Group_5__0 )? )
            {
            // InternalTheoryStore.g:386:1: ( ( rule__Model__Group_5__0 )? )
            // InternalTheoryStore.g:387:2: ( rule__Model__Group_5__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalTheoryStore.g:388:2: ( rule__Model__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTheoryStore.g:388:3: rule__Model__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_5__0"
    // InternalTheoryStore.g:397:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:401:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalTheoryStore.g:402:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__0"


    // $ANTLR start "rule__Model__Group_5__0__Impl"
    // InternalTheoryStore.g:409:1: rule__Model__Group_5__0__Impl : ( '->' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:413:1: ( ( '->' ) )
            // InternalTheoryStore.g:414:1: ( '->' )
            {
            // InternalTheoryStore.g:414:1: ( '->' )
            // InternalTheoryStore.g:415:2: '->'
            {
             before(grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__0__Impl"


    // $ANTLR start "rule__Model__Group_5__1"
    // InternalTheoryStore.g:424:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl rule__Model__Group_5__2 ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:428:1: ( rule__Model__Group_5__1__Impl rule__Model__Group_5__2 )
            // InternalTheoryStore.g:429:2: rule__Model__Group_5__1__Impl rule__Model__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__1"


    // $ANTLR start "rule__Model__Group_5__1__Impl"
    // InternalTheoryStore.g:436:1: rule__Model__Group_5__1__Impl : ( ( rule__Model__RequirementsAssignment_5_1 ) ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:440:1: ( ( ( rule__Model__RequirementsAssignment_5_1 ) ) )
            // InternalTheoryStore.g:441:1: ( ( rule__Model__RequirementsAssignment_5_1 ) )
            {
            // InternalTheoryStore.g:441:1: ( ( rule__Model__RequirementsAssignment_5_1 ) )
            // InternalTheoryStore.g:442:2: ( rule__Model__RequirementsAssignment_5_1 )
            {
             before(grammarAccess.getModelAccess().getRequirementsAssignment_5_1()); 
            // InternalTheoryStore.g:443:2: ( rule__Model__RequirementsAssignment_5_1 )
            // InternalTheoryStore.g:443:3: rule__Model__RequirementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__RequirementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRequirementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__1__Impl"


    // $ANTLR start "rule__Model__Group_5__2"
    // InternalTheoryStore.g:451:1: rule__Model__Group_5__2 : rule__Model__Group_5__2__Impl ;
    public final void rule__Model__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:455:1: ( rule__Model__Group_5__2__Impl )
            // InternalTheoryStore.g:456:2: rule__Model__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__2"


    // $ANTLR start "rule__Model__Group_5__2__Impl"
    // InternalTheoryStore.g:462:1: rule__Model__Group_5__2__Impl : ( ( rule__Model__Group_5_2__0 )* ) ;
    public final void rule__Model__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:466:1: ( ( ( rule__Model__Group_5_2__0 )* ) )
            // InternalTheoryStore.g:467:1: ( ( rule__Model__Group_5_2__0 )* )
            {
            // InternalTheoryStore.g:467:1: ( ( rule__Model__Group_5_2__0 )* )
            // InternalTheoryStore.g:468:2: ( rule__Model__Group_5_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_5_2()); 
            // InternalTheoryStore.g:469:2: ( rule__Model__Group_5_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTheoryStore.g:469:3: rule__Model__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__2__Impl"


    // $ANTLR start "rule__Model__Group_5_2__0"
    // InternalTheoryStore.g:478:1: rule__Model__Group_5_2__0 : rule__Model__Group_5_2__0__Impl rule__Model__Group_5_2__1 ;
    public final void rule__Model__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:482:1: ( rule__Model__Group_5_2__0__Impl rule__Model__Group_5_2__1 )
            // InternalTheoryStore.g:483:2: rule__Model__Group_5_2__0__Impl rule__Model__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_2__0"


    // $ANTLR start "rule__Model__Group_5_2__0__Impl"
    // InternalTheoryStore.g:490:1: rule__Model__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:494:1: ( ( ',' ) )
            // InternalTheoryStore.g:495:1: ( ',' )
            {
            // InternalTheoryStore.g:495:1: ( ',' )
            // InternalTheoryStore.g:496:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_5_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_2__0__Impl"


    // $ANTLR start "rule__Model__Group_5_2__1"
    // InternalTheoryStore.g:505:1: rule__Model__Group_5_2__1 : rule__Model__Group_5_2__1__Impl ;
    public final void rule__Model__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:509:1: ( rule__Model__Group_5_2__1__Impl )
            // InternalTheoryStore.g:510:2: rule__Model__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_2__1"


    // $ANTLR start "rule__Model__Group_5_2__1__Impl"
    // InternalTheoryStore.g:516:1: rule__Model__Group_5_2__1__Impl : ( ( rule__Model__RequirementsAssignment_5_2_1 ) ) ;
    public final void rule__Model__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:520:1: ( ( ( rule__Model__RequirementsAssignment_5_2_1 ) ) )
            // InternalTheoryStore.g:521:1: ( ( rule__Model__RequirementsAssignment_5_2_1 ) )
            {
            // InternalTheoryStore.g:521:1: ( ( rule__Model__RequirementsAssignment_5_2_1 ) )
            // InternalTheoryStore.g:522:2: ( rule__Model__RequirementsAssignment_5_2_1 )
            {
             before(grammarAccess.getModelAccess().getRequirementsAssignment_5_2_1()); 
            // InternalTheoryStore.g:523:2: ( rule__Model__RequirementsAssignment_5_2_1 )
            // InternalTheoryStore.g:523:3: rule__Model__RequirementsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__RequirementsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRequirementsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5_2__1__Impl"


    // $ANTLR start "rule__Theory__Group__0"
    // InternalTheoryStore.g:532:1: rule__Theory__Group__0 : rule__Theory__Group__0__Impl rule__Theory__Group__1 ;
    public final void rule__Theory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:536:1: ( rule__Theory__Group__0__Impl rule__Theory__Group__1 )
            // InternalTheoryStore.g:537:2: rule__Theory__Group__0__Impl rule__Theory__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__0"


    // $ANTLR start "rule__Theory__Group__0__Impl"
    // InternalTheoryStore.g:544:1: rule__Theory__Group__0__Impl : ( 'Theory' ) ;
    public final void rule__Theory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:548:1: ( ( 'Theory' ) )
            // InternalTheoryStore.g:549:1: ( 'Theory' )
            {
            // InternalTheoryStore.g:549:1: ( 'Theory' )
            // InternalTheoryStore.g:550:2: 'Theory'
            {
             before(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getTheoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__0__Impl"


    // $ANTLR start "rule__Theory__Group__1"
    // InternalTheoryStore.g:559:1: rule__Theory__Group__1 : rule__Theory__Group__1__Impl rule__Theory__Group__2 ;
    public final void rule__Theory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:563:1: ( rule__Theory__Group__1__Impl rule__Theory__Group__2 )
            // InternalTheoryStore.g:564:2: rule__Theory__Group__1__Impl rule__Theory__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Theory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__1"


    // $ANTLR start "rule__Theory__Group__1__Impl"
    // InternalTheoryStore.g:571:1: rule__Theory__Group__1__Impl : ( ( rule__Theory__NameAssignment_1 ) ) ;
    public final void rule__Theory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:575:1: ( ( ( rule__Theory__NameAssignment_1 ) ) )
            // InternalTheoryStore.g:576:1: ( ( rule__Theory__NameAssignment_1 ) )
            {
            // InternalTheoryStore.g:576:1: ( ( rule__Theory__NameAssignment_1 ) )
            // InternalTheoryStore.g:577:2: ( rule__Theory__NameAssignment_1 )
            {
             before(grammarAccess.getTheoryAccess().getNameAssignment_1()); 
            // InternalTheoryStore.g:578:2: ( rule__Theory__NameAssignment_1 )
            // InternalTheoryStore.g:578:3: rule__Theory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__1__Impl"


    // $ANTLR start "rule__Theory__Group__2"
    // InternalTheoryStore.g:586:1: rule__Theory__Group__2 : rule__Theory__Group__2__Impl rule__Theory__Group__3 ;
    public final void rule__Theory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:590:1: ( rule__Theory__Group__2__Impl rule__Theory__Group__3 )
            // InternalTheoryStore.g:591:2: rule__Theory__Group__2__Impl rule__Theory__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Theory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__2"


    // $ANTLR start "rule__Theory__Group__2__Impl"
    // InternalTheoryStore.g:598:1: rule__Theory__Group__2__Impl : ( '{' ) ;
    public final void rule__Theory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:602:1: ( ( '{' ) )
            // InternalTheoryStore.g:603:1: ( '{' )
            {
            // InternalTheoryStore.g:603:1: ( '{' )
            // InternalTheoryStore.g:604:2: '{'
            {
             before(grammarAccess.getTheoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__2__Impl"


    // $ANTLR start "rule__Theory__Group__3"
    // InternalTheoryStore.g:613:1: rule__Theory__Group__3 : rule__Theory__Group__3__Impl rule__Theory__Group__4 ;
    public final void rule__Theory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:617:1: ( rule__Theory__Group__3__Impl rule__Theory__Group__4 )
            // InternalTheoryStore.g:618:2: rule__Theory__Group__3__Impl rule__Theory__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Theory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__3"


    // $ANTLR start "rule__Theory__Group__3__Impl"
    // InternalTheoryStore.g:625:1: rule__Theory__Group__3__Impl : ( ( rule__Theory__ContentAssignment_3 ) ) ;
    public final void rule__Theory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:629:1: ( ( ( rule__Theory__ContentAssignment_3 ) ) )
            // InternalTheoryStore.g:630:1: ( ( rule__Theory__ContentAssignment_3 ) )
            {
            // InternalTheoryStore.g:630:1: ( ( rule__Theory__ContentAssignment_3 ) )
            // InternalTheoryStore.g:631:2: ( rule__Theory__ContentAssignment_3 )
            {
             before(grammarAccess.getTheoryAccess().getContentAssignment_3()); 
            // InternalTheoryStore.g:632:2: ( rule__Theory__ContentAssignment_3 )
            // InternalTheoryStore.g:632:3: rule__Theory__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Theory__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__3__Impl"


    // $ANTLR start "rule__Theory__Group__4"
    // InternalTheoryStore.g:640:1: rule__Theory__Group__4 : rule__Theory__Group__4__Impl rule__Theory__Group__5 ;
    public final void rule__Theory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:644:1: ( rule__Theory__Group__4__Impl rule__Theory__Group__5 )
            // InternalTheoryStore.g:645:2: rule__Theory__Group__4__Impl rule__Theory__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Theory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__4"


    // $ANTLR start "rule__Theory__Group__4__Impl"
    // InternalTheoryStore.g:652:1: rule__Theory__Group__4__Impl : ( '}' ) ;
    public final void rule__Theory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:656:1: ( ( '}' ) )
            // InternalTheoryStore.g:657:1: ( '}' )
            {
            // InternalTheoryStore.g:657:1: ( '}' )
            // InternalTheoryStore.g:658:2: '}'
            {
             before(grammarAccess.getTheoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__4__Impl"


    // $ANTLR start "rule__Theory__Group__5"
    // InternalTheoryStore.g:667:1: rule__Theory__Group__5 : rule__Theory__Group__5__Impl ;
    public final void rule__Theory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:671:1: ( rule__Theory__Group__5__Impl )
            // InternalTheoryStore.g:672:2: rule__Theory__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__5"


    // $ANTLR start "rule__Theory__Group__5__Impl"
    // InternalTheoryStore.g:678:1: rule__Theory__Group__5__Impl : ( ( rule__Theory__Group_5__0 )? ) ;
    public final void rule__Theory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:682:1: ( ( ( rule__Theory__Group_5__0 )? ) )
            // InternalTheoryStore.g:683:1: ( ( rule__Theory__Group_5__0 )? )
            {
            // InternalTheoryStore.g:683:1: ( ( rule__Theory__Group_5__0 )? )
            // InternalTheoryStore.g:684:2: ( rule__Theory__Group_5__0 )?
            {
             before(grammarAccess.getTheoryAccess().getGroup_5()); 
            // InternalTheoryStore.g:685:2: ( rule__Theory__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTheoryStore.g:685:3: rule__Theory__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Theory__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTheoryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group__5__Impl"


    // $ANTLR start "rule__Theory__Group_5__0"
    // InternalTheoryStore.g:694:1: rule__Theory__Group_5__0 : rule__Theory__Group_5__0__Impl rule__Theory__Group_5__1 ;
    public final void rule__Theory__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:698:1: ( rule__Theory__Group_5__0__Impl rule__Theory__Group_5__1 )
            // InternalTheoryStore.g:699:2: rule__Theory__Group_5__0__Impl rule__Theory__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5__0"


    // $ANTLR start "rule__Theory__Group_5__0__Impl"
    // InternalTheoryStore.g:706:1: rule__Theory__Group_5__0__Impl : ( '->' ) ;
    public final void rule__Theory__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:710:1: ( ( '->' ) )
            // InternalTheoryStore.g:711:1: ( '->' )
            {
            // InternalTheoryStore.g:711:1: ( '->' )
            // InternalTheoryStore.g:712:2: '->'
            {
             before(grammarAccess.getTheoryAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5__0__Impl"


    // $ANTLR start "rule__Theory__Group_5__1"
    // InternalTheoryStore.g:721:1: rule__Theory__Group_5__1 : rule__Theory__Group_5__1__Impl rule__Theory__Group_5__2 ;
    public final void rule__Theory__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:725:1: ( rule__Theory__Group_5__1__Impl rule__Theory__Group_5__2 )
            // InternalTheoryStore.g:726:2: rule__Theory__Group_5__1__Impl rule__Theory__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Theory__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5__1"


    // $ANTLR start "rule__Theory__Group_5__1__Impl"
    // InternalTheoryStore.g:733:1: rule__Theory__Group_5__1__Impl : ( ( rule__Theory__ElementsAssignment_5_1 ) ) ;
    public final void rule__Theory__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:737:1: ( ( ( rule__Theory__ElementsAssignment_5_1 ) ) )
            // InternalTheoryStore.g:738:1: ( ( rule__Theory__ElementsAssignment_5_1 ) )
            {
            // InternalTheoryStore.g:738:1: ( ( rule__Theory__ElementsAssignment_5_1 ) )
            // InternalTheoryStore.g:739:2: ( rule__Theory__ElementsAssignment_5_1 )
            {
             before(grammarAccess.getTheoryAccess().getElementsAssignment_5_1()); 
            // InternalTheoryStore.g:740:2: ( rule__Theory__ElementsAssignment_5_1 )
            // InternalTheoryStore.g:740:3: rule__Theory__ElementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__ElementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5__1__Impl"


    // $ANTLR start "rule__Theory__Group_5__2"
    // InternalTheoryStore.g:748:1: rule__Theory__Group_5__2 : rule__Theory__Group_5__2__Impl ;
    public final void rule__Theory__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:752:1: ( rule__Theory__Group_5__2__Impl )
            // InternalTheoryStore.g:753:2: rule__Theory__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5__2"


    // $ANTLR start "rule__Theory__Group_5__2__Impl"
    // InternalTheoryStore.g:759:1: rule__Theory__Group_5__2__Impl : ( ( rule__Theory__Group_5_2__0 )* ) ;
    public final void rule__Theory__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:763:1: ( ( ( rule__Theory__Group_5_2__0 )* ) )
            // InternalTheoryStore.g:764:1: ( ( rule__Theory__Group_5_2__0 )* )
            {
            // InternalTheoryStore.g:764:1: ( ( rule__Theory__Group_5_2__0 )* )
            // InternalTheoryStore.g:765:2: ( rule__Theory__Group_5_2__0 )*
            {
             before(grammarAccess.getTheoryAccess().getGroup_5_2()); 
            // InternalTheoryStore.g:766:2: ( rule__Theory__Group_5_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTheoryStore.g:766:3: rule__Theory__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Theory__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTheoryAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5__2__Impl"


    // $ANTLR start "rule__Theory__Group_5_2__0"
    // InternalTheoryStore.g:775:1: rule__Theory__Group_5_2__0 : rule__Theory__Group_5_2__0__Impl rule__Theory__Group_5_2__1 ;
    public final void rule__Theory__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:779:1: ( rule__Theory__Group_5_2__0__Impl rule__Theory__Group_5_2__1 )
            // InternalTheoryStore.g:780:2: rule__Theory__Group_5_2__0__Impl rule__Theory__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Theory__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Theory__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5_2__0"


    // $ANTLR start "rule__Theory__Group_5_2__0__Impl"
    // InternalTheoryStore.g:787:1: rule__Theory__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Theory__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:791:1: ( ( ',' ) )
            // InternalTheoryStore.g:792:1: ( ',' )
            {
            // InternalTheoryStore.g:792:1: ( ',' )
            // InternalTheoryStore.g:793:2: ','
            {
             before(grammarAccess.getTheoryAccess().getCommaKeyword_5_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5_2__0__Impl"


    // $ANTLR start "rule__Theory__Group_5_2__1"
    // InternalTheoryStore.g:802:1: rule__Theory__Group_5_2__1 : rule__Theory__Group_5_2__1__Impl ;
    public final void rule__Theory__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:806:1: ( rule__Theory__Group_5_2__1__Impl )
            // InternalTheoryStore.g:807:2: rule__Theory__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Theory__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5_2__1"


    // $ANTLR start "rule__Theory__Group_5_2__1__Impl"
    // InternalTheoryStore.g:813:1: rule__Theory__Group_5_2__1__Impl : ( ( rule__Theory__ElementsAssignment_5_2_1 ) ) ;
    public final void rule__Theory__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:817:1: ( ( ( rule__Theory__ElementsAssignment_5_2_1 ) ) )
            // InternalTheoryStore.g:818:1: ( ( rule__Theory__ElementsAssignment_5_2_1 ) )
            {
            // InternalTheoryStore.g:818:1: ( ( rule__Theory__ElementsAssignment_5_2_1 ) )
            // InternalTheoryStore.g:819:2: ( rule__Theory__ElementsAssignment_5_2_1 )
            {
             before(grammarAccess.getTheoryAccess().getElementsAssignment_5_2_1()); 
            // InternalTheoryStore.g:820:2: ( rule__Theory__ElementsAssignment_5_2_1 )
            // InternalTheoryStore.g:820:3: rule__Theory__ElementsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Theory__ElementsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTheoryAccess().getElementsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__Group_5_2__1__Impl"


    // $ANTLR start "rule__Requirement__Group__0"
    // InternalTheoryStore.g:829:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:833:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // InternalTheoryStore.g:834:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Requirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0"


    // $ANTLR start "rule__Requirement__Group__0__Impl"
    // InternalTheoryStore.g:841:1: rule__Requirement__Group__0__Impl : ( 'Requirement' ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:845:1: ( ( 'Requirement' ) )
            // InternalTheoryStore.g:846:1: ( 'Requirement' )
            {
            // InternalTheoryStore.g:846:1: ( 'Requirement' )
            // InternalTheoryStore.g:847:2: 'Requirement'
            {
             before(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getRequirementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0__Impl"


    // $ANTLR start "rule__Requirement__Group__1"
    // InternalTheoryStore.g:856:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:860:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // InternalTheoryStore.g:861:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Requirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1"


    // $ANTLR start "rule__Requirement__Group__1__Impl"
    // InternalTheoryStore.g:868:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__NameAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:872:1: ( ( ( rule__Requirement__NameAssignment_1 ) ) )
            // InternalTheoryStore.g:873:1: ( ( rule__Requirement__NameAssignment_1 ) )
            {
            // InternalTheoryStore.g:873:1: ( ( rule__Requirement__NameAssignment_1 ) )
            // InternalTheoryStore.g:874:2: ( rule__Requirement__NameAssignment_1 )
            {
             before(grammarAccess.getRequirementAccess().getNameAssignment_1()); 
            // InternalTheoryStore.g:875:2: ( rule__Requirement__NameAssignment_1 )
            // InternalTheoryStore.g:875:3: rule__Requirement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1__Impl"


    // $ANTLR start "rule__Requirement__Group__2"
    // InternalTheoryStore.g:883:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:887:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // InternalTheoryStore.g:888:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Requirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2"


    // $ANTLR start "rule__Requirement__Group__2__Impl"
    // InternalTheoryStore.g:895:1: rule__Requirement__Group__2__Impl : ( '{' ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:899:1: ( ( '{' ) )
            // InternalTheoryStore.g:900:1: ( '{' )
            {
            // InternalTheoryStore.g:900:1: ( '{' )
            // InternalTheoryStore.g:901:2: '{'
            {
             before(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2__Impl"


    // $ANTLR start "rule__Requirement__Group__3"
    // InternalTheoryStore.g:910:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl rule__Requirement__Group__4 ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:914:1: ( rule__Requirement__Group__3__Impl rule__Requirement__Group__4 )
            // InternalTheoryStore.g:915:2: rule__Requirement__Group__3__Impl rule__Requirement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Requirement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3"


    // $ANTLR start "rule__Requirement__Group__3__Impl"
    // InternalTheoryStore.g:922:1: rule__Requirement__Group__3__Impl : ( ( rule__Requirement__ContentAssignment_3 ) ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:926:1: ( ( ( rule__Requirement__ContentAssignment_3 ) ) )
            // InternalTheoryStore.g:927:1: ( ( rule__Requirement__ContentAssignment_3 ) )
            {
            // InternalTheoryStore.g:927:1: ( ( rule__Requirement__ContentAssignment_3 ) )
            // InternalTheoryStore.g:928:2: ( rule__Requirement__ContentAssignment_3 )
            {
             before(grammarAccess.getRequirementAccess().getContentAssignment_3()); 
            // InternalTheoryStore.g:929:2: ( rule__Requirement__ContentAssignment_3 )
            // InternalTheoryStore.g:929:3: rule__Requirement__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__3__Impl"


    // $ANTLR start "rule__Requirement__Group__4"
    // InternalTheoryStore.g:937:1: rule__Requirement__Group__4 : rule__Requirement__Group__4__Impl ;
    public final void rule__Requirement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:941:1: ( rule__Requirement__Group__4__Impl )
            // InternalTheoryStore.g:942:2: rule__Requirement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4"


    // $ANTLR start "rule__Requirement__Group__4__Impl"
    // InternalTheoryStore.g:948:1: rule__Requirement__Group__4__Impl : ( '}' ) ;
    public final void rule__Requirement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:952:1: ( ( '}' ) )
            // InternalTheoryStore.g:953:1: ( '}' )
            {
            // InternalTheoryStore.g:953:1: ( '}' )
            // InternalTheoryStore.g:954:2: '}'
            {
             before(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__4__Impl"


    // $ANTLR start "rule__Experiment__Group__0"
    // InternalTheoryStore.g:964:1: rule__Experiment__Group__0 : rule__Experiment__Group__0__Impl rule__Experiment__Group__1 ;
    public final void rule__Experiment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:968:1: ( rule__Experiment__Group__0__Impl rule__Experiment__Group__1 )
            // InternalTheoryStore.g:969:2: rule__Experiment__Group__0__Impl rule__Experiment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Experiment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__0"


    // $ANTLR start "rule__Experiment__Group__0__Impl"
    // InternalTheoryStore.g:976:1: rule__Experiment__Group__0__Impl : ( 'Experiment' ) ;
    public final void rule__Experiment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:980:1: ( ( 'Experiment' ) )
            // InternalTheoryStore.g:981:1: ( 'Experiment' )
            {
            // InternalTheoryStore.g:981:1: ( 'Experiment' )
            // InternalTheoryStore.g:982:2: 'Experiment'
            {
             before(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getExperimentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__0__Impl"


    // $ANTLR start "rule__Experiment__Group__1"
    // InternalTheoryStore.g:991:1: rule__Experiment__Group__1 : rule__Experiment__Group__1__Impl rule__Experiment__Group__2 ;
    public final void rule__Experiment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:995:1: ( rule__Experiment__Group__1__Impl rule__Experiment__Group__2 )
            // InternalTheoryStore.g:996:2: rule__Experiment__Group__1__Impl rule__Experiment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Experiment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__1"


    // $ANTLR start "rule__Experiment__Group__1__Impl"
    // InternalTheoryStore.g:1003:1: rule__Experiment__Group__1__Impl : ( ( rule__Experiment__NameAssignment_1 ) ) ;
    public final void rule__Experiment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1007:1: ( ( ( rule__Experiment__NameAssignment_1 ) ) )
            // InternalTheoryStore.g:1008:1: ( ( rule__Experiment__NameAssignment_1 ) )
            {
            // InternalTheoryStore.g:1008:1: ( ( rule__Experiment__NameAssignment_1 ) )
            // InternalTheoryStore.g:1009:2: ( rule__Experiment__NameAssignment_1 )
            {
             before(grammarAccess.getExperimentAccess().getNameAssignment_1()); 
            // InternalTheoryStore.g:1010:2: ( rule__Experiment__NameAssignment_1 )
            // InternalTheoryStore.g:1010:3: rule__Experiment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__1__Impl"


    // $ANTLR start "rule__Experiment__Group__2"
    // InternalTheoryStore.g:1018:1: rule__Experiment__Group__2 : rule__Experiment__Group__2__Impl rule__Experiment__Group__3 ;
    public final void rule__Experiment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1022:1: ( rule__Experiment__Group__2__Impl rule__Experiment__Group__3 )
            // InternalTheoryStore.g:1023:2: rule__Experiment__Group__2__Impl rule__Experiment__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Experiment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__2"


    // $ANTLR start "rule__Experiment__Group__2__Impl"
    // InternalTheoryStore.g:1030:1: rule__Experiment__Group__2__Impl : ( '{' ) ;
    public final void rule__Experiment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1034:1: ( ( '{' ) )
            // InternalTheoryStore.g:1035:1: ( '{' )
            {
            // InternalTheoryStore.g:1035:1: ( '{' )
            // InternalTheoryStore.g:1036:2: '{'
            {
             before(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__2__Impl"


    // $ANTLR start "rule__Experiment__Group__3"
    // InternalTheoryStore.g:1045:1: rule__Experiment__Group__3 : rule__Experiment__Group__3__Impl rule__Experiment__Group__4 ;
    public final void rule__Experiment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1049:1: ( rule__Experiment__Group__3__Impl rule__Experiment__Group__4 )
            // InternalTheoryStore.g:1050:2: rule__Experiment__Group__3__Impl rule__Experiment__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Experiment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__3"


    // $ANTLR start "rule__Experiment__Group__3__Impl"
    // InternalTheoryStore.g:1057:1: rule__Experiment__Group__3__Impl : ( ( rule__Experiment__ContentAssignment_3 ) ) ;
    public final void rule__Experiment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1061:1: ( ( ( rule__Experiment__ContentAssignment_3 ) ) )
            // InternalTheoryStore.g:1062:1: ( ( rule__Experiment__ContentAssignment_3 ) )
            {
            // InternalTheoryStore.g:1062:1: ( ( rule__Experiment__ContentAssignment_3 ) )
            // InternalTheoryStore.g:1063:2: ( rule__Experiment__ContentAssignment_3 )
            {
             before(grammarAccess.getExperimentAccess().getContentAssignment_3()); 
            // InternalTheoryStore.g:1064:2: ( rule__Experiment__ContentAssignment_3 )
            // InternalTheoryStore.g:1064:3: rule__Experiment__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__3__Impl"


    // $ANTLR start "rule__Experiment__Group__4"
    // InternalTheoryStore.g:1072:1: rule__Experiment__Group__4 : rule__Experiment__Group__4__Impl rule__Experiment__Group__5 ;
    public final void rule__Experiment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1076:1: ( rule__Experiment__Group__4__Impl rule__Experiment__Group__5 )
            // InternalTheoryStore.g:1077:2: rule__Experiment__Group__4__Impl rule__Experiment__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Experiment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__4"


    // $ANTLR start "rule__Experiment__Group__4__Impl"
    // InternalTheoryStore.g:1084:1: rule__Experiment__Group__4__Impl : ( '}' ) ;
    public final void rule__Experiment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1088:1: ( ( '}' ) )
            // InternalTheoryStore.g:1089:1: ( '}' )
            {
            // InternalTheoryStore.g:1089:1: ( '}' )
            // InternalTheoryStore.g:1090:2: '}'
            {
             before(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__4__Impl"


    // $ANTLR start "rule__Experiment__Group__5"
    // InternalTheoryStore.g:1099:1: rule__Experiment__Group__5 : rule__Experiment__Group__5__Impl rule__Experiment__Group__6 ;
    public final void rule__Experiment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1103:1: ( rule__Experiment__Group__5__Impl rule__Experiment__Group__6 )
            // InternalTheoryStore.g:1104:2: rule__Experiment__Group__5__Impl rule__Experiment__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Experiment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__5"


    // $ANTLR start "rule__Experiment__Group__5__Impl"
    // InternalTheoryStore.g:1111:1: rule__Experiment__Group__5__Impl : ( '->' ) ;
    public final void rule__Experiment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1115:1: ( ( '->' ) )
            // InternalTheoryStore.g:1116:1: ( '->' )
            {
            // InternalTheoryStore.g:1116:1: ( '->' )
            // InternalTheoryStore.g:1117:2: '->'
            {
             before(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__5__Impl"


    // $ANTLR start "rule__Experiment__Group__6"
    // InternalTheoryStore.g:1126:1: rule__Experiment__Group__6 : rule__Experiment__Group__6__Impl rule__Experiment__Group__7 ;
    public final void rule__Experiment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1130:1: ( rule__Experiment__Group__6__Impl rule__Experiment__Group__7 )
            // InternalTheoryStore.g:1131:2: rule__Experiment__Group__6__Impl rule__Experiment__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Experiment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__6"


    // $ANTLR start "rule__Experiment__Group__6__Impl"
    // InternalTheoryStore.g:1138:1: rule__Experiment__Group__6__Impl : ( ( rule__Experiment__ModelAssignment_6 ) ) ;
    public final void rule__Experiment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1142:1: ( ( ( rule__Experiment__ModelAssignment_6 ) ) )
            // InternalTheoryStore.g:1143:1: ( ( rule__Experiment__ModelAssignment_6 ) )
            {
            // InternalTheoryStore.g:1143:1: ( ( rule__Experiment__ModelAssignment_6 ) )
            // InternalTheoryStore.g:1144:2: ( rule__Experiment__ModelAssignment_6 )
            {
             before(grammarAccess.getExperimentAccess().getModelAssignment_6()); 
            // InternalTheoryStore.g:1145:2: ( rule__Experiment__ModelAssignment_6 )
            // InternalTheoryStore.g:1145:3: rule__Experiment__ModelAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__ModelAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getModelAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__6__Impl"


    // $ANTLR start "rule__Experiment__Group__7"
    // InternalTheoryStore.g:1153:1: rule__Experiment__Group__7 : rule__Experiment__Group__7__Impl ;
    public final void rule__Experiment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1157:1: ( rule__Experiment__Group__7__Impl )
            // InternalTheoryStore.g:1158:2: rule__Experiment__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__7"


    // $ANTLR start "rule__Experiment__Group__7__Impl"
    // InternalTheoryStore.g:1164:1: rule__Experiment__Group__7__Impl : ( ( rule__Experiment__Group_7__0 )? ) ;
    public final void rule__Experiment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1168:1: ( ( ( rule__Experiment__Group_7__0 )? ) )
            // InternalTheoryStore.g:1169:1: ( ( rule__Experiment__Group_7__0 )? )
            {
            // InternalTheoryStore.g:1169:1: ( ( rule__Experiment__Group_7__0 )? )
            // InternalTheoryStore.g:1170:2: ( rule__Experiment__Group_7__0 )?
            {
             before(grammarAccess.getExperimentAccess().getGroup_7()); 
            // InternalTheoryStore.g:1171:2: ( rule__Experiment__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTheoryStore.g:1171:3: rule__Experiment__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Experiment__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExperimentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group__7__Impl"


    // $ANTLR start "rule__Experiment__Group_7__0"
    // InternalTheoryStore.g:1180:1: rule__Experiment__Group_7__0 : rule__Experiment__Group_7__0__Impl rule__Experiment__Group_7__1 ;
    public final void rule__Experiment__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1184:1: ( rule__Experiment__Group_7__0__Impl rule__Experiment__Group_7__1 )
            // InternalTheoryStore.g:1185:2: rule__Experiment__Group_7__0__Impl rule__Experiment__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Experiment__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7__0"


    // $ANTLR start "rule__Experiment__Group_7__0__Impl"
    // InternalTheoryStore.g:1192:1: rule__Experiment__Group_7__0__Impl : ( '->' ) ;
    public final void rule__Experiment__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1196:1: ( ( '->' ) )
            // InternalTheoryStore.g:1197:1: ( '->' )
            {
            // InternalTheoryStore.g:1197:1: ( '->' )
            // InternalTheoryStore.g:1198:2: '->'
            {
             before(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_7_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getHyphenMinusGreaterThanSignKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7__0__Impl"


    // $ANTLR start "rule__Experiment__Group_7__1"
    // InternalTheoryStore.g:1207:1: rule__Experiment__Group_7__1 : rule__Experiment__Group_7__1__Impl rule__Experiment__Group_7__2 ;
    public final void rule__Experiment__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1211:1: ( rule__Experiment__Group_7__1__Impl rule__Experiment__Group_7__2 )
            // InternalTheoryStore.g:1212:2: rule__Experiment__Group_7__1__Impl rule__Experiment__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__Experiment__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7__1"


    // $ANTLR start "rule__Experiment__Group_7__1__Impl"
    // InternalTheoryStore.g:1219:1: rule__Experiment__Group_7__1__Impl : ( ( rule__Experiment__RequirementsAssignment_7_1 ) ) ;
    public final void rule__Experiment__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1223:1: ( ( ( rule__Experiment__RequirementsAssignment_7_1 ) ) )
            // InternalTheoryStore.g:1224:1: ( ( rule__Experiment__RequirementsAssignment_7_1 ) )
            {
            // InternalTheoryStore.g:1224:1: ( ( rule__Experiment__RequirementsAssignment_7_1 ) )
            // InternalTheoryStore.g:1225:2: ( rule__Experiment__RequirementsAssignment_7_1 )
            {
             before(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_1()); 
            // InternalTheoryStore.g:1226:2: ( rule__Experiment__RequirementsAssignment_7_1 )
            // InternalTheoryStore.g:1226:3: rule__Experiment__RequirementsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__RequirementsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7__1__Impl"


    // $ANTLR start "rule__Experiment__Group_7__2"
    // InternalTheoryStore.g:1234:1: rule__Experiment__Group_7__2 : rule__Experiment__Group_7__2__Impl ;
    public final void rule__Experiment__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1238:1: ( rule__Experiment__Group_7__2__Impl )
            // InternalTheoryStore.g:1239:2: rule__Experiment__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7__2"


    // $ANTLR start "rule__Experiment__Group_7__2__Impl"
    // InternalTheoryStore.g:1245:1: rule__Experiment__Group_7__2__Impl : ( ( rule__Experiment__Group_7_2__0 )* ) ;
    public final void rule__Experiment__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1249:1: ( ( ( rule__Experiment__Group_7_2__0 )* ) )
            // InternalTheoryStore.g:1250:1: ( ( rule__Experiment__Group_7_2__0 )* )
            {
            // InternalTheoryStore.g:1250:1: ( ( rule__Experiment__Group_7_2__0 )* )
            // InternalTheoryStore.g:1251:2: ( rule__Experiment__Group_7_2__0 )*
            {
             before(grammarAccess.getExperimentAccess().getGroup_7_2()); 
            // InternalTheoryStore.g:1252:2: ( rule__Experiment__Group_7_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTheoryStore.g:1252:3: rule__Experiment__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Experiment__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExperimentAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7__2__Impl"


    // $ANTLR start "rule__Experiment__Group_7_2__0"
    // InternalTheoryStore.g:1261:1: rule__Experiment__Group_7_2__0 : rule__Experiment__Group_7_2__0__Impl rule__Experiment__Group_7_2__1 ;
    public final void rule__Experiment__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1265:1: ( rule__Experiment__Group_7_2__0__Impl rule__Experiment__Group_7_2__1 )
            // InternalTheoryStore.g:1266:2: rule__Experiment__Group_7_2__0__Impl rule__Experiment__Group_7_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Experiment__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experiment__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7_2__0"


    // $ANTLR start "rule__Experiment__Group_7_2__0__Impl"
    // InternalTheoryStore.g:1273:1: rule__Experiment__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Experiment__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1277:1: ( ( ',' ) )
            // InternalTheoryStore.g:1278:1: ( ',' )
            {
            // InternalTheoryStore.g:1278:1: ( ',' )
            // InternalTheoryStore.g:1279:2: ','
            {
             before(grammarAccess.getExperimentAccess().getCommaKeyword_7_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7_2__0__Impl"


    // $ANTLR start "rule__Experiment__Group_7_2__1"
    // InternalTheoryStore.g:1288:1: rule__Experiment__Group_7_2__1 : rule__Experiment__Group_7_2__1__Impl ;
    public final void rule__Experiment__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1292:1: ( rule__Experiment__Group_7_2__1__Impl )
            // InternalTheoryStore.g:1293:2: rule__Experiment__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7_2__1"


    // $ANTLR start "rule__Experiment__Group_7_2__1__Impl"
    // InternalTheoryStore.g:1299:1: rule__Experiment__Group_7_2__1__Impl : ( ( rule__Experiment__RequirementsAssignment_7_2_1 ) ) ;
    public final void rule__Experiment__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1303:1: ( ( ( rule__Experiment__RequirementsAssignment_7_2_1 ) ) )
            // InternalTheoryStore.g:1304:1: ( ( rule__Experiment__RequirementsAssignment_7_2_1 ) )
            {
            // InternalTheoryStore.g:1304:1: ( ( rule__Experiment__RequirementsAssignment_7_2_1 ) )
            // InternalTheoryStore.g:1305:2: ( rule__Experiment__RequirementsAssignment_7_2_1 )
            {
             before(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_2_1()); 
            // InternalTheoryStore.g:1306:2: ( rule__Experiment__RequirementsAssignment_7_2_1 )
            // InternalTheoryStore.g:1306:3: rule__Experiment__RequirementsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Experiment__RequirementsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentAccess().getRequirementsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__Group_7_2__1__Impl"


    // $ANTLR start "rule__TheoryStore__ElementsAssignment"
    // InternalTheoryStore.g:1315:1: rule__TheoryStore__ElementsAssignment : ( ruleElement ) ;
    public final void rule__TheoryStore__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1319:1: ( ( ruleElement ) )
            // InternalTheoryStore.g:1320:2: ( ruleElement )
            {
            // InternalTheoryStore.g:1320:2: ( ruleElement )
            // InternalTheoryStore.g:1321:3: ruleElement
            {
             before(grammarAccess.getTheoryStoreAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getTheoryStoreAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TheoryStore__ElementsAssignment"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalTheoryStore.g:1330:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1334:1: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1335:2: ( RULE_ID )
            {
            // InternalTheoryStore.g:1335:2: ( RULE_ID )
            // InternalTheoryStore.g:1336:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ContentAssignment_3"
    // InternalTheoryStore.g:1345:1: rule__Model__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Model__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1349:1: ( ( RULE_STRING ) )
            // InternalTheoryStore.g:1350:2: ( RULE_STRING )
            {
            // InternalTheoryStore.g:1350:2: ( RULE_STRING )
            // InternalTheoryStore.g:1351:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getContentSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getContentSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContentAssignment_3"


    // $ANTLR start "rule__Model__RequirementsAssignment_5_1"
    // InternalTheoryStore.g:1360:1: rule__Model__RequirementsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Model__RequirementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1364:1: ( ( ( RULE_ID ) ) )
            // InternalTheoryStore.g:1365:2: ( ( RULE_ID ) )
            {
            // InternalTheoryStore.g:1365:2: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1366:3: ( RULE_ID )
            {
             before(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_1_0()); 
            // InternalTheoryStore.g:1367:3: ( RULE_ID )
            // InternalTheoryStore.g:1368:4: RULE_ID
            {
             before(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RequirementsAssignment_5_1"


    // $ANTLR start "rule__Model__RequirementsAssignment_5_2_1"
    // InternalTheoryStore.g:1379:1: rule__Model__RequirementsAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Model__RequirementsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1383:1: ( ( ( RULE_ID ) ) )
            // InternalTheoryStore.g:1384:2: ( ( RULE_ID ) )
            {
            // InternalTheoryStore.g:1384:2: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1385:3: ( RULE_ID )
            {
             before(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_2_1_0()); 
            // InternalTheoryStore.g:1386:3: ( RULE_ID )
            // InternalTheoryStore.g:1387:4: RULE_ID
            {
             before(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRequirementsRequirementIDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getModelAccess().getRequirementsRequirementCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RequirementsAssignment_5_2_1"


    // $ANTLR start "rule__Theory__NameAssignment_1"
    // InternalTheoryStore.g:1398:1: rule__Theory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Theory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1402:1: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1403:2: ( RULE_ID )
            {
            // InternalTheoryStore.g:1403:2: ( RULE_ID )
            // InternalTheoryStore.g:1404:3: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__NameAssignment_1"


    // $ANTLR start "rule__Theory__ContentAssignment_3"
    // InternalTheoryStore.g:1413:1: rule__Theory__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Theory__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1417:1: ( ( RULE_STRING ) )
            // InternalTheoryStore.g:1418:2: ( RULE_STRING )
            {
            // InternalTheoryStore.g:1418:2: ( RULE_STRING )
            // InternalTheoryStore.g:1419:3: RULE_STRING
            {
             before(grammarAccess.getTheoryAccess().getContentSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getContentSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__ContentAssignment_3"


    // $ANTLR start "rule__Theory__ElementsAssignment_5_1"
    // InternalTheoryStore.g:1428:1: rule__Theory__ElementsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Theory__ElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1432:1: ( ( ( RULE_ID ) ) )
            // InternalTheoryStore.g:1433:2: ( ( RULE_ID ) )
            {
            // InternalTheoryStore.g:1433:2: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1434:3: ( RULE_ID )
            {
             before(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_1_0()); 
            // InternalTheoryStore.g:1435:3: ( RULE_ID )
            // InternalTheoryStore.g:1436:4: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__ElementsAssignment_5_1"


    // $ANTLR start "rule__Theory__ElementsAssignment_5_2_1"
    // InternalTheoryStore.g:1447:1: rule__Theory__ElementsAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Theory__ElementsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1451:1: ( ( ( RULE_ID ) ) )
            // InternalTheoryStore.g:1452:2: ( ( RULE_ID ) )
            {
            // InternalTheoryStore.g:1452:2: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1453:3: ( RULE_ID )
            {
             before(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_2_1_0()); 
            // InternalTheoryStore.g:1454:3: ( RULE_ID )
            // InternalTheoryStore.g:1455:4: RULE_ID
            {
             before(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTheoryAccess().getElementsElementIDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getTheoryAccess().getElementsElementCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Theory__ElementsAssignment_5_2_1"


    // $ANTLR start "rule__Requirement__NameAssignment_1"
    // InternalTheoryStore.g:1466:1: rule__Requirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Requirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1470:1: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1471:2: ( RULE_ID )
            {
            // InternalTheoryStore.g:1471:2: ( RULE_ID )
            // InternalTheoryStore.g:1472:3: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__NameAssignment_1"


    // $ANTLR start "rule__Requirement__ContentAssignment_3"
    // InternalTheoryStore.g:1481:1: rule__Requirement__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Requirement__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1485:1: ( ( RULE_STRING ) )
            // InternalTheoryStore.g:1486:2: ( RULE_STRING )
            {
            // InternalTheoryStore.g:1486:2: ( RULE_STRING )
            // InternalTheoryStore.g:1487:3: RULE_STRING
            {
             before(grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getContentSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__ContentAssignment_3"


    // $ANTLR start "rule__Experiment__NameAssignment_1"
    // InternalTheoryStore.g:1496:1: rule__Experiment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Experiment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1500:1: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1501:2: ( RULE_ID )
            {
            // InternalTheoryStore.g:1501:2: ( RULE_ID )
            // InternalTheoryStore.g:1502:3: RULE_ID
            {
             before(grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__NameAssignment_1"


    // $ANTLR start "rule__Experiment__ContentAssignment_3"
    // InternalTheoryStore.g:1511:1: rule__Experiment__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Experiment__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1515:1: ( ( RULE_STRING ) )
            // InternalTheoryStore.g:1516:2: ( RULE_STRING )
            {
            // InternalTheoryStore.g:1516:2: ( RULE_STRING )
            // InternalTheoryStore.g:1517:3: RULE_STRING
            {
             before(grammarAccess.getExperimentAccess().getContentSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getContentSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__ContentAssignment_3"


    // $ANTLR start "rule__Experiment__ModelAssignment_6"
    // InternalTheoryStore.g:1526:1: rule__Experiment__ModelAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Experiment__ModelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1530:1: ( ( ( RULE_ID ) ) )
            // InternalTheoryStore.g:1531:2: ( ( RULE_ID ) )
            {
            // InternalTheoryStore.g:1531:2: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1532:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentAccess().getModelModelCrossReference_6_0()); 
            // InternalTheoryStore.g:1533:3: ( RULE_ID )
            // InternalTheoryStore.g:1534:4: RULE_ID
            {
             before(grammarAccess.getExperimentAccess().getModelModelIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getModelModelIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getExperimentAccess().getModelModelCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__ModelAssignment_6"


    // $ANTLR start "rule__Experiment__RequirementsAssignment_7_1"
    // InternalTheoryStore.g:1545:1: rule__Experiment__RequirementsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Experiment__RequirementsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1549:1: ( ( ( RULE_ID ) ) )
            // InternalTheoryStore.g:1550:2: ( ( RULE_ID ) )
            {
            // InternalTheoryStore.g:1550:2: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1551:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_1_0()); 
            // InternalTheoryStore.g:1552:3: ( RULE_ID )
            // InternalTheoryStore.g:1553:4: RULE_ID
            {
             before(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__RequirementsAssignment_7_1"


    // $ANTLR start "rule__Experiment__RequirementsAssignment_7_2_1"
    // InternalTheoryStore.g:1564:1: rule__Experiment__RequirementsAssignment_7_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Experiment__RequirementsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTheoryStore.g:1568:1: ( ( ( RULE_ID ) ) )
            // InternalTheoryStore.g:1569:2: ( ( RULE_ID ) )
            {
            // InternalTheoryStore.g:1569:2: ( ( RULE_ID ) )
            // InternalTheoryStore.g:1570:3: ( RULE_ID )
            {
             before(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_2_1_0()); 
            // InternalTheoryStore.g:1571:3: ( RULE_ID )
            // InternalTheoryStore.g:1572:4: RULE_ID
            {
             before(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExperimentAccess().getRequirementsRequirementIDTerminalRuleCall_7_2_1_0_1()); 

            }

             after(grammarAccess.getExperimentAccess().getRequirementsRequirementCrossReference_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experiment__RequirementsAssignment_7_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000070802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});

}