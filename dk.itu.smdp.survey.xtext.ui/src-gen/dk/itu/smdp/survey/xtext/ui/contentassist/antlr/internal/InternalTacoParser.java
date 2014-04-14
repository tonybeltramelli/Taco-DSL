package dk.itu.smdp.survey.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.smdp.survey.xtext.services.TacoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTacoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'date'", "'description'", "'category'", "'person'", "','", "'page'", "'A'", "'input'", "']'", "'sub'", "'end'", "'Q'", "'['", "'-'", "'rank'", "'y/n'", "'*'"
    };
    public static final int RULE_ID=5;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTacoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTacoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTacoParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g"; }


     
     	private TacoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TacoGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:61:1: ( ruleSurvey EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:62:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey61);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey68); 

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
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:69:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:73:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:74:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:74:1: ( ( rule__Survey__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:75:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:76:1: ( rule__Survey__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:76:2: rule__Survey__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0_in_ruleSurvey94);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:89:1: ( ruleQuestion EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion128); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:97:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:101:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:102:1: ( ( rule__Question__Alternatives ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:102:1: ( ( rule__Question__Alternatives ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:103:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:104:1: ( rule__Question__Alternatives )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:104:2: rule__Question__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Alternatives_in_ruleQuestion154);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleCategory"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:116:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:117:1: ( ruleCategory EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:118:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory181);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory188); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:125:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:129:2: ( ( ( rule__Category__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:130:1: ( ( rule__Category__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:130:1: ( ( rule__Category__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:131:1: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:132:1: ( rule__Category__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:132:2: rule__Category__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__0_in_ruleCategory214);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:145:1: ( ruleEString EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:160:1: ( rule__EString__Alternatives )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePerson"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:172:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:173:1: ( rulePerson EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:174:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_entryRulePerson301);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePerson308); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:181:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:185:2: ( ( ( rule__Person__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:186:1: ( ( rule__Person__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:186:1: ( ( rule__Person__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:187:1: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:188:1: ( rule__Person__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:188:2: rule__Person__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__0_in_rulePerson334);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRulePage"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:200:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:201:1: ( rulePage EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:202:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage361);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage368); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:209:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:213:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:214:1: ( ( rule__Page__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:214:1: ( ( rule__Page__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:215:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:216:1: ( rule__Page__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:216:2: rule__Page__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0_in_rulePage394);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:230:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:231:1: ( ruleAnswer EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:232:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer423);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer430); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:239:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:243:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:244:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:244:1: ( ( rule__Answer__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:245:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:246:1: ( rule__Answer__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:246:2: rule__Answer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0_in_ruleAnswer456);
            rule__Answer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleMultipleChoice_Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:258:1: entryRuleMultipleChoice_Impl : ruleMultipleChoice_Impl EOF ;
    public final void entryRuleMultipleChoice_Impl() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:259:1: ( ruleMultipleChoice_Impl EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:260:1: ruleMultipleChoice_Impl EOF
            {
             before(grammarAccess.getMultipleChoice_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_Impl_in_entryRuleMultipleChoice_Impl483);
            ruleMultipleChoice_Impl();

            state._fsp--;

             after(grammarAccess.getMultipleChoice_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice_Impl490); 

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
    // $ANTLR end "entryRuleMultipleChoice_Impl"


    // $ANTLR start "ruleMultipleChoice_Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:267:1: ruleMultipleChoice_Impl : ( ( rule__MultipleChoice_Impl__Group__0 ) ) ;
    public final void ruleMultipleChoice_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:271:2: ( ( ( rule__MultipleChoice_Impl__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:272:1: ( ( rule__MultipleChoice_Impl__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:272:1: ( ( rule__MultipleChoice_Impl__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:273:1: ( rule__MultipleChoice_Impl__Group__0 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:274:1: ( rule__MultipleChoice_Impl__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:274:2: rule__MultipleChoice_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__0_in_ruleMultipleChoice_Impl516);
            rule__MultipleChoice_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoice_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleMultipleChoice_Impl"


    // $ANTLR start "entryRuleRanking"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:286:1: entryRuleRanking : ruleRanking EOF ;
    public final void entryRuleRanking() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:287:1: ( ruleRanking EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:288:1: ruleRanking EOF
            {
             before(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking543);
            ruleRanking();

            state._fsp--;

             after(grammarAccess.getRankingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking550); 

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
    // $ANTLR end "entryRuleRanking"


    // $ANTLR start "ruleRanking"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:295:1: ruleRanking : ( ( rule__Ranking__Group__0 ) ) ;
    public final void ruleRanking() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:299:2: ( ( ( rule__Ranking__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:300:1: ( ( rule__Ranking__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:300:1: ( ( rule__Ranking__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:301:1: ( rule__Ranking__Group__0 )
            {
             before(grammarAccess.getRankingAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:302:1: ( rule__Ranking__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:302:2: rule__Ranking__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__0_in_ruleRanking576);
            rule__Ranking__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getGroup()); 

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
    // $ANTLR end "ruleRanking"


    // $ANTLR start "entryRuleRating"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:314:1: entryRuleRating : ruleRating EOF ;
    public final void entryRuleRating() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:315:1: ( ruleRating EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:316:1: ruleRating EOF
            {
             before(grammarAccess.getRatingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_in_entryRuleRating603);
            ruleRating();

            state._fsp--;

             after(grammarAccess.getRatingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating610); 

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
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:323:1: ruleRating : ( ( rule__Rating__Group__0 ) ) ;
    public final void ruleRating() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:327:2: ( ( ( rule__Rating__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:328:1: ( ( rule__Rating__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:328:1: ( ( rule__Rating__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:329:1: ( rule__Rating__Group__0 )
            {
             before(grammarAccess.getRatingAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:330:1: ( rule__Rating__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:330:2: rule__Rating__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__0_in_ruleRating636);
            rule__Rating__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getGroup()); 

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
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleYesNo"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:342:1: entryRuleYesNo : ruleYesNo EOF ;
    public final void entryRuleYesNo() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:343:1: ( ruleYesNo EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:344:1: ruleYesNo EOF
            {
             before(grammarAccess.getYesNoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYesNo_in_entryRuleYesNo663);
            ruleYesNo();

            state._fsp--;

             after(grammarAccess.getYesNoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYesNo670); 

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
    // $ANTLR end "entryRuleYesNo"


    // $ANTLR start "ruleYesNo"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:351:1: ruleYesNo : ( ( rule__YesNo__Group__0 ) ) ;
    public final void ruleYesNo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:355:2: ( ( ( rule__YesNo__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:356:1: ( ( rule__YesNo__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:356:1: ( ( rule__YesNo__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:357:1: ( rule__YesNo__Group__0 )
            {
             before(grammarAccess.getYesNoAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:358:1: ( rule__YesNo__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:358:2: rule__YesNo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__0_in_ruleYesNo696);
            rule__YesNo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYesNoAccess().getGroup()); 

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
    // $ANTLR end "ruleYesNo"


    // $ANTLR start "entryRuleOpenField"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:370:1: entryRuleOpenField : ruleOpenField EOF ;
    public final void entryRuleOpenField() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:371:1: ( ruleOpenField EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:372:1: ruleOpenField EOF
            {
             before(grammarAccess.getOpenFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenField_in_entryRuleOpenField723);
            ruleOpenField();

            state._fsp--;

             after(grammarAccess.getOpenFieldRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpenField730); 

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
    // $ANTLR end "entryRuleOpenField"


    // $ANTLR start "ruleOpenField"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:379:1: ruleOpenField : ( ( rule__OpenField__Group__0 ) ) ;
    public final void ruleOpenField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:383:2: ( ( ( rule__OpenField__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:384:1: ( ( rule__OpenField__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:384:1: ( ( rule__OpenField__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:385:1: ( rule__OpenField__Group__0 )
            {
             before(grammarAccess.getOpenFieldAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:386:1: ( rule__OpenField__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:386:2: rule__OpenField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__0_in_ruleOpenField756);
            rule__OpenField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleOpenField"


    // $ANTLR start "entryRuleMutuallyExclusive_Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:398:1: entryRuleMutuallyExclusive_Impl : ruleMutuallyExclusive_Impl EOF ;
    public final void entryRuleMutuallyExclusive_Impl() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:399:1: ( ruleMutuallyExclusive_Impl EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:400:1: ruleMutuallyExclusive_Impl EOF
            {
             before(grammarAccess.getMutuallyExclusive_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMutuallyExclusive_Impl_in_entryRuleMutuallyExclusive_Impl783);
            ruleMutuallyExclusive_Impl();

            state._fsp--;

             after(grammarAccess.getMutuallyExclusive_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMutuallyExclusive_Impl790); 

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
    // $ANTLR end "entryRuleMutuallyExclusive_Impl"


    // $ANTLR start "ruleMutuallyExclusive_Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:407:1: ruleMutuallyExclusive_Impl : ( ( rule__MutuallyExclusive_Impl__Group__0 ) ) ;
    public final void ruleMutuallyExclusive_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:411:2: ( ( ( rule__MutuallyExclusive_Impl__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:412:1: ( ( rule__MutuallyExclusive_Impl__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:412:1: ( ( rule__MutuallyExclusive_Impl__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:413:1: ( rule__MutuallyExclusive_Impl__Group__0 )
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:414:1: ( rule__MutuallyExclusive_Impl__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:414:2: rule__MutuallyExclusive_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__0_in_ruleMutuallyExclusive_Impl816);
            rule__MutuallyExclusive_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleMutuallyExclusive_Impl"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:426:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:427:1: ( ruleEInt EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:428:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt843);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt850); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:435:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:439:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:440:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:440:1: ( ( rule__EInt__Group__0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:441:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:442:1: ( rule__EInt__Group__0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:442:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt876);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePersonAttribute"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:454:1: entryRulePersonAttribute : rulePersonAttribute EOF ;
    public final void entryRulePersonAttribute() throws RecognitionException {
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:455:1: ( rulePersonAttribute EOF )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:456:1: rulePersonAttribute EOF
            {
             before(grammarAccess.getPersonAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_entryRulePersonAttribute903);
            rulePersonAttribute();

            state._fsp--;

             after(grammarAccess.getPersonAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePersonAttribute910); 

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
    // $ANTLR end "entryRulePersonAttribute"


    // $ANTLR start "rulePersonAttribute"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:463:1: rulePersonAttribute : ( ( rule__PersonAttribute__KeyAssignment ) ) ;
    public final void rulePersonAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:467:2: ( ( ( rule__PersonAttribute__KeyAssignment ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:468:1: ( ( rule__PersonAttribute__KeyAssignment ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:468:1: ( ( rule__PersonAttribute__KeyAssignment ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:469:1: ( rule__PersonAttribute__KeyAssignment )
            {
             before(grammarAccess.getPersonAttributeAccess().getKeyAssignment()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:470:1: ( rule__PersonAttribute__KeyAssignment )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:470:2: rule__PersonAttribute__KeyAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__PersonAttribute__KeyAssignment_in_rulePersonAttribute936);
            rule__PersonAttribute__KeyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPersonAttributeAccess().getKeyAssignment()); 

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
    // $ANTLR end "rulePersonAttribute"


    // $ANTLR start "rule__Question__Alternatives"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:482:1: rule__Question__Alternatives : ( ( ruleMultipleChoice_Impl ) | ( ruleRanking ) | ( ruleRating ) | ( ruleYesNo ) | ( ruleOpenField ) | ( ruleMutuallyExclusive_Impl ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:486:1: ( ( ruleMultipleChoice_Impl ) | ( ruleRanking ) | ( ruleRating ) | ( ruleYesNo ) | ( ruleOpenField ) | ( ruleMutuallyExclusive_Impl ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:487:1: ( ruleMultipleChoice_Impl )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:487:1: ( ruleMultipleChoice_Impl )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:488:1: ruleMultipleChoice_Impl
                    {
                     before(grammarAccess.getQuestionAccess().getMultipleChoice_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_Impl_in_rule__Question__Alternatives972);
                    ruleMultipleChoice_Impl();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultipleChoice_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:493:6: ( ruleRanking )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:493:6: ( ruleRanking )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:494:1: ruleRanking
                    {
                     before(grammarAccess.getQuestionAccess().getRankingParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_rule__Question__Alternatives989);
                    ruleRanking();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRankingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:499:6: ( ruleRating )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:499:6: ( ruleRating )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:500:1: ruleRating
                    {
                     before(grammarAccess.getQuestionAccess().getRatingParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRating_in_rule__Question__Alternatives1006);
                    ruleRating();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getRatingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:505:6: ( ruleYesNo )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:505:6: ( ruleYesNo )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:506:1: ruleYesNo
                    {
                     before(grammarAccess.getQuestionAccess().getYesNoParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleYesNo_in_rule__Question__Alternatives1023);
                    ruleYesNo();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getYesNoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:511:6: ( ruleOpenField )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:511:6: ( ruleOpenField )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:512:1: ruleOpenField
                    {
                     before(grammarAccess.getQuestionAccess().getOpenFieldParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOpenField_in_rule__Question__Alternatives1040);
                    ruleOpenField();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getOpenFieldParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:517:6: ( ruleMutuallyExclusive_Impl )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:517:6: ( ruleMutuallyExclusive_Impl )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:518:1: ruleMutuallyExclusive_Impl
                    {
                     before(grammarAccess.getQuestionAccess().getMutuallyExclusive_ImplParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMutuallyExclusive_Impl_in_rule__Question__Alternatives1057);
                    ruleMutuallyExclusive_Impl();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMutuallyExclusive_ImplParserRuleCall_5()); 

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
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:528:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:532:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:533:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:533:1: ( RULE_STRING )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:534:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1089); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:539:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:539:6: ( RULE_ID )
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:540:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1106); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Survey__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:553:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:557:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:558:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01137);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01140);
            rule__Survey__Group__1();

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
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:565:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:569:1: ( ( 'survey' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:570:1: ( 'survey' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:570:1: ( 'survey' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:571:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl1168); 
             after(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 

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
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:584:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:588:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:589:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11199);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11202);
            rule__Survey__Group__2();

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
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:596:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__TitleAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:600:1: ( ( ( rule__Survey__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:601:1: ( ( rule__Survey__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:601:1: ( ( rule__Survey__TitleAssignment_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:602:1: ( rule__Survey__TitleAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:603:1: ( rule__Survey__TitleAssignment_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:603:2: rule__Survey__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__TitleAssignment_1_in_rule__Survey__Group__1__Impl1229);
            rule__Survey__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:613:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:617:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:618:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21259);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21262);
            rule__Survey__Group__3();

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
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:625:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__Group_2__0 )? ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:629:1: ( ( ( rule__Survey__Group_2__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:630:1: ( ( rule__Survey__Group_2__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:630:1: ( ( rule__Survey__Group_2__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:631:1: ( rule__Survey__Group_2__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:632:1: ( rule__Survey__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:632:2: rule__Survey__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__0_in_rule__Survey__Group__2__Impl1289);
                    rule__Survey__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:642:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:646:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:647:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31320);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31323);
            rule__Survey__Group__4();

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
    // $ANTLR end "rule__Survey__Group__3"


    // $ANTLR start "rule__Survey__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:654:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__Group_3__0 )? ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:658:1: ( ( ( rule__Survey__Group_3__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:659:1: ( ( rule__Survey__Group_3__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:659:1: ( ( rule__Survey__Group_3__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:660:1: ( rule__Survey__Group_3__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_3()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:661:1: ( rule__Survey__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:661:2: rule__Survey__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__0_in_rule__Survey__Group__3__Impl1350);
                    rule__Survey__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Survey__Group__3__Impl"


    // $ANTLR start "rule__Survey__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:671:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:675:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:676:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41381);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41384);
            rule__Survey__Group__5();

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
    // $ANTLR end "rule__Survey__Group__4"


    // $ANTLR start "rule__Survey__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:683:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__PersonAssignment_4 )? ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:687:1: ( ( ( rule__Survey__PersonAssignment_4 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:688:1: ( ( rule__Survey__PersonAssignment_4 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:688:1: ( ( rule__Survey__PersonAssignment_4 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:689:1: ( rule__Survey__PersonAssignment_4 )?
            {
             before(grammarAccess.getSurveyAccess().getPersonAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:690:1: ( rule__Survey__PersonAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:690:2: rule__Survey__PersonAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__PersonAssignment_4_in_rule__Survey__Group__4__Impl1411);
                    rule__Survey__PersonAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getPersonAssignment_4()); 

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
    // $ANTLR end "rule__Survey__Group__4__Impl"


    // $ANTLR start "rule__Survey__Group__5"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:700:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl rule__Survey__Group__6 ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:704:1: ( rule__Survey__Group__5__Impl rule__Survey__Group__6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:705:2: rule__Survey__Group__5__Impl rule__Survey__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51442);
            rule__Survey__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__51445);
            rule__Survey__Group__6();

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
    // $ANTLR end "rule__Survey__Group__5"


    // $ANTLR start "rule__Survey__Group__5__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:712:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__CategoriesAssignment_5 ) ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:716:1: ( ( ( rule__Survey__CategoriesAssignment_5 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:717:1: ( ( rule__Survey__CategoriesAssignment_5 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:717:1: ( ( rule__Survey__CategoriesAssignment_5 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:718:1: ( rule__Survey__CategoriesAssignment_5 )
            {
             before(grammarAccess.getSurveyAccess().getCategoriesAssignment_5()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:719:1: ( rule__Survey__CategoriesAssignment_5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:719:2: rule__Survey__CategoriesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__CategoriesAssignment_5_in_rule__Survey__Group__5__Impl1472);
            rule__Survey__CategoriesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getCategoriesAssignment_5()); 

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
    // $ANTLR end "rule__Survey__Group__5__Impl"


    // $ANTLR start "rule__Survey__Group__6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:729:1: rule__Survey__Group__6 : rule__Survey__Group__6__Impl ;
    public final void rule__Survey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:733:1: ( rule__Survey__Group__6__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:734:2: rule__Survey__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__61502);
            rule__Survey__Group__6__Impl();

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
    // $ANTLR end "rule__Survey__Group__6"


    // $ANTLR start "rule__Survey__Group__6__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:740:1: rule__Survey__Group__6__Impl : ( ( rule__Survey__CategoriesAssignment_6 )* ) ;
    public final void rule__Survey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:744:1: ( ( ( rule__Survey__CategoriesAssignment_6 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:745:1: ( ( rule__Survey__CategoriesAssignment_6 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:745:1: ( ( rule__Survey__CategoriesAssignment_6 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:746:1: ( rule__Survey__CategoriesAssignment_6 )*
            {
             before(grammarAccess.getSurveyAccess().getCategoriesAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:747:1: ( rule__Survey__CategoriesAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:747:2: rule__Survey__CategoriesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__CategoriesAssignment_6_in_rule__Survey__Group__6__Impl1529);
            	    rule__Survey__CategoriesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getCategoriesAssignment_6()); 

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
    // $ANTLR end "rule__Survey__Group__6__Impl"


    // $ANTLR start "rule__Survey__Group_2__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:771:1: rule__Survey__Group_2__0 : rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 ;
    public final void rule__Survey__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:775:1: ( rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:776:2: rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__01574);
            rule__Survey__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__01577);
            rule__Survey__Group_2__1();

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
    // $ANTLR end "rule__Survey__Group_2__0"


    // $ANTLR start "rule__Survey__Group_2__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:783:1: rule__Survey__Group_2__0__Impl : ( 'date' ) ;
    public final void rule__Survey__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:787:1: ( ( 'date' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:788:1: ( 'date' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:788:1: ( 'date' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:789:1: 'date'
            {
             before(grammarAccess.getSurveyAccess().getDateKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group_2__0__Impl1605); 
             after(grammarAccess.getSurveyAccess().getDateKeyword_2_0()); 

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
    // $ANTLR end "rule__Survey__Group_2__0__Impl"


    // $ANTLR start "rule__Survey__Group_2__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:802:1: rule__Survey__Group_2__1 : rule__Survey__Group_2__1__Impl ;
    public final void rule__Survey__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:806:1: ( rule__Survey__Group_2__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:807:2: rule__Survey__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11636);
            rule__Survey__Group_2__1__Impl();

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
    // $ANTLR end "rule__Survey__Group_2__1"


    // $ANTLR start "rule__Survey__Group_2__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:813:1: rule__Survey__Group_2__1__Impl : ( ( rule__Survey__DateAssignment_2_1 ) ) ;
    public final void rule__Survey__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:817:1: ( ( ( rule__Survey__DateAssignment_2_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:818:1: ( ( rule__Survey__DateAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:818:1: ( ( rule__Survey__DateAssignment_2_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:819:1: ( rule__Survey__DateAssignment_2_1 )
            {
             before(grammarAccess.getSurveyAccess().getDateAssignment_2_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:820:1: ( rule__Survey__DateAssignment_2_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:820:2: rule__Survey__DateAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__DateAssignment_2_1_in_rule__Survey__Group_2__1__Impl1663);
            rule__Survey__DateAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getDateAssignment_2_1()); 

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
    // $ANTLR end "rule__Survey__Group_2__1__Impl"


    // $ANTLR start "rule__Survey__Group_3__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:834:1: rule__Survey__Group_3__0 : rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1 ;
    public final void rule__Survey__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:838:1: ( rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:839:2: rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__0__Impl_in_rule__Survey__Group_3__01697);
            rule__Survey__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__1_in_rule__Survey__Group_3__01700);
            rule__Survey__Group_3__1();

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
    // $ANTLR end "rule__Survey__Group_3__0"


    // $ANTLR start "rule__Survey__Group_3__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:846:1: rule__Survey__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Survey__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:850:1: ( ( 'description' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:851:1: ( 'description' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:851:1: ( 'description' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:852:1: 'description'
            {
             before(grammarAccess.getSurveyAccess().getDescriptionKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group_3__0__Impl1728); 
             after(grammarAccess.getSurveyAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__Survey__Group_3__0__Impl"


    // $ANTLR start "rule__Survey__Group_3__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:865:1: rule__Survey__Group_3__1 : rule__Survey__Group_3__1__Impl ;
    public final void rule__Survey__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:869:1: ( rule__Survey__Group_3__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:870:2: rule__Survey__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__1__Impl_in_rule__Survey__Group_3__11759);
            rule__Survey__Group_3__1__Impl();

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
    // $ANTLR end "rule__Survey__Group_3__1"


    // $ANTLR start "rule__Survey__Group_3__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:876:1: rule__Survey__Group_3__1__Impl : ( ( rule__Survey__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Survey__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:880:1: ( ( ( rule__Survey__DescriptionAssignment_3_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:881:1: ( ( rule__Survey__DescriptionAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:881:1: ( ( rule__Survey__DescriptionAssignment_3_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:882:1: ( rule__Survey__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getSurveyAccess().getDescriptionAssignment_3_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:883:1: ( rule__Survey__DescriptionAssignment_3_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:883:2: rule__Survey__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__DescriptionAssignment_3_1_in_rule__Survey__Group_3__1__Impl1786);
            rule__Survey__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__Survey__Group_3__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:897:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:901:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:902:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__01820);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__1_in_rule__Category__Group__01823);
            rule__Category__Group__1();

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
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:909:1: rule__Category__Group__0__Impl : ( 'category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:913:1: ( ( 'category' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:914:1: ( 'category' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:914:1: ( 'category' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:915:1: 'category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Category__Group__0__Impl1851); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

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
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:928:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:932:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:933:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__11882);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__2_in_rule__Category__Group__11885);
            rule__Category__Group__2();

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
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:940:1: rule__Category__Group__1__Impl : ( ( rule__Category__TitleAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:944:1: ( ( ( rule__Category__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:945:1: ( ( rule__Category__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:945:1: ( ( rule__Category__TitleAssignment_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:946:1: ( rule__Category__TitleAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:947:1: ( rule__Category__TitleAssignment_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:947:2: rule__Category__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__TitleAssignment_1_in_rule__Category__Group__1__Impl1912);
            rule__Category__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:957:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:961:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:962:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__21942);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__3_in_rule__Category__Group__21945);
            rule__Category__Group__3();

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
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:969:1: rule__Category__Group__2__Impl : ( ( rule__Category__Group_2__0 )? ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:973:1: ( ( ( rule__Category__Group_2__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:974:1: ( ( rule__Category__Group_2__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:974:1: ( ( rule__Category__Group_2__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:975:1: ( rule__Category__Group_2__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:976:1: ( rule__Category__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:976:2: rule__Category__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__0_in_rule__Category__Group__2__Impl1972);
                    rule__Category__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:986:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:990:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:991:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__32003);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__4_in_rule__Category__Group__32006);
            rule__Category__Group__4();

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
    // $ANTLR end "rule__Category__Group__3"


    // $ANTLR start "rule__Category__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:998:1: rule__Category__Group__3__Impl : ( ( rule__Category__PagesAssignment_3 ) ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1002:1: ( ( ( rule__Category__PagesAssignment_3 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1003:1: ( ( rule__Category__PagesAssignment_3 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1003:1: ( ( rule__Category__PagesAssignment_3 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1004:1: ( rule__Category__PagesAssignment_3 )
            {
             before(grammarAccess.getCategoryAccess().getPagesAssignment_3()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1005:1: ( rule__Category__PagesAssignment_3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1005:2: rule__Category__PagesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__PagesAssignment_3_in_rule__Category__Group__3__Impl2033);
            rule__Category__PagesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getPagesAssignment_3()); 

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
    // $ANTLR end "rule__Category__Group__3__Impl"


    // $ANTLR start "rule__Category__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1015:1: rule__Category__Group__4 : rule__Category__Group__4__Impl ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1019:1: ( rule__Category__Group__4__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1020:2: rule__Category__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__42063);
            rule__Category__Group__4__Impl();

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
    // $ANTLR end "rule__Category__Group__4"


    // $ANTLR start "rule__Category__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1026:1: rule__Category__Group__4__Impl : ( ( rule__Category__PagesAssignment_4 )* ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1030:1: ( ( ( rule__Category__PagesAssignment_4 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1031:1: ( ( rule__Category__PagesAssignment_4 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1031:1: ( ( rule__Category__PagesAssignment_4 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1032:1: ( rule__Category__PagesAssignment_4 )*
            {
             before(grammarAccess.getCategoryAccess().getPagesAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1033:1: ( rule__Category__PagesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1033:2: rule__Category__PagesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Category__PagesAssignment_4_in_rule__Category__Group__4__Impl2090);
            	    rule__Category__PagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCategoryAccess().getPagesAssignment_4()); 

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
    // $ANTLR end "rule__Category__Group__4__Impl"


    // $ANTLR start "rule__Category__Group_2__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1053:1: rule__Category__Group_2__0 : rule__Category__Group_2__0__Impl rule__Category__Group_2__1 ;
    public final void rule__Category__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1057:1: ( rule__Category__Group_2__0__Impl rule__Category__Group_2__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1058:2: rule__Category__Group_2__0__Impl rule__Category__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__0__Impl_in_rule__Category__Group_2__02131);
            rule__Category__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__1_in_rule__Category__Group_2__02134);
            rule__Category__Group_2__1();

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
    // $ANTLR end "rule__Category__Group_2__0"


    // $ANTLR start "rule__Category__Group_2__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1065:1: rule__Category__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Category__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1069:1: ( ( 'description' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1070:1: ( 'description' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1070:1: ( 'description' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1071:1: 'description'
            {
             before(grammarAccess.getCategoryAccess().getDescriptionKeyword_2_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Category__Group_2__0__Impl2162); 
             after(grammarAccess.getCategoryAccess().getDescriptionKeyword_2_0()); 

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
    // $ANTLR end "rule__Category__Group_2__0__Impl"


    // $ANTLR start "rule__Category__Group_2__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1084:1: rule__Category__Group_2__1 : rule__Category__Group_2__1__Impl ;
    public final void rule__Category__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1088:1: ( rule__Category__Group_2__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1089:2: rule__Category__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__1__Impl_in_rule__Category__Group_2__12193);
            rule__Category__Group_2__1__Impl();

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
    // $ANTLR end "rule__Category__Group_2__1"


    // $ANTLR start "rule__Category__Group_2__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1095:1: rule__Category__Group_2__1__Impl : ( ( rule__Category__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Category__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1099:1: ( ( ( rule__Category__DescriptionAssignment_2_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1100:1: ( ( rule__Category__DescriptionAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1100:1: ( ( rule__Category__DescriptionAssignment_2_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1101:1: ( rule__Category__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getDescriptionAssignment_2_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1102:1: ( rule__Category__DescriptionAssignment_2_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1102:2: rule__Category__DescriptionAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__DescriptionAssignment_2_1_in_rule__Category__Group_2__1__Impl2220);
            rule__Category__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getDescriptionAssignment_2_1()); 

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
    // $ANTLR end "rule__Category__Group_2__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1116:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1120:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1121:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__02254);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__1_in_rule__Person__Group__02257);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1128:1: rule__Person__Group__0__Impl : ( 'person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1132:1: ( ( 'person' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1133:1: ( 'person' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1133:1: ( 'person' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1134:1: 'person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Person__Group__0__Impl2285); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

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
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1147:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1151:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1152:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__12316);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__2_in_rule__Person__Group__12319);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1159:1: rule__Person__Group__1__Impl : ( ( rule__Person__AttributeAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1163:1: ( ( ( rule__Person__AttributeAssignment_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1164:1: ( ( rule__Person__AttributeAssignment_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1164:1: ( ( rule__Person__AttributeAssignment_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1165:1: ( rule__Person__AttributeAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getAttributeAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1166:1: ( rule__Person__AttributeAssignment_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1166:2: rule__Person__AttributeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__AttributeAssignment_1_in_rule__Person__Group__1__Impl2346);
            rule__Person__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAttributeAssignment_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1176:1: rule__Person__Group__2 : rule__Person__Group__2__Impl ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1180:1: ( rule__Person__Group__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1181:2: rule__Person__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__22376);
            rule__Person__Group__2__Impl();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1187:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )* ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1191:1: ( ( ( rule__Person__Group_2__0 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1192:1: ( ( rule__Person__Group_2__0 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1192:1: ( ( rule__Person__Group_2__0 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1193:1: ( rule__Person__Group_2__0 )*
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1194:1: ( rule__Person__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1194:2: rule__Person__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__0_in_rule__Person__Group__2__Impl2403);
            	    rule__Person__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPersonAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group_2__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1210:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1214:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1215:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__0__Impl_in_rule__Person__Group_2__02440);
            rule__Person__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__1_in_rule__Person__Group_2__02443);
            rule__Person__Group_2__1();

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
    // $ANTLR end "rule__Person__Group_2__0"


    // $ANTLR start "rule__Person__Group_2__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1222:1: rule__Person__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1226:1: ( ( ',' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1227:1: ( ',' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1227:1: ( ',' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1228:1: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Person__Group_2__0__Impl2471); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Person__Group_2__0__Impl"


    // $ANTLR start "rule__Person__Group_2__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1241:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1245:1: ( rule__Person__Group_2__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1246:2: rule__Person__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__1__Impl_in_rule__Person__Group_2__12502);
            rule__Person__Group_2__1__Impl();

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
    // $ANTLR end "rule__Person__Group_2__1"


    // $ANTLR start "rule__Person__Group_2__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1252:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__AttributeAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1256:1: ( ( ( rule__Person__AttributeAssignment_2_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1257:1: ( ( rule__Person__AttributeAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1257:1: ( ( rule__Person__AttributeAssignment_2_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1258:1: ( rule__Person__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getAttributeAssignment_2_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1259:1: ( rule__Person__AttributeAssignment_2_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1259:2: rule__Person__AttributeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__AttributeAssignment_2_1_in_rule__Person__Group_2__1__Impl2529);
            rule__Person__AttributeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAttributeAssignment_2_1()); 

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
    // $ANTLR end "rule__Person__Group_2__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1273:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1277:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1278:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02563);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02566);
            rule__Page__Group__1();

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
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1285:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1289:1: ( ( 'page' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1290:1: ( 'page' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1290:1: ( 'page' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1291:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Page__Group__0__Impl2594); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

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
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1304:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1308:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1309:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12625);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12628);
            rule__Page__Group__2();

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
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1316:1: rule__Page__Group__1__Impl : ( ( rule__Page__QuestionsAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1320:1: ( ( ( rule__Page__QuestionsAssignment_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1321:1: ( ( rule__Page__QuestionsAssignment_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1321:1: ( ( rule__Page__QuestionsAssignment_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1322:1: ( rule__Page__QuestionsAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1323:1: ( rule__Page__QuestionsAssignment_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1323:2: rule__Page__QuestionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__QuestionsAssignment_1_in_rule__Page__Group__1__Impl2655);
            rule__Page__QuestionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getQuestionsAssignment_1()); 

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
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1333:1: rule__Page__Group__2 : rule__Page__Group__2__Impl ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1337:1: ( rule__Page__Group__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1338:2: rule__Page__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22685);
            rule__Page__Group__2__Impl();

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
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1344:1: rule__Page__Group__2__Impl : ( ( rule__Page__QuestionsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1348:1: ( ( ( rule__Page__QuestionsAssignment_2 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1349:1: ( ( rule__Page__QuestionsAssignment_2 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1349:1: ( ( rule__Page__QuestionsAssignment_2 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1350:1: ( rule__Page__QuestionsAssignment_2 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1351:1: ( rule__Page__QuestionsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1351:2: rule__Page__QuestionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Page__QuestionsAssignment_2_in_rule__Page__Group__2__Impl2712);
            	    rule__Page__QuestionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getQuestionsAssignment_2()); 

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
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1367:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1371:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1372:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02749);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02752);
            rule__Answer__Group__1();

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
    // $ANTLR end "rule__Answer__Group__0"


    // $ANTLR start "rule__Answer__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1379:1: rule__Answer__Group__0__Impl : ( () ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1383:1: ( ( () ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1384:1: ( () )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1384:1: ( () )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1385:1: ()
            {
             before(grammarAccess.getAnswerAccess().getAnswerAction_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1386:1: ()
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1388:1: 
            {
            }

             after(grammarAccess.getAnswerAccess().getAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1398:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1402:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1403:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12810);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12813);
            rule__Answer__Group__2();

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
    // $ANTLR end "rule__Answer__Group__1"


    // $ANTLR start "rule__Answer__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1410:1: rule__Answer__Group__1__Impl : ( 'A' ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1414:1: ( ( 'A' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1415:1: ( 'A' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1415:1: ( 'A' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1416:1: 'A'
            {
             before(grammarAccess.getAnswerAccess().getAKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Answer__Group__1__Impl2841); 
             after(grammarAccess.getAnswerAccess().getAKeyword_1()); 

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
    // $ANTLR end "rule__Answer__Group__1__Impl"


    // $ANTLR start "rule__Answer__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1429:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1433:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1434:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22872);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22875);
            rule__Answer__Group__3();

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
    // $ANTLR end "rule__Answer__Group__2"


    // $ANTLR start "rule__Answer__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1441:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__DescriptionAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1445:1: ( ( ( rule__Answer__DescriptionAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1446:1: ( ( rule__Answer__DescriptionAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1446:1: ( ( rule__Answer__DescriptionAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1447:1: ( rule__Answer__DescriptionAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1448:1: ( rule__Answer__DescriptionAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1448:2: rule__Answer__DescriptionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__DescriptionAssignment_2_in_rule__Answer__Group__2__Impl2902);
            rule__Answer__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getDescriptionAssignment_2()); 

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
    // $ANTLR end "rule__Answer__Group__2__Impl"


    // $ANTLR start "rule__Answer__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1458:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl rule__Answer__Group__4 ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1462:1: ( rule__Answer__Group__3__Impl rule__Answer__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1463:2: rule__Answer__Group__3__Impl rule__Answer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32932);
            rule__Answer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__4_in_rule__Answer__Group__32935);
            rule__Answer__Group__4();

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
    // $ANTLR end "rule__Answer__Group__3"


    // $ANTLR start "rule__Answer__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1470:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1474:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1475:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1475:1: ( ( rule__Answer__Group_3__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1476:1: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1477:1: ( rule__Answer__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1477:2: rule__Answer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl2962);
                    rule__Answer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Answer__Group__3__Impl"


    // $ANTLR start "rule__Answer__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1487:1: rule__Answer__Group__4 : rule__Answer__Group__4__Impl ;
    public final void rule__Answer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1491:1: ( rule__Answer__Group__4__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1492:2: rule__Answer__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__4__Impl_in_rule__Answer__Group__42993);
            rule__Answer__Group__4__Impl();

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
    // $ANTLR end "rule__Answer__Group__4"


    // $ANTLR start "rule__Answer__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1498:1: rule__Answer__Group__4__Impl : ( ( rule__Answer__Group_4__0 )? ) ;
    public final void rule__Answer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1502:1: ( ( ( rule__Answer__Group_4__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1503:1: ( ( rule__Answer__Group_4__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1503:1: ( ( rule__Answer__Group_4__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1504:1: ( rule__Answer__Group_4__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1505:1: ( rule__Answer__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1505:2: rule__Answer__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__0_in_rule__Answer__Group__4__Impl3020);
                    rule__Answer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Answer__Group__4__Impl"


    // $ANTLR start "rule__Answer__Group_3__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1525:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1529:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1530:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__03061);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__03064);
            rule__Answer__Group_3__1();

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
    // $ANTLR end "rule__Answer__Group_3__0"


    // $ANTLR start "rule__Answer__Group_3__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1537:1: rule__Answer__Group_3__0__Impl : ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1541:1: ( ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1542:1: ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1542:1: ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1543:1: ( rule__Answer__IsUserInputAllowedAssignment_3_0 )
            {
             before(grammarAccess.getAnswerAccess().getIsUserInputAllowedAssignment_3_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1544:1: ( rule__Answer__IsUserInputAllowedAssignment_3_0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1544:2: rule__Answer__IsUserInputAllowedAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__IsUserInputAllowedAssignment_3_0_in_rule__Answer__Group_3__0__Impl3091);
            rule__Answer__IsUserInputAllowedAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getIsUserInputAllowedAssignment_3_0()); 

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
    // $ANTLR end "rule__Answer__Group_3__0__Impl"


    // $ANTLR start "rule__Answer__Group_3__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1554:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1558:1: ( rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1559:2: rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__13121);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__13124);
            rule__Answer__Group_3__2();

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
    // $ANTLR end "rule__Answer__Group_3__1"


    // $ANTLR start "rule__Answer__Group_3__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1566:1: rule__Answer__Group_3__1__Impl : ( 'input' ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1570:1: ( ( 'input' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1571:1: ( 'input' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1571:1: ( 'input' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1572:1: 'input'
            {
             before(grammarAccess.getAnswerAccess().getInputKeyword_3_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Answer__Group_3__1__Impl3152); 
             after(grammarAccess.getAnswerAccess().getInputKeyword_3_1()); 

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
    // $ANTLR end "rule__Answer__Group_3__1__Impl"


    // $ANTLR start "rule__Answer__Group_3__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1585:1: rule__Answer__Group_3__2 : rule__Answer__Group_3__2__Impl ;
    public final void rule__Answer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1589:1: ( rule__Answer__Group_3__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1590:2: rule__Answer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__23183);
            rule__Answer__Group_3__2__Impl();

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
    // $ANTLR end "rule__Answer__Group_3__2"


    // $ANTLR start "rule__Answer__Group_3__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1596:1: rule__Answer__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Answer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1600:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1601:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1601:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1602:1: ']'
            {
             before(grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Answer__Group_3__2__Impl3211); 
             after(grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__Answer__Group_3__2__Impl"


    // $ANTLR start "rule__Answer__Group_4__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1621:1: rule__Answer__Group_4__0 : rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 ;
    public final void rule__Answer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1625:1: ( rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1626:2: rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__0__Impl_in_rule__Answer__Group_4__03248);
            rule__Answer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__1_in_rule__Answer__Group_4__03251);
            rule__Answer__Group_4__1();

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
    // $ANTLR end "rule__Answer__Group_4__0"


    // $ANTLR start "rule__Answer__Group_4__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1633:1: rule__Answer__Group_4__0__Impl : ( 'sub' ) ;
    public final void rule__Answer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1637:1: ( ( 'sub' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1638:1: ( 'sub' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1638:1: ( 'sub' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1639:1: 'sub'
            {
             before(grammarAccess.getAnswerAccess().getSubKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Answer__Group_4__0__Impl3279); 
             after(grammarAccess.getAnswerAccess().getSubKeyword_4_0()); 

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
    // $ANTLR end "rule__Answer__Group_4__0__Impl"


    // $ANTLR start "rule__Answer__Group_4__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1652:1: rule__Answer__Group_4__1 : rule__Answer__Group_4__1__Impl rule__Answer__Group_4__2 ;
    public final void rule__Answer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1656:1: ( rule__Answer__Group_4__1__Impl rule__Answer__Group_4__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1657:2: rule__Answer__Group_4__1__Impl rule__Answer__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__1__Impl_in_rule__Answer__Group_4__13310);
            rule__Answer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__2_in_rule__Answer__Group_4__13313);
            rule__Answer__Group_4__2();

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
    // $ANTLR end "rule__Answer__Group_4__1"


    // $ANTLR start "rule__Answer__Group_4__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1664:1: rule__Answer__Group_4__1__Impl : ( ( rule__Answer__SubquestionAssignment_4_1 ) ) ;
    public final void rule__Answer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1668:1: ( ( ( rule__Answer__SubquestionAssignment_4_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1669:1: ( ( rule__Answer__SubquestionAssignment_4_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1669:1: ( ( rule__Answer__SubquestionAssignment_4_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1670:1: ( rule__Answer__SubquestionAssignment_4_1 )
            {
             before(grammarAccess.getAnswerAccess().getSubquestionAssignment_4_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1671:1: ( rule__Answer__SubquestionAssignment_4_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1671:2: rule__Answer__SubquestionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__SubquestionAssignment_4_1_in_rule__Answer__Group_4__1__Impl3340);
            rule__Answer__SubquestionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getSubquestionAssignment_4_1()); 

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
    // $ANTLR end "rule__Answer__Group_4__1__Impl"


    // $ANTLR start "rule__Answer__Group_4__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1681:1: rule__Answer__Group_4__2 : rule__Answer__Group_4__2__Impl rule__Answer__Group_4__3 ;
    public final void rule__Answer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1685:1: ( rule__Answer__Group_4__2__Impl rule__Answer__Group_4__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1686:2: rule__Answer__Group_4__2__Impl rule__Answer__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__2__Impl_in_rule__Answer__Group_4__23370);
            rule__Answer__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__3_in_rule__Answer__Group_4__23373);
            rule__Answer__Group_4__3();

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
    // $ANTLR end "rule__Answer__Group_4__2"


    // $ANTLR start "rule__Answer__Group_4__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1693:1: rule__Answer__Group_4__2__Impl : ( ( rule__Answer__SubquestionAssignment_4_2 )* ) ;
    public final void rule__Answer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1697:1: ( ( ( rule__Answer__SubquestionAssignment_4_2 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1698:1: ( ( rule__Answer__SubquestionAssignment_4_2 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1698:1: ( ( rule__Answer__SubquestionAssignment_4_2 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1699:1: ( rule__Answer__SubquestionAssignment_4_2 )*
            {
             before(grammarAccess.getAnswerAccess().getSubquestionAssignment_4_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1700:1: ( rule__Answer__SubquestionAssignment_4_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1700:2: rule__Answer__SubquestionAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Answer__SubquestionAssignment_4_2_in_rule__Answer__Group_4__2__Impl3400);
            	    rule__Answer__SubquestionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAnswerAccess().getSubquestionAssignment_4_2()); 

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
    // $ANTLR end "rule__Answer__Group_4__2__Impl"


    // $ANTLR start "rule__Answer__Group_4__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1710:1: rule__Answer__Group_4__3 : rule__Answer__Group_4__3__Impl ;
    public final void rule__Answer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1714:1: ( rule__Answer__Group_4__3__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1715:2: rule__Answer__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__3__Impl_in_rule__Answer__Group_4__33431);
            rule__Answer__Group_4__3__Impl();

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
    // $ANTLR end "rule__Answer__Group_4__3"


    // $ANTLR start "rule__Answer__Group_4__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1721:1: rule__Answer__Group_4__3__Impl : ( 'end' ) ;
    public final void rule__Answer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1725:1: ( ( 'end' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1726:1: ( 'end' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1726:1: ( 'end' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1727:1: 'end'
            {
             before(grammarAccess.getAnswerAccess().getEndKeyword_4_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Answer__Group_4__3__Impl3459); 
             after(grammarAccess.getAnswerAccess().getEndKeyword_4_3()); 

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
    // $ANTLR end "rule__Answer__Group_4__3__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1748:1: rule__MultipleChoice_Impl__Group__0 : rule__MultipleChoice_Impl__Group__0__Impl rule__MultipleChoice_Impl__Group__1 ;
    public final void rule__MultipleChoice_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1752:1: ( rule__MultipleChoice_Impl__Group__0__Impl rule__MultipleChoice_Impl__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1753:2: rule__MultipleChoice_Impl__Group__0__Impl rule__MultipleChoice_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__0__Impl_in_rule__MultipleChoice_Impl__Group__03498);
            rule__MultipleChoice_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__1_in_rule__MultipleChoice_Impl__Group__03501);
            rule__MultipleChoice_Impl__Group__1();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__0"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1760:1: rule__MultipleChoice_Impl__Group__0__Impl : ( 'Q' ) ;
    public final void rule__MultipleChoice_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1764:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1765:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1765:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1766:1: 'Q'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getQKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MultipleChoice_Impl__Group__0__Impl3529); 
             after(grammarAccess.getMultipleChoice_ImplAccess().getQKeyword_0()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__0__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1779:1: rule__MultipleChoice_Impl__Group__1 : rule__MultipleChoice_Impl__Group__1__Impl rule__MultipleChoice_Impl__Group__2 ;
    public final void rule__MultipleChoice_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1783:1: ( rule__MultipleChoice_Impl__Group__1__Impl rule__MultipleChoice_Impl__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1784:2: rule__MultipleChoice_Impl__Group__1__Impl rule__MultipleChoice_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__1__Impl_in_rule__MultipleChoice_Impl__Group__13560);
            rule__MultipleChoice_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__2_in_rule__MultipleChoice_Impl__Group__13563);
            rule__MultipleChoice_Impl__Group__2();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__1"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1791:1: rule__MultipleChoice_Impl__Group__1__Impl : ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? ) ;
    public final void rule__MultipleChoice_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1795:1: ( ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1796:1: ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1796:1: ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1797:1: ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1798:1: ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1798:2: rule__MultipleChoice_Impl__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__IsMandatoryAssignment_1_in_rule__MultipleChoice_Impl__Group__1__Impl3590);
                    rule__MultipleChoice_Impl__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1808:1: rule__MultipleChoice_Impl__Group__2 : rule__MultipleChoice_Impl__Group__2__Impl rule__MultipleChoice_Impl__Group__3 ;
    public final void rule__MultipleChoice_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1812:1: ( rule__MultipleChoice_Impl__Group__2__Impl rule__MultipleChoice_Impl__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1813:2: rule__MultipleChoice_Impl__Group__2__Impl rule__MultipleChoice_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__2__Impl_in_rule__MultipleChoice_Impl__Group__23621);
            rule__MultipleChoice_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__3_in_rule__MultipleChoice_Impl__Group__23624);
            rule__MultipleChoice_Impl__Group__3();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__2"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1820:1: rule__MultipleChoice_Impl__Group__2__Impl : ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1824:1: ( ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1825:1: ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1825:1: ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1826:1: ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1827:1: ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1827:2: rule__MultipleChoice_Impl__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__QuestionTextAssignment_2_in_rule__MultipleChoice_Impl__Group__2__Impl3651);
            rule__MultipleChoice_Impl__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextAssignment_2()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__2__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1837:1: rule__MultipleChoice_Impl__Group__3 : rule__MultipleChoice_Impl__Group__3__Impl rule__MultipleChoice_Impl__Group__4 ;
    public final void rule__MultipleChoice_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1841:1: ( rule__MultipleChoice_Impl__Group__3__Impl rule__MultipleChoice_Impl__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1842:2: rule__MultipleChoice_Impl__Group__3__Impl rule__MultipleChoice_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__3__Impl_in_rule__MultipleChoice_Impl__Group__33681);
            rule__MultipleChoice_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__4_in_rule__MultipleChoice_Impl__Group__33684);
            rule__MultipleChoice_Impl__Group__4();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__3"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1849:1: rule__MultipleChoice_Impl__Group__3__Impl : ( '[' ) ;
    public final void rule__MultipleChoice_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1853:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1854:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1854:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1855:1: '['
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getLeftSquareBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MultipleChoice_Impl__Group__3__Impl3712); 
             after(grammarAccess.getMultipleChoice_ImplAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__3__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1868:1: rule__MultipleChoice_Impl__Group__4 : rule__MultipleChoice_Impl__Group__4__Impl rule__MultipleChoice_Impl__Group__5 ;
    public final void rule__MultipleChoice_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1872:1: ( rule__MultipleChoice_Impl__Group__4__Impl rule__MultipleChoice_Impl__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1873:2: rule__MultipleChoice_Impl__Group__4__Impl rule__MultipleChoice_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__4__Impl_in_rule__MultipleChoice_Impl__Group__43743);
            rule__MultipleChoice_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__5_in_rule__MultipleChoice_Impl__Group__43746);
            rule__MultipleChoice_Impl__Group__5();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__4"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1880:1: rule__MultipleChoice_Impl__Group__4__Impl : ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1884:1: ( ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1885:1: ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1885:1: ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1886:1: ( rule__MultipleChoice_Impl__MinAssignment_4 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMinAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1887:1: ( rule__MultipleChoice_Impl__MinAssignment_4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1887:2: rule__MultipleChoice_Impl__MinAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__MinAssignment_4_in_rule__MultipleChoice_Impl__Group__4__Impl3773);
            rule__MultipleChoice_Impl__MinAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoice_ImplAccess().getMinAssignment_4()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__4__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__5"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1897:1: rule__MultipleChoice_Impl__Group__5 : rule__MultipleChoice_Impl__Group__5__Impl rule__MultipleChoice_Impl__Group__6 ;
    public final void rule__MultipleChoice_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1901:1: ( rule__MultipleChoice_Impl__Group__5__Impl rule__MultipleChoice_Impl__Group__6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1902:2: rule__MultipleChoice_Impl__Group__5__Impl rule__MultipleChoice_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__5__Impl_in_rule__MultipleChoice_Impl__Group__53803);
            rule__MultipleChoice_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__6_in_rule__MultipleChoice_Impl__Group__53806);
            rule__MultipleChoice_Impl__Group__6();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__5"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__5__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1909:1: rule__MultipleChoice_Impl__Group__5__Impl : ( '-' ) ;
    public final void rule__MultipleChoice_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1913:1: ( ( '-' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1914:1: ( '-' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1914:1: ( '-' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1915:1: '-'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getHyphenMinusKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MultipleChoice_Impl__Group__5__Impl3834); 
             after(grammarAccess.getMultipleChoice_ImplAccess().getHyphenMinusKeyword_5()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__5__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1928:1: rule__MultipleChoice_Impl__Group__6 : rule__MultipleChoice_Impl__Group__6__Impl rule__MultipleChoice_Impl__Group__7 ;
    public final void rule__MultipleChoice_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1932:1: ( rule__MultipleChoice_Impl__Group__6__Impl rule__MultipleChoice_Impl__Group__7 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1933:2: rule__MultipleChoice_Impl__Group__6__Impl rule__MultipleChoice_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__6__Impl_in_rule__MultipleChoice_Impl__Group__63865);
            rule__MultipleChoice_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__7_in_rule__MultipleChoice_Impl__Group__63868);
            rule__MultipleChoice_Impl__Group__7();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__6"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__6__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1940:1: rule__MultipleChoice_Impl__Group__6__Impl : ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1944:1: ( ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1945:1: ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1945:1: ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1946:1: ( rule__MultipleChoice_Impl__MaxAssignment_6 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMaxAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1947:1: ( rule__MultipleChoice_Impl__MaxAssignment_6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1947:2: rule__MultipleChoice_Impl__MaxAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__MaxAssignment_6_in_rule__MultipleChoice_Impl__Group__6__Impl3895);
            rule__MultipleChoice_Impl__MaxAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoice_ImplAccess().getMaxAssignment_6()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__6__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__7"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1957:1: rule__MultipleChoice_Impl__Group__7 : rule__MultipleChoice_Impl__Group__7__Impl rule__MultipleChoice_Impl__Group__8 ;
    public final void rule__MultipleChoice_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1961:1: ( rule__MultipleChoice_Impl__Group__7__Impl rule__MultipleChoice_Impl__Group__8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1962:2: rule__MultipleChoice_Impl__Group__7__Impl rule__MultipleChoice_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__7__Impl_in_rule__MultipleChoice_Impl__Group__73925);
            rule__MultipleChoice_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__8_in_rule__MultipleChoice_Impl__Group__73928);
            rule__MultipleChoice_Impl__Group__8();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__7"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__7__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1969:1: rule__MultipleChoice_Impl__Group__7__Impl : ( ']' ) ;
    public final void rule__MultipleChoice_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1973:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1974:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1974:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1975:1: ']'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getRightSquareBracketKeyword_7()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MultipleChoice_Impl__Group__7__Impl3956); 
             after(grammarAccess.getMultipleChoice_ImplAccess().getRightSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__7__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__8"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1988:1: rule__MultipleChoice_Impl__Group__8 : rule__MultipleChoice_Impl__Group__8__Impl rule__MultipleChoice_Impl__Group__9 ;
    public final void rule__MultipleChoice_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1992:1: ( rule__MultipleChoice_Impl__Group__8__Impl rule__MultipleChoice_Impl__Group__9 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1993:2: rule__MultipleChoice_Impl__Group__8__Impl rule__MultipleChoice_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__8__Impl_in_rule__MultipleChoice_Impl__Group__83987);
            rule__MultipleChoice_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__9_in_rule__MultipleChoice_Impl__Group__83990);
            rule__MultipleChoice_Impl__Group__9();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__8"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__8__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2000:1: rule__MultipleChoice_Impl__Group__8__Impl : ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2004:1: ( ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2005:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2005:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2006:1: ( rule__MultipleChoice_Impl__AnswersAssignment_8 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAssignment_8()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2007:1: ( rule__MultipleChoice_Impl__AnswersAssignment_8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2007:2: rule__MultipleChoice_Impl__AnswersAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_8_in_rule__MultipleChoice_Impl__Group__8__Impl4017);
            rule__MultipleChoice_Impl__AnswersAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAssignment_8()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__8__Impl"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__9"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2017:1: rule__MultipleChoice_Impl__Group__9 : rule__MultipleChoice_Impl__Group__9__Impl ;
    public final void rule__MultipleChoice_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2021:1: ( rule__MultipleChoice_Impl__Group__9__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2022:2: rule__MultipleChoice_Impl__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__9__Impl_in_rule__MultipleChoice_Impl__Group__94047);
            rule__MultipleChoice_Impl__Group__9__Impl();

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__9"


    // $ANTLR start "rule__MultipleChoice_Impl__Group__9__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2028:1: rule__MultipleChoice_Impl__Group__9__Impl : ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* ) ;
    public final void rule__MultipleChoice_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2032:1: ( ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2033:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2033:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2034:1: ( rule__MultipleChoice_Impl__AnswersAssignment_9 )*
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAssignment_9()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2035:1: ( rule__MultipleChoice_Impl__AnswersAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2035:2: rule__MultipleChoice_Impl__AnswersAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_9_in_rule__MultipleChoice_Impl__Group__9__Impl4074);
            	    rule__MultipleChoice_Impl__AnswersAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAssignment_9()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__Group__9__Impl"


    // $ANTLR start "rule__Ranking__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2065:1: rule__Ranking__Group__0 : rule__Ranking__Group__0__Impl rule__Ranking__Group__1 ;
    public final void rule__Ranking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2069:1: ( rule__Ranking__Group__0__Impl rule__Ranking__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2070:2: rule__Ranking__Group__0__Impl rule__Ranking__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__0__Impl_in_rule__Ranking__Group__04125);
            rule__Ranking__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__1_in_rule__Ranking__Group__04128);
            rule__Ranking__Group__1();

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
    // $ANTLR end "rule__Ranking__Group__0"


    // $ANTLR start "rule__Ranking__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2077:1: rule__Ranking__Group__0__Impl : ( 'Q' ) ;
    public final void rule__Ranking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2081:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2082:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2082:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2083:1: 'Q'
            {
             before(grammarAccess.getRankingAccess().getQKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Ranking__Group__0__Impl4156); 
             after(grammarAccess.getRankingAccess().getQKeyword_0()); 

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
    // $ANTLR end "rule__Ranking__Group__0__Impl"


    // $ANTLR start "rule__Ranking__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2096:1: rule__Ranking__Group__1 : rule__Ranking__Group__1__Impl rule__Ranking__Group__2 ;
    public final void rule__Ranking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2100:1: ( rule__Ranking__Group__1__Impl rule__Ranking__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2101:2: rule__Ranking__Group__1__Impl rule__Ranking__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__1__Impl_in_rule__Ranking__Group__14187);
            rule__Ranking__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__2_in_rule__Ranking__Group__14190);
            rule__Ranking__Group__2();

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
    // $ANTLR end "rule__Ranking__Group__1"


    // $ANTLR start "rule__Ranking__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2108:1: rule__Ranking__Group__1__Impl : ( ( rule__Ranking__IsMandatoryAssignment_1 )? ) ;
    public final void rule__Ranking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2112:1: ( ( ( rule__Ranking__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2113:1: ( ( rule__Ranking__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2113:1: ( ( rule__Ranking__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2114:1: ( rule__Ranking__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getRankingAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2115:1: ( rule__Ranking__IsMandatoryAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2115:2: rule__Ranking__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ranking__IsMandatoryAssignment_1_in_rule__Ranking__Group__1__Impl4217);
                    rule__Ranking__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRankingAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__Ranking__Group__1__Impl"


    // $ANTLR start "rule__Ranking__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2125:1: rule__Ranking__Group__2 : rule__Ranking__Group__2__Impl rule__Ranking__Group__3 ;
    public final void rule__Ranking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2129:1: ( rule__Ranking__Group__2__Impl rule__Ranking__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2130:2: rule__Ranking__Group__2__Impl rule__Ranking__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__2__Impl_in_rule__Ranking__Group__24248);
            rule__Ranking__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__3_in_rule__Ranking__Group__24251);
            rule__Ranking__Group__3();

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
    // $ANTLR end "rule__Ranking__Group__2"


    // $ANTLR start "rule__Ranking__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2137:1: rule__Ranking__Group__2__Impl : ( ( rule__Ranking__QuestionTextAssignment_2 ) ) ;
    public final void rule__Ranking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2141:1: ( ( ( rule__Ranking__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2142:1: ( ( rule__Ranking__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2142:1: ( ( rule__Ranking__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2143:1: ( rule__Ranking__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getRankingAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2144:1: ( rule__Ranking__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2144:2: rule__Ranking__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__QuestionTextAssignment_2_in_rule__Ranking__Group__2__Impl4278);
            rule__Ranking__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getQuestionTextAssignment_2()); 

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
    // $ANTLR end "rule__Ranking__Group__2__Impl"


    // $ANTLR start "rule__Ranking__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2154:1: rule__Ranking__Group__3 : rule__Ranking__Group__3__Impl rule__Ranking__Group__4 ;
    public final void rule__Ranking__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2158:1: ( rule__Ranking__Group__3__Impl rule__Ranking__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2159:2: rule__Ranking__Group__3__Impl rule__Ranking__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__3__Impl_in_rule__Ranking__Group__34308);
            rule__Ranking__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__4_in_rule__Ranking__Group__34311);
            rule__Ranking__Group__4();

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
    // $ANTLR end "rule__Ranking__Group__3"


    // $ANTLR start "rule__Ranking__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2166:1: rule__Ranking__Group__3__Impl : ( '[' ) ;
    public final void rule__Ranking__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2170:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2171:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2171:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2172:1: '['
            {
             before(grammarAccess.getRankingAccess().getLeftSquareBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Ranking__Group__3__Impl4339); 
             after(grammarAccess.getRankingAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Ranking__Group__3__Impl"


    // $ANTLR start "rule__Ranking__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2185:1: rule__Ranking__Group__4 : rule__Ranking__Group__4__Impl rule__Ranking__Group__5 ;
    public final void rule__Ranking__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2189:1: ( rule__Ranking__Group__4__Impl rule__Ranking__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2190:2: rule__Ranking__Group__4__Impl rule__Ranking__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__4__Impl_in_rule__Ranking__Group__44370);
            rule__Ranking__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__5_in_rule__Ranking__Group__44373);
            rule__Ranking__Group__5();

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
    // $ANTLR end "rule__Ranking__Group__4"


    // $ANTLR start "rule__Ranking__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2197:1: rule__Ranking__Group__4__Impl : ( 'rank' ) ;
    public final void rule__Ranking__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2201:1: ( ( 'rank' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2202:1: ( 'rank' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2202:1: ( 'rank' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2203:1: 'rank'
            {
             before(grammarAccess.getRankingAccess().getRankKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Ranking__Group__4__Impl4401); 
             after(grammarAccess.getRankingAccess().getRankKeyword_4()); 

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
    // $ANTLR end "rule__Ranking__Group__4__Impl"


    // $ANTLR start "rule__Ranking__Group__5"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2216:1: rule__Ranking__Group__5 : rule__Ranking__Group__5__Impl rule__Ranking__Group__6 ;
    public final void rule__Ranking__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2220:1: ( rule__Ranking__Group__5__Impl rule__Ranking__Group__6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2221:2: rule__Ranking__Group__5__Impl rule__Ranking__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__5__Impl_in_rule__Ranking__Group__54432);
            rule__Ranking__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__6_in_rule__Ranking__Group__54435);
            rule__Ranking__Group__6();

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
    // $ANTLR end "rule__Ranking__Group__5"


    // $ANTLR start "rule__Ranking__Group__5__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2228:1: rule__Ranking__Group__5__Impl : ( ']' ) ;
    public final void rule__Ranking__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2232:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2233:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2233:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2234:1: ']'
            {
             before(grammarAccess.getRankingAccess().getRightSquareBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Ranking__Group__5__Impl4463); 
             after(grammarAccess.getRankingAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Ranking__Group__5__Impl"


    // $ANTLR start "rule__Ranking__Group__6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2247:1: rule__Ranking__Group__6 : rule__Ranking__Group__6__Impl rule__Ranking__Group__7 ;
    public final void rule__Ranking__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2251:1: ( rule__Ranking__Group__6__Impl rule__Ranking__Group__7 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2252:2: rule__Ranking__Group__6__Impl rule__Ranking__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__6__Impl_in_rule__Ranking__Group__64494);
            rule__Ranking__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__7_in_rule__Ranking__Group__64497);
            rule__Ranking__Group__7();

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
    // $ANTLR end "rule__Ranking__Group__6"


    // $ANTLR start "rule__Ranking__Group__6__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2259:1: rule__Ranking__Group__6__Impl : ( ( rule__Ranking__AnswersAssignment_6 ) ) ;
    public final void rule__Ranking__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2263:1: ( ( ( rule__Ranking__AnswersAssignment_6 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2264:1: ( ( rule__Ranking__AnswersAssignment_6 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2264:1: ( ( rule__Ranking__AnswersAssignment_6 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2265:1: ( rule__Ranking__AnswersAssignment_6 )
            {
             before(grammarAccess.getRankingAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2266:1: ( rule__Ranking__AnswersAssignment_6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2266:2: rule__Ranking__AnswersAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__AnswersAssignment_6_in_rule__Ranking__Group__6__Impl4524);
            rule__Ranking__AnswersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRankingAccess().getAnswersAssignment_6()); 

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
    // $ANTLR end "rule__Ranking__Group__6__Impl"


    // $ANTLR start "rule__Ranking__Group__7"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2276:1: rule__Ranking__Group__7 : rule__Ranking__Group__7__Impl ;
    public final void rule__Ranking__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2280:1: ( rule__Ranking__Group__7__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2281:2: rule__Ranking__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__7__Impl_in_rule__Ranking__Group__74554);
            rule__Ranking__Group__7__Impl();

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
    // $ANTLR end "rule__Ranking__Group__7"


    // $ANTLR start "rule__Ranking__Group__7__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2287:1: rule__Ranking__Group__7__Impl : ( ( rule__Ranking__AnswersAssignment_7 )* ) ;
    public final void rule__Ranking__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2291:1: ( ( ( rule__Ranking__AnswersAssignment_7 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2292:1: ( ( rule__Ranking__AnswersAssignment_7 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2292:1: ( ( rule__Ranking__AnswersAssignment_7 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2293:1: ( rule__Ranking__AnswersAssignment_7 )*
            {
             before(grammarAccess.getRankingAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2294:1: ( rule__Ranking__AnswersAssignment_7 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2294:2: rule__Ranking__AnswersAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ranking__AnswersAssignment_7_in_rule__Ranking__Group__7__Impl4581);
            	    rule__Ranking__AnswersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRankingAccess().getAnswersAssignment_7()); 

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
    // $ANTLR end "rule__Ranking__Group__7__Impl"


    // $ANTLR start "rule__Rating__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2320:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2324:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2325:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__04628);
            rule__Rating__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__04631);
            rule__Rating__Group__1();

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
    // $ANTLR end "rule__Rating__Group__0"


    // $ANTLR start "rule__Rating__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2332:1: rule__Rating__Group__0__Impl : ( 'Q' ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2336:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2337:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2337:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2338:1: 'Q'
            {
             before(grammarAccess.getRatingAccess().getQKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Rating__Group__0__Impl4659); 
             after(grammarAccess.getRatingAccess().getQKeyword_0()); 

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
    // $ANTLR end "rule__Rating__Group__0__Impl"


    // $ANTLR start "rule__Rating__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2351:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2355:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2356:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__14690);
            rule__Rating__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__14693);
            rule__Rating__Group__2();

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
    // $ANTLR end "rule__Rating__Group__1"


    // $ANTLR start "rule__Rating__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2363:1: rule__Rating__Group__1__Impl : ( ( rule__Rating__IsMandatoryAssignment_1 )? ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2367:1: ( ( ( rule__Rating__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2368:1: ( ( rule__Rating__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2368:1: ( ( rule__Rating__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2369:1: ( rule__Rating__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getRatingAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2370:1: ( rule__Rating__IsMandatoryAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2370:2: rule__Rating__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating__IsMandatoryAssignment_1_in_rule__Rating__Group__1__Impl4720);
                    rule__Rating__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRatingAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__Rating__Group__1__Impl"


    // $ANTLR start "rule__Rating__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2380:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2384:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2385:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__24751);
            rule__Rating__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__24754);
            rule__Rating__Group__3();

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
    // $ANTLR end "rule__Rating__Group__2"


    // $ANTLR start "rule__Rating__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2392:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__QuestionTextAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2396:1: ( ( ( rule__Rating__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2397:1: ( ( rule__Rating__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2397:1: ( ( rule__Rating__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2398:1: ( rule__Rating__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2399:1: ( rule__Rating__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2399:2: rule__Rating__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__QuestionTextAssignment_2_in_rule__Rating__Group__2__Impl4781);
            rule__Rating__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getQuestionTextAssignment_2()); 

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
    // $ANTLR end "rule__Rating__Group__2__Impl"


    // $ANTLR start "rule__Rating__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2409:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2413:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2414:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__34811);
            rule__Rating__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__4_in_rule__Rating__Group__34814);
            rule__Rating__Group__4();

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
    // $ANTLR end "rule__Rating__Group__3"


    // $ANTLR start "rule__Rating__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2421:1: rule__Rating__Group__3__Impl : ( '[' ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2425:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2426:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2426:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2427:1: '['
            {
             before(grammarAccess.getRatingAccess().getLeftSquareBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Rating__Group__3__Impl4842); 
             after(grammarAccess.getRatingAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Rating__Group__3__Impl"


    // $ANTLR start "rule__Rating__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2440:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl rule__Rating__Group__5 ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2444:1: ( rule__Rating__Group__4__Impl rule__Rating__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2445:2: rule__Rating__Group__4__Impl rule__Rating__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__4__Impl_in_rule__Rating__Group__44873);
            rule__Rating__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__5_in_rule__Rating__Group__44876);
            rule__Rating__Group__5();

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
    // $ANTLR end "rule__Rating__Group__4"


    // $ANTLR start "rule__Rating__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2452:1: rule__Rating__Group__4__Impl : ( ( rule__Rating__StartAssignment_4 ) ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2456:1: ( ( ( rule__Rating__StartAssignment_4 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2457:1: ( ( rule__Rating__StartAssignment_4 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2457:1: ( ( rule__Rating__StartAssignment_4 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2458:1: ( rule__Rating__StartAssignment_4 )
            {
             before(grammarAccess.getRatingAccess().getStartAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2459:1: ( rule__Rating__StartAssignment_4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2459:2: rule__Rating__StartAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__StartAssignment_4_in_rule__Rating__Group__4__Impl4903);
            rule__Rating__StartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getStartAssignment_4()); 

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
    // $ANTLR end "rule__Rating__Group__4__Impl"


    // $ANTLR start "rule__Rating__Group__5"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2469:1: rule__Rating__Group__5 : rule__Rating__Group__5__Impl rule__Rating__Group__6 ;
    public final void rule__Rating__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2473:1: ( rule__Rating__Group__5__Impl rule__Rating__Group__6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2474:2: rule__Rating__Group__5__Impl rule__Rating__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__5__Impl_in_rule__Rating__Group__54933);
            rule__Rating__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__6_in_rule__Rating__Group__54936);
            rule__Rating__Group__6();

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
    // $ANTLR end "rule__Rating__Group__5"


    // $ANTLR start "rule__Rating__Group__5__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2481:1: rule__Rating__Group__5__Impl : ( '-' ) ;
    public final void rule__Rating__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2485:1: ( ( '-' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2486:1: ( '-' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2486:1: ( '-' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2487:1: '-'
            {
             before(grammarAccess.getRatingAccess().getHyphenMinusKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Rating__Group__5__Impl4964); 
             after(grammarAccess.getRatingAccess().getHyphenMinusKeyword_5()); 

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
    // $ANTLR end "rule__Rating__Group__5__Impl"


    // $ANTLR start "rule__Rating__Group__6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2500:1: rule__Rating__Group__6 : rule__Rating__Group__6__Impl rule__Rating__Group__7 ;
    public final void rule__Rating__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2504:1: ( rule__Rating__Group__6__Impl rule__Rating__Group__7 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2505:2: rule__Rating__Group__6__Impl rule__Rating__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__6__Impl_in_rule__Rating__Group__64995);
            rule__Rating__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__7_in_rule__Rating__Group__64998);
            rule__Rating__Group__7();

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
    // $ANTLR end "rule__Rating__Group__6"


    // $ANTLR start "rule__Rating__Group__6__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2512:1: rule__Rating__Group__6__Impl : ( ( rule__Rating__EndAssignment_6 ) ) ;
    public final void rule__Rating__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2516:1: ( ( ( rule__Rating__EndAssignment_6 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2517:1: ( ( rule__Rating__EndAssignment_6 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2517:1: ( ( rule__Rating__EndAssignment_6 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2518:1: ( rule__Rating__EndAssignment_6 )
            {
             before(grammarAccess.getRatingAccess().getEndAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2519:1: ( rule__Rating__EndAssignment_6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2519:2: rule__Rating__EndAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__EndAssignment_6_in_rule__Rating__Group__6__Impl5025);
            rule__Rating__EndAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getEndAssignment_6()); 

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
    // $ANTLR end "rule__Rating__Group__6__Impl"


    // $ANTLR start "rule__Rating__Group__7"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2529:1: rule__Rating__Group__7 : rule__Rating__Group__7__Impl rule__Rating__Group__8 ;
    public final void rule__Rating__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2533:1: ( rule__Rating__Group__7__Impl rule__Rating__Group__8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2534:2: rule__Rating__Group__7__Impl rule__Rating__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__7__Impl_in_rule__Rating__Group__75055);
            rule__Rating__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__8_in_rule__Rating__Group__75058);
            rule__Rating__Group__8();

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
    // $ANTLR end "rule__Rating__Group__7"


    // $ANTLR start "rule__Rating__Group__7__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2541:1: rule__Rating__Group__7__Impl : ( ',' ) ;
    public final void rule__Rating__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2545:1: ( ( ',' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2546:1: ( ',' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2546:1: ( ',' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2547:1: ','
            {
             before(grammarAccess.getRatingAccess().getCommaKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Rating__Group__7__Impl5086); 
             after(grammarAccess.getRatingAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__Rating__Group__7__Impl"


    // $ANTLR start "rule__Rating__Group__8"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2560:1: rule__Rating__Group__8 : rule__Rating__Group__8__Impl rule__Rating__Group__9 ;
    public final void rule__Rating__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2564:1: ( rule__Rating__Group__8__Impl rule__Rating__Group__9 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2565:2: rule__Rating__Group__8__Impl rule__Rating__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__8__Impl_in_rule__Rating__Group__85117);
            rule__Rating__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__9_in_rule__Rating__Group__85120);
            rule__Rating__Group__9();

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
    // $ANTLR end "rule__Rating__Group__8"


    // $ANTLR start "rule__Rating__Group__8__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2572:1: rule__Rating__Group__8__Impl : ( ( rule__Rating__IntervalAssignment_8 ) ) ;
    public final void rule__Rating__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2576:1: ( ( ( rule__Rating__IntervalAssignment_8 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2577:1: ( ( rule__Rating__IntervalAssignment_8 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2577:1: ( ( rule__Rating__IntervalAssignment_8 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2578:1: ( rule__Rating__IntervalAssignment_8 )
            {
             before(grammarAccess.getRatingAccess().getIntervalAssignment_8()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2579:1: ( rule__Rating__IntervalAssignment_8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2579:2: rule__Rating__IntervalAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__IntervalAssignment_8_in_rule__Rating__Group__8__Impl5147);
            rule__Rating__IntervalAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRatingAccess().getIntervalAssignment_8()); 

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
    // $ANTLR end "rule__Rating__Group__8__Impl"


    // $ANTLR start "rule__Rating__Group__9"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2589:1: rule__Rating__Group__9 : rule__Rating__Group__9__Impl ;
    public final void rule__Rating__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2593:1: ( rule__Rating__Group__9__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2594:2: rule__Rating__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__9__Impl_in_rule__Rating__Group__95177);
            rule__Rating__Group__9__Impl();

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
    // $ANTLR end "rule__Rating__Group__9"


    // $ANTLR start "rule__Rating__Group__9__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2600:1: rule__Rating__Group__9__Impl : ( ']' ) ;
    public final void rule__Rating__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2604:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2605:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2605:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2606:1: ']'
            {
             before(grammarAccess.getRatingAccess().getRightSquareBracketKeyword_9()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Rating__Group__9__Impl5205); 
             after(grammarAccess.getRatingAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__Rating__Group__9__Impl"


    // $ANTLR start "rule__YesNo__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2639:1: rule__YesNo__Group__0 : rule__YesNo__Group__0__Impl rule__YesNo__Group__1 ;
    public final void rule__YesNo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2643:1: ( rule__YesNo__Group__0__Impl rule__YesNo__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2644:2: rule__YesNo__Group__0__Impl rule__YesNo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__0__Impl_in_rule__YesNo__Group__05256);
            rule__YesNo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__1_in_rule__YesNo__Group__05259);
            rule__YesNo__Group__1();

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
    // $ANTLR end "rule__YesNo__Group__0"


    // $ANTLR start "rule__YesNo__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2651:1: rule__YesNo__Group__0__Impl : ( 'Q' ) ;
    public final void rule__YesNo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2655:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2656:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2656:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2657:1: 'Q'
            {
             before(grammarAccess.getYesNoAccess().getQKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__YesNo__Group__0__Impl5287); 
             after(grammarAccess.getYesNoAccess().getQKeyword_0()); 

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
    // $ANTLR end "rule__YesNo__Group__0__Impl"


    // $ANTLR start "rule__YesNo__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2670:1: rule__YesNo__Group__1 : rule__YesNo__Group__1__Impl rule__YesNo__Group__2 ;
    public final void rule__YesNo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2674:1: ( rule__YesNo__Group__1__Impl rule__YesNo__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2675:2: rule__YesNo__Group__1__Impl rule__YesNo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__1__Impl_in_rule__YesNo__Group__15318);
            rule__YesNo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__2_in_rule__YesNo__Group__15321);
            rule__YesNo__Group__2();

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
    // $ANTLR end "rule__YesNo__Group__1"


    // $ANTLR start "rule__YesNo__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2682:1: rule__YesNo__Group__1__Impl : ( ( rule__YesNo__IsMandatoryAssignment_1 )? ) ;
    public final void rule__YesNo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2686:1: ( ( ( rule__YesNo__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2687:1: ( ( rule__YesNo__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2687:1: ( ( rule__YesNo__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2688:1: ( rule__YesNo__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getYesNoAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2689:1: ( rule__YesNo__IsMandatoryAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2689:2: rule__YesNo__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__YesNo__IsMandatoryAssignment_1_in_rule__YesNo__Group__1__Impl5348);
                    rule__YesNo__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getYesNoAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__YesNo__Group__1__Impl"


    // $ANTLR start "rule__YesNo__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2699:1: rule__YesNo__Group__2 : rule__YesNo__Group__2__Impl rule__YesNo__Group__3 ;
    public final void rule__YesNo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2703:1: ( rule__YesNo__Group__2__Impl rule__YesNo__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2704:2: rule__YesNo__Group__2__Impl rule__YesNo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__2__Impl_in_rule__YesNo__Group__25379);
            rule__YesNo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__3_in_rule__YesNo__Group__25382);
            rule__YesNo__Group__3();

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
    // $ANTLR end "rule__YesNo__Group__2"


    // $ANTLR start "rule__YesNo__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2711:1: rule__YesNo__Group__2__Impl : ( ( rule__YesNo__QuestionTextAssignment_2 ) ) ;
    public final void rule__YesNo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2715:1: ( ( ( rule__YesNo__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2716:1: ( ( rule__YesNo__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2716:1: ( ( rule__YesNo__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2717:1: ( rule__YesNo__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getYesNoAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2718:1: ( rule__YesNo__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2718:2: rule__YesNo__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__QuestionTextAssignment_2_in_rule__YesNo__Group__2__Impl5409);
            rule__YesNo__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getYesNoAccess().getQuestionTextAssignment_2()); 

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
    // $ANTLR end "rule__YesNo__Group__2__Impl"


    // $ANTLR start "rule__YesNo__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2728:1: rule__YesNo__Group__3 : rule__YesNo__Group__3__Impl rule__YesNo__Group__4 ;
    public final void rule__YesNo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2732:1: ( rule__YesNo__Group__3__Impl rule__YesNo__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2733:2: rule__YesNo__Group__3__Impl rule__YesNo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__3__Impl_in_rule__YesNo__Group__35439);
            rule__YesNo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__4_in_rule__YesNo__Group__35442);
            rule__YesNo__Group__4();

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
    // $ANTLR end "rule__YesNo__Group__3"


    // $ANTLR start "rule__YesNo__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2740:1: rule__YesNo__Group__3__Impl : ( '[' ) ;
    public final void rule__YesNo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2744:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2745:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2745:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2746:1: '['
            {
             before(grammarAccess.getYesNoAccess().getLeftSquareBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__YesNo__Group__3__Impl5470); 
             after(grammarAccess.getYesNoAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__YesNo__Group__3__Impl"


    // $ANTLR start "rule__YesNo__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2759:1: rule__YesNo__Group__4 : rule__YesNo__Group__4__Impl rule__YesNo__Group__5 ;
    public final void rule__YesNo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2763:1: ( rule__YesNo__Group__4__Impl rule__YesNo__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2764:2: rule__YesNo__Group__4__Impl rule__YesNo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__4__Impl_in_rule__YesNo__Group__45501);
            rule__YesNo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__5_in_rule__YesNo__Group__45504);
            rule__YesNo__Group__5();

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
    // $ANTLR end "rule__YesNo__Group__4"


    // $ANTLR start "rule__YesNo__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2771:1: rule__YesNo__Group__4__Impl : ( 'y/n' ) ;
    public final void rule__YesNo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2775:1: ( ( 'y/n' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2776:1: ( 'y/n' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2776:1: ( 'y/n' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2777:1: 'y/n'
            {
             before(grammarAccess.getYesNoAccess().getYNKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__YesNo__Group__4__Impl5532); 
             after(grammarAccess.getYesNoAccess().getYNKeyword_4()); 

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
    // $ANTLR end "rule__YesNo__Group__4__Impl"


    // $ANTLR start "rule__YesNo__Group__5"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2790:1: rule__YesNo__Group__5 : rule__YesNo__Group__5__Impl ;
    public final void rule__YesNo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2794:1: ( rule__YesNo__Group__5__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2795:2: rule__YesNo__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__5__Impl_in_rule__YesNo__Group__55563);
            rule__YesNo__Group__5__Impl();

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
    // $ANTLR end "rule__YesNo__Group__5"


    // $ANTLR start "rule__YesNo__Group__5__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2801:1: rule__YesNo__Group__5__Impl : ( ']' ) ;
    public final void rule__YesNo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2805:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2806:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2806:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2807:1: ']'
            {
             before(grammarAccess.getYesNoAccess().getRightSquareBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__YesNo__Group__5__Impl5591); 
             after(grammarAccess.getYesNoAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__YesNo__Group__5__Impl"


    // $ANTLR start "rule__OpenField__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2832:1: rule__OpenField__Group__0 : rule__OpenField__Group__0__Impl rule__OpenField__Group__1 ;
    public final void rule__OpenField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2836:1: ( rule__OpenField__Group__0__Impl rule__OpenField__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2837:2: rule__OpenField__Group__0__Impl rule__OpenField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__0__Impl_in_rule__OpenField__Group__05634);
            rule__OpenField__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__1_in_rule__OpenField__Group__05637);
            rule__OpenField__Group__1();

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
    // $ANTLR end "rule__OpenField__Group__0"


    // $ANTLR start "rule__OpenField__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2844:1: rule__OpenField__Group__0__Impl : ( 'Q' ) ;
    public final void rule__OpenField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2848:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2849:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2849:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2850:1: 'Q'
            {
             before(grammarAccess.getOpenFieldAccess().getQKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__OpenField__Group__0__Impl5665); 
             after(grammarAccess.getOpenFieldAccess().getQKeyword_0()); 

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
    // $ANTLR end "rule__OpenField__Group__0__Impl"


    // $ANTLR start "rule__OpenField__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2863:1: rule__OpenField__Group__1 : rule__OpenField__Group__1__Impl rule__OpenField__Group__2 ;
    public final void rule__OpenField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2867:1: ( rule__OpenField__Group__1__Impl rule__OpenField__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2868:2: rule__OpenField__Group__1__Impl rule__OpenField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__1__Impl_in_rule__OpenField__Group__15696);
            rule__OpenField__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__2_in_rule__OpenField__Group__15699);
            rule__OpenField__Group__2();

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
    // $ANTLR end "rule__OpenField__Group__1"


    // $ANTLR start "rule__OpenField__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2875:1: rule__OpenField__Group__1__Impl : ( ( rule__OpenField__IsMandatoryAssignment_1 )? ) ;
    public final void rule__OpenField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2879:1: ( ( ( rule__OpenField__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2880:1: ( ( rule__OpenField__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2880:1: ( ( rule__OpenField__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2881:1: ( rule__OpenField__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getOpenFieldAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2882:1: ( rule__OpenField__IsMandatoryAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2882:2: rule__OpenField__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OpenField__IsMandatoryAssignment_1_in_rule__OpenField__Group__1__Impl5726);
                    rule__OpenField__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpenFieldAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__OpenField__Group__1__Impl"


    // $ANTLR start "rule__OpenField__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2892:1: rule__OpenField__Group__2 : rule__OpenField__Group__2__Impl ;
    public final void rule__OpenField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2896:1: ( rule__OpenField__Group__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2897:2: rule__OpenField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__2__Impl_in_rule__OpenField__Group__25757);
            rule__OpenField__Group__2__Impl();

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
    // $ANTLR end "rule__OpenField__Group__2"


    // $ANTLR start "rule__OpenField__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2903:1: rule__OpenField__Group__2__Impl : ( ( rule__OpenField__QuestionTextAssignment_2 ) ) ;
    public final void rule__OpenField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2907:1: ( ( ( rule__OpenField__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2908:1: ( ( rule__OpenField__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2908:1: ( ( rule__OpenField__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2909:1: ( rule__OpenField__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getOpenFieldAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2910:1: ( rule__OpenField__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2910:2: rule__OpenField__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__QuestionTextAssignment_2_in_rule__OpenField__Group__2__Impl5784);
            rule__OpenField__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOpenFieldAccess().getQuestionTextAssignment_2()); 

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
    // $ANTLR end "rule__OpenField__Group__2__Impl"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2926:1: rule__MutuallyExclusive_Impl__Group__0 : rule__MutuallyExclusive_Impl__Group__0__Impl rule__MutuallyExclusive_Impl__Group__1 ;
    public final void rule__MutuallyExclusive_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2930:1: ( rule__MutuallyExclusive_Impl__Group__0__Impl rule__MutuallyExclusive_Impl__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2931:2: rule__MutuallyExclusive_Impl__Group__0__Impl rule__MutuallyExclusive_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__0__Impl_in_rule__MutuallyExclusive_Impl__Group__05820);
            rule__MutuallyExclusive_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__1_in_rule__MutuallyExclusive_Impl__Group__05823);
            rule__MutuallyExclusive_Impl__Group__1();

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__0"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2938:1: rule__MutuallyExclusive_Impl__Group__0__Impl : ( 'Q' ) ;
    public final void rule__MutuallyExclusive_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2942:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2943:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2943:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2944:1: 'Q'
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getQKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MutuallyExclusive_Impl__Group__0__Impl5851); 
             after(grammarAccess.getMutuallyExclusive_ImplAccess().getQKeyword_0()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__0__Impl"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2957:1: rule__MutuallyExclusive_Impl__Group__1 : rule__MutuallyExclusive_Impl__Group__1__Impl rule__MutuallyExclusive_Impl__Group__2 ;
    public final void rule__MutuallyExclusive_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2961:1: ( rule__MutuallyExclusive_Impl__Group__1__Impl rule__MutuallyExclusive_Impl__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2962:2: rule__MutuallyExclusive_Impl__Group__1__Impl rule__MutuallyExclusive_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__1__Impl_in_rule__MutuallyExclusive_Impl__Group__15882);
            rule__MutuallyExclusive_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__2_in_rule__MutuallyExclusive_Impl__Group__15885);
            rule__MutuallyExclusive_Impl__Group__2();

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__1"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2969:1: rule__MutuallyExclusive_Impl__Group__1__Impl : ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? ) ;
    public final void rule__MutuallyExclusive_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2973:1: ( ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2974:1: ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2974:1: ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2975:1: ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2976:1: ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2976:2: rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1_in_rule__MutuallyExclusive_Impl__Group__1__Impl5912);
                    rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__1__Impl"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2986:1: rule__MutuallyExclusive_Impl__Group__2 : rule__MutuallyExclusive_Impl__Group__2__Impl rule__MutuallyExclusive_Impl__Group__3 ;
    public final void rule__MutuallyExclusive_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2990:1: ( rule__MutuallyExclusive_Impl__Group__2__Impl rule__MutuallyExclusive_Impl__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2991:2: rule__MutuallyExclusive_Impl__Group__2__Impl rule__MutuallyExclusive_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__2__Impl_in_rule__MutuallyExclusive_Impl__Group__25943);
            rule__MutuallyExclusive_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__3_in_rule__MutuallyExclusive_Impl__Group__25946);
            rule__MutuallyExclusive_Impl__Group__3();

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__2"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__2__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2998:1: rule__MutuallyExclusive_Impl__Group__2__Impl : ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) ) ;
    public final void rule__MutuallyExclusive_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3002:1: ( ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3003:1: ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3003:1: ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3004:1: ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3005:1: ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3005:2: rule__MutuallyExclusive_Impl__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__QuestionTextAssignment_2_in_rule__MutuallyExclusive_Impl__Group__2__Impl5973);
            rule__MutuallyExclusive_Impl__QuestionTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextAssignment_2()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__2__Impl"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3015:1: rule__MutuallyExclusive_Impl__Group__3 : rule__MutuallyExclusive_Impl__Group__3__Impl rule__MutuallyExclusive_Impl__Group__4 ;
    public final void rule__MutuallyExclusive_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3019:1: ( rule__MutuallyExclusive_Impl__Group__3__Impl rule__MutuallyExclusive_Impl__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3020:2: rule__MutuallyExclusive_Impl__Group__3__Impl rule__MutuallyExclusive_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__3__Impl_in_rule__MutuallyExclusive_Impl__Group__36003);
            rule__MutuallyExclusive_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__4_in_rule__MutuallyExclusive_Impl__Group__36006);
            rule__MutuallyExclusive_Impl__Group__4();

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__3"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__3__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3027:1: rule__MutuallyExclusive_Impl__Group__3__Impl : ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) ) ;
    public final void rule__MutuallyExclusive_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3031:1: ( ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3032:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3032:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3033:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 )
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAssignment_3()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3034:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3034:2: rule__MutuallyExclusive_Impl__AnswersAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_3_in_rule__MutuallyExclusive_Impl__Group__3__Impl6033);
            rule__MutuallyExclusive_Impl__AnswersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAssignment_3()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__3__Impl"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3044:1: rule__MutuallyExclusive_Impl__Group__4 : rule__MutuallyExclusive_Impl__Group__4__Impl ;
    public final void rule__MutuallyExclusive_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3048:1: ( rule__MutuallyExclusive_Impl__Group__4__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3049:2: rule__MutuallyExclusive_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__4__Impl_in_rule__MutuallyExclusive_Impl__Group__46063);
            rule__MutuallyExclusive_Impl__Group__4__Impl();

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__4"


    // $ANTLR start "rule__MutuallyExclusive_Impl__Group__4__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3055:1: rule__MutuallyExclusive_Impl__Group__4__Impl : ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* ) ;
    public final void rule__MutuallyExclusive_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3059:1: ( ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3060:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3060:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3061:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )*
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3062:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3062:2: rule__MutuallyExclusive_Impl__AnswersAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_4_in_rule__MutuallyExclusive_Impl__Group__4__Impl6090);
            	    rule__MutuallyExclusive_Impl__AnswersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAssignment_4()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__Group__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3082:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3086:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3087:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06131);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06134);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3094:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3098:1: ( ( ( '-' )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3099:1: ( ( '-' )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3099:1: ( ( '-' )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3100:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3101:1: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3102:2: '-'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__EInt__Group__0__Impl6163); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3113:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3117:1: ( rule__EInt__Group__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3118:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16196);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3124:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3128:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3129:1: ( RULE_INT )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3129:1: ( RULE_INT )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3130:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6223); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Survey__TitleAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3146:1: rule__Survey__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3150:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3151:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3151:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3152:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16261);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Survey__TitleAssignment_1"


    // $ANTLR start "rule__Survey__DateAssignment_2_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3161:1: rule__Survey__DateAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Survey__DateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3165:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3166:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3166:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3167:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getDateEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__DateAssignment_2_16292);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getDateEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Survey__DateAssignment_2_1"


    // $ANTLR start "rule__Survey__DescriptionAssignment_3_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3176:1: rule__Survey__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Survey__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3180:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3181:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3181:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3182:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__DescriptionAssignment_3_16323);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Survey__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Survey__PersonAssignment_4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3191:1: rule__Survey__PersonAssignment_4 : ( rulePerson ) ;
    public final void rule__Survey__PersonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3195:1: ( ( rulePerson ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3196:1: ( rulePerson )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3196:1: ( rulePerson )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3197:1: rulePerson
            {
             before(grammarAccess.getSurveyAccess().getPersonPersonParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_rule__Survey__PersonAssignment_46354);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPersonPersonParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Survey__PersonAssignment_4"


    // $ANTLR start "rule__Survey__CategoriesAssignment_5"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3206:1: rule__Survey__CategoriesAssignment_5 : ( ruleCategory ) ;
    public final void rule__Survey__CategoriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3210:1: ( ( ruleCategory ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3211:1: ( ruleCategory )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3211:1: ( ruleCategory )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3212:1: ruleCategory
            {
             before(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_56385);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Survey__CategoriesAssignment_5"


    // $ANTLR start "rule__Survey__CategoriesAssignment_6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3221:1: rule__Survey__CategoriesAssignment_6 : ( ruleCategory ) ;
    public final void rule__Survey__CategoriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3225:1: ( ( ruleCategory ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3226:1: ( ruleCategory )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3226:1: ( ruleCategory )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3227:1: ruleCategory
            {
             before(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_66416);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Survey__CategoriesAssignment_6"


    // $ANTLR start "rule__Category__TitleAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3236:1: rule__Category__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Category__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3240:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3241:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3241:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3242:1: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Category__TitleAssignment_16447);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getTitleEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Category__TitleAssignment_1"


    // $ANTLR start "rule__Category__DescriptionAssignment_2_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3251:1: rule__Category__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Category__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3255:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3256:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3256:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3257:1: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Category__DescriptionAssignment_2_16478);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Category__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Category__PagesAssignment_3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3266:1: rule__Category__PagesAssignment_3 : ( rulePage ) ;
    public final void rule__Category__PagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3270:1: ( ( rulePage ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3271:1: ( rulePage )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3271:1: ( rulePage )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3272:1: rulePage
            {
             before(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Category__PagesAssignment_36509);
            rulePage();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Category__PagesAssignment_3"


    // $ANTLR start "rule__Category__PagesAssignment_4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3281:1: rule__Category__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Category__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3285:1: ( ( rulePage ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3286:1: ( rulePage )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3286:1: ( rulePage )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3287:1: rulePage
            {
             before(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Category__PagesAssignment_46540);
            rulePage();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Category__PagesAssignment_4"


    // $ANTLR start "rule__Person__AttributeAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3296:1: rule__Person__AttributeAssignment_1 : ( rulePersonAttribute ) ;
    public final void rule__Person__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3300:1: ( ( rulePersonAttribute ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3301:1: ( rulePersonAttribute )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3301:1: ( rulePersonAttribute )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3302:1: rulePersonAttribute
            {
             before(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_16571);
            rulePersonAttribute();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Person__AttributeAssignment_1"


    // $ANTLR start "rule__Person__AttributeAssignment_2_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3311:1: rule__Person__AttributeAssignment_2_1 : ( rulePersonAttribute ) ;
    public final void rule__Person__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3315:1: ( ( rulePersonAttribute ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3316:1: ( rulePersonAttribute )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3316:1: ( rulePersonAttribute )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3317:1: rulePersonAttribute
            {
             before(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_2_16602);
            rulePersonAttribute();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Person__AttributeAssignment_2_1"


    // $ANTLR start "rule__Page__QuestionsAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3326:1: rule__Page__QuestionsAssignment_1 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3330:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3331:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3331:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3332:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_16633);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Page__QuestionsAssignment_1"


    // $ANTLR start "rule__Page__QuestionsAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3341:1: rule__Page__QuestionsAssignment_2 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3345:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3346:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3346:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3347:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_26664);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Page__QuestionsAssignment_2"


    // $ANTLR start "rule__Answer__DescriptionAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3356:1: rule__Answer__DescriptionAssignment_2 : ( ruleEString ) ;
    public final void rule__Answer__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3360:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3361:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3361:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3362:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getDescriptionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__DescriptionAssignment_26695);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getDescriptionEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Answer__DescriptionAssignment_2"


    // $ANTLR start "rule__Answer__IsUserInputAllowedAssignment_3_0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3371:1: rule__Answer__IsUserInputAllowedAssignment_3_0 : ( ( '[' ) ) ;
    public final void rule__Answer__IsUserInputAllowedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3375:1: ( ( ( '[' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3376:1: ( ( '[' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3376:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3377:1: ( '[' )
            {
             before(grammarAccess.getAnswerAccess().getIsUserInputAllowedLeftSquareBracketKeyword_3_0_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3378:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3379:1: '['
            {
             before(grammarAccess.getAnswerAccess().getIsUserInputAllowedLeftSquareBracketKeyword_3_0_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Answer__IsUserInputAllowedAssignment_3_06731); 
             after(grammarAccess.getAnswerAccess().getIsUserInputAllowedLeftSquareBracketKeyword_3_0_0()); 

            }

             after(grammarAccess.getAnswerAccess().getIsUserInputAllowedLeftSquareBracketKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Answer__IsUserInputAllowedAssignment_3_0"


    // $ANTLR start "rule__Answer__SubquestionAssignment_4_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3394:1: rule__Answer__SubquestionAssignment_4_1 : ( ruleQuestion ) ;
    public final void rule__Answer__SubquestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3398:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3399:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3399:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3400:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_16770);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Answer__SubquestionAssignment_4_1"


    // $ANTLR start "rule__Answer__SubquestionAssignment_4_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3409:1: rule__Answer__SubquestionAssignment_4_2 : ( ruleQuestion ) ;
    public final void rule__Answer__SubquestionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3413:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3414:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3414:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3415:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_26801);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Answer__SubquestionAssignment_4_2"


    // $ANTLR start "rule__MultipleChoice_Impl__IsMandatoryAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3424:1: rule__MultipleChoice_Impl__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__MultipleChoice_Impl__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3428:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3429:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3429:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3430:1: ( '*' )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3431:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3432:1: '*'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MultipleChoice_Impl__IsMandatoryAssignment_16837); 
             after(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__IsMandatoryAssignment_1"


    // $ANTLR start "rule__MultipleChoice_Impl__QuestionTextAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3447:1: rule__MultipleChoice_Impl__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__MultipleChoice_Impl__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3451:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3452:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3452:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3453:1: ruleEString
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice_Impl__QuestionTextAssignment_26876);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__QuestionTextAssignment_2"


    // $ANTLR start "rule__MultipleChoice_Impl__MinAssignment_4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3462:1: rule__MultipleChoice_Impl__MinAssignment_4 : ( ruleEInt ) ;
    public final void rule__MultipleChoice_Impl__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3466:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3467:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3467:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3468:1: ruleEInt
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMinEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MinAssignment_46907);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMultipleChoice_ImplAccess().getMinEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__MinAssignment_4"


    // $ANTLR start "rule__MultipleChoice_Impl__MaxAssignment_6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3477:1: rule__MultipleChoice_Impl__MaxAssignment_6 : ( ruleEInt ) ;
    public final void rule__MultipleChoice_Impl__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3481:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3482:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3482:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3483:1: ruleEInt
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMaxEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MaxAssignment_66938);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMultipleChoice_ImplAccess().getMaxEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__MaxAssignment_6"


    // $ANTLR start "rule__MultipleChoice_Impl__AnswersAssignment_8"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3492:1: rule__MultipleChoice_Impl__AnswersAssignment_8 : ( ruleAnswer ) ;
    public final void rule__MultipleChoice_Impl__AnswersAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3496:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3497:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3497:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3498:1: ruleAnswer
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_86969);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__AnswersAssignment_8"


    // $ANTLR start "rule__MultipleChoice_Impl__AnswersAssignment_9"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3507:1: rule__MultipleChoice_Impl__AnswersAssignment_9 : ( ruleAnswer ) ;
    public final void rule__MultipleChoice_Impl__AnswersAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3511:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3512:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3512:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3513:1: ruleAnswer
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_97000);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__MultipleChoice_Impl__AnswersAssignment_9"


    // $ANTLR start "rule__Ranking__IsMandatoryAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3522:1: rule__Ranking__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Ranking__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3526:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3527:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3527:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3528:1: ( '*' )
            {
             before(grammarAccess.getRankingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3529:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3530:1: '*'
            {
             before(grammarAccess.getRankingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Ranking__IsMandatoryAssignment_17036); 
             after(grammarAccess.getRankingAccess().getIsMandatoryAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getRankingAccess().getIsMandatoryAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__Ranking__IsMandatoryAssignment_1"


    // $ANTLR start "rule__Ranking__QuestionTextAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3545:1: rule__Ranking__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__Ranking__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3549:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3550:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3550:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3551:1: ruleEString
            {
             before(grammarAccess.getRankingAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ranking__QuestionTextAssignment_27075);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getQuestionTextEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Ranking__QuestionTextAssignment_2"


    // $ANTLR start "rule__Ranking__AnswersAssignment_6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3560:1: rule__Ranking__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Ranking__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3564:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3565:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3565:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3566:1: ruleAnswer
            {
             before(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_67106);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Ranking__AnswersAssignment_6"


    // $ANTLR start "rule__Ranking__AnswersAssignment_7"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3575:1: rule__Ranking__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__Ranking__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3579:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3580:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3580:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3581:1: ruleAnswer
            {
             before(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_77137);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Ranking__AnswersAssignment_7"


    // $ANTLR start "rule__Rating__IsMandatoryAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3590:1: rule__Rating__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Rating__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3594:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3595:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3595:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3596:1: ( '*' )
            {
             before(grammarAccess.getRatingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3597:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3598:1: '*'
            {
             before(grammarAccess.getRatingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Rating__IsMandatoryAssignment_17173); 
             after(grammarAccess.getRatingAccess().getIsMandatoryAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getRatingAccess().getIsMandatoryAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__Rating__IsMandatoryAssignment_1"


    // $ANTLR start "rule__Rating__QuestionTextAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3613:1: rule__Rating__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__Rating__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3617:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3618:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3618:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3619:1: ruleEString
            {
             before(grammarAccess.getRatingAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rating__QuestionTextAssignment_27212);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRatingAccess().getQuestionTextEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rating__QuestionTextAssignment_2"


    // $ANTLR start "rule__Rating__StartAssignment_4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3628:1: rule__Rating__StartAssignment_4 : ( ruleEInt ) ;
    public final void rule__Rating__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3632:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3633:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3633:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3634:1: ruleEInt
            {
             before(grammarAccess.getRatingAccess().getStartEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating__StartAssignment_47243);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRatingAccess().getStartEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rating__StartAssignment_4"


    // $ANTLR start "rule__Rating__EndAssignment_6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3643:1: rule__Rating__EndAssignment_6 : ( ruleEInt ) ;
    public final void rule__Rating__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3647:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3648:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3648:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3649:1: ruleEInt
            {
             before(grammarAccess.getRatingAccess().getEndEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating__EndAssignment_67274);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRatingAccess().getEndEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Rating__EndAssignment_6"


    // $ANTLR start "rule__Rating__IntervalAssignment_8"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3658:1: rule__Rating__IntervalAssignment_8 : ( ruleEInt ) ;
    public final void rule__Rating__IntervalAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3662:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3663:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3663:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3664:1: ruleEInt
            {
             before(grammarAccess.getRatingAccess().getIntervalEIntParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating__IntervalAssignment_87305);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRatingAccess().getIntervalEIntParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Rating__IntervalAssignment_8"


    // $ANTLR start "rule__YesNo__IsMandatoryAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3673:1: rule__YesNo__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__YesNo__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3677:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3678:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3678:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3679:1: ( '*' )
            {
             before(grammarAccess.getYesNoAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3680:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3681:1: '*'
            {
             before(grammarAccess.getYesNoAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__YesNo__IsMandatoryAssignment_17341); 
             after(grammarAccess.getYesNoAccess().getIsMandatoryAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getYesNoAccess().getIsMandatoryAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__YesNo__IsMandatoryAssignment_1"


    // $ANTLR start "rule__YesNo__QuestionTextAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3696:1: rule__YesNo__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__YesNo__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3700:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3701:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3701:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3702:1: ruleEString
            {
             before(grammarAccess.getYesNoAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__YesNo__QuestionTextAssignment_27380);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getYesNoAccess().getQuestionTextEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__YesNo__QuestionTextAssignment_2"


    // $ANTLR start "rule__OpenField__IsMandatoryAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3711:1: rule__OpenField__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__OpenField__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3715:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3716:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3716:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3717:1: ( '*' )
            {
             before(grammarAccess.getOpenFieldAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3718:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3719:1: '*'
            {
             before(grammarAccess.getOpenFieldAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OpenField__IsMandatoryAssignment_17416); 
             after(grammarAccess.getOpenFieldAccess().getIsMandatoryAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getOpenFieldAccess().getIsMandatoryAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__OpenField__IsMandatoryAssignment_1"


    // $ANTLR start "rule__OpenField__QuestionTextAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3734:1: rule__OpenField__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__OpenField__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3738:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3739:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3739:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3740:1: ruleEString
            {
             before(grammarAccess.getOpenFieldAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OpenField__QuestionTextAssignment_27455);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpenFieldAccess().getQuestionTextEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OpenField__QuestionTextAssignment_2"


    // $ANTLR start "rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3749:1: rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3753:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3754:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3754:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3755:1: ( '*' )
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3756:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3757:1: '*'
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_17491); 
             after(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1"


    // $ANTLR start "rule__MutuallyExclusive_Impl__QuestionTextAssignment_2"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3772:1: rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__MutuallyExclusive_Impl__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3776:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3777:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3777:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3778:1: ruleEString
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MutuallyExclusive_Impl__QuestionTextAssignment_27530);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__QuestionTextAssignment_2"


    // $ANTLR start "rule__MutuallyExclusive_Impl__AnswersAssignment_3"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3787:1: rule__MutuallyExclusive_Impl__AnswersAssignment_3 : ( ruleAnswer ) ;
    public final void rule__MutuallyExclusive_Impl__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3791:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3792:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3792:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3793:1: ruleAnswer
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_37561);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__AnswersAssignment_3"


    // $ANTLR start "rule__MutuallyExclusive_Impl__AnswersAssignment_4"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3802:1: rule__MutuallyExclusive_Impl__AnswersAssignment_4 : ( ruleAnswer ) ;
    public final void rule__MutuallyExclusive_Impl__AnswersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3806:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3807:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3807:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3808:1: ruleAnswer
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_47592);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MutuallyExclusive_Impl__AnswersAssignment_4"


    // $ANTLR start "rule__PersonAttribute__KeyAssignment"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3817:1: rule__PersonAttribute__KeyAssignment : ( ruleEString ) ;
    public final void rule__PersonAttribute__KeyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3821:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3822:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3822:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3823:1: ruleEString
            {
             before(grammarAccess.getPersonAttributeAccess().getKeyEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PersonAttribute__KeyAssignment7623);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAttributeAccess().getKeyEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__PersonAttribute__KeyAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\21\uffff";
    static final String DFA1_eofS =
        "\3\uffff\2\7\14\uffff";
    static final String DFA1_minS =
        "\1\27\2\4\2\16\1\uffff\1\6\1\uffff\1\6\1\31\2\uffff\2\6\1\20\2\uffff";
    static final String DFA1_maxS =
        "\1\27\1\34\1\5\2\30\1\uffff\1\33\1\uffff\1\6\1\31\2\uffff\1\31\1"+
        "\6\1\24\2\uffff";
    static final String DFA1_acceptS =
        "\5\uffff\1\6\1\uffff\1\5\2\uffff\1\4\1\2\3\uffff\1\1\1\3";
    static final String DFA1_specialS =
        "\21\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\3\1\4\26\uffff\1\2",
            "\1\3\1\4",
            "\1\7\2\uffff\1\7\1\5\3\uffff\2\7\1\6",
            "\1\7\2\uffff\1\7\1\5\3\uffff\2\7\1\6",
            "",
            "\1\11\22\uffff\1\10\1\13\1\12",
            "",
            "\1\11",
            "\1\14",
            "",
            "",
            "\1\16\22\uffff\1\15",
            "\1\16",
            "\1\20\3\uffff\1\17",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "482:1: rule__Question__Alternatives : ( ( ruleMultipleChoice_Impl ) | ( ruleRanking ) | ( ruleRating ) | ( ruleYesNo ) | ( ruleOpenField ) | ( ruleMutuallyExclusive_Impl ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__0_in_ruleCategory214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePerson_in_entryRulePerson301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePerson308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__0_in_rulePerson334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_Impl_in_entryRuleMultipleChoice_Impl483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice_Impl490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__0_in_ruleMultipleChoice_Impl516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__0_in_ruleRanking576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_in_entryRuleRating603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__0_in_ruleRating636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNo_in_entryRuleYesNo663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYesNo670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__0_in_ruleYesNo696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenField_in_entryRuleOpenField723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpenField730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__Group__0_in_ruleOpenField756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMutuallyExclusive_Impl_in_entryRuleMutuallyExclusive_Impl783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMutuallyExclusive_Impl790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__0_in_ruleMutuallyExclusive_Impl816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_entryRulePersonAttribute903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePersonAttribute910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PersonAttribute__KeyAssignment_in_rulePersonAttribute936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_Impl_in_rule__Question__Alternatives972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_rule__Question__Alternatives989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_in_rule__Question__Alternatives1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNo_in_rule__Question__Alternatives1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenField_in_rule__Question__Alternatives1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMutuallyExclusive_Impl_in_rule__Question__Alternatives1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01137 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11199 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__TitleAssignment_1_in_rule__Survey__Group__1__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21259 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0_in_rule__Survey__Group__2__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31320 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__0_in_rule__Survey__Group__3__Impl1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41381 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PersonAssignment_4_in_rule__Survey__Group__4__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51442 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__51445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__CategoriesAssignment_5_in_rule__Survey__Group__5__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__61502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__CategoriesAssignment_6_in_rule__Survey__Group__6__Impl1529 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__01574 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__01577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group_2__0__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__DateAssignment_2_1_in_rule__Survey__Group_2__1__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__0__Impl_in_rule__Survey__Group_3__01697 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__1_in_rule__Survey__Group_3__01700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group_3__0__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__1__Impl_in_rule__Survey__Group_3__11759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__DescriptionAssignment_3_1_in_rule__Survey__Group_3__1__Impl1786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__01820 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__01823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Category__Group__0__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__11882 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Category__Group__2_in_rule__Category__Group__11885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__TitleAssignment_1_in_rule__Category__Group__1__Impl1912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__21942 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Category__Group__3_in_rule__Category__Group__21945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group_2__0_in_rule__Category__Group__2__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__32003 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rule__Category__Group__4_in_rule__Category__Group__32006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__PagesAssignment_3_in_rule__Category__Group__3__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__42063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__PagesAssignment_4_in_rule__Category__Group__4__Impl2090 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_rule__Category__Group_2__0__Impl_in_rule__Category__Group_2__02131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Category__Group_2__1_in_rule__Category__Group_2__02134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Category__Group_2__0__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group_2__1__Impl_in_rule__Category__Group_2__12193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__DescriptionAssignment_2_1_in_rule__Category__Group_2__1__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__02254 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Person__Group__1_in_rule__Person__Group__02257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Person__Group__0__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__12316 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Person__Group__2_in_rule__Person__Group__12319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__AttributeAssignment_1_in_rule__Person__Group__1__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__22376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__0_in_rule__Person__Group__2__Impl2403 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__0__Impl_in_rule__Person__Group_2__02440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Person__Group_2__1_in_rule__Person__Group_2__02443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Person__Group_2__0__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__1__Impl_in_rule__Person__Group_2__12502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__AttributeAssignment_2_1_in_rule__Person__Group_2__1__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02563 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Page__Group__0__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12625 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_1_in_rule__Page__Group__1__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_2_in_rule__Page__Group__2__Impl2712 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02749 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12810 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Answer__Group__1__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22872 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__DescriptionAssignment_2_in_rule__Answer__Group__2__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32932 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_rule__Answer__Group__4_in_rule__Answer__Group__32935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__4__Impl_in_rule__Answer__Group__42993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__0_in_rule__Answer__Group__4__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__03061 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__03064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsUserInputAllowedAssignment_3_0_in_rule__Answer__Group_3__0__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__13121 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__13124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Answer__Group_3__1__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__23183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Answer__Group_3__2__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__0__Impl_in_rule__Answer__Group_4__03248 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__1_in_rule__Answer__Group_4__03251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Answer__Group_4__0__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__1__Impl_in_rule__Answer__Group_4__13310 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__2_in_rule__Answer__Group_4__13313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__SubquestionAssignment_4_1_in_rule__Answer__Group_4__1__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__2__Impl_in_rule__Answer__Group_4__23370 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__3_in_rule__Answer__Group_4__23373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__SubquestionAssignment_4_2_in_rule__Answer__Group_4__2__Impl3400 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__3__Impl_in_rule__Answer__Group_4__33431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Answer__Group_4__3__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__0__Impl_in_rule__MultipleChoice_Impl__Group__03498 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__1_in_rule__MultipleChoice_Impl__Group__03501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MultipleChoice_Impl__Group__0__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__1__Impl_in_rule__MultipleChoice_Impl__Group__13560 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__2_in_rule__MultipleChoice_Impl__Group__13563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__IsMandatoryAssignment_1_in_rule__MultipleChoice_Impl__Group__1__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__2__Impl_in_rule__MultipleChoice_Impl__Group__23621 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__3_in_rule__MultipleChoice_Impl__Group__23624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__QuestionTextAssignment_2_in_rule__MultipleChoice_Impl__Group__2__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__3__Impl_in_rule__MultipleChoice_Impl__Group__33681 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__4_in_rule__MultipleChoice_Impl__Group__33684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MultipleChoice_Impl__Group__3__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__4__Impl_in_rule__MultipleChoice_Impl__Group__43743 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__5_in_rule__MultipleChoice_Impl__Group__43746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__MinAssignment_4_in_rule__MultipleChoice_Impl__Group__4__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__5__Impl_in_rule__MultipleChoice_Impl__Group__53803 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__6_in_rule__MultipleChoice_Impl__Group__53806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MultipleChoice_Impl__Group__5__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__6__Impl_in_rule__MultipleChoice_Impl__Group__63865 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__7_in_rule__MultipleChoice_Impl__Group__63868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__MaxAssignment_6_in_rule__MultipleChoice_Impl__Group__6__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__7__Impl_in_rule__MultipleChoice_Impl__Group__73925 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__8_in_rule__MultipleChoice_Impl__Group__73928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MultipleChoice_Impl__Group__7__Impl3956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__8__Impl_in_rule__MultipleChoice_Impl__Group__83987 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__9_in_rule__MultipleChoice_Impl__Group__83990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_8_in_rule__MultipleChoice_Impl__Group__8__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__9__Impl_in_rule__MultipleChoice_Impl__Group__94047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_9_in_rule__MultipleChoice_Impl__Group__9__Impl4074 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__0__Impl_in_rule__Ranking__Group__04125 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__Ranking__Group__1_in_rule__Ranking__Group__04128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Ranking__Group__0__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__1__Impl_in_rule__Ranking__Group__14187 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__Ranking__Group__2_in_rule__Ranking__Group__14190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__IsMandatoryAssignment_1_in_rule__Ranking__Group__1__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__2__Impl_in_rule__Ranking__Group__24248 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__3_in_rule__Ranking__Group__24251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__QuestionTextAssignment_2_in_rule__Ranking__Group__2__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__3__Impl_in_rule__Ranking__Group__34308 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__4_in_rule__Ranking__Group__34311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Ranking__Group__3__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__4__Impl_in_rule__Ranking__Group__44370 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__5_in_rule__Ranking__Group__44373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Ranking__Group__4__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__5__Impl_in_rule__Ranking__Group__54432 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__6_in_rule__Ranking__Group__54435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Ranking__Group__5__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__6__Impl_in_rule__Ranking__Group__64494 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__7_in_rule__Ranking__Group__64497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__AnswersAssignment_6_in_rule__Ranking__Group__6__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__7__Impl_in_rule__Ranking__Group__74554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__AnswersAssignment_7_in_rule__Ranking__Group__7__Impl4581 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__04628 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__04631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Rating__Group__0__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__14690 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__14693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__IsMandatoryAssignment_1_in_rule__Rating__Group__1__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__24751 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__24754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__QuestionTextAssignment_2_in_rule__Rating__Group__2__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__34811 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Rating__Group__4_in_rule__Rating__Group__34814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Rating__Group__3__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__4__Impl_in_rule__Rating__Group__44873 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Rating__Group__5_in_rule__Rating__Group__44876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__StartAssignment_4_in_rule__Rating__Group__4__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__5__Impl_in_rule__Rating__Group__54933 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Rating__Group__6_in_rule__Rating__Group__54936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Rating__Group__5__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__6__Impl_in_rule__Rating__Group__64995 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Rating__Group__7_in_rule__Rating__Group__64998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__EndAssignment_6_in_rule__Rating__Group__6__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__7__Impl_in_rule__Rating__Group__75055 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__Rating__Group__8_in_rule__Rating__Group__75058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Rating__Group__7__Impl5086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__8__Impl_in_rule__Rating__Group__85117 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Rating__Group__9_in_rule__Rating__Group__85120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__IntervalAssignment_8_in_rule__Rating__Group__8__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__9__Impl_in_rule__Rating__Group__95177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Rating__Group__9__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__0__Impl_in_rule__YesNo__Group__05256 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__YesNo__Group__1_in_rule__YesNo__Group__05259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__YesNo__Group__0__Impl5287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__1__Impl_in_rule__YesNo__Group__15318 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__YesNo__Group__2_in_rule__YesNo__Group__15321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__IsMandatoryAssignment_1_in_rule__YesNo__Group__1__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__2__Impl_in_rule__YesNo__Group__25379 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__YesNo__Group__3_in_rule__YesNo__Group__25382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__QuestionTextAssignment_2_in_rule__YesNo__Group__2__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__3__Impl_in_rule__YesNo__Group__35439 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__YesNo__Group__4_in_rule__YesNo__Group__35442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__YesNo__Group__3__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__4__Impl_in_rule__YesNo__Group__45501 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__YesNo__Group__5_in_rule__YesNo__Group__45504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__YesNo__Group__4__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__5__Impl_in_rule__YesNo__Group__55563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__YesNo__Group__5__Impl5591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__Group__0__Impl_in_rule__OpenField__Group__05634 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__OpenField__Group__1_in_rule__OpenField__Group__05637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__OpenField__Group__0__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__Group__1__Impl_in_rule__OpenField__Group__15696 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__OpenField__Group__2_in_rule__OpenField__Group__15699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__IsMandatoryAssignment_1_in_rule__OpenField__Group__1__Impl5726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__Group__2__Impl_in_rule__OpenField__Group__25757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__QuestionTextAssignment_2_in_rule__OpenField__Group__2__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__0__Impl_in_rule__MutuallyExclusive_Impl__Group__05820 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__1_in_rule__MutuallyExclusive_Impl__Group__05823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MutuallyExclusive_Impl__Group__0__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__1__Impl_in_rule__MutuallyExclusive_Impl__Group__15882 = new BitSet(new long[]{0x0000000010000030L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__2_in_rule__MutuallyExclusive_Impl__Group__15885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1_in_rule__MutuallyExclusive_Impl__Group__1__Impl5912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__2__Impl_in_rule__MutuallyExclusive_Impl__Group__25943 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__3_in_rule__MutuallyExclusive_Impl__Group__25946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__QuestionTextAssignment_2_in_rule__MutuallyExclusive_Impl__Group__2__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__3__Impl_in_rule__MutuallyExclusive_Impl__Group__36003 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__4_in_rule__MutuallyExclusive_Impl__Group__36006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_3_in_rule__MutuallyExclusive_Impl__Group__3__Impl6033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__4__Impl_in_rule__MutuallyExclusive_Impl__Group__46063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_4_in_rule__MutuallyExclusive_Impl__Group__4__Impl6090 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06131 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__EInt__Group__0__Impl6163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__DateAssignment_2_16292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__DescriptionAssignment_3_16323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePerson_in_rule__Survey__PersonAssignment_46354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_56385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_66416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Category__TitleAssignment_16447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Category__DescriptionAssignment_2_16478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Category__PagesAssignment_36509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Category__PagesAssignment_46540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_16571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_2_16602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_16633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_26664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__DescriptionAssignment_26695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Answer__IsUserInputAllowedAssignment_3_06731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_16770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_26801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MultipleChoice_Impl__IsMandatoryAssignment_16837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice_Impl__QuestionTextAssignment_26876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MinAssignment_46907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MaxAssignment_66938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_86969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_97000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Ranking__IsMandatoryAssignment_17036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ranking__QuestionTextAssignment_27075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_67106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_77137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Rating__IsMandatoryAssignment_17173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rating__QuestionTextAssignment_27212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating__StartAssignment_47243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating__EndAssignment_67274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating__IntervalAssignment_87305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__YesNo__IsMandatoryAssignment_17341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__YesNo__QuestionTextAssignment_27380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OpenField__IsMandatoryAssignment_17416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OpenField__QuestionTextAssignment_27455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_17491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MutuallyExclusive_Impl__QuestionTextAssignment_27530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_37561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_47592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PersonAttribute__KeyAssignment7623 = new BitSet(new long[]{0x0000000000000002L});
    }


}