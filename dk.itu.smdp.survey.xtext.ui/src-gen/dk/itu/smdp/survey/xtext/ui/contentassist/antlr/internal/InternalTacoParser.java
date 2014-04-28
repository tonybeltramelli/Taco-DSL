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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'date'", "'description'", "'email'", "'category'", "'person'", "','", "'page'", "'A'", "'input'", "']'", "'sub'", "'end'", "'Q'", "'['", "'-'", "'rank'", "'y/n'", "'*'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:683:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__Group_4__0 )? ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:687:1: ( ( ( rule__Survey__Group_4__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:688:1: ( ( rule__Survey__Group_4__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:688:1: ( ( rule__Survey__Group_4__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:689:1: ( rule__Survey__Group_4__0 )?
            {
             before(grammarAccess.getSurveyAccess().getGroup_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:690:1: ( rule__Survey__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:690:2: rule__Survey__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_4__0_in_rule__Survey__Group__4__Impl1411);
                    rule__Survey__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getGroup_4()); 

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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:712:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__PersonAssignment_5 )? ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:716:1: ( ( ( rule__Survey__PersonAssignment_5 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:717:1: ( ( rule__Survey__PersonAssignment_5 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:717:1: ( ( rule__Survey__PersonAssignment_5 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:718:1: ( rule__Survey__PersonAssignment_5 )?
            {
             before(grammarAccess.getSurveyAccess().getPersonAssignment_5()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:719:1: ( rule__Survey__PersonAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:719:2: rule__Survey__PersonAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Survey__PersonAssignment_5_in_rule__Survey__Group__5__Impl1472);
                    rule__Survey__PersonAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSurveyAccess().getPersonAssignment_5()); 

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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:729:1: rule__Survey__Group__6 : rule__Survey__Group__6__Impl rule__Survey__Group__7 ;
    public final void rule__Survey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:733:1: ( rule__Survey__Group__6__Impl rule__Survey__Group__7 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:734:2: rule__Survey__Group__6__Impl rule__Survey__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__61503);
            rule__Survey__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__7_in_rule__Survey__Group__61506);
            rule__Survey__Group__7();

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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:741:1: rule__Survey__Group__6__Impl : ( ( rule__Survey__CategoriesAssignment_6 ) ) ;
    public final void rule__Survey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:745:1: ( ( ( rule__Survey__CategoriesAssignment_6 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:746:1: ( ( rule__Survey__CategoriesAssignment_6 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:746:1: ( ( rule__Survey__CategoriesAssignment_6 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:747:1: ( rule__Survey__CategoriesAssignment_6 )
            {
             before(grammarAccess.getSurveyAccess().getCategoriesAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:748:1: ( rule__Survey__CategoriesAssignment_6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:748:2: rule__Survey__CategoriesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__CategoriesAssignment_6_in_rule__Survey__Group__6__Impl1533);
            rule__Survey__CategoriesAssignment_6();

            state._fsp--;


            }

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


    // $ANTLR start "rule__Survey__Group__7"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:758:1: rule__Survey__Group__7 : rule__Survey__Group__7__Impl ;
    public final void rule__Survey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:762:1: ( rule__Survey__Group__7__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:763:2: rule__Survey__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__7__Impl_in_rule__Survey__Group__71563);
            rule__Survey__Group__7__Impl();

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
    // $ANTLR end "rule__Survey__Group__7"


    // $ANTLR start "rule__Survey__Group__7__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:769:1: rule__Survey__Group__7__Impl : ( ( rule__Survey__CategoriesAssignment_7 )* ) ;
    public final void rule__Survey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:773:1: ( ( ( rule__Survey__CategoriesAssignment_7 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:774:1: ( ( rule__Survey__CategoriesAssignment_7 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:774:1: ( ( rule__Survey__CategoriesAssignment_7 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:775:1: ( rule__Survey__CategoriesAssignment_7 )*
            {
             before(grammarAccess.getSurveyAccess().getCategoriesAssignment_7()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:776:1: ( rule__Survey__CategoriesAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:776:2: rule__Survey__CategoriesAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__CategoriesAssignment_7_in_rule__Survey__Group__7__Impl1590);
            	    rule__Survey__CategoriesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getCategoriesAssignment_7()); 

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
    // $ANTLR end "rule__Survey__Group__7__Impl"


    // $ANTLR start "rule__Survey__Group_2__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:802:1: rule__Survey__Group_2__0 : rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 ;
    public final void rule__Survey__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:806:1: ( rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:807:2: rule__Survey__Group_2__0__Impl rule__Survey__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__01637);
            rule__Survey__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__01640);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:814:1: rule__Survey__Group_2__0__Impl : ( 'date' ) ;
    public final void rule__Survey__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:818:1: ( ( 'date' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:819:1: ( 'date' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:819:1: ( 'date' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:820:1: 'date'
            {
             before(grammarAccess.getSurveyAccess().getDateKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group_2__0__Impl1668); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:833:1: rule__Survey__Group_2__1 : rule__Survey__Group_2__1__Impl ;
    public final void rule__Survey__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:837:1: ( rule__Survey__Group_2__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:838:2: rule__Survey__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11699);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:844:1: rule__Survey__Group_2__1__Impl : ( ( rule__Survey__DateAssignment_2_1 ) ) ;
    public final void rule__Survey__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:848:1: ( ( ( rule__Survey__DateAssignment_2_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:849:1: ( ( rule__Survey__DateAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:849:1: ( ( rule__Survey__DateAssignment_2_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:850:1: ( rule__Survey__DateAssignment_2_1 )
            {
             before(grammarAccess.getSurveyAccess().getDateAssignment_2_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:851:1: ( rule__Survey__DateAssignment_2_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:851:2: rule__Survey__DateAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__DateAssignment_2_1_in_rule__Survey__Group_2__1__Impl1726);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:865:1: rule__Survey__Group_3__0 : rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1 ;
    public final void rule__Survey__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:869:1: ( rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:870:2: rule__Survey__Group_3__0__Impl rule__Survey__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__0__Impl_in_rule__Survey__Group_3__01760);
            rule__Survey__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__1_in_rule__Survey__Group_3__01763);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:877:1: rule__Survey__Group_3__0__Impl : ( 'description' ) ;
    public final void rule__Survey__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:881:1: ( ( 'description' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:882:1: ( 'description' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:882:1: ( 'description' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:883:1: 'description'
            {
             before(grammarAccess.getSurveyAccess().getDescriptionKeyword_3_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group_3__0__Impl1791); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:896:1: rule__Survey__Group_3__1 : rule__Survey__Group_3__1__Impl ;
    public final void rule__Survey__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:900:1: ( rule__Survey__Group_3__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:901:2: rule__Survey__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_3__1__Impl_in_rule__Survey__Group_3__11822);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:907:1: rule__Survey__Group_3__1__Impl : ( ( rule__Survey__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Survey__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:911:1: ( ( ( rule__Survey__DescriptionAssignment_3_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:912:1: ( ( rule__Survey__DescriptionAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:912:1: ( ( rule__Survey__DescriptionAssignment_3_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:913:1: ( rule__Survey__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getSurveyAccess().getDescriptionAssignment_3_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:914:1: ( rule__Survey__DescriptionAssignment_3_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:914:2: rule__Survey__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__DescriptionAssignment_3_1_in_rule__Survey__Group_3__1__Impl1849);
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


    // $ANTLR start "rule__Survey__Group_4__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:928:1: rule__Survey__Group_4__0 : rule__Survey__Group_4__0__Impl rule__Survey__Group_4__1 ;
    public final void rule__Survey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:932:1: ( rule__Survey__Group_4__0__Impl rule__Survey__Group_4__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:933:2: rule__Survey__Group_4__0__Impl rule__Survey__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_4__0__Impl_in_rule__Survey__Group_4__01883);
            rule__Survey__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_4__1_in_rule__Survey__Group_4__01886);
            rule__Survey__Group_4__1();

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
    // $ANTLR end "rule__Survey__Group_4__0"


    // $ANTLR start "rule__Survey__Group_4__0__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:940:1: rule__Survey__Group_4__0__Impl : ( 'email' ) ;
    public final void rule__Survey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:944:1: ( ( 'email' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:945:1: ( 'email' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:945:1: ( 'email' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:946:1: 'email'
            {
             before(grammarAccess.getSurveyAccess().getEmailKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Survey__Group_4__0__Impl1914); 
             after(grammarAccess.getSurveyAccess().getEmailKeyword_4_0()); 

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
    // $ANTLR end "rule__Survey__Group_4__0__Impl"


    // $ANTLR start "rule__Survey__Group_4__1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:959:1: rule__Survey__Group_4__1 : rule__Survey__Group_4__1__Impl ;
    public final void rule__Survey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:963:1: ( rule__Survey__Group_4__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:964:2: rule__Survey__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_4__1__Impl_in_rule__Survey__Group_4__11945);
            rule__Survey__Group_4__1__Impl();

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
    // $ANTLR end "rule__Survey__Group_4__1"


    // $ANTLR start "rule__Survey__Group_4__1__Impl"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:970:1: rule__Survey__Group_4__1__Impl : ( ( rule__Survey__EmailAssignment_4_1 ) ) ;
    public final void rule__Survey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:974:1: ( ( ( rule__Survey__EmailAssignment_4_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:975:1: ( ( rule__Survey__EmailAssignment_4_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:975:1: ( ( rule__Survey__EmailAssignment_4_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:976:1: ( rule__Survey__EmailAssignment_4_1 )
            {
             before(grammarAccess.getSurveyAccess().getEmailAssignment_4_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:977:1: ( rule__Survey__EmailAssignment_4_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:977:2: rule__Survey__EmailAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__EmailAssignment_4_1_in_rule__Survey__Group_4__1__Impl1972);
            rule__Survey__EmailAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getEmailAssignment_4_1()); 

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
    // $ANTLR end "rule__Survey__Group_4__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:991:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:995:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:996:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__02006);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__1_in_rule__Category__Group__02009);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1003:1: rule__Category__Group__0__Impl : ( 'category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1007:1: ( ( 'category' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1008:1: ( 'category' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1008:1: ( 'category' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1009:1: 'category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Category__Group__0__Impl2037); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1022:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1026:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1027:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__12068);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__2_in_rule__Category__Group__12071);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1034:1: rule__Category__Group__1__Impl : ( ( rule__Category__TitleAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1038:1: ( ( ( rule__Category__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1039:1: ( ( rule__Category__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1039:1: ( ( rule__Category__TitleAssignment_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1040:1: ( rule__Category__TitleAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1041:1: ( rule__Category__TitleAssignment_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1041:2: rule__Category__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__TitleAssignment_1_in_rule__Category__Group__1__Impl2098);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1051:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1055:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1056:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__22128);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__3_in_rule__Category__Group__22131);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1063:1: rule__Category__Group__2__Impl : ( ( rule__Category__Group_2__0 )? ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1067:1: ( ( ( rule__Category__Group_2__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1068:1: ( ( rule__Category__Group_2__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1068:1: ( ( rule__Category__Group_2__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1069:1: ( rule__Category__Group_2__0 )?
            {
             before(grammarAccess.getCategoryAccess().getGroup_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1070:1: ( rule__Category__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1070:2: rule__Category__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__0_in_rule__Category__Group__2__Impl2158);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1080:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1084:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1085:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__32189);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__4_in_rule__Category__Group__32192);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1092:1: rule__Category__Group__3__Impl : ( ( rule__Category__PagesAssignment_3 ) ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1096:1: ( ( ( rule__Category__PagesAssignment_3 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1097:1: ( ( rule__Category__PagesAssignment_3 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1097:1: ( ( rule__Category__PagesAssignment_3 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1098:1: ( rule__Category__PagesAssignment_3 )
            {
             before(grammarAccess.getCategoryAccess().getPagesAssignment_3()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1099:1: ( rule__Category__PagesAssignment_3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1099:2: rule__Category__PagesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__PagesAssignment_3_in_rule__Category__Group__3__Impl2219);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1109:1: rule__Category__Group__4 : rule__Category__Group__4__Impl ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1113:1: ( rule__Category__Group__4__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1114:2: rule__Category__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__42249);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1120:1: rule__Category__Group__4__Impl : ( ( rule__Category__PagesAssignment_4 )* ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1124:1: ( ( ( rule__Category__PagesAssignment_4 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1125:1: ( ( rule__Category__PagesAssignment_4 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1125:1: ( ( rule__Category__PagesAssignment_4 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1126:1: ( rule__Category__PagesAssignment_4 )*
            {
             before(grammarAccess.getCategoryAccess().getPagesAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1127:1: ( rule__Category__PagesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1127:2: rule__Category__PagesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Category__PagesAssignment_4_in_rule__Category__Group__4__Impl2276);
            	    rule__Category__PagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1147:1: rule__Category__Group_2__0 : rule__Category__Group_2__0__Impl rule__Category__Group_2__1 ;
    public final void rule__Category__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1151:1: ( rule__Category__Group_2__0__Impl rule__Category__Group_2__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1152:2: rule__Category__Group_2__0__Impl rule__Category__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__0__Impl_in_rule__Category__Group_2__02317);
            rule__Category__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__1_in_rule__Category__Group_2__02320);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1159:1: rule__Category__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Category__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1163:1: ( ( 'description' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1164:1: ( 'description' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1164:1: ( 'description' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1165:1: 'description'
            {
             before(grammarAccess.getCategoryAccess().getDescriptionKeyword_2_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Category__Group_2__0__Impl2348); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1178:1: rule__Category__Group_2__1 : rule__Category__Group_2__1__Impl ;
    public final void rule__Category__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1182:1: ( rule__Category__Group_2__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1183:2: rule__Category__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Group_2__1__Impl_in_rule__Category__Group_2__12379);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1189:1: rule__Category__Group_2__1__Impl : ( ( rule__Category__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Category__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1193:1: ( ( ( rule__Category__DescriptionAssignment_2_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1194:1: ( ( rule__Category__DescriptionAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1194:1: ( ( rule__Category__DescriptionAssignment_2_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1195:1: ( rule__Category__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCategoryAccess().getDescriptionAssignment_2_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1196:1: ( rule__Category__DescriptionAssignment_2_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1196:2: rule__Category__DescriptionAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__DescriptionAssignment_2_1_in_rule__Category__Group_2__1__Impl2406);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1210:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1214:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1215:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__02440);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__1_in_rule__Person__Group__02443);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1222:1: rule__Person__Group__0__Impl : ( 'person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1226:1: ( ( 'person' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1227:1: ( 'person' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1227:1: ( 'person' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1228:1: 'person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Person__Group__0__Impl2471); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1241:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1245:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1246:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__12502);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__2_in_rule__Person__Group__12505);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1253:1: rule__Person__Group__1__Impl : ( ( rule__Person__AttributeAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1257:1: ( ( ( rule__Person__AttributeAssignment_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1258:1: ( ( rule__Person__AttributeAssignment_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1258:1: ( ( rule__Person__AttributeAssignment_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1259:1: ( rule__Person__AttributeAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getAttributeAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1260:1: ( rule__Person__AttributeAssignment_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1260:2: rule__Person__AttributeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__AttributeAssignment_1_in_rule__Person__Group__1__Impl2532);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1270:1: rule__Person__Group__2 : rule__Person__Group__2__Impl ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1274:1: ( rule__Person__Group__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1275:2: rule__Person__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__22562);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1281:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )* ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1285:1: ( ( ( rule__Person__Group_2__0 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1286:1: ( ( rule__Person__Group_2__0 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1286:1: ( ( rule__Person__Group_2__0 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1287:1: ( rule__Person__Group_2__0 )*
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1288:1: ( rule__Person__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1288:2: rule__Person__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__0_in_rule__Person__Group__2__Impl2589);
            	    rule__Person__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1304:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1308:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1309:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__0__Impl_in_rule__Person__Group_2__02626);
            rule__Person__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__1_in_rule__Person__Group_2__02629);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1316:1: rule__Person__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1320:1: ( ( ',' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1321:1: ( ',' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1321:1: ( ',' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1322:1: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Person__Group_2__0__Impl2657); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1335:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1339:1: ( rule__Person__Group_2__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1340:2: rule__Person__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__Group_2__1__Impl_in_rule__Person__Group_2__12688);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1346:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__AttributeAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1350:1: ( ( ( rule__Person__AttributeAssignment_2_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1351:1: ( ( rule__Person__AttributeAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1351:1: ( ( rule__Person__AttributeAssignment_2_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1352:1: ( rule__Person__AttributeAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getAttributeAssignment_2_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1353:1: ( rule__Person__AttributeAssignment_2_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1353:2: rule__Person__AttributeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Person__AttributeAssignment_2_1_in_rule__Person__Group_2__1__Impl2715);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1367:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1371:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1372:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02749);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02752);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1379:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1383:1: ( ( 'page' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1384:1: ( 'page' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1384:1: ( 'page' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1385:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Page__Group__0__Impl2780); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1398:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1402:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1403:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12811);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12814);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1410:1: rule__Page__Group__1__Impl : ( ( rule__Page__QuestionsAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1414:1: ( ( ( rule__Page__QuestionsAssignment_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1415:1: ( ( rule__Page__QuestionsAssignment_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1415:1: ( ( rule__Page__QuestionsAssignment_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1416:1: ( rule__Page__QuestionsAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1417:1: ( rule__Page__QuestionsAssignment_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1417:2: rule__Page__QuestionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__QuestionsAssignment_1_in_rule__Page__Group__1__Impl2841);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1427:1: rule__Page__Group__2 : rule__Page__Group__2__Impl ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1431:1: ( rule__Page__Group__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1432:2: rule__Page__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22871);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1438:1: rule__Page__Group__2__Impl : ( ( rule__Page__QuestionsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1442:1: ( ( ( rule__Page__QuestionsAssignment_2 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1443:1: ( ( rule__Page__QuestionsAssignment_2 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1443:1: ( ( rule__Page__QuestionsAssignment_2 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1444:1: ( rule__Page__QuestionsAssignment_2 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1445:1: ( rule__Page__QuestionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1445:2: rule__Page__QuestionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Page__QuestionsAssignment_2_in_rule__Page__Group__2__Impl2898);
            	    rule__Page__QuestionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1461:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1465:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1466:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02935);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02938);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1473:1: rule__Answer__Group__0__Impl : ( () ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1477:1: ( ( () ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1478:1: ( () )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1478:1: ( () )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1479:1: ()
            {
             before(grammarAccess.getAnswerAccess().getAnswerAction_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1480:1: ()
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1482:1: 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1492:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1496:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1497:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12996);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12999);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1504:1: rule__Answer__Group__1__Impl : ( 'A' ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1508:1: ( ( 'A' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1509:1: ( 'A' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1509:1: ( 'A' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1510:1: 'A'
            {
             before(grammarAccess.getAnswerAccess().getAKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Answer__Group__1__Impl3027); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1523:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1527:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1528:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__23058);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__23061);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1535:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__DescriptionAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1539:1: ( ( ( rule__Answer__DescriptionAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1540:1: ( ( rule__Answer__DescriptionAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1540:1: ( ( rule__Answer__DescriptionAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1541:1: ( rule__Answer__DescriptionAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getDescriptionAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1542:1: ( rule__Answer__DescriptionAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1542:2: rule__Answer__DescriptionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__DescriptionAssignment_2_in_rule__Answer__Group__2__Impl3088);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1552:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl rule__Answer__Group__4 ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1556:1: ( rule__Answer__Group__3__Impl rule__Answer__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1557:2: rule__Answer__Group__3__Impl rule__Answer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__33118);
            rule__Answer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__4_in_rule__Answer__Group__33121);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1564:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__Group_3__0 )? ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1568:1: ( ( ( rule__Answer__Group_3__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1569:1: ( ( rule__Answer__Group_3__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1569:1: ( ( rule__Answer__Group_3__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1570:1: ( rule__Answer__Group_3__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_3()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1571:1: ( rule__Answer__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1571:2: rule__Answer__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl3148);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1581:1: rule__Answer__Group__4 : rule__Answer__Group__4__Impl ;
    public final void rule__Answer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1585:1: ( rule__Answer__Group__4__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1586:2: rule__Answer__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__4__Impl_in_rule__Answer__Group__43179);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1592:1: rule__Answer__Group__4__Impl : ( ( rule__Answer__Group_4__0 )? ) ;
    public final void rule__Answer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1596:1: ( ( ( rule__Answer__Group_4__0 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1597:1: ( ( rule__Answer__Group_4__0 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1597:1: ( ( rule__Answer__Group_4__0 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1598:1: ( rule__Answer__Group_4__0 )?
            {
             before(grammarAccess.getAnswerAccess().getGroup_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1599:1: ( rule__Answer__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1599:2: rule__Answer__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__0_in_rule__Answer__Group__4__Impl3206);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1619:1: rule__Answer__Group_3__0 : rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 ;
    public final void rule__Answer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1623:1: ( rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1624:2: rule__Answer__Group_3__0__Impl rule__Answer__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__03247);
            rule__Answer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__03250);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1631:1: rule__Answer__Group_3__0__Impl : ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) ) ;
    public final void rule__Answer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1635:1: ( ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1636:1: ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1636:1: ( ( rule__Answer__IsUserInputAllowedAssignment_3_0 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1637:1: ( rule__Answer__IsUserInputAllowedAssignment_3_0 )
            {
             before(grammarAccess.getAnswerAccess().getIsUserInputAllowedAssignment_3_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1638:1: ( rule__Answer__IsUserInputAllowedAssignment_3_0 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1638:2: rule__Answer__IsUserInputAllowedAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__IsUserInputAllowedAssignment_3_0_in_rule__Answer__Group_3__0__Impl3277);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1648:1: rule__Answer__Group_3__1 : rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 ;
    public final void rule__Answer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1652:1: ( rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1653:2: rule__Answer__Group_3__1__Impl rule__Answer__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__13307);
            rule__Answer__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__13310);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1660:1: rule__Answer__Group_3__1__Impl : ( 'input' ) ;
    public final void rule__Answer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1664:1: ( ( 'input' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1665:1: ( 'input' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1665:1: ( 'input' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1666:1: 'input'
            {
             before(grammarAccess.getAnswerAccess().getInputKeyword_3_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Answer__Group_3__1__Impl3338); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1679:1: rule__Answer__Group_3__2 : rule__Answer__Group_3__2__Impl ;
    public final void rule__Answer__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1683:1: ( rule__Answer__Group_3__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1684:2: rule__Answer__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__23369);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1690:1: rule__Answer__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Answer__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1694:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1695:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1695:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1696:1: ']'
            {
             before(grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Answer__Group_3__2__Impl3397); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1715:1: rule__Answer__Group_4__0 : rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 ;
    public final void rule__Answer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1719:1: ( rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1720:2: rule__Answer__Group_4__0__Impl rule__Answer__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__0__Impl_in_rule__Answer__Group_4__03434);
            rule__Answer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__1_in_rule__Answer__Group_4__03437);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1727:1: rule__Answer__Group_4__0__Impl : ( 'sub' ) ;
    public final void rule__Answer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1731:1: ( ( 'sub' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1732:1: ( 'sub' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1732:1: ( 'sub' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1733:1: 'sub'
            {
             before(grammarAccess.getAnswerAccess().getSubKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Answer__Group_4__0__Impl3465); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1746:1: rule__Answer__Group_4__1 : rule__Answer__Group_4__1__Impl rule__Answer__Group_4__2 ;
    public final void rule__Answer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1750:1: ( rule__Answer__Group_4__1__Impl rule__Answer__Group_4__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1751:2: rule__Answer__Group_4__1__Impl rule__Answer__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__1__Impl_in_rule__Answer__Group_4__13496);
            rule__Answer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__2_in_rule__Answer__Group_4__13499);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1758:1: rule__Answer__Group_4__1__Impl : ( ( rule__Answer__SubquestionAssignment_4_1 ) ) ;
    public final void rule__Answer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1762:1: ( ( ( rule__Answer__SubquestionAssignment_4_1 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1763:1: ( ( rule__Answer__SubquestionAssignment_4_1 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1763:1: ( ( rule__Answer__SubquestionAssignment_4_1 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1764:1: ( rule__Answer__SubquestionAssignment_4_1 )
            {
             before(grammarAccess.getAnswerAccess().getSubquestionAssignment_4_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1765:1: ( rule__Answer__SubquestionAssignment_4_1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1765:2: rule__Answer__SubquestionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__SubquestionAssignment_4_1_in_rule__Answer__Group_4__1__Impl3526);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1775:1: rule__Answer__Group_4__2 : rule__Answer__Group_4__2__Impl rule__Answer__Group_4__3 ;
    public final void rule__Answer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1779:1: ( rule__Answer__Group_4__2__Impl rule__Answer__Group_4__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1780:2: rule__Answer__Group_4__2__Impl rule__Answer__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__2__Impl_in_rule__Answer__Group_4__23556);
            rule__Answer__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__3_in_rule__Answer__Group_4__23559);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1787:1: rule__Answer__Group_4__2__Impl : ( ( rule__Answer__SubquestionAssignment_4_2 )* ) ;
    public final void rule__Answer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1791:1: ( ( ( rule__Answer__SubquestionAssignment_4_2 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1792:1: ( ( rule__Answer__SubquestionAssignment_4_2 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1792:1: ( ( rule__Answer__SubquestionAssignment_4_2 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1793:1: ( rule__Answer__SubquestionAssignment_4_2 )*
            {
             before(grammarAccess.getAnswerAccess().getSubquestionAssignment_4_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1794:1: ( rule__Answer__SubquestionAssignment_4_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1794:2: rule__Answer__SubquestionAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Answer__SubquestionAssignment_4_2_in_rule__Answer__Group_4__2__Impl3586);
            	    rule__Answer__SubquestionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1804:1: rule__Answer__Group_4__3 : rule__Answer__Group_4__3__Impl ;
    public final void rule__Answer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1808:1: ( rule__Answer__Group_4__3__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1809:2: rule__Answer__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group_4__3__Impl_in_rule__Answer__Group_4__33617);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1815:1: rule__Answer__Group_4__3__Impl : ( 'end' ) ;
    public final void rule__Answer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1819:1: ( ( 'end' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1820:1: ( 'end' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1820:1: ( 'end' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1821:1: 'end'
            {
             before(grammarAccess.getAnswerAccess().getEndKeyword_4_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Answer__Group_4__3__Impl3645); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1842:1: rule__MultipleChoice_Impl__Group__0 : rule__MultipleChoice_Impl__Group__0__Impl rule__MultipleChoice_Impl__Group__1 ;
    public final void rule__MultipleChoice_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1846:1: ( rule__MultipleChoice_Impl__Group__0__Impl rule__MultipleChoice_Impl__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1847:2: rule__MultipleChoice_Impl__Group__0__Impl rule__MultipleChoice_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__0__Impl_in_rule__MultipleChoice_Impl__Group__03684);
            rule__MultipleChoice_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__1_in_rule__MultipleChoice_Impl__Group__03687);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1854:1: rule__MultipleChoice_Impl__Group__0__Impl : ( 'Q' ) ;
    public final void rule__MultipleChoice_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1858:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1859:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1859:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1860:1: 'Q'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getQKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MultipleChoice_Impl__Group__0__Impl3715); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1873:1: rule__MultipleChoice_Impl__Group__1 : rule__MultipleChoice_Impl__Group__1__Impl rule__MultipleChoice_Impl__Group__2 ;
    public final void rule__MultipleChoice_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1877:1: ( rule__MultipleChoice_Impl__Group__1__Impl rule__MultipleChoice_Impl__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1878:2: rule__MultipleChoice_Impl__Group__1__Impl rule__MultipleChoice_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__1__Impl_in_rule__MultipleChoice_Impl__Group__13746);
            rule__MultipleChoice_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__2_in_rule__MultipleChoice_Impl__Group__13749);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1885:1: rule__MultipleChoice_Impl__Group__1__Impl : ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? ) ;
    public final void rule__MultipleChoice_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1889:1: ( ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1890:1: ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1890:1: ( ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1891:1: ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1892:1: ( rule__MultipleChoice_Impl__IsMandatoryAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1892:2: rule__MultipleChoice_Impl__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__IsMandatoryAssignment_1_in_rule__MultipleChoice_Impl__Group__1__Impl3776);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1902:1: rule__MultipleChoice_Impl__Group__2 : rule__MultipleChoice_Impl__Group__2__Impl rule__MultipleChoice_Impl__Group__3 ;
    public final void rule__MultipleChoice_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1906:1: ( rule__MultipleChoice_Impl__Group__2__Impl rule__MultipleChoice_Impl__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1907:2: rule__MultipleChoice_Impl__Group__2__Impl rule__MultipleChoice_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__2__Impl_in_rule__MultipleChoice_Impl__Group__23807);
            rule__MultipleChoice_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__3_in_rule__MultipleChoice_Impl__Group__23810);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1914:1: rule__MultipleChoice_Impl__Group__2__Impl : ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1918:1: ( ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1919:1: ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1919:1: ( ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1920:1: ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1921:1: ( rule__MultipleChoice_Impl__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1921:2: rule__MultipleChoice_Impl__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__QuestionTextAssignment_2_in_rule__MultipleChoice_Impl__Group__2__Impl3837);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1931:1: rule__MultipleChoice_Impl__Group__3 : rule__MultipleChoice_Impl__Group__3__Impl rule__MultipleChoice_Impl__Group__4 ;
    public final void rule__MultipleChoice_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1935:1: ( rule__MultipleChoice_Impl__Group__3__Impl rule__MultipleChoice_Impl__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1936:2: rule__MultipleChoice_Impl__Group__3__Impl rule__MultipleChoice_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__3__Impl_in_rule__MultipleChoice_Impl__Group__33867);
            rule__MultipleChoice_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__4_in_rule__MultipleChoice_Impl__Group__33870);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1943:1: rule__MultipleChoice_Impl__Group__3__Impl : ( '[' ) ;
    public final void rule__MultipleChoice_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1947:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1948:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1948:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1949:1: '['
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getLeftSquareBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MultipleChoice_Impl__Group__3__Impl3898); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1962:1: rule__MultipleChoice_Impl__Group__4 : rule__MultipleChoice_Impl__Group__4__Impl rule__MultipleChoice_Impl__Group__5 ;
    public final void rule__MultipleChoice_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1966:1: ( rule__MultipleChoice_Impl__Group__4__Impl rule__MultipleChoice_Impl__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1967:2: rule__MultipleChoice_Impl__Group__4__Impl rule__MultipleChoice_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__4__Impl_in_rule__MultipleChoice_Impl__Group__43929);
            rule__MultipleChoice_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__5_in_rule__MultipleChoice_Impl__Group__43932);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1974:1: rule__MultipleChoice_Impl__Group__4__Impl : ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1978:1: ( ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1979:1: ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1979:1: ( ( rule__MultipleChoice_Impl__MinAssignment_4 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1980:1: ( rule__MultipleChoice_Impl__MinAssignment_4 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMinAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1981:1: ( rule__MultipleChoice_Impl__MinAssignment_4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1981:2: rule__MultipleChoice_Impl__MinAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__MinAssignment_4_in_rule__MultipleChoice_Impl__Group__4__Impl3959);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1991:1: rule__MultipleChoice_Impl__Group__5 : rule__MultipleChoice_Impl__Group__5__Impl rule__MultipleChoice_Impl__Group__6 ;
    public final void rule__MultipleChoice_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1995:1: ( rule__MultipleChoice_Impl__Group__5__Impl rule__MultipleChoice_Impl__Group__6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:1996:2: rule__MultipleChoice_Impl__Group__5__Impl rule__MultipleChoice_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__5__Impl_in_rule__MultipleChoice_Impl__Group__53989);
            rule__MultipleChoice_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__6_in_rule__MultipleChoice_Impl__Group__53992);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2003:1: rule__MultipleChoice_Impl__Group__5__Impl : ( '-' ) ;
    public final void rule__MultipleChoice_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2007:1: ( ( '-' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2008:1: ( '-' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2008:1: ( '-' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2009:1: '-'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getHyphenMinusKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MultipleChoice_Impl__Group__5__Impl4020); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2022:1: rule__MultipleChoice_Impl__Group__6 : rule__MultipleChoice_Impl__Group__6__Impl rule__MultipleChoice_Impl__Group__7 ;
    public final void rule__MultipleChoice_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2026:1: ( rule__MultipleChoice_Impl__Group__6__Impl rule__MultipleChoice_Impl__Group__7 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2027:2: rule__MultipleChoice_Impl__Group__6__Impl rule__MultipleChoice_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__6__Impl_in_rule__MultipleChoice_Impl__Group__64051);
            rule__MultipleChoice_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__7_in_rule__MultipleChoice_Impl__Group__64054);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2034:1: rule__MultipleChoice_Impl__Group__6__Impl : ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2038:1: ( ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2039:1: ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2039:1: ( ( rule__MultipleChoice_Impl__MaxAssignment_6 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2040:1: ( rule__MultipleChoice_Impl__MaxAssignment_6 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMaxAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2041:1: ( rule__MultipleChoice_Impl__MaxAssignment_6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2041:2: rule__MultipleChoice_Impl__MaxAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__MaxAssignment_6_in_rule__MultipleChoice_Impl__Group__6__Impl4081);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2051:1: rule__MultipleChoice_Impl__Group__7 : rule__MultipleChoice_Impl__Group__7__Impl rule__MultipleChoice_Impl__Group__8 ;
    public final void rule__MultipleChoice_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2055:1: ( rule__MultipleChoice_Impl__Group__7__Impl rule__MultipleChoice_Impl__Group__8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2056:2: rule__MultipleChoice_Impl__Group__7__Impl rule__MultipleChoice_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__7__Impl_in_rule__MultipleChoice_Impl__Group__74111);
            rule__MultipleChoice_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__8_in_rule__MultipleChoice_Impl__Group__74114);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2063:1: rule__MultipleChoice_Impl__Group__7__Impl : ( ']' ) ;
    public final void rule__MultipleChoice_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2067:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2068:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2068:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2069:1: ']'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getRightSquareBracketKeyword_7()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MultipleChoice_Impl__Group__7__Impl4142); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2082:1: rule__MultipleChoice_Impl__Group__8 : rule__MultipleChoice_Impl__Group__8__Impl rule__MultipleChoice_Impl__Group__9 ;
    public final void rule__MultipleChoice_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2086:1: ( rule__MultipleChoice_Impl__Group__8__Impl rule__MultipleChoice_Impl__Group__9 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2087:2: rule__MultipleChoice_Impl__Group__8__Impl rule__MultipleChoice_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__8__Impl_in_rule__MultipleChoice_Impl__Group__84173);
            rule__MultipleChoice_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__9_in_rule__MultipleChoice_Impl__Group__84176);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2094:1: rule__MultipleChoice_Impl__Group__8__Impl : ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) ) ;
    public final void rule__MultipleChoice_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2098:1: ( ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2099:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2099:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_8 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2100:1: ( rule__MultipleChoice_Impl__AnswersAssignment_8 )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAssignment_8()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2101:1: ( rule__MultipleChoice_Impl__AnswersAssignment_8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2101:2: rule__MultipleChoice_Impl__AnswersAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_8_in_rule__MultipleChoice_Impl__Group__8__Impl4203);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2111:1: rule__MultipleChoice_Impl__Group__9 : rule__MultipleChoice_Impl__Group__9__Impl ;
    public final void rule__MultipleChoice_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2115:1: ( rule__MultipleChoice_Impl__Group__9__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2116:2: rule__MultipleChoice_Impl__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__Group__9__Impl_in_rule__MultipleChoice_Impl__Group__94233);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2122:1: rule__MultipleChoice_Impl__Group__9__Impl : ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* ) ;
    public final void rule__MultipleChoice_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2126:1: ( ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2127:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2127:1: ( ( rule__MultipleChoice_Impl__AnswersAssignment_9 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2128:1: ( rule__MultipleChoice_Impl__AnswersAssignment_9 )*
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAssignment_9()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2129:1: ( rule__MultipleChoice_Impl__AnswersAssignment_9 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2129:2: rule__MultipleChoice_Impl__AnswersAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_9_in_rule__MultipleChoice_Impl__Group__9__Impl4260);
            	    rule__MultipleChoice_Impl__AnswersAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2159:1: rule__Ranking__Group__0 : rule__Ranking__Group__0__Impl rule__Ranking__Group__1 ;
    public final void rule__Ranking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2163:1: ( rule__Ranking__Group__0__Impl rule__Ranking__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2164:2: rule__Ranking__Group__0__Impl rule__Ranking__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__0__Impl_in_rule__Ranking__Group__04311);
            rule__Ranking__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__1_in_rule__Ranking__Group__04314);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2171:1: rule__Ranking__Group__0__Impl : ( 'Q' ) ;
    public final void rule__Ranking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2175:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2176:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2176:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2177:1: 'Q'
            {
             before(grammarAccess.getRankingAccess().getQKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Ranking__Group__0__Impl4342); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2190:1: rule__Ranking__Group__1 : rule__Ranking__Group__1__Impl rule__Ranking__Group__2 ;
    public final void rule__Ranking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2194:1: ( rule__Ranking__Group__1__Impl rule__Ranking__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2195:2: rule__Ranking__Group__1__Impl rule__Ranking__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__1__Impl_in_rule__Ranking__Group__14373);
            rule__Ranking__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__2_in_rule__Ranking__Group__14376);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2202:1: rule__Ranking__Group__1__Impl : ( ( rule__Ranking__IsMandatoryAssignment_1 )? ) ;
    public final void rule__Ranking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2206:1: ( ( ( rule__Ranking__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2207:1: ( ( rule__Ranking__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2207:1: ( ( rule__Ranking__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2208:1: ( rule__Ranking__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getRankingAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2209:1: ( rule__Ranking__IsMandatoryAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2209:2: rule__Ranking__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ranking__IsMandatoryAssignment_1_in_rule__Ranking__Group__1__Impl4403);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2219:1: rule__Ranking__Group__2 : rule__Ranking__Group__2__Impl rule__Ranking__Group__3 ;
    public final void rule__Ranking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2223:1: ( rule__Ranking__Group__2__Impl rule__Ranking__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2224:2: rule__Ranking__Group__2__Impl rule__Ranking__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__2__Impl_in_rule__Ranking__Group__24434);
            rule__Ranking__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__3_in_rule__Ranking__Group__24437);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2231:1: rule__Ranking__Group__2__Impl : ( ( rule__Ranking__QuestionTextAssignment_2 ) ) ;
    public final void rule__Ranking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2235:1: ( ( ( rule__Ranking__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2236:1: ( ( rule__Ranking__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2236:1: ( ( rule__Ranking__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2237:1: ( rule__Ranking__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getRankingAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2238:1: ( rule__Ranking__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2238:2: rule__Ranking__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__QuestionTextAssignment_2_in_rule__Ranking__Group__2__Impl4464);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2248:1: rule__Ranking__Group__3 : rule__Ranking__Group__3__Impl rule__Ranking__Group__4 ;
    public final void rule__Ranking__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2252:1: ( rule__Ranking__Group__3__Impl rule__Ranking__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2253:2: rule__Ranking__Group__3__Impl rule__Ranking__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__3__Impl_in_rule__Ranking__Group__34494);
            rule__Ranking__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__4_in_rule__Ranking__Group__34497);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2260:1: rule__Ranking__Group__3__Impl : ( '[' ) ;
    public final void rule__Ranking__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2264:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2265:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2265:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2266:1: '['
            {
             before(grammarAccess.getRankingAccess().getLeftSquareBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Ranking__Group__3__Impl4525); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2279:1: rule__Ranking__Group__4 : rule__Ranking__Group__4__Impl rule__Ranking__Group__5 ;
    public final void rule__Ranking__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2283:1: ( rule__Ranking__Group__4__Impl rule__Ranking__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2284:2: rule__Ranking__Group__4__Impl rule__Ranking__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__4__Impl_in_rule__Ranking__Group__44556);
            rule__Ranking__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__5_in_rule__Ranking__Group__44559);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2291:1: rule__Ranking__Group__4__Impl : ( 'rank' ) ;
    public final void rule__Ranking__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2295:1: ( ( 'rank' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2296:1: ( 'rank' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2296:1: ( 'rank' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2297:1: 'rank'
            {
             before(grammarAccess.getRankingAccess().getRankKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ranking__Group__4__Impl4587); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2310:1: rule__Ranking__Group__5 : rule__Ranking__Group__5__Impl rule__Ranking__Group__6 ;
    public final void rule__Ranking__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2314:1: ( rule__Ranking__Group__5__Impl rule__Ranking__Group__6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2315:2: rule__Ranking__Group__5__Impl rule__Ranking__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__5__Impl_in_rule__Ranking__Group__54618);
            rule__Ranking__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__6_in_rule__Ranking__Group__54621);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2322:1: rule__Ranking__Group__5__Impl : ( ']' ) ;
    public final void rule__Ranking__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2326:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2327:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2327:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2328:1: ']'
            {
             before(grammarAccess.getRankingAccess().getRightSquareBracketKeyword_5()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Ranking__Group__5__Impl4649); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2341:1: rule__Ranking__Group__6 : rule__Ranking__Group__6__Impl rule__Ranking__Group__7 ;
    public final void rule__Ranking__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2345:1: ( rule__Ranking__Group__6__Impl rule__Ranking__Group__7 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2346:2: rule__Ranking__Group__6__Impl rule__Ranking__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__6__Impl_in_rule__Ranking__Group__64680);
            rule__Ranking__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__7_in_rule__Ranking__Group__64683);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2353:1: rule__Ranking__Group__6__Impl : ( ( rule__Ranking__AnswersAssignment_6 ) ) ;
    public final void rule__Ranking__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2357:1: ( ( ( rule__Ranking__AnswersAssignment_6 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2358:1: ( ( rule__Ranking__AnswersAssignment_6 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2358:1: ( ( rule__Ranking__AnswersAssignment_6 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2359:1: ( rule__Ranking__AnswersAssignment_6 )
            {
             before(grammarAccess.getRankingAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2360:1: ( rule__Ranking__AnswersAssignment_6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2360:2: rule__Ranking__AnswersAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__AnswersAssignment_6_in_rule__Ranking__Group__6__Impl4710);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2370:1: rule__Ranking__Group__7 : rule__Ranking__Group__7__Impl ;
    public final void rule__Ranking__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2374:1: ( rule__Ranking__Group__7__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2375:2: rule__Ranking__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ranking__Group__7__Impl_in_rule__Ranking__Group__74740);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2381:1: rule__Ranking__Group__7__Impl : ( ( rule__Ranking__AnswersAssignment_7 )* ) ;
    public final void rule__Ranking__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2385:1: ( ( ( rule__Ranking__AnswersAssignment_7 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2386:1: ( ( rule__Ranking__AnswersAssignment_7 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2386:1: ( ( rule__Ranking__AnswersAssignment_7 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2387:1: ( rule__Ranking__AnswersAssignment_7 )*
            {
             before(grammarAccess.getRankingAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2388:1: ( rule__Ranking__AnswersAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2388:2: rule__Ranking__AnswersAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ranking__AnswersAssignment_7_in_rule__Ranking__Group__7__Impl4767);
            	    rule__Ranking__AnswersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2414:1: rule__Rating__Group__0 : rule__Rating__Group__0__Impl rule__Rating__Group__1 ;
    public final void rule__Rating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2418:1: ( rule__Rating__Group__0__Impl rule__Rating__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2419:2: rule__Rating__Group__0__Impl rule__Rating__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__04814);
            rule__Rating__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__04817);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2426:1: rule__Rating__Group__0__Impl : ( 'Q' ) ;
    public final void rule__Rating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2430:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2431:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2431:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2432:1: 'Q'
            {
             before(grammarAccess.getRatingAccess().getQKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Rating__Group__0__Impl4845); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2445:1: rule__Rating__Group__1 : rule__Rating__Group__1__Impl rule__Rating__Group__2 ;
    public final void rule__Rating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2449:1: ( rule__Rating__Group__1__Impl rule__Rating__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2450:2: rule__Rating__Group__1__Impl rule__Rating__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__14876);
            rule__Rating__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__14879);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2457:1: rule__Rating__Group__1__Impl : ( ( rule__Rating__IsMandatoryAssignment_1 )? ) ;
    public final void rule__Rating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2461:1: ( ( ( rule__Rating__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2462:1: ( ( rule__Rating__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2462:1: ( ( rule__Rating__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2463:1: ( rule__Rating__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getRatingAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2464:1: ( rule__Rating__IsMandatoryAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2464:2: rule__Rating__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rating__IsMandatoryAssignment_1_in_rule__Rating__Group__1__Impl4906);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2474:1: rule__Rating__Group__2 : rule__Rating__Group__2__Impl rule__Rating__Group__3 ;
    public final void rule__Rating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2478:1: ( rule__Rating__Group__2__Impl rule__Rating__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2479:2: rule__Rating__Group__2__Impl rule__Rating__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__24937);
            rule__Rating__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__24940);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2486:1: rule__Rating__Group__2__Impl : ( ( rule__Rating__QuestionTextAssignment_2 ) ) ;
    public final void rule__Rating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2490:1: ( ( ( rule__Rating__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2491:1: ( ( rule__Rating__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2491:1: ( ( rule__Rating__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2492:1: ( rule__Rating__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getRatingAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2493:1: ( rule__Rating__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2493:2: rule__Rating__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__QuestionTextAssignment_2_in_rule__Rating__Group__2__Impl4967);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2503:1: rule__Rating__Group__3 : rule__Rating__Group__3__Impl rule__Rating__Group__4 ;
    public final void rule__Rating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2507:1: ( rule__Rating__Group__3__Impl rule__Rating__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2508:2: rule__Rating__Group__3__Impl rule__Rating__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__34997);
            rule__Rating__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__4_in_rule__Rating__Group__35000);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2515:1: rule__Rating__Group__3__Impl : ( '[' ) ;
    public final void rule__Rating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2519:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2520:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2520:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2521:1: '['
            {
             before(grammarAccess.getRatingAccess().getLeftSquareBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Rating__Group__3__Impl5028); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2534:1: rule__Rating__Group__4 : rule__Rating__Group__4__Impl rule__Rating__Group__5 ;
    public final void rule__Rating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2538:1: ( rule__Rating__Group__4__Impl rule__Rating__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2539:2: rule__Rating__Group__4__Impl rule__Rating__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__4__Impl_in_rule__Rating__Group__45059);
            rule__Rating__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__5_in_rule__Rating__Group__45062);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2546:1: rule__Rating__Group__4__Impl : ( ( rule__Rating__StartAssignment_4 ) ) ;
    public final void rule__Rating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2550:1: ( ( ( rule__Rating__StartAssignment_4 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2551:1: ( ( rule__Rating__StartAssignment_4 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2551:1: ( ( rule__Rating__StartAssignment_4 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2552:1: ( rule__Rating__StartAssignment_4 )
            {
             before(grammarAccess.getRatingAccess().getStartAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2553:1: ( rule__Rating__StartAssignment_4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2553:2: rule__Rating__StartAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__StartAssignment_4_in_rule__Rating__Group__4__Impl5089);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2563:1: rule__Rating__Group__5 : rule__Rating__Group__5__Impl rule__Rating__Group__6 ;
    public final void rule__Rating__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2567:1: ( rule__Rating__Group__5__Impl rule__Rating__Group__6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2568:2: rule__Rating__Group__5__Impl rule__Rating__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__5__Impl_in_rule__Rating__Group__55119);
            rule__Rating__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__6_in_rule__Rating__Group__55122);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2575:1: rule__Rating__Group__5__Impl : ( '-' ) ;
    public final void rule__Rating__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2579:1: ( ( '-' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2580:1: ( '-' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2580:1: ( '-' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2581:1: '-'
            {
             before(grammarAccess.getRatingAccess().getHyphenMinusKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Rating__Group__5__Impl5150); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2594:1: rule__Rating__Group__6 : rule__Rating__Group__6__Impl rule__Rating__Group__7 ;
    public final void rule__Rating__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2598:1: ( rule__Rating__Group__6__Impl rule__Rating__Group__7 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2599:2: rule__Rating__Group__6__Impl rule__Rating__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__6__Impl_in_rule__Rating__Group__65181);
            rule__Rating__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__7_in_rule__Rating__Group__65184);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2606:1: rule__Rating__Group__6__Impl : ( ( rule__Rating__EndAssignment_6 ) ) ;
    public final void rule__Rating__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2610:1: ( ( ( rule__Rating__EndAssignment_6 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2611:1: ( ( rule__Rating__EndAssignment_6 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2611:1: ( ( rule__Rating__EndAssignment_6 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2612:1: ( rule__Rating__EndAssignment_6 )
            {
             before(grammarAccess.getRatingAccess().getEndAssignment_6()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2613:1: ( rule__Rating__EndAssignment_6 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2613:2: rule__Rating__EndAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__EndAssignment_6_in_rule__Rating__Group__6__Impl5211);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2623:1: rule__Rating__Group__7 : rule__Rating__Group__7__Impl rule__Rating__Group__8 ;
    public final void rule__Rating__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2627:1: ( rule__Rating__Group__7__Impl rule__Rating__Group__8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2628:2: rule__Rating__Group__7__Impl rule__Rating__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__7__Impl_in_rule__Rating__Group__75241);
            rule__Rating__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__8_in_rule__Rating__Group__75244);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2635:1: rule__Rating__Group__7__Impl : ( ',' ) ;
    public final void rule__Rating__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2639:1: ( ( ',' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2640:1: ( ',' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2640:1: ( ',' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2641:1: ','
            {
             before(grammarAccess.getRatingAccess().getCommaKeyword_7()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Rating__Group__7__Impl5272); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2654:1: rule__Rating__Group__8 : rule__Rating__Group__8__Impl rule__Rating__Group__9 ;
    public final void rule__Rating__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2658:1: ( rule__Rating__Group__8__Impl rule__Rating__Group__9 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2659:2: rule__Rating__Group__8__Impl rule__Rating__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__8__Impl_in_rule__Rating__Group__85303);
            rule__Rating__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__9_in_rule__Rating__Group__85306);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2666:1: rule__Rating__Group__8__Impl : ( ( rule__Rating__IntervalAssignment_8 ) ) ;
    public final void rule__Rating__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2670:1: ( ( ( rule__Rating__IntervalAssignment_8 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2671:1: ( ( rule__Rating__IntervalAssignment_8 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2671:1: ( ( rule__Rating__IntervalAssignment_8 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2672:1: ( rule__Rating__IntervalAssignment_8 )
            {
             before(grammarAccess.getRatingAccess().getIntervalAssignment_8()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2673:1: ( rule__Rating__IntervalAssignment_8 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2673:2: rule__Rating__IntervalAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__IntervalAssignment_8_in_rule__Rating__Group__8__Impl5333);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2683:1: rule__Rating__Group__9 : rule__Rating__Group__9__Impl ;
    public final void rule__Rating__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2687:1: ( rule__Rating__Group__9__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2688:2: rule__Rating__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rating__Group__9__Impl_in_rule__Rating__Group__95363);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2694:1: rule__Rating__Group__9__Impl : ( ']' ) ;
    public final void rule__Rating__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2698:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2699:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2699:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2700:1: ']'
            {
             before(grammarAccess.getRatingAccess().getRightSquareBracketKeyword_9()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Rating__Group__9__Impl5391); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2733:1: rule__YesNo__Group__0 : rule__YesNo__Group__0__Impl rule__YesNo__Group__1 ;
    public final void rule__YesNo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2737:1: ( rule__YesNo__Group__0__Impl rule__YesNo__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2738:2: rule__YesNo__Group__0__Impl rule__YesNo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__0__Impl_in_rule__YesNo__Group__05442);
            rule__YesNo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__1_in_rule__YesNo__Group__05445);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2745:1: rule__YesNo__Group__0__Impl : ( 'Q' ) ;
    public final void rule__YesNo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2749:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2750:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2750:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2751:1: 'Q'
            {
             before(grammarAccess.getYesNoAccess().getQKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__YesNo__Group__0__Impl5473); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2764:1: rule__YesNo__Group__1 : rule__YesNo__Group__1__Impl rule__YesNo__Group__2 ;
    public final void rule__YesNo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2768:1: ( rule__YesNo__Group__1__Impl rule__YesNo__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2769:2: rule__YesNo__Group__1__Impl rule__YesNo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__1__Impl_in_rule__YesNo__Group__15504);
            rule__YesNo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__2_in_rule__YesNo__Group__15507);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2776:1: rule__YesNo__Group__1__Impl : ( ( rule__YesNo__IsMandatoryAssignment_1 )? ) ;
    public final void rule__YesNo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2780:1: ( ( ( rule__YesNo__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2781:1: ( ( rule__YesNo__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2781:1: ( ( rule__YesNo__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2782:1: ( rule__YesNo__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getYesNoAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2783:1: ( rule__YesNo__IsMandatoryAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2783:2: rule__YesNo__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__YesNo__IsMandatoryAssignment_1_in_rule__YesNo__Group__1__Impl5534);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2793:1: rule__YesNo__Group__2 : rule__YesNo__Group__2__Impl rule__YesNo__Group__3 ;
    public final void rule__YesNo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2797:1: ( rule__YesNo__Group__2__Impl rule__YesNo__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2798:2: rule__YesNo__Group__2__Impl rule__YesNo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__2__Impl_in_rule__YesNo__Group__25565);
            rule__YesNo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__3_in_rule__YesNo__Group__25568);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2805:1: rule__YesNo__Group__2__Impl : ( ( rule__YesNo__QuestionTextAssignment_2 ) ) ;
    public final void rule__YesNo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2809:1: ( ( ( rule__YesNo__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2810:1: ( ( rule__YesNo__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2810:1: ( ( rule__YesNo__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2811:1: ( rule__YesNo__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getYesNoAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2812:1: ( rule__YesNo__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2812:2: rule__YesNo__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__QuestionTextAssignment_2_in_rule__YesNo__Group__2__Impl5595);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2822:1: rule__YesNo__Group__3 : rule__YesNo__Group__3__Impl rule__YesNo__Group__4 ;
    public final void rule__YesNo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2826:1: ( rule__YesNo__Group__3__Impl rule__YesNo__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2827:2: rule__YesNo__Group__3__Impl rule__YesNo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__3__Impl_in_rule__YesNo__Group__35625);
            rule__YesNo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__4_in_rule__YesNo__Group__35628);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2834:1: rule__YesNo__Group__3__Impl : ( '[' ) ;
    public final void rule__YesNo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2838:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2839:1: ( '[' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2839:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2840:1: '['
            {
             before(grammarAccess.getYesNoAccess().getLeftSquareBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__YesNo__Group__3__Impl5656); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2853:1: rule__YesNo__Group__4 : rule__YesNo__Group__4__Impl rule__YesNo__Group__5 ;
    public final void rule__YesNo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2857:1: ( rule__YesNo__Group__4__Impl rule__YesNo__Group__5 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2858:2: rule__YesNo__Group__4__Impl rule__YesNo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__4__Impl_in_rule__YesNo__Group__45687);
            rule__YesNo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__5_in_rule__YesNo__Group__45690);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2865:1: rule__YesNo__Group__4__Impl : ( 'y/n' ) ;
    public final void rule__YesNo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2869:1: ( ( 'y/n' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2870:1: ( 'y/n' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2870:1: ( 'y/n' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2871:1: 'y/n'
            {
             before(grammarAccess.getYesNoAccess().getYNKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__YesNo__Group__4__Impl5718); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2884:1: rule__YesNo__Group__5 : rule__YesNo__Group__5__Impl ;
    public final void rule__YesNo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2888:1: ( rule__YesNo__Group__5__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2889:2: rule__YesNo__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNo__Group__5__Impl_in_rule__YesNo__Group__55749);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2895:1: rule__YesNo__Group__5__Impl : ( ']' ) ;
    public final void rule__YesNo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2899:1: ( ( ']' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2900:1: ( ']' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2900:1: ( ']' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2901:1: ']'
            {
             before(grammarAccess.getYesNoAccess().getRightSquareBracketKeyword_5()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__YesNo__Group__5__Impl5777); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2926:1: rule__OpenField__Group__0 : rule__OpenField__Group__0__Impl rule__OpenField__Group__1 ;
    public final void rule__OpenField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2930:1: ( rule__OpenField__Group__0__Impl rule__OpenField__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2931:2: rule__OpenField__Group__0__Impl rule__OpenField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__0__Impl_in_rule__OpenField__Group__05820);
            rule__OpenField__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__1_in_rule__OpenField__Group__05823);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2938:1: rule__OpenField__Group__0__Impl : ( 'Q' ) ;
    public final void rule__OpenField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2942:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2943:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2943:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2944:1: 'Q'
            {
             before(grammarAccess.getOpenFieldAccess().getQKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__OpenField__Group__0__Impl5851); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2957:1: rule__OpenField__Group__1 : rule__OpenField__Group__1__Impl rule__OpenField__Group__2 ;
    public final void rule__OpenField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2961:1: ( rule__OpenField__Group__1__Impl rule__OpenField__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2962:2: rule__OpenField__Group__1__Impl rule__OpenField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__1__Impl_in_rule__OpenField__Group__15882);
            rule__OpenField__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__2_in_rule__OpenField__Group__15885);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2969:1: rule__OpenField__Group__1__Impl : ( ( rule__OpenField__IsMandatoryAssignment_1 )? ) ;
    public final void rule__OpenField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2973:1: ( ( ( rule__OpenField__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2974:1: ( ( rule__OpenField__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2974:1: ( ( rule__OpenField__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2975:1: ( rule__OpenField__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getOpenFieldAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2976:1: ( rule__OpenField__IsMandatoryAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2976:2: rule__OpenField__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OpenField__IsMandatoryAssignment_1_in_rule__OpenField__Group__1__Impl5912);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2986:1: rule__OpenField__Group__2 : rule__OpenField__Group__2__Impl ;
    public final void rule__OpenField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2990:1: ( rule__OpenField__Group__2__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2991:2: rule__OpenField__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__Group__2__Impl_in_rule__OpenField__Group__25943);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:2997:1: rule__OpenField__Group__2__Impl : ( ( rule__OpenField__QuestionTextAssignment_2 ) ) ;
    public final void rule__OpenField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3001:1: ( ( ( rule__OpenField__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3002:1: ( ( rule__OpenField__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3002:1: ( ( rule__OpenField__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3003:1: ( rule__OpenField__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getOpenFieldAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3004:1: ( rule__OpenField__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3004:2: rule__OpenField__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OpenField__QuestionTextAssignment_2_in_rule__OpenField__Group__2__Impl5970);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3020:1: rule__MutuallyExclusive_Impl__Group__0 : rule__MutuallyExclusive_Impl__Group__0__Impl rule__MutuallyExclusive_Impl__Group__1 ;
    public final void rule__MutuallyExclusive_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3024:1: ( rule__MutuallyExclusive_Impl__Group__0__Impl rule__MutuallyExclusive_Impl__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3025:2: rule__MutuallyExclusive_Impl__Group__0__Impl rule__MutuallyExclusive_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__0__Impl_in_rule__MutuallyExclusive_Impl__Group__06006);
            rule__MutuallyExclusive_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__1_in_rule__MutuallyExclusive_Impl__Group__06009);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3032:1: rule__MutuallyExclusive_Impl__Group__0__Impl : ( 'Q' ) ;
    public final void rule__MutuallyExclusive_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3036:1: ( ( 'Q' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3037:1: ( 'Q' )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3037:1: ( 'Q' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3038:1: 'Q'
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getQKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MutuallyExclusive_Impl__Group__0__Impl6037); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3051:1: rule__MutuallyExclusive_Impl__Group__1 : rule__MutuallyExclusive_Impl__Group__1__Impl rule__MutuallyExclusive_Impl__Group__2 ;
    public final void rule__MutuallyExclusive_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3055:1: ( rule__MutuallyExclusive_Impl__Group__1__Impl rule__MutuallyExclusive_Impl__Group__2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3056:2: rule__MutuallyExclusive_Impl__Group__1__Impl rule__MutuallyExclusive_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__1__Impl_in_rule__MutuallyExclusive_Impl__Group__16068);
            rule__MutuallyExclusive_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__2_in_rule__MutuallyExclusive_Impl__Group__16071);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3063:1: rule__MutuallyExclusive_Impl__Group__1__Impl : ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? ) ;
    public final void rule__MutuallyExclusive_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3067:1: ( ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3068:1: ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3068:1: ( ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3069:1: ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAssignment_1()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3070:1: ( rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3070:2: rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1_in_rule__MutuallyExclusive_Impl__Group__1__Impl6098);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3080:1: rule__MutuallyExclusive_Impl__Group__2 : rule__MutuallyExclusive_Impl__Group__2__Impl rule__MutuallyExclusive_Impl__Group__3 ;
    public final void rule__MutuallyExclusive_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3084:1: ( rule__MutuallyExclusive_Impl__Group__2__Impl rule__MutuallyExclusive_Impl__Group__3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3085:2: rule__MutuallyExclusive_Impl__Group__2__Impl rule__MutuallyExclusive_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__2__Impl_in_rule__MutuallyExclusive_Impl__Group__26129);
            rule__MutuallyExclusive_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__3_in_rule__MutuallyExclusive_Impl__Group__26132);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3092:1: rule__MutuallyExclusive_Impl__Group__2__Impl : ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) ) ;
    public final void rule__MutuallyExclusive_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3096:1: ( ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3097:1: ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3097:1: ( ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3098:1: ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 )
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextAssignment_2()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3099:1: ( rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3099:2: rule__MutuallyExclusive_Impl__QuestionTextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__QuestionTextAssignment_2_in_rule__MutuallyExclusive_Impl__Group__2__Impl6159);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3109:1: rule__MutuallyExclusive_Impl__Group__3 : rule__MutuallyExclusive_Impl__Group__3__Impl rule__MutuallyExclusive_Impl__Group__4 ;
    public final void rule__MutuallyExclusive_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3113:1: ( rule__MutuallyExclusive_Impl__Group__3__Impl rule__MutuallyExclusive_Impl__Group__4 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3114:2: rule__MutuallyExclusive_Impl__Group__3__Impl rule__MutuallyExclusive_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__3__Impl_in_rule__MutuallyExclusive_Impl__Group__36189);
            rule__MutuallyExclusive_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__4_in_rule__MutuallyExclusive_Impl__Group__36192);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3121:1: rule__MutuallyExclusive_Impl__Group__3__Impl : ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) ) ;
    public final void rule__MutuallyExclusive_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3125:1: ( ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3126:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3126:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3127:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 )
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAssignment_3()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3128:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_3 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3128:2: rule__MutuallyExclusive_Impl__AnswersAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_3_in_rule__MutuallyExclusive_Impl__Group__3__Impl6219);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3138:1: rule__MutuallyExclusive_Impl__Group__4 : rule__MutuallyExclusive_Impl__Group__4__Impl ;
    public final void rule__MutuallyExclusive_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3142:1: ( rule__MutuallyExclusive_Impl__Group__4__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3143:2: rule__MutuallyExclusive_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__Group__4__Impl_in_rule__MutuallyExclusive_Impl__Group__46249);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3149:1: rule__MutuallyExclusive_Impl__Group__4__Impl : ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* ) ;
    public final void rule__MutuallyExclusive_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3153:1: ( ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3154:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3154:1: ( ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )* )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3155:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )*
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAssignment_4()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3156:1: ( rule__MutuallyExclusive_Impl__AnswersAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3156:2: rule__MutuallyExclusive_Impl__AnswersAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_4_in_rule__MutuallyExclusive_Impl__Group__4__Impl6276);
            	    rule__MutuallyExclusive_Impl__AnswersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3176:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3180:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3181:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06317);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06320);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3188:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3192:1: ( ( ( '-' )? ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3193:1: ( ( '-' )? )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3193:1: ( ( '-' )? )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3194:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3195:1: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3196:2: '-'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__EInt__Group__0__Impl6349); 

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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3207:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3211:1: ( rule__EInt__Group__1__Impl )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3212:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16382);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3218:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3222:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3223:1: ( RULE_INT )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3223:1: ( RULE_INT )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3224:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6409); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3240:1: rule__Survey__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3244:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3245:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3245:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3246:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16447);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3255:1: rule__Survey__DateAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Survey__DateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3259:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3260:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3260:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3261:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getDateEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__DateAssignment_2_16478);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3270:1: rule__Survey__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Survey__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3274:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3275:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3275:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3276:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__DescriptionAssignment_3_16509);
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


    // $ANTLR start "rule__Survey__EmailAssignment_4_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3285:1: rule__Survey__EmailAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Survey__EmailAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3289:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3290:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3290:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3291:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getEmailEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__EmailAssignment_4_16540);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getEmailEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Survey__EmailAssignment_4_1"


    // $ANTLR start "rule__Survey__PersonAssignment_5"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3300:1: rule__Survey__PersonAssignment_5 : ( rulePerson ) ;
    public final void rule__Survey__PersonAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3304:1: ( ( rulePerson ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3305:1: ( rulePerson )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3305:1: ( rulePerson )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3306:1: rulePerson
            {
             before(grammarAccess.getSurveyAccess().getPersonPersonParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_rule__Survey__PersonAssignment_56571);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPersonPersonParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Survey__PersonAssignment_5"


    // $ANTLR start "rule__Survey__CategoriesAssignment_6"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3315:1: rule__Survey__CategoriesAssignment_6 : ( ruleCategory ) ;
    public final void rule__Survey__CategoriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3319:1: ( ( ruleCategory ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3320:1: ( ruleCategory )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3320:1: ( ruleCategory )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3321:1: ruleCategory
            {
             before(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_66602);
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


    // $ANTLR start "rule__Survey__CategoriesAssignment_7"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3330:1: rule__Survey__CategoriesAssignment_7 : ( ruleCategory ) ;
    public final void rule__Survey__CategoriesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3334:1: ( ( ruleCategory ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3335:1: ( ruleCategory )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3335:1: ( ruleCategory )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3336:1: ruleCategory
            {
             before(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_76633);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Survey__CategoriesAssignment_7"


    // $ANTLR start "rule__Category__TitleAssignment_1"
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3345:1: rule__Category__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Category__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3349:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3350:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3350:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3351:1: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Category__TitleAssignment_16664);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3360:1: rule__Category__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Category__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3364:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3365:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3365:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3366:1: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Category__DescriptionAssignment_2_16695);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3375:1: rule__Category__PagesAssignment_3 : ( rulePage ) ;
    public final void rule__Category__PagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3379:1: ( ( rulePage ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3380:1: ( rulePage )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3380:1: ( rulePage )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3381:1: rulePage
            {
             before(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Category__PagesAssignment_36726);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3390:1: rule__Category__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Category__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3394:1: ( ( rulePage ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3395:1: ( rulePage )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3395:1: ( rulePage )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3396:1: rulePage
            {
             before(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Category__PagesAssignment_46757);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3405:1: rule__Person__AttributeAssignment_1 : ( rulePersonAttribute ) ;
    public final void rule__Person__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3409:1: ( ( rulePersonAttribute ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3410:1: ( rulePersonAttribute )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3410:1: ( rulePersonAttribute )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3411:1: rulePersonAttribute
            {
             before(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_16788);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3420:1: rule__Person__AttributeAssignment_2_1 : ( rulePersonAttribute ) ;
    public final void rule__Person__AttributeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3424:1: ( ( rulePersonAttribute ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3425:1: ( rulePersonAttribute )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3425:1: ( rulePersonAttribute )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3426:1: rulePersonAttribute
            {
             before(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_2_16819);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3435:1: rule__Page__QuestionsAssignment_1 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3439:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3440:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3440:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3441:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_16850);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3450:1: rule__Page__QuestionsAssignment_2 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3454:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3455:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3455:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3456:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_26881);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3465:1: rule__Answer__DescriptionAssignment_2 : ( ruleEString ) ;
    public final void rule__Answer__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3469:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3470:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3470:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3471:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getDescriptionEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__DescriptionAssignment_26912);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3480:1: rule__Answer__IsUserInputAllowedAssignment_3_0 : ( ( '[' ) ) ;
    public final void rule__Answer__IsUserInputAllowedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3484:1: ( ( ( '[' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3485:1: ( ( '[' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3485:1: ( ( '[' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3486:1: ( '[' )
            {
             before(grammarAccess.getAnswerAccess().getIsUserInputAllowedLeftSquareBracketKeyword_3_0_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3487:1: ( '[' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3488:1: '['
            {
             before(grammarAccess.getAnswerAccess().getIsUserInputAllowedLeftSquareBracketKeyword_3_0_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Answer__IsUserInputAllowedAssignment_3_06948); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3503:1: rule__Answer__SubquestionAssignment_4_1 : ( ruleQuestion ) ;
    public final void rule__Answer__SubquestionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3507:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3508:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3508:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3509:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_16987);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3518:1: rule__Answer__SubquestionAssignment_4_2 : ( ruleQuestion ) ;
    public final void rule__Answer__SubquestionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3522:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3523:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3523:1: ( ruleQuestion )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3524:1: ruleQuestion
            {
             before(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_27018);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3533:1: rule__MultipleChoice_Impl__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__MultipleChoice_Impl__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3537:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3538:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3538:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3539:1: ( '*' )
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3540:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3541:1: '*'
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MultipleChoice_Impl__IsMandatoryAssignment_17054); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3556:1: rule__MultipleChoice_Impl__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__MultipleChoice_Impl__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3560:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3561:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3561:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3562:1: ruleEString
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice_Impl__QuestionTextAssignment_27093);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3571:1: rule__MultipleChoice_Impl__MinAssignment_4 : ( ruleEInt ) ;
    public final void rule__MultipleChoice_Impl__MinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3575:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3576:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3576:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3577:1: ruleEInt
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMinEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MinAssignment_47124);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3586:1: rule__MultipleChoice_Impl__MaxAssignment_6 : ( ruleEInt ) ;
    public final void rule__MultipleChoice_Impl__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3590:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3591:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3591:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3592:1: ruleEInt
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getMaxEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MaxAssignment_67155);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3601:1: rule__MultipleChoice_Impl__AnswersAssignment_8 : ( ruleAnswer ) ;
    public final void rule__MultipleChoice_Impl__AnswersAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3605:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3606:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3606:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3607:1: ruleAnswer
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_87186);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3616:1: rule__MultipleChoice_Impl__AnswersAssignment_9 : ( ruleAnswer ) ;
    public final void rule__MultipleChoice_Impl__AnswersAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3620:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3621:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3621:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3622:1: ruleAnswer
            {
             before(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_97217);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3631:1: rule__Ranking__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Ranking__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3635:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3636:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3636:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3637:1: ( '*' )
            {
             before(grammarAccess.getRankingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3638:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3639:1: '*'
            {
             before(grammarAccess.getRankingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Ranking__IsMandatoryAssignment_17253); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3654:1: rule__Ranking__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__Ranking__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3658:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3659:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3659:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3660:1: ruleEString
            {
             before(grammarAccess.getRankingAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ranking__QuestionTextAssignment_27292);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3669:1: rule__Ranking__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Ranking__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3673:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3674:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3674:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3675:1: ruleAnswer
            {
             before(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_67323);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3684:1: rule__Ranking__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__Ranking__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3688:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3689:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3689:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3690:1: ruleAnswer
            {
             before(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_77354);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3699:1: rule__Rating__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Rating__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3703:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3704:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3704:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3705:1: ( '*' )
            {
             before(grammarAccess.getRatingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3706:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3707:1: '*'
            {
             before(grammarAccess.getRatingAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Rating__IsMandatoryAssignment_17390); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3722:1: rule__Rating__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__Rating__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3726:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3727:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3727:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3728:1: ruleEString
            {
             before(grammarAccess.getRatingAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Rating__QuestionTextAssignment_27429);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3737:1: rule__Rating__StartAssignment_4 : ( ruleEInt ) ;
    public final void rule__Rating__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3741:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3742:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3742:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3743:1: ruleEInt
            {
             before(grammarAccess.getRatingAccess().getStartEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating__StartAssignment_47460);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3752:1: rule__Rating__EndAssignment_6 : ( ruleEInt ) ;
    public final void rule__Rating__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3756:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3757:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3757:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3758:1: ruleEInt
            {
             before(grammarAccess.getRatingAccess().getEndEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating__EndAssignment_67491);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3767:1: rule__Rating__IntervalAssignment_8 : ( ruleEInt ) ;
    public final void rule__Rating__IntervalAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3771:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3772:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3772:1: ( ruleEInt )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3773:1: ruleEInt
            {
             before(grammarAccess.getRatingAccess().getIntervalEIntParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Rating__IntervalAssignment_87522);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3782:1: rule__YesNo__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__YesNo__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3786:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3787:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3787:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3788:1: ( '*' )
            {
             before(grammarAccess.getYesNoAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3789:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3790:1: '*'
            {
             before(grammarAccess.getYesNoAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__YesNo__IsMandatoryAssignment_17558); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3805:1: rule__YesNo__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__YesNo__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3809:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3810:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3810:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3811:1: ruleEString
            {
             before(grammarAccess.getYesNoAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__YesNo__QuestionTextAssignment_27597);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3820:1: rule__OpenField__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__OpenField__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3824:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3825:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3825:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3826:1: ( '*' )
            {
             before(grammarAccess.getOpenFieldAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3827:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3828:1: '*'
            {
             before(grammarAccess.getOpenFieldAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__OpenField__IsMandatoryAssignment_17633); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3843:1: rule__OpenField__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__OpenField__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3847:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3848:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3848:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3849:1: ruleEString
            {
             before(grammarAccess.getOpenFieldAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OpenField__QuestionTextAssignment_27672);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3858:1: rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1 : ( ( '*' ) ) ;
    public final void rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3862:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3863:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3863:1: ( ( '*' ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3864:1: ( '*' )
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3865:1: ( '*' )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3866:1: '*'
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAsteriskKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_17708); 
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3881:1: rule__MutuallyExclusive_Impl__QuestionTextAssignment_2 : ( ruleEString ) ;
    public final void rule__MutuallyExclusive_Impl__QuestionTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3885:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3886:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3886:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3887:1: ruleEString
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MutuallyExclusive_Impl__QuestionTextAssignment_27747);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3896:1: rule__MutuallyExclusive_Impl__AnswersAssignment_3 : ( ruleAnswer ) ;
    public final void rule__MutuallyExclusive_Impl__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3900:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3901:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3901:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3902:1: ruleAnswer
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_37778);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3911:1: rule__MutuallyExclusive_Impl__AnswersAssignment_4 : ( ruleAnswer ) ;
    public final void rule__MutuallyExclusive_Impl__AnswersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3915:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3916:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3916:1: ( ruleAnswer )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3917:1: ruleAnswer
            {
             before(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_47809);
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
    // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3926:1: rule__PersonAttribute__KeyAssignment : ( ruleEString ) ;
    public final void rule__PersonAttribute__KeyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3930:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3931:1: ( ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3931:1: ( ruleEString )
            // ../dk.itu.smdp.survey.xtext.ui/src-gen/dk/itu/smdp/survey/xtext/ui/contentassist/antlr/internal/InternalTaco.g:3932:1: ruleEString
            {
             before(grammarAccess.getPersonAttributeAccess().getKeyEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PersonAttribute__KeyAssignment7840);
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
        "\1\30\2\4\2\17\1\6\2\uffff\1\6\1\32\2\uffff\2\6\1\21\2\uffff";
    static final String DFA1_maxS =
        "\1\30\1\35\1\5\2\31\1\34\2\uffff\1\6\1\32\2\uffff\1\32\1\6\1\25"+
        "\2\uffff";
    static final String DFA1_acceptS =
        "\6\uffff\1\6\1\5\2\uffff\1\4\1\2\3\uffff\1\1\1\3";
    static final String DFA1_specialS =
        "\21\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\3\1\4\27\uffff\1\2",
            "\1\3\1\4",
            "\1\7\2\uffff\1\7\1\6\3\uffff\2\7\1\5",
            "\1\7\2\uffff\1\7\1\6\3\uffff\2\7\1\5",
            "\1\11\23\uffff\1\10\1\13\1\12",
            "",
            "",
            "\1\11",
            "\1\14",
            "",
            "",
            "\1\16\23\uffff\1\15",
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
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11199 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__TitleAssignment_1_in_rule__Survey__Group__1__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21259 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0_in_rule__Survey__Group__2__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31320 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__0_in_rule__Survey__Group__3__Impl1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41381 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_4__0_in_rule__Survey__Group__4__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51442 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__51445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PersonAssignment_5_in_rule__Survey__Group__5__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__61503 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_rule__Survey__Group__7_in_rule__Survey__Group__61506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__CategoriesAssignment_6_in_rule__Survey__Group__6__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__7__Impl_in_rule__Survey__Group__71563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__CategoriesAssignment_7_in_rule__Survey__Group__7__Impl1590 = new BitSet(new long[]{0x000000000001F002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__0__Impl_in_rule__Survey__Group_2__01637 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1_in_rule__Survey__Group_2__01640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group_2__0__Impl1668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_2__1__Impl_in_rule__Survey__Group_2__11699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__DateAssignment_2_1_in_rule__Survey__Group_2__1__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__0__Impl_in_rule__Survey__Group_3__01760 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__1_in_rule__Survey__Group_3__01763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group_3__0__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_3__1__Impl_in_rule__Survey__Group_3__11822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__DescriptionAssignment_3_1_in_rule__Survey__Group_3__1__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_4__0__Impl_in_rule__Survey__Group_4__01883 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group_4__1_in_rule__Survey__Group_4__01886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Survey__Group_4__0__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_4__1__Impl_in_rule__Survey__Group_4__11945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__EmailAssignment_4_1_in_rule__Survey__Group_4__1__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__02006 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__02009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Category__Group__0__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__12068 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Category__Group__2_in_rule__Category__Group__12071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__TitleAssignment_1_in_rule__Category__Group__1__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__22128 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Category__Group__3_in_rule__Category__Group__22131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group_2__0_in_rule__Category__Group__2__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__32189 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Category__Group__4_in_rule__Category__Group__32192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__PagesAssignment_3_in_rule__Category__Group__3__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__42249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__PagesAssignment_4_in_rule__Category__Group__4__Impl2276 = new BitSet(new long[]{0x0000000000042002L});
        public static final BitSet FOLLOW_rule__Category__Group_2__0__Impl_in_rule__Category__Group_2__02317 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Category__Group_2__1_in_rule__Category__Group_2__02320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Category__Group_2__0__Impl2348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Group_2__1__Impl_in_rule__Category__Group_2__12379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__DescriptionAssignment_2_1_in_rule__Category__Group_2__1__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__02440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Person__Group__1_in_rule__Person__Group__02443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Person__Group__0__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__12502 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Person__Group__2_in_rule__Person__Group__12505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__AttributeAssignment_1_in_rule__Person__Group__1__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group__2__Impl_in_rule__Person__Group__22562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__0_in_rule__Person__Group__2__Impl2589 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__0__Impl_in_rule__Person__Group_2__02626 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Person__Group_2__1_in_rule__Person__Group_2__02629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Person__Group_2__0__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__Group_2__1__Impl_in_rule__Person__Group_2__12688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Person__AttributeAssignment_2_1_in_rule__Person__Group_2__1__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02749 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Page__Group__0__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12811 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_1_in_rule__Page__Group__1__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_2_in_rule__Page__Group__2__Impl2898 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02935 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12996 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Answer__Group__1__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__23058 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__23061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__DescriptionAssignment_2_in_rule__Answer__Group__2__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__33118 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Answer__Group__4_in_rule__Answer__Group__33121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0_in_rule__Answer__Group__3__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__4__Impl_in_rule__Answer__Group__43179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__0_in_rule__Answer__Group__4__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__0__Impl_in_rule__Answer__Group_3__03247 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1_in_rule__Answer__Group_3__03250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsUserInputAllowedAssignment_3_0_in_rule__Answer__Group_3__0__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__1__Impl_in_rule__Answer__Group_3__13307 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2_in_rule__Answer__Group_3__13310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Answer__Group_3__1__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_3__2__Impl_in_rule__Answer__Group_3__23369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Answer__Group_3__2__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__0__Impl_in_rule__Answer__Group_4__03434 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__1_in_rule__Answer__Group_4__03437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Answer__Group_4__0__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__1__Impl_in_rule__Answer__Group_4__13496 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__2_in_rule__Answer__Group_4__13499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__SubquestionAssignment_4_1_in_rule__Answer__Group_4__1__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__2__Impl_in_rule__Answer__Group_4__23556 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__3_in_rule__Answer__Group_4__23559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__SubquestionAssignment_4_2_in_rule__Answer__Group_4__2__Impl3586 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_rule__Answer__Group_4__3__Impl_in_rule__Answer__Group_4__33617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Answer__Group_4__3__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__0__Impl_in_rule__MultipleChoice_Impl__Group__03684 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__1_in_rule__MultipleChoice_Impl__Group__03687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MultipleChoice_Impl__Group__0__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__1__Impl_in_rule__MultipleChoice_Impl__Group__13746 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__2_in_rule__MultipleChoice_Impl__Group__13749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__IsMandatoryAssignment_1_in_rule__MultipleChoice_Impl__Group__1__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__2__Impl_in_rule__MultipleChoice_Impl__Group__23807 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__3_in_rule__MultipleChoice_Impl__Group__23810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__QuestionTextAssignment_2_in_rule__MultipleChoice_Impl__Group__2__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__3__Impl_in_rule__MultipleChoice_Impl__Group__33867 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__4_in_rule__MultipleChoice_Impl__Group__33870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MultipleChoice_Impl__Group__3__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__4__Impl_in_rule__MultipleChoice_Impl__Group__43929 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__5_in_rule__MultipleChoice_Impl__Group__43932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__MinAssignment_4_in_rule__MultipleChoice_Impl__Group__4__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__5__Impl_in_rule__MultipleChoice_Impl__Group__53989 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__6_in_rule__MultipleChoice_Impl__Group__53992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MultipleChoice_Impl__Group__5__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__6__Impl_in_rule__MultipleChoice_Impl__Group__64051 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__7_in_rule__MultipleChoice_Impl__Group__64054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__MaxAssignment_6_in_rule__MultipleChoice_Impl__Group__6__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__7__Impl_in_rule__MultipleChoice_Impl__Group__74111 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__8_in_rule__MultipleChoice_Impl__Group__74114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MultipleChoice_Impl__Group__7__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__8__Impl_in_rule__MultipleChoice_Impl__Group__84173 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__9_in_rule__MultipleChoice_Impl__Group__84176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_8_in_rule__MultipleChoice_Impl__Group__8__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__Group__9__Impl_in_rule__MultipleChoice_Impl__Group__94233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice_Impl__AnswersAssignment_9_in_rule__MultipleChoice_Impl__Group__9__Impl4260 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__0__Impl_in_rule__Ranking__Group__04311 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__Ranking__Group__1_in_rule__Ranking__Group__04314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Ranking__Group__0__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__1__Impl_in_rule__Ranking__Group__14373 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__Ranking__Group__2_in_rule__Ranking__Group__14376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__IsMandatoryAssignment_1_in_rule__Ranking__Group__1__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__2__Impl_in_rule__Ranking__Group__24434 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__3_in_rule__Ranking__Group__24437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__QuestionTextAssignment_2_in_rule__Ranking__Group__2__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__3__Impl_in_rule__Ranking__Group__34494 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__4_in_rule__Ranking__Group__34497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Ranking__Group__3__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__4__Impl_in_rule__Ranking__Group__44556 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__5_in_rule__Ranking__Group__44559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ranking__Group__4__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__5__Impl_in_rule__Ranking__Group__54618 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__6_in_rule__Ranking__Group__54621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Ranking__Group__5__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__6__Impl_in_rule__Ranking__Group__64680 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Ranking__Group__7_in_rule__Ranking__Group__64683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__AnswersAssignment_6_in_rule__Ranking__Group__6__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__Group__7__Impl_in_rule__Ranking__Group__74740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ranking__AnswersAssignment_7_in_rule__Ranking__Group__7__Impl4767 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Rating__Group__0__Impl_in_rule__Rating__Group__04814 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__Rating__Group__1_in_rule__Rating__Group__04817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Rating__Group__0__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__1__Impl_in_rule__Rating__Group__14876 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__Rating__Group__2_in_rule__Rating__Group__14879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__IsMandatoryAssignment_1_in_rule__Rating__Group__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__2__Impl_in_rule__Rating__Group__24937 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Rating__Group__3_in_rule__Rating__Group__24940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__QuestionTextAssignment_2_in_rule__Rating__Group__2__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__3__Impl_in_rule__Rating__Group__34997 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__Rating__Group__4_in_rule__Rating__Group__35000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Rating__Group__3__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__4__Impl_in_rule__Rating__Group__45059 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Rating__Group__5_in_rule__Rating__Group__45062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__StartAssignment_4_in_rule__Rating__Group__4__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__5__Impl_in_rule__Rating__Group__55119 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__Rating__Group__6_in_rule__Rating__Group__55122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Rating__Group__5__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__6__Impl_in_rule__Rating__Group__65181 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Rating__Group__7_in_rule__Rating__Group__65184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__EndAssignment_6_in_rule__Rating__Group__6__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__7__Impl_in_rule__Rating__Group__75241 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__Rating__Group__8_in_rule__Rating__Group__75244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Rating__Group__7__Impl5272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__8__Impl_in_rule__Rating__Group__85303 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Rating__Group__9_in_rule__Rating__Group__85306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__IntervalAssignment_8_in_rule__Rating__Group__8__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rating__Group__9__Impl_in_rule__Rating__Group__95363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Rating__Group__9__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__0__Impl_in_rule__YesNo__Group__05442 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__YesNo__Group__1_in_rule__YesNo__Group__05445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__YesNo__Group__0__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__1__Impl_in_rule__YesNo__Group__15504 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__YesNo__Group__2_in_rule__YesNo__Group__15507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__IsMandatoryAssignment_1_in_rule__YesNo__Group__1__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__2__Impl_in_rule__YesNo__Group__25565 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__YesNo__Group__3_in_rule__YesNo__Group__25568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__QuestionTextAssignment_2_in_rule__YesNo__Group__2__Impl5595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__3__Impl_in_rule__YesNo__Group__35625 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__YesNo__Group__4_in_rule__YesNo__Group__35628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__YesNo__Group__3__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__4__Impl_in_rule__YesNo__Group__45687 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__YesNo__Group__5_in_rule__YesNo__Group__45690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__YesNo__Group__4__Impl5718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNo__Group__5__Impl_in_rule__YesNo__Group__55749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__YesNo__Group__5__Impl5777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__Group__0__Impl_in_rule__OpenField__Group__05820 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__OpenField__Group__1_in_rule__OpenField__Group__05823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__OpenField__Group__0__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__Group__1__Impl_in_rule__OpenField__Group__15882 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__OpenField__Group__2_in_rule__OpenField__Group__15885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__IsMandatoryAssignment_1_in_rule__OpenField__Group__1__Impl5912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__Group__2__Impl_in_rule__OpenField__Group__25943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OpenField__QuestionTextAssignment_2_in_rule__OpenField__Group__2__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__0__Impl_in_rule__MutuallyExclusive_Impl__Group__06006 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__1_in_rule__MutuallyExclusive_Impl__Group__06009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MutuallyExclusive_Impl__Group__0__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__1__Impl_in_rule__MutuallyExclusive_Impl__Group__16068 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__2_in_rule__MutuallyExclusive_Impl__Group__16071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_1_in_rule__MutuallyExclusive_Impl__Group__1__Impl6098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__2__Impl_in_rule__MutuallyExclusive_Impl__Group__26129 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__3_in_rule__MutuallyExclusive_Impl__Group__26132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__QuestionTextAssignment_2_in_rule__MutuallyExclusive_Impl__Group__2__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__3__Impl_in_rule__MutuallyExclusive_Impl__Group__36189 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__4_in_rule__MutuallyExclusive_Impl__Group__36192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_3_in_rule__MutuallyExclusive_Impl__Group__3__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__Group__4__Impl_in_rule__MutuallyExclusive_Impl__Group__46249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MutuallyExclusive_Impl__AnswersAssignment_4_in_rule__MutuallyExclusive_Impl__Group__4__Impl6276 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06317 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__EInt__Group__0__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__16382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__DateAssignment_2_16478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__DescriptionAssignment_3_16509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__EmailAssignment_4_16540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePerson_in_rule__Survey__PersonAssignment_56571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_66602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Survey__CategoriesAssignment_76633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Category__TitleAssignment_16664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Category__DescriptionAssignment_2_16695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Category__PagesAssignment_36726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Category__PagesAssignment_46757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_16788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rule__Person__AttributeAssignment_2_16819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_16850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_26881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__DescriptionAssignment_26912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Answer__IsUserInputAllowedAssignment_3_06948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_16987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__Answer__SubquestionAssignment_4_27018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MultipleChoice_Impl__IsMandatoryAssignment_17054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice_Impl__QuestionTextAssignment_27093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MinAssignment_47124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MultipleChoice_Impl__MaxAssignment_67155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_87186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultipleChoice_Impl__AnswersAssignment_97217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Ranking__IsMandatoryAssignment_17253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ranking__QuestionTextAssignment_27292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_67323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Ranking__AnswersAssignment_77354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Rating__IsMandatoryAssignment_17390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Rating__QuestionTextAssignment_27429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating__StartAssignment_47460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating__EndAssignment_67491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Rating__IntervalAssignment_87522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__YesNo__IsMandatoryAssignment_17558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__YesNo__QuestionTextAssignment_27597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__OpenField__IsMandatoryAssignment_17633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OpenField__QuestionTextAssignment_27672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MutuallyExclusive_Impl__IsMandatoryAssignment_17708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MutuallyExclusive_Impl__QuestionTextAssignment_27747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_37778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MutuallyExclusive_Impl__AnswersAssignment_47809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PersonAttribute__KeyAssignment7840 = new BitSet(new long[]{0x0000000000000002L});
    }


}