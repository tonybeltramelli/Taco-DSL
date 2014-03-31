package dk.itu.smdp.survey.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.smdp.survey.xtext.services.TacoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTacoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "':'", "'date'", "'description'", "'category'", "'<'", "'>'", "'person'", "','", "'step'", "'true'", "'false'", "'option'", "'isCheckedByDefault'", "'isUserInputAllowed'", "'multipleChoice'", "'questionText'", "'isMandatory'", "'min'", "'max'", "'subQuestions'", "'ranking'", "'rating'", "'start'", "'end'", "'interval'", "'yesNo'", "'openField'", "'mutuallyExclusive'", "'text'", "'image'", "'-'", "'.'", "'E'", "'e'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g"; }



     	private TacoGrammarAccess grammarAccess;
     	
        public InternalTacoParser(TokenStream input, TacoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Survey";	
       	}
       	
       	@Override
       	protected TacoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurvey"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSurvey85); 

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
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? ( (lv_person_9_0= rulePerson ) )? ( (lv_categories_10_0= ruleCategory ) ) ( (lv_categories_11_0= ruleCategory ) )* ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_title_2_0 = null;

        AntlrDatatypeRuleToken lv_date_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_person_9_0 = null;

        EObject lv_categories_10_0 = null;

        EObject lv_categories_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:79:28: ( (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? ( (lv_person_9_0= rulePerson ) )? ( (lv_categories_10_0= ruleCategory ) ) ( (lv_categories_11_0= ruleCategory ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:80:1: (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? ( (lv_person_9_0= rulePerson ) )? ( (lv_categories_10_0= ruleCategory ) ) ( (lv_categories_11_0= ruleCategory ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:80:1: (otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? ( (lv_person_9_0= rulePerson ) )? ( (lv_categories_10_0= ruleCategory ) ) ( (lv_categories_11_0= ruleCategory ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:80:3: otherlv_0= 'title' otherlv_1= ':' ( (lv_title_2_0= ruleEString ) ) (otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? ( (lv_person_9_0= rulePerson ) )? ( (lv_categories_10_0= ruleCategory ) ) ( (lv_categories_11_0= ruleCategory ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getTitleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey134); 

                	newLeafNode(otherlv_1, grammarAccess.getSurveyAccess().getColonKeyword_1());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:88:1: ( (lv_title_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:89:1: (lv_title_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:89:1: (lv_title_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:90:3: lv_title_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey155);
            lv_title_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:106:2: (otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:106:4: otherlv_3= 'date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey168); 

                        	newLeafNode(otherlv_3, grammarAccess.getSurveyAccess().getDateKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey180); 

                        	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getColonKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:114:1: ( (lv_date_5_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:115:1: (lv_date_5_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:115:1: (lv_date_5_0= ruleEString )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:116:3: lv_date_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getDateEStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey201);
                    lv_date_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"date",
                            		lv_date_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:132:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:132:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSurvey216); 

                        	newLeafNode(otherlv_6, grammarAccess.getSurveyAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey228); 

                        	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getColonKeyword_4_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:140:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:141:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:141:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:142:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey249);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:158:4: ( (lv_person_9_0= rulePerson ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:159:1: (lv_person_9_0= rulePerson )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:159:1: (lv_person_9_0= rulePerson )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:160:3: lv_person_9_0= rulePerson
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getPersonPersonParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePerson_in_ruleSurvey272);
                    lv_person_9_0=rulePerson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"person",
                            		lv_person_9_0, 
                            		"Person");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:176:3: ( (lv_categories_10_0= ruleCategory ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:177:1: (lv_categories_10_0= ruleCategory )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:177:1: (lv_categories_10_0= ruleCategory )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:178:3: lv_categories_10_0= ruleCategory
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleSurvey294);
            lv_categories_10_0=ruleCategory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		add(
                   			current, 
                   			"categories",
                    		lv_categories_10_0, 
                    		"Category");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:194:2: ( (lv_categories_11_0= ruleCategory ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:195:1: (lv_categories_11_0= ruleCategory )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:195:1: (lv_categories_11_0= ruleCategory )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:196:3: lv_categories_11_0= ruleCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleSurvey315);
            	    lv_categories_11_0=ruleCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categories",
            	            		lv_categories_11_0, 
            	            		"Category");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestion"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:220:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:221:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:222:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion352);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion362); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:229:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_MultipleChoice_Impl_0 = null;

        EObject this_Ranking_1 = null;

        EObject this_Rating_2 = null;

        EObject this_YesNo_3 = null;

        EObject this_OpenField_4 = null;

        EObject this_MutuallyExclusive_Impl_5 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:232:28: ( (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:233:1: (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:233:1: (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 39:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:234:5: this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoice_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_Impl_in_ruleQuestion409);
                    this_MultipleChoice_Impl_0=ruleMultipleChoice_Impl();

                    state._fsp--;

                     
                            current = this_MultipleChoice_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:244:5: this_Ranking_1= ruleRanking
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRankingParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_ruleQuestion436);
                    this_Ranking_1=ruleRanking();

                    state._fsp--;

                     
                            current = this_Ranking_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:254:5: this_Rating_2= ruleRating
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRatingParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRating_in_ruleQuestion463);
                    this_Rating_2=ruleRating();

                    state._fsp--;

                     
                            current = this_Rating_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:264:5: this_YesNo_3= ruleYesNo
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getYesNoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleYesNo_in_ruleQuestion490);
                    this_YesNo_3=ruleYesNo();

                    state._fsp--;

                     
                            current = this_YesNo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:274:5: this_OpenField_4= ruleOpenField
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenFieldParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpenField_in_ruleQuestion517);
                    this_OpenField_4=ruleOpenField();

                    state._fsp--;

                     
                            current = this_OpenField_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:284:5: this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMutuallyExclusive_ImplParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMutuallyExclusive_Impl_in_ruleQuestion544);
                    this_MutuallyExclusive_Impl_5=ruleMutuallyExclusive_Impl();

                    state._fsp--;

                     
                            current = this_MutuallyExclusive_Impl_5; 
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleDescription"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:300:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:301:2: (iv_ruleDescription= ruleDescription EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:302:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDescription_in_entryRuleDescription579);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDescription589); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:309:1: ruleDescription returns [EObject current=null] : (this_Text_0= ruleText | this_Image_1= ruleImage ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Image_1 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:312:28: ( (this_Text_0= ruleText | this_Image_1= ruleImage ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:313:1: (this_Text_0= ruleText | this_Image_1= ruleImage )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:313:1: (this_Text_0= ruleText | this_Image_1= ruleImage )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==40) ) {
                alt6=1;
            }
            else if ( (LA6_0==41) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:314:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleDescription636);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:324:5: this_Image_1= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getDescriptionAccess().getImageParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImage_in_ruleDescription663);
                    this_Image_1=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_1; 
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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleCategory"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:340:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:341:2: (iv_ruleCategory= ruleCategory EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:342:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory698);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory708); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:349:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'category' otherlv_1= '<' otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleEString ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleEString ) ) )? ( (lv_steps_8_0= ruleStep ) ) ( (lv_steps_9_0= ruleStep ) )* otherlv_10= '>' otherlv_11= 'category' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_steps_8_0 = null;

        EObject lv_steps_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:352:28: ( (otherlv_0= 'category' otherlv_1= '<' otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleEString ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleEString ) ) )? ( (lv_steps_8_0= ruleStep ) ) ( (lv_steps_9_0= ruleStep ) )* otherlv_10= '>' otherlv_11= 'category' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:353:1: (otherlv_0= 'category' otherlv_1= '<' otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleEString ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleEString ) ) )? ( (lv_steps_8_0= ruleStep ) ) ( (lv_steps_9_0= ruleStep ) )* otherlv_10= '>' otherlv_11= 'category' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:353:1: (otherlv_0= 'category' otherlv_1= '<' otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleEString ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleEString ) ) )? ( (lv_steps_8_0= ruleStep ) ) ( (lv_steps_9_0= ruleStep ) )* otherlv_10= '>' otherlv_11= 'category' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:353:3: otherlv_0= 'category' otherlv_1= '<' otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleEString ) ) (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleEString ) ) )? ( (lv_steps_8_0= ruleStep ) ) ( (lv_steps_9_0= ruleStep ) )* otherlv_10= '>' otherlv_11= 'category'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCategory745); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCategory757); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getLessThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleCategory769); 

                	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getTitleKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCategory781); 

                	newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getColonKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:369:1: ( (lv_title_4_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:370:1: (lv_title_4_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:370:1: (lv_title_4_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:371:3: lv_title_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getTitleEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCategory802);
            lv_title_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:387:2: (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:387:4: otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCategory815); 

                        	newLeafNode(otherlv_5, grammarAccess.getCategoryAccess().getDescriptionKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCategory827); 

                        	newLeafNode(otherlv_6, grammarAccess.getCategoryAccess().getColonKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:395:1: ( (lv_description_7_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:396:1: (lv_description_7_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:396:1: (lv_description_7_0= ruleEString )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:397:3: lv_description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCategory848);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCategoryRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:413:4: ( (lv_steps_8_0= ruleStep ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:414:1: (lv_steps_8_0= ruleStep )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:414:1: (lv_steps_8_0= ruleStep )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:415:3: lv_steps_8_0= ruleStep
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getStepsStepParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStep_in_ruleCategory871);
            lv_steps_8_0=ruleStep();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		add(
                   			current, 
                   			"steps",
                    		lv_steps_8_0, 
                    		"Step");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:431:2: ( (lv_steps_9_0= ruleStep ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:432:1: (lv_steps_9_0= ruleStep )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:432:1: (lv_steps_9_0= ruleStep )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:433:3: lv_steps_9_0= ruleStep
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoryAccess().getStepsStepParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStep_in_ruleCategory892);
            	    lv_steps_9_0=ruleStep();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"steps",
            	            		lv_steps_9_0, 
            	            		"Step");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCategory905); 

                	newLeafNode(otherlv_10, grammarAccess.getCategoryAccess().getGreaterThanSignKeyword_8());
                
            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCategory917); 

                	newLeafNode(otherlv_11, grammarAccess.getCategoryAccess().getCategoryKeyword_9());
                

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:465:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:466:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:467:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString954);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString965); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:474:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:477:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:478:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:478:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:478:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1005); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:486:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1031); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePerson"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:501:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:502:2: (iv_rulePerson= rulePerson EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:503:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_entryRulePerson1076);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePerson1086); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:510:1: rulePerson returns [EObject current=null] : (otherlv_0= 'person' otherlv_1= '<' ( (lv_attribute_2_0= rulePersonAttribute ) ) (otherlv_3= ',' ( (lv_attribute_4_0= rulePersonAttribute ) ) )* otherlv_5= '>' otherlv_6= 'person' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attribute_2_0 = null;

        EObject lv_attribute_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:513:28: ( (otherlv_0= 'person' otherlv_1= '<' ( (lv_attribute_2_0= rulePersonAttribute ) ) (otherlv_3= ',' ( (lv_attribute_4_0= rulePersonAttribute ) ) )* otherlv_5= '>' otherlv_6= 'person' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:514:1: (otherlv_0= 'person' otherlv_1= '<' ( (lv_attribute_2_0= rulePersonAttribute ) ) (otherlv_3= ',' ( (lv_attribute_4_0= rulePersonAttribute ) ) )* otherlv_5= '>' otherlv_6= 'person' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:514:1: (otherlv_0= 'person' otherlv_1= '<' ( (lv_attribute_2_0= rulePersonAttribute ) ) (otherlv_3= ',' ( (lv_attribute_4_0= rulePersonAttribute ) ) )* otherlv_5= '>' otherlv_6= 'person' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:514:3: otherlv_0= 'person' otherlv_1= '<' ( (lv_attribute_2_0= rulePersonAttribute ) ) (otherlv_3= ',' ( (lv_attribute_4_0= rulePersonAttribute ) ) )* otherlv_5= '>' otherlv_6= 'person'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePerson1123); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePerson1135); 

                	newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getLessThanSignKeyword_1());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:522:1: ( (lv_attribute_2_0= rulePersonAttribute ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:523:1: (lv_attribute_2_0= rulePersonAttribute )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:523:1: (lv_attribute_2_0= rulePersonAttribute )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:524:3: lv_attribute_2_0= rulePersonAttribute
            {
             
            	        newCompositeNode(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rulePerson1156);
            lv_attribute_2_0=rulePersonAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	        }
                   		add(
                   			current, 
                   			"attribute",
                    		lv_attribute_2_0, 
                    		"PersonAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:540:2: (otherlv_3= ',' ( (lv_attribute_4_0= rulePersonAttribute ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:540:4: otherlv_3= ',' ( (lv_attribute_4_0= rulePersonAttribute ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePerson1169); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getCommaKeyword_3_0());
            	        
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:544:1: ( (lv_attribute_4_0= rulePersonAttribute ) )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:545:1: (lv_attribute_4_0= rulePersonAttribute )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:545:1: (lv_attribute_4_0= rulePersonAttribute )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:546:3: lv_attribute_4_0= rulePersonAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rulePerson1190);
            	    lv_attribute_4_0=rulePersonAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_4_0, 
            	            		"PersonAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePerson1204); 

                	newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getGreaterThanSignKeyword_4());
                
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePerson1216); 

                	newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getPersonKeyword_5());
                

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleStep"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:578:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:579:2: (iv_ruleStep= ruleStep EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:580:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStep_in_entryRuleStep1252);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStep1262); 

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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:587:1: ruleStep returns [EObject current=null] : (otherlv_0= 'step' otherlv_1= '<' ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '>' otherlv_5= 'step' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_questions_2_0 = null;

        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:590:28: ( (otherlv_0= 'step' otherlv_1= '<' ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '>' otherlv_5= 'step' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:591:1: (otherlv_0= 'step' otherlv_1= '<' ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '>' otherlv_5= 'step' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:591:1: (otherlv_0= 'step' otherlv_1= '<' ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '>' otherlv_5= 'step' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:591:3: otherlv_0= 'step' otherlv_1= '<' ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '>' otherlv_5= 'step'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStep1299); 

                	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getStepKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStep1311); 

                	newLeafNode(otherlv_1, grammarAccess.getStepAccess().getLessThanSignKeyword_1());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:599:1: ( (lv_questions_2_0= ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:600:1: (lv_questions_2_0= ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:600:1: (lv_questions_2_0= ruleQuestion )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:601:3: lv_questions_2_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getStepAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleStep1332);
            lv_questions_2_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStepRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_2_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:617:2: ( (lv_questions_3_0= ruleQuestion ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26||(LA11_0>=32 && LA11_0<=33)||(LA11_0>=37 && LA11_0<=39)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:618:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:618:1: (lv_questions_3_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:619:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStepAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleStep1353);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStepRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStep1366); 

                	newLeafNode(otherlv_4, grammarAccess.getStepAccess().getGreaterThanSignKeyword_4());
                
            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStep1378); 

                	newLeafNode(otherlv_5, grammarAccess.getStepAccess().getStepKeyword_5());
                

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleEBoolean"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:651:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:652:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:653:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1415);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1426); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:660:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:663:28: ( (kw= 'true' | kw= 'false' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:664:1: (kw= 'true' | kw= 'false' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:664:1: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:665:2: kw= 'true'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEBoolean1464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:672:2: kw= 'false'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEBoolean1483); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleOption"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:685:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:686:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:687:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption1523);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption1533); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:694:1: ruleOption returns [EObject current=null] : ( () otherlv_1= 'option' otherlv_2= '<' (otherlv_3= 'isCheckedByDefault' otherlv_4= ':' ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) ) )? (otherlv_6= 'isUserInputAllowed' otherlv_7= ':' ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) ) )? ( ( (lv_contains_9_0= ruleDescription ) ) (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )* )? otherlv_12= '>' otherlv_13= 'option' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_isCheckedByDefault_5_0 = null;

        AntlrDatatypeRuleToken lv_isUserInputAllowed_8_0 = null;

        EObject lv_contains_9_0 = null;

        EObject lv_contains_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:697:28: ( ( () otherlv_1= 'option' otherlv_2= '<' (otherlv_3= 'isCheckedByDefault' otherlv_4= ':' ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) ) )? (otherlv_6= 'isUserInputAllowed' otherlv_7= ':' ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) ) )? ( ( (lv_contains_9_0= ruleDescription ) ) (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )* )? otherlv_12= '>' otherlv_13= 'option' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:698:1: ( () otherlv_1= 'option' otherlv_2= '<' (otherlv_3= 'isCheckedByDefault' otherlv_4= ':' ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) ) )? (otherlv_6= 'isUserInputAllowed' otherlv_7= ':' ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) ) )? ( ( (lv_contains_9_0= ruleDescription ) ) (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )* )? otherlv_12= '>' otherlv_13= 'option' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:698:1: ( () otherlv_1= 'option' otherlv_2= '<' (otherlv_3= 'isCheckedByDefault' otherlv_4= ':' ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) ) )? (otherlv_6= 'isUserInputAllowed' otherlv_7= ':' ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) ) )? ( ( (lv_contains_9_0= ruleDescription ) ) (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )* )? otherlv_12= '>' otherlv_13= 'option' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:698:2: () otherlv_1= 'option' otherlv_2= '<' (otherlv_3= 'isCheckedByDefault' otherlv_4= ':' ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) ) )? (otherlv_6= 'isUserInputAllowed' otherlv_7= ':' ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) ) )? ( ( (lv_contains_9_0= ruleDescription ) ) (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )* )? otherlv_12= '>' otherlv_13= 'option'
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:698:2: ()
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:699:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOptionAccess().getOptionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOption1579); 

                	newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getOptionKeyword_1());
                
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOption1591); 

                	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getLessThanSignKeyword_2());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:712:1: (otherlv_3= 'isCheckedByDefault' otherlv_4= ':' ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:712:3: otherlv_3= 'isCheckedByDefault' otherlv_4= ':' ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOption1604); 

                        	newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getIsCheckedByDefaultKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOption1616); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getColonKeyword_3_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:720:1: ( (lv_isCheckedByDefault_5_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:721:1: (lv_isCheckedByDefault_5_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:721:1: (lv_isCheckedByDefault_5_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:722:3: lv_isCheckedByDefault_5_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionAccess().getIsCheckedByDefaultEBooleanParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOption1637);
                    lv_isCheckedByDefault_5_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionRule());
                    	        }
                           		set(
                           			current, 
                           			"isCheckedByDefault",
                            		lv_isCheckedByDefault_5_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:738:4: (otherlv_6= 'isUserInputAllowed' otherlv_7= ':' ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:738:6: otherlv_6= 'isUserInputAllowed' otherlv_7= ':' ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOption1652); 

                        	newLeafNode(otherlv_6, grammarAccess.getOptionAccess().getIsUserInputAllowedKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOption1664); 

                        	newLeafNode(otherlv_7, grammarAccess.getOptionAccess().getColonKeyword_4_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:746:1: ( (lv_isUserInputAllowed_8_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:747:1: (lv_isUserInputAllowed_8_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:747:1: (lv_isUserInputAllowed_8_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:748:3: lv_isUserInputAllowed_8_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionAccess().getIsUserInputAllowedEBooleanParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOption1685);
                    lv_isUserInputAllowed_8_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionRule());
                    	        }
                           		set(
                           			current, 
                           			"isUserInputAllowed",
                            		lv_isUserInputAllowed_8_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:764:4: ( ( (lv_contains_9_0= ruleDescription ) ) (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=40 && LA16_0<=41)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:764:5: ( (lv_contains_9_0= ruleDescription ) ) (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )*
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:764:5: ( (lv_contains_9_0= ruleDescription ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:765:1: (lv_contains_9_0= ruleDescription )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:765:1: (lv_contains_9_0= ruleDescription )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:766:3: lv_contains_9_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionAccess().getContainsDescriptionParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDescription_in_ruleOption1709);
                    lv_contains_9_0=ruleDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionRule());
                    	        }
                           		add(
                           			current, 
                           			"contains",
                            		lv_contains_9_0, 
                            		"Description");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:782:2: (otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:782:4: otherlv_10= ',' ( (lv_contains_11_0= ruleDescription ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOption1722); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getOptionAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:786:1: ( (lv_contains_11_0= ruleDescription ) )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:787:1: (lv_contains_11_0= ruleDescription )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:787:1: (lv_contains_11_0= ruleDescription )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:788:3: lv_contains_11_0= ruleDescription
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOptionAccess().getContainsDescriptionParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDescription_in_ruleOption1743);
                    	    lv_contains_11_0=ruleDescription();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOptionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"contains",
                    	            		lv_contains_11_0, 
                    	            		"Description");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOption1759); 

                	newLeafNode(otherlv_12, grammarAccess.getOptionAccess().getGreaterThanSignKeyword_6());
                
            otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOption1771); 

                	newLeafNode(otherlv_13, grammarAccess.getOptionAccess().getOptionKeyword_7());
                

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleMultipleChoice_Impl"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:820:1: entryRuleMultipleChoice_Impl returns [EObject current=null] : iv_ruleMultipleChoice_Impl= ruleMultipleChoice_Impl EOF ;
    public final EObject entryRuleMultipleChoice_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice_Impl = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:821:2: (iv_ruleMultipleChoice_Impl= ruleMultipleChoice_Impl EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:822:2: iv_ruleMultipleChoice_Impl= ruleMultipleChoice_Impl EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoice_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_Impl_in_entryRuleMultipleChoice_Impl1807);
            iv_ruleMultipleChoice_Impl=ruleMultipleChoice_Impl();

            state._fsp--;

             current =iv_ruleMultipleChoice_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice_Impl1817); 

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
    // $ANTLR end "entryRuleMultipleChoice_Impl"


    // $ANTLR start "ruleMultipleChoice_Impl"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:829:1: ruleMultipleChoice_Impl returns [EObject current=null] : (otherlv_0= 'multipleChoice' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'min' otherlv_9= ':' ( (lv_min_10_0= ruleEInt ) ) otherlv_11= 'max' otherlv_12= ':' ( (lv_max_13_0= ruleEInt ) ) ( ( (lv_option_14_0= ruleOption ) ) ( (lv_option_15_0= ruleOption ) )* )? (otherlv_16= 'subQuestions' otherlv_17= '<' ( (lv_subquestion_18_0= ruleQuestion ) ) ( (lv_subquestion_19_0= ruleQuestion ) )* otherlv_20= '>' otherlv_21= 'subQuestions' )? otherlv_22= '>' otherlv_23= 'multipleChoice' ) ;
    public final EObject ruleMultipleChoice_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_questionText_4_0 = null;

        AntlrDatatypeRuleToken lv_isMandatory_7_0 = null;

        AntlrDatatypeRuleToken lv_min_10_0 = null;

        AntlrDatatypeRuleToken lv_max_13_0 = null;

        EObject lv_option_14_0 = null;

        EObject lv_option_15_0 = null;

        EObject lv_subquestion_18_0 = null;

        EObject lv_subquestion_19_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:832:28: ( (otherlv_0= 'multipleChoice' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'min' otherlv_9= ':' ( (lv_min_10_0= ruleEInt ) ) otherlv_11= 'max' otherlv_12= ':' ( (lv_max_13_0= ruleEInt ) ) ( ( (lv_option_14_0= ruleOption ) ) ( (lv_option_15_0= ruleOption ) )* )? (otherlv_16= 'subQuestions' otherlv_17= '<' ( (lv_subquestion_18_0= ruleQuestion ) ) ( (lv_subquestion_19_0= ruleQuestion ) )* otherlv_20= '>' otherlv_21= 'subQuestions' )? otherlv_22= '>' otherlv_23= 'multipleChoice' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:833:1: (otherlv_0= 'multipleChoice' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'min' otherlv_9= ':' ( (lv_min_10_0= ruleEInt ) ) otherlv_11= 'max' otherlv_12= ':' ( (lv_max_13_0= ruleEInt ) ) ( ( (lv_option_14_0= ruleOption ) ) ( (lv_option_15_0= ruleOption ) )* )? (otherlv_16= 'subQuestions' otherlv_17= '<' ( (lv_subquestion_18_0= ruleQuestion ) ) ( (lv_subquestion_19_0= ruleQuestion ) )* otherlv_20= '>' otherlv_21= 'subQuestions' )? otherlv_22= '>' otherlv_23= 'multipleChoice' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:833:1: (otherlv_0= 'multipleChoice' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'min' otherlv_9= ':' ( (lv_min_10_0= ruleEInt ) ) otherlv_11= 'max' otherlv_12= ':' ( (lv_max_13_0= ruleEInt ) ) ( ( (lv_option_14_0= ruleOption ) ) ( (lv_option_15_0= ruleOption ) )* )? (otherlv_16= 'subQuestions' otherlv_17= '<' ( (lv_subquestion_18_0= ruleQuestion ) ) ( (lv_subquestion_19_0= ruleQuestion ) )* otherlv_20= '>' otherlv_21= 'subQuestions' )? otherlv_22= '>' otherlv_23= 'multipleChoice' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:833:3: otherlv_0= 'multipleChoice' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'min' otherlv_9= ':' ( (lv_min_10_0= ruleEInt ) ) otherlv_11= 'max' otherlv_12= ':' ( (lv_max_13_0= ruleEInt ) ) ( ( (lv_option_14_0= ruleOption ) ) ( (lv_option_15_0= ruleOption ) )* )? (otherlv_16= 'subQuestions' otherlv_17= '<' ( (lv_subquestion_18_0= ruleQuestion ) ) ( (lv_subquestion_19_0= ruleQuestion ) )* otherlv_20= '>' otherlv_21= 'subQuestions' )? otherlv_22= '>' otherlv_23= 'multipleChoice'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice_Impl1854); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoice_ImplAccess().getMultipleChoiceKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice_Impl1866); 

                	newLeafNode(otherlv_1, grammarAccess.getMultipleChoice_ImplAccess().getLessThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultipleChoice_Impl1878); 

                	newLeafNode(otherlv_2, grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice_Impl1890); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoice_ImplAccess().getColonKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:849:1: ( (lv_questionText_4_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:850:1: (lv_questionText_4_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:850:1: (lv_questionText_4_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:851:3: lv_questionText_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice_Impl1911);
            lv_questionText_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:867:2: (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:867:4: otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultipleChoice_Impl1924); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice_Impl1936); 

                        	newLeafNode(otherlv_6, grammarAccess.getMultipleChoice_ImplAccess().getColonKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:875:1: ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:876:1: (lv_isMandatory_7_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:876:1: (lv_isMandatory_7_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:877:3: lv_isMandatory_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryEBooleanParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleMultipleChoice_Impl1957);
                    lv_isMandatory_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"isMandatory",
                            		lv_isMandatory_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultipleChoice_Impl1971); 

                	newLeafNode(otherlv_8, grammarAccess.getMultipleChoice_ImplAccess().getMinKeyword_6());
                
            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice_Impl1983); 

                	newLeafNode(otherlv_9, grammarAccess.getMultipleChoice_ImplAccess().getColonKeyword_7());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:901:1: ( (lv_min_10_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:902:1: (lv_min_10_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:902:1: (lv_min_10_0= ruleEInt )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:903:3: lv_min_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getMinEIntParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl2004);
            lv_min_10_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_10_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultipleChoice_Impl2016); 

                	newLeafNode(otherlv_11, grammarAccess.getMultipleChoice_ImplAccess().getMaxKeyword_9());
                
            otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultipleChoice_Impl2028); 

                	newLeafNode(otherlv_12, grammarAccess.getMultipleChoice_ImplAccess().getColonKeyword_10());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:927:1: ( (lv_max_13_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:928:1: (lv_max_13_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:928:1: (lv_max_13_0= ruleEInt )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:929:3: lv_max_13_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getMaxEIntParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl2049);
            lv_max_13_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_13_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:945:2: ( ( (lv_option_14_0= ruleOption ) ) ( (lv_option_15_0= ruleOption ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:945:3: ( (lv_option_14_0= ruleOption ) ) ( (lv_option_15_0= ruleOption ) )*
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:945:3: ( (lv_option_14_0= ruleOption ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:946:1: (lv_option_14_0= ruleOption )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:946:1: (lv_option_14_0= ruleOption )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:947:3: lv_option_14_0= ruleOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getOptionOptionParserRuleCall_12_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultipleChoice_Impl2071);
                    lv_option_14_0=ruleOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"option",
                            		lv_option_14_0, 
                            		"Option");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:963:2: ( (lv_option_15_0= ruleOption ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:964:1: (lv_option_15_0= ruleOption )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:964:1: (lv_option_15_0= ruleOption )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:965:3: lv_option_15_0= ruleOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getOptionOptionParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMultipleChoice_Impl2092);
                    	    lv_option_15_0=ruleOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"option",
                    	            		lv_option_15_0, 
                    	            		"Option");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:981:5: (otherlv_16= 'subQuestions' otherlv_17= '<' ( (lv_subquestion_18_0= ruleQuestion ) ) ( (lv_subquestion_19_0= ruleQuestion ) )* otherlv_20= '>' otherlv_21= 'subQuestions' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:981:7: otherlv_16= 'subQuestions' otherlv_17= '<' ( (lv_subquestion_18_0= ruleQuestion ) ) ( (lv_subquestion_19_0= ruleQuestion ) )* otherlv_20= '>' otherlv_21= 'subQuestions'
                    {
                    otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultipleChoice_Impl2108); 

                        	newLeafNode(otherlv_16, grammarAccess.getMultipleChoice_ImplAccess().getSubQuestionsKeyword_13_0());
                        
                    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultipleChoice_Impl2120); 

                        	newLeafNode(otherlv_17, grammarAccess.getMultipleChoice_ImplAccess().getLessThanSignKeyword_13_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:989:1: ( (lv_subquestion_18_0= ruleQuestion ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:990:1: (lv_subquestion_18_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:990:1: (lv_subquestion_18_0= ruleQuestion )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:991:3: lv_subquestion_18_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getSubquestionQuestionParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMultipleChoice_Impl2141);
                    lv_subquestion_18_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"subquestion",
                            		lv_subquestion_18_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1007:2: ( (lv_subquestion_19_0= ruleQuestion ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==26||(LA20_0>=32 && LA20_0<=33)||(LA20_0>=37 && LA20_0<=39)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1008:1: (lv_subquestion_19_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1008:1: (lv_subquestion_19_0= ruleQuestion )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1009:3: lv_subquestion_19_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getSubquestionQuestionParserRuleCall_13_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMultipleChoice_Impl2162);
                    	    lv_subquestion_19_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subquestion",
                    	            		lv_subquestion_19_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice_Impl2175); 

                        	newLeafNode(otherlv_20, grammarAccess.getMultipleChoice_ImplAccess().getGreaterThanSignKeyword_13_4());
                        
                    otherlv_21=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultipleChoice_Impl2187); 

                        	newLeafNode(otherlv_21, grammarAccess.getMultipleChoice_ImplAccess().getSubQuestionsKeyword_13_5());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultipleChoice_Impl2201); 

                	newLeafNode(otherlv_22, grammarAccess.getMultipleChoice_ImplAccess().getGreaterThanSignKeyword_14());
                
            otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice_Impl2213); 

                	newLeafNode(otherlv_23, grammarAccess.getMultipleChoice_ImplAccess().getMultipleChoiceKeyword_15());
                

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
    // $ANTLR end "ruleMultipleChoice_Impl"


    // $ANTLR start "entryRuleRanking"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1049:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1050:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1051:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking2249);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking2259); 

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
    // $ANTLR end "entryRuleRanking"


    // $ANTLR start "ruleRanking"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1058:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'ranking' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'ranking' ) ;
    public final EObject ruleRanking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_questionText_4_0 = null;

        AntlrDatatypeRuleToken lv_isMandatory_7_0 = null;

        EObject lv_option_8_0 = null;

        EObject lv_option_9_0 = null;

        EObject lv_subquestion_12_0 = null;

        EObject lv_subquestion_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1061:28: ( (otherlv_0= 'ranking' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'ranking' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1062:1: (otherlv_0= 'ranking' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'ranking' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1062:1: (otherlv_0= 'ranking' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'ranking' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1062:3: otherlv_0= 'ranking' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'ranking'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRanking2296); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getRankingKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRanking2308); 

                	newLeafNode(otherlv_1, grammarAccess.getRankingAccess().getLessThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRanking2320); 

                	newLeafNode(otherlv_2, grammarAccess.getRankingAccess().getQuestionTextKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRanking2332); 

                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getColonKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1078:1: ( (lv_questionText_4_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1079:1: (lv_questionText_4_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1079:1: (lv_questionText_4_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1080:3: lv_questionText_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking2353);
            lv_questionText_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1096:2: (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1096:4: otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRanking2366); 

                        	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getIsMandatoryKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRanking2378); 

                        	newLeafNode(otherlv_6, grammarAccess.getRankingAccess().getColonKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1104:1: ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1105:1: (lv_isMandatory_7_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1105:1: (lv_isMandatory_7_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1106:3: lv_isMandatory_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getIsMandatoryEBooleanParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleRanking2399);
                    lv_isMandatory_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		set(
                           			current, 
                           			"isMandatory",
                            		lv_isMandatory_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1122:4: ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1122:5: ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )*
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1122:5: ( (lv_option_8_0= ruleOption ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1123:1: (lv_option_8_0= ruleOption )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1123:1: (lv_option_8_0= ruleOption )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1124:3: lv_option_8_0= ruleOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getOptionOptionParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleRanking2423);
                    lv_option_8_0=ruleOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"option",
                            		lv_option_8_0, 
                            		"Option");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1140:2: ( (lv_option_9_0= ruleOption ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==23) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1141:1: (lv_option_9_0= ruleOption )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1141:1: (lv_option_9_0= ruleOption )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1142:3: lv_option_9_0= ruleOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getOptionOptionParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleRanking2444);
                    	    lv_option_9_0=ruleOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"option",
                    	            		lv_option_9_0, 
                    	            		"Option");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1158:5: (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1158:7: otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions'
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRanking2460); 

                        	newLeafNode(otherlv_10, grammarAccess.getRankingAccess().getSubQuestionsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRanking2472); 

                        	newLeafNode(otherlv_11, grammarAccess.getRankingAccess().getLessThanSignKeyword_7_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1166:1: ( (lv_subquestion_12_0= ruleQuestion ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1167:1: (lv_subquestion_12_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1167:1: (lv_subquestion_12_0= ruleQuestion )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1168:3: lv_subquestion_12_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getRankingAccess().getSubquestionQuestionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRanking2493);
                    lv_subquestion_12_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	        }
                           		add(
                           			current, 
                           			"subquestion",
                            		lv_subquestion_12_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1184:2: ( (lv_subquestion_13_0= ruleQuestion ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==26||(LA25_0>=32 && LA25_0<=33)||(LA25_0>=37 && LA25_0<=39)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1185:1: (lv_subquestion_13_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1185:1: (lv_subquestion_13_0= ruleQuestion )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1186:3: lv_subquestion_13_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRankingAccess().getSubquestionQuestionParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRanking2514);
                    	    lv_subquestion_13_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subquestion",
                    	            		lv_subquestion_13_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2527); 

                        	newLeafNode(otherlv_14, grammarAccess.getRankingAccess().getGreaterThanSignKeyword_7_4());
                        
                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRanking2539); 

                        	newLeafNode(otherlv_15, grammarAccess.getRankingAccess().getSubQuestionsKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRanking2553); 

                	newLeafNode(otherlv_16, grammarAccess.getRankingAccess().getGreaterThanSignKeyword_8());
                
            otherlv_17=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRanking2565); 

                	newLeafNode(otherlv_17, grammarAccess.getRankingAccess().getRankingKeyword_9());
                

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
    // $ANTLR end "ruleRanking"


    // $ANTLR start "entryRuleRating"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1226:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1227:2: (iv_ruleRating= ruleRating EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1228:2: iv_ruleRating= ruleRating EOF
            {
             newCompositeNode(grammarAccess.getRatingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_in_entryRuleRating2601);
            iv_ruleRating=ruleRating();

            state._fsp--;

             current =iv_ruleRating; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating2611); 

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
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1235:1: ruleRating returns [EObject current=null] : (otherlv_0= 'rating' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'start' otherlv_9= ':' ( (lv_start_10_0= ruleEFloat ) ) otherlv_11= 'end' otherlv_12= ':' ( (lv_end_13_0= ruleEFloat ) ) (otherlv_14= 'interval' otherlv_15= ':' ( (lv_interval_16_0= ruleEFloat ) ) )? ( ( (lv_option_17_0= ruleOption ) ) ( (lv_option_18_0= ruleOption ) )* )? (otherlv_19= 'subQuestions' otherlv_20= '<' ( (lv_subquestion_21_0= ruleQuestion ) ) ( (lv_subquestion_22_0= ruleQuestion ) )* otherlv_23= '>' otherlv_24= 'subQuestions' )? otherlv_25= '>' otherlv_26= 'rating' ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_questionText_4_0 = null;

        AntlrDatatypeRuleToken lv_isMandatory_7_0 = null;

        AntlrDatatypeRuleToken lv_start_10_0 = null;

        AntlrDatatypeRuleToken lv_end_13_0 = null;

        AntlrDatatypeRuleToken lv_interval_16_0 = null;

        EObject lv_option_17_0 = null;

        EObject lv_option_18_0 = null;

        EObject lv_subquestion_21_0 = null;

        EObject lv_subquestion_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1238:28: ( (otherlv_0= 'rating' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'start' otherlv_9= ':' ( (lv_start_10_0= ruleEFloat ) ) otherlv_11= 'end' otherlv_12= ':' ( (lv_end_13_0= ruleEFloat ) ) (otherlv_14= 'interval' otherlv_15= ':' ( (lv_interval_16_0= ruleEFloat ) ) )? ( ( (lv_option_17_0= ruleOption ) ) ( (lv_option_18_0= ruleOption ) )* )? (otherlv_19= 'subQuestions' otherlv_20= '<' ( (lv_subquestion_21_0= ruleQuestion ) ) ( (lv_subquestion_22_0= ruleQuestion ) )* otherlv_23= '>' otherlv_24= 'subQuestions' )? otherlv_25= '>' otherlv_26= 'rating' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1239:1: (otherlv_0= 'rating' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'start' otherlv_9= ':' ( (lv_start_10_0= ruleEFloat ) ) otherlv_11= 'end' otherlv_12= ':' ( (lv_end_13_0= ruleEFloat ) ) (otherlv_14= 'interval' otherlv_15= ':' ( (lv_interval_16_0= ruleEFloat ) ) )? ( ( (lv_option_17_0= ruleOption ) ) ( (lv_option_18_0= ruleOption ) )* )? (otherlv_19= 'subQuestions' otherlv_20= '<' ( (lv_subquestion_21_0= ruleQuestion ) ) ( (lv_subquestion_22_0= ruleQuestion ) )* otherlv_23= '>' otherlv_24= 'subQuestions' )? otherlv_25= '>' otherlv_26= 'rating' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1239:1: (otherlv_0= 'rating' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'start' otherlv_9= ':' ( (lv_start_10_0= ruleEFloat ) ) otherlv_11= 'end' otherlv_12= ':' ( (lv_end_13_0= ruleEFloat ) ) (otherlv_14= 'interval' otherlv_15= ':' ( (lv_interval_16_0= ruleEFloat ) ) )? ( ( (lv_option_17_0= ruleOption ) ) ( (lv_option_18_0= ruleOption ) )* )? (otherlv_19= 'subQuestions' otherlv_20= '<' ( (lv_subquestion_21_0= ruleQuestion ) ) ( (lv_subquestion_22_0= ruleQuestion ) )* otherlv_23= '>' otherlv_24= 'subQuestions' )? otherlv_25= '>' otherlv_26= 'rating' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1239:3: otherlv_0= 'rating' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? otherlv_8= 'start' otherlv_9= ':' ( (lv_start_10_0= ruleEFloat ) ) otherlv_11= 'end' otherlv_12= ':' ( (lv_end_13_0= ruleEFloat ) ) (otherlv_14= 'interval' otherlv_15= ':' ( (lv_interval_16_0= ruleEFloat ) ) )? ( ( (lv_option_17_0= ruleOption ) ) ( (lv_option_18_0= ruleOption ) )* )? (otherlv_19= 'subQuestions' otherlv_20= '<' ( (lv_subquestion_21_0= ruleQuestion ) ) ( (lv_subquestion_22_0= ruleQuestion ) )* otherlv_23= '>' otherlv_24= 'subQuestions' )? otherlv_25= '>' otherlv_26= 'rating'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating2648); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getRatingKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating2660); 

                	newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getLessThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRating2672); 

                	newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getQuestionTextKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating2684); 

                	newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getColonKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1255:1: ( (lv_questionText_4_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1256:1: (lv_questionText_4_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1256:1: (lv_questionText_4_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1257:3: lv_questionText_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRatingAccess().getQuestionTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating2705);
            lv_questionText_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1273:2: (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1273:4: otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRating2718); 

                        	newLeafNode(otherlv_5, grammarAccess.getRatingAccess().getIsMandatoryKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating2730); 

                        	newLeafNode(otherlv_6, grammarAccess.getRatingAccess().getColonKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1281:1: ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1282:1: (lv_isMandatory_7_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1282:1: (lv_isMandatory_7_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1283:3: lv_isMandatory_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingAccess().getIsMandatoryEBooleanParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleRating2751);
                    lv_isMandatory_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingRule());
                    	        }
                           		set(
                           			current, 
                           			"isMandatory",
                            		lv_isMandatory_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRating2765); 

                	newLeafNode(otherlv_8, grammarAccess.getRatingAccess().getStartKeyword_6());
                
            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating2777); 

                	newLeafNode(otherlv_9, grammarAccess.getRatingAccess().getColonKeyword_7());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1307:1: ( (lv_start_10_0= ruleEFloat ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1308:1: (lv_start_10_0= ruleEFloat )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1308:1: (lv_start_10_0= ruleEFloat )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1309:3: lv_start_10_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getRatingAccess().getStartEFloatParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleRating2798);
            lv_start_10_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_10_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRating2810); 

                	newLeafNode(otherlv_11, grammarAccess.getRatingAccess().getEndKeyword_9());
                
            otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating2822); 

                	newLeafNode(otherlv_12, grammarAccess.getRatingAccess().getColonKeyword_10());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1333:1: ( (lv_end_13_0= ruleEFloat ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1334:1: (lv_end_13_0= ruleEFloat )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1334:1: (lv_end_13_0= ruleEFloat )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1335:3: lv_end_13_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getRatingAccess().getEndEFloatParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleRating2843);
            lv_end_13_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_13_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1351:2: (otherlv_14= 'interval' otherlv_15= ':' ( (lv_interval_16_0= ruleEFloat ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1351:4: otherlv_14= 'interval' otherlv_15= ':' ( (lv_interval_16_0= ruleEFloat ) )
                    {
                    otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRating2856); 

                        	newLeafNode(otherlv_14, grammarAccess.getRatingAccess().getIntervalKeyword_12_0());
                        
                    otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRating2868); 

                        	newLeafNode(otherlv_15, grammarAccess.getRatingAccess().getColonKeyword_12_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1359:1: ( (lv_interval_16_0= ruleEFloat ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1360:1: (lv_interval_16_0= ruleEFloat )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1360:1: (lv_interval_16_0= ruleEFloat )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1361:3: lv_interval_16_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingAccess().getIntervalEFloatParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleRating2889);
                    lv_interval_16_0=ruleEFloat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingRule());
                    	        }
                           		set(
                           			current, 
                           			"interval",
                            		lv_interval_16_0, 
                            		"EFloat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1377:4: ( ( (lv_option_17_0= ruleOption ) ) ( (lv_option_18_0= ruleOption ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1377:5: ( (lv_option_17_0= ruleOption ) ) ( (lv_option_18_0= ruleOption ) )*
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1377:5: ( (lv_option_17_0= ruleOption ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1378:1: (lv_option_17_0= ruleOption )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1378:1: (lv_option_17_0= ruleOption )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1379:3: lv_option_17_0= ruleOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingAccess().getOptionOptionParserRuleCall_13_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleRating2913);
                    lv_option_17_0=ruleOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingRule());
                    	        }
                           		add(
                           			current, 
                           			"option",
                            		lv_option_17_0, 
                            		"Option");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1395:2: ( (lv_option_18_0= ruleOption ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==23) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1396:1: (lv_option_18_0= ruleOption )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1396:1: (lv_option_18_0= ruleOption )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1397:3: lv_option_18_0= ruleOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRatingAccess().getOptionOptionParserRuleCall_13_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleRating2934);
                    	    lv_option_18_0=ruleOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRatingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"option",
                    	            		lv_option_18_0, 
                    	            		"Option");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1413:5: (otherlv_19= 'subQuestions' otherlv_20= '<' ( (lv_subquestion_21_0= ruleQuestion ) ) ( (lv_subquestion_22_0= ruleQuestion ) )* otherlv_23= '>' otherlv_24= 'subQuestions' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1413:7: otherlv_19= 'subQuestions' otherlv_20= '<' ( (lv_subquestion_21_0= ruleQuestion ) ) ( (lv_subquestion_22_0= ruleQuestion ) )* otherlv_23= '>' otherlv_24= 'subQuestions'
                    {
                    otherlv_19=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating2950); 

                        	newLeafNode(otherlv_19, grammarAccess.getRatingAccess().getSubQuestionsKeyword_14_0());
                        
                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating2962); 

                        	newLeafNode(otherlv_20, grammarAccess.getRatingAccess().getLessThanSignKeyword_14_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1421:1: ( (lv_subquestion_21_0= ruleQuestion ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1422:1: (lv_subquestion_21_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1422:1: (lv_subquestion_21_0= ruleQuestion )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1423:3: lv_subquestion_21_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getRatingAccess().getSubquestionQuestionParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRating2983);
                    lv_subquestion_21_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRatingRule());
                    	        }
                           		add(
                           			current, 
                           			"subquestion",
                            		lv_subquestion_21_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1439:2: ( (lv_subquestion_22_0= ruleQuestion ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26||(LA31_0>=32 && LA31_0<=33)||(LA31_0>=37 && LA31_0<=39)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1440:1: (lv_subquestion_22_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1440:1: (lv_subquestion_22_0= ruleQuestion )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1441:3: lv_subquestion_22_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRatingAccess().getSubquestionQuestionParserRuleCall_14_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleRating3004);
                    	    lv_subquestion_22_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRatingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subquestion",
                    	            		lv_subquestion_22_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating3017); 

                        	newLeafNode(otherlv_23, grammarAccess.getRatingAccess().getGreaterThanSignKeyword_14_4());
                        
                    otherlv_24=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRating3029); 

                        	newLeafNode(otherlv_24, grammarAccess.getRatingAccess().getSubQuestionsKeyword_14_5());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRating3043); 

                	newLeafNode(otherlv_25, grammarAccess.getRatingAccess().getGreaterThanSignKeyword_15());
                
            otherlv_26=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRating3055); 

                	newLeafNode(otherlv_26, grammarAccess.getRatingAccess().getRatingKeyword_16());
                

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
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleYesNo"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1481:1: entryRuleYesNo returns [EObject current=null] : iv_ruleYesNo= ruleYesNo EOF ;
    public final EObject entryRuleYesNo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYesNo = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1482:2: (iv_ruleYesNo= ruleYesNo EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1483:2: iv_ruleYesNo= ruleYesNo EOF
            {
             newCompositeNode(grammarAccess.getYesNoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYesNo_in_entryRuleYesNo3091);
            iv_ruleYesNo=ruleYesNo();

            state._fsp--;

             current =iv_ruleYesNo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYesNo3101); 

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
    // $ANTLR end "entryRuleYesNo"


    // $ANTLR start "ruleYesNo"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1490:1: ruleYesNo returns [EObject current=null] : (otherlv_0= 'yesNo' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'yesNo' ) ;
    public final EObject ruleYesNo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_questionText_4_0 = null;

        AntlrDatatypeRuleToken lv_isMandatory_7_0 = null;

        EObject lv_option_8_0 = null;

        EObject lv_option_9_0 = null;

        EObject lv_subquestion_12_0 = null;

        EObject lv_subquestion_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1493:28: ( (otherlv_0= 'yesNo' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'yesNo' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1494:1: (otherlv_0= 'yesNo' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'yesNo' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1494:1: (otherlv_0= 'yesNo' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'yesNo' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1494:3: otherlv_0= 'yesNo' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'yesNo'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleYesNo3138); 

                	newLeafNode(otherlv_0, grammarAccess.getYesNoAccess().getYesNoKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleYesNo3150); 

                	newLeafNode(otherlv_1, grammarAccess.getYesNoAccess().getLessThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleYesNo3162); 

                	newLeafNode(otherlv_2, grammarAccess.getYesNoAccess().getQuestionTextKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleYesNo3174); 

                	newLeafNode(otherlv_3, grammarAccess.getYesNoAccess().getColonKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1510:1: ( (lv_questionText_4_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1511:1: (lv_questionText_4_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1511:1: (lv_questionText_4_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1512:3: lv_questionText_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getYesNoAccess().getQuestionTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleYesNo3195);
            lv_questionText_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getYesNoRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1528:2: (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1528:4: otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleYesNo3208); 

                        	newLeafNode(otherlv_5, grammarAccess.getYesNoAccess().getIsMandatoryKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleYesNo3220); 

                        	newLeafNode(otherlv_6, grammarAccess.getYesNoAccess().getColonKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1536:1: ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1537:1: (lv_isMandatory_7_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1537:1: (lv_isMandatory_7_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1538:3: lv_isMandatory_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getYesNoAccess().getIsMandatoryEBooleanParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleYesNo3241);
                    lv_isMandatory_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getYesNoRule());
                    	        }
                           		set(
                           			current, 
                           			"isMandatory",
                            		lv_isMandatory_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1554:4: ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1554:5: ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )*
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1554:5: ( (lv_option_8_0= ruleOption ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1555:1: (lv_option_8_0= ruleOption )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1555:1: (lv_option_8_0= ruleOption )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1556:3: lv_option_8_0= ruleOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getYesNoAccess().getOptionOptionParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleYesNo3265);
                    lv_option_8_0=ruleOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getYesNoRule());
                    	        }
                           		add(
                           			current, 
                           			"option",
                            		lv_option_8_0, 
                            		"Option");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1572:2: ( (lv_option_9_0= ruleOption ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==23) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1573:1: (lv_option_9_0= ruleOption )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1573:1: (lv_option_9_0= ruleOption )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1574:3: lv_option_9_0= ruleOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getYesNoAccess().getOptionOptionParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleYesNo3286);
                    	    lv_option_9_0=ruleOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getYesNoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"option",
                    	            		lv_option_9_0, 
                    	            		"Option");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1590:5: (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1590:7: otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions'
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleYesNo3302); 

                        	newLeafNode(otherlv_10, grammarAccess.getYesNoAccess().getSubQuestionsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleYesNo3314); 

                        	newLeafNode(otherlv_11, grammarAccess.getYesNoAccess().getLessThanSignKeyword_7_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1598:1: ( (lv_subquestion_12_0= ruleQuestion ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1599:1: (lv_subquestion_12_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1599:1: (lv_subquestion_12_0= ruleQuestion )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1600:3: lv_subquestion_12_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getYesNoAccess().getSubquestionQuestionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleYesNo3335);
                    lv_subquestion_12_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getYesNoRule());
                    	        }
                           		add(
                           			current, 
                           			"subquestion",
                            		lv_subquestion_12_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1616:2: ( (lv_subquestion_13_0= ruleQuestion ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==26||(LA36_0>=32 && LA36_0<=33)||(LA36_0>=37 && LA36_0<=39)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1617:1: (lv_subquestion_13_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1617:1: (lv_subquestion_13_0= ruleQuestion )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1618:3: lv_subquestion_13_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getYesNoAccess().getSubquestionQuestionParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleYesNo3356);
                    	    lv_subquestion_13_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getYesNoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subquestion",
                    	            		lv_subquestion_13_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleYesNo3369); 

                        	newLeafNode(otherlv_14, grammarAccess.getYesNoAccess().getGreaterThanSignKeyword_7_4());
                        
                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleYesNo3381); 

                        	newLeafNode(otherlv_15, grammarAccess.getYesNoAccess().getSubQuestionsKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleYesNo3395); 

                	newLeafNode(otherlv_16, grammarAccess.getYesNoAccess().getGreaterThanSignKeyword_8());
                
            otherlv_17=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleYesNo3407); 

                	newLeafNode(otherlv_17, grammarAccess.getYesNoAccess().getYesNoKeyword_9());
                

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
    // $ANTLR end "ruleYesNo"


    // $ANTLR start "entryRuleOpenField"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1658:1: entryRuleOpenField returns [EObject current=null] : iv_ruleOpenField= ruleOpenField EOF ;
    public final EObject entryRuleOpenField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenField = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1659:2: (iv_ruleOpenField= ruleOpenField EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1660:2: iv_ruleOpenField= ruleOpenField EOF
            {
             newCompositeNode(grammarAccess.getOpenFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenField_in_entryRuleOpenField3443);
            iv_ruleOpenField=ruleOpenField();

            state._fsp--;

             current =iv_ruleOpenField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpenField3453); 

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
    // $ANTLR end "entryRuleOpenField"


    // $ANTLR start "ruleOpenField"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1667:1: ruleOpenField returns [EObject current=null] : (otherlv_0= 'openField' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'openField' ) ;
    public final EObject ruleOpenField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_questionText_4_0 = null;

        AntlrDatatypeRuleToken lv_isMandatory_7_0 = null;

        EObject lv_option_8_0 = null;

        EObject lv_option_9_0 = null;

        EObject lv_subquestion_12_0 = null;

        EObject lv_subquestion_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1670:28: ( (otherlv_0= 'openField' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'openField' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1671:1: (otherlv_0= 'openField' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'openField' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1671:1: (otherlv_0= 'openField' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'openField' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1671:3: otherlv_0= 'openField' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'openField'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOpenField3490); 

                	newLeafNode(otherlv_0, grammarAccess.getOpenFieldAccess().getOpenFieldKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpenField3502); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenFieldAccess().getLessThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOpenField3514); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenFieldAccess().getQuestionTextKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpenField3526); 

                	newLeafNode(otherlv_3, grammarAccess.getOpenFieldAccess().getColonKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1687:1: ( (lv_questionText_4_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1688:1: (lv_questionText_4_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1688:1: (lv_questionText_4_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1689:3: lv_questionText_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenFieldAccess().getQuestionTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpenField3547);
            lv_questionText_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenFieldRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1705:2: (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1705:4: otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleOpenField3560); 

                        	newLeafNode(otherlv_5, grammarAccess.getOpenFieldAccess().getIsMandatoryKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpenField3572); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpenFieldAccess().getColonKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1713:1: ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1714:1: (lv_isMandatory_7_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1714:1: (lv_isMandatory_7_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1715:3: lv_isMandatory_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenFieldAccess().getIsMandatoryEBooleanParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleOpenField3593);
                    lv_isMandatory_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"isMandatory",
                            		lv_isMandatory_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1731:4: ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1731:5: ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )*
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1731:5: ( (lv_option_8_0= ruleOption ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1732:1: (lv_option_8_0= ruleOption )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1732:1: (lv_option_8_0= ruleOption )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1733:3: lv_option_8_0= ruleOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenFieldAccess().getOptionOptionParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleOpenField3617);
                    lv_option_8_0=ruleOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenFieldRule());
                    	        }
                           		add(
                           			current, 
                           			"option",
                            		lv_option_8_0, 
                            		"Option");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1749:2: ( (lv_option_9_0= ruleOption ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==23) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1750:1: (lv_option_9_0= ruleOption )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1750:1: (lv_option_9_0= ruleOption )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1751:3: lv_option_9_0= ruleOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOpenFieldAccess().getOptionOptionParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleOpenField3638);
                    	    lv_option_9_0=ruleOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOpenFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"option",
                    	            		lv_option_9_0, 
                    	            		"Option");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1767:5: (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1767:7: otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions'
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOpenField3654); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpenFieldAccess().getSubQuestionsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpenField3666); 

                        	newLeafNode(otherlv_11, grammarAccess.getOpenFieldAccess().getLessThanSignKeyword_7_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1775:1: ( (lv_subquestion_12_0= ruleQuestion ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1776:1: (lv_subquestion_12_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1776:1: (lv_subquestion_12_0= ruleQuestion )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1777:3: lv_subquestion_12_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpenFieldAccess().getSubquestionQuestionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleOpenField3687);
                    lv_subquestion_12_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpenFieldRule());
                    	        }
                           		add(
                           			current, 
                           			"subquestion",
                            		lv_subquestion_12_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1793:2: ( (lv_subquestion_13_0= ruleQuestion ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==26||(LA41_0>=32 && LA41_0<=33)||(LA41_0>=37 && LA41_0<=39)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1794:1: (lv_subquestion_13_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1794:1: (lv_subquestion_13_0= ruleQuestion )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1795:3: lv_subquestion_13_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOpenFieldAccess().getSubquestionQuestionParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleOpenField3708);
                    	    lv_subquestion_13_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOpenFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subquestion",
                    	            		lv_subquestion_13_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpenField3721); 

                        	newLeafNode(otherlv_14, grammarAccess.getOpenFieldAccess().getGreaterThanSignKeyword_7_4());
                        
                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOpenField3733); 

                        	newLeafNode(otherlv_15, grammarAccess.getOpenFieldAccess().getSubQuestionsKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpenField3747); 

                	newLeafNode(otherlv_16, grammarAccess.getOpenFieldAccess().getGreaterThanSignKeyword_8());
                
            otherlv_17=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOpenField3759); 

                	newLeafNode(otherlv_17, grammarAccess.getOpenFieldAccess().getOpenFieldKeyword_9());
                

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
    // $ANTLR end "ruleOpenField"


    // $ANTLR start "entryRuleMutuallyExclusive_Impl"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1835:1: entryRuleMutuallyExclusive_Impl returns [EObject current=null] : iv_ruleMutuallyExclusive_Impl= ruleMutuallyExclusive_Impl EOF ;
    public final EObject entryRuleMutuallyExclusive_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMutuallyExclusive_Impl = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1836:2: (iv_ruleMutuallyExclusive_Impl= ruleMutuallyExclusive_Impl EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1837:2: iv_ruleMutuallyExclusive_Impl= ruleMutuallyExclusive_Impl EOF
            {
             newCompositeNode(grammarAccess.getMutuallyExclusive_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMutuallyExclusive_Impl_in_entryRuleMutuallyExclusive_Impl3795);
            iv_ruleMutuallyExclusive_Impl=ruleMutuallyExclusive_Impl();

            state._fsp--;

             current =iv_ruleMutuallyExclusive_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMutuallyExclusive_Impl3805); 

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
    // $ANTLR end "entryRuleMutuallyExclusive_Impl"


    // $ANTLR start "ruleMutuallyExclusive_Impl"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1844:1: ruleMutuallyExclusive_Impl returns [EObject current=null] : (otherlv_0= 'mutuallyExclusive' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'mutuallyExclusive' ) ;
    public final EObject ruleMutuallyExclusive_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_questionText_4_0 = null;

        AntlrDatatypeRuleToken lv_isMandatory_7_0 = null;

        EObject lv_option_8_0 = null;

        EObject lv_option_9_0 = null;

        EObject lv_subquestion_12_0 = null;

        EObject lv_subquestion_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1847:28: ( (otherlv_0= 'mutuallyExclusive' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'mutuallyExclusive' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1848:1: (otherlv_0= 'mutuallyExclusive' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'mutuallyExclusive' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1848:1: (otherlv_0= 'mutuallyExclusive' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'mutuallyExclusive' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1848:3: otherlv_0= 'mutuallyExclusive' otherlv_1= '<' otherlv_2= 'questionText' otherlv_3= ':' ( (lv_questionText_4_0= ruleEString ) ) (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )? ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )? (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )? otherlv_16= '>' otherlv_17= 'mutuallyExclusive'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMutuallyExclusive_Impl3842); 

                	newLeafNode(otherlv_0, grammarAccess.getMutuallyExclusive_ImplAccess().getMutuallyExclusiveKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMutuallyExclusive_Impl3854); 

                	newLeafNode(otherlv_1, grammarAccess.getMutuallyExclusive_ImplAccess().getLessThanSignKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMutuallyExclusive_Impl3866); 

                	newLeafNode(otherlv_2, grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMutuallyExclusive_Impl3878); 

                	newLeafNode(otherlv_3, grammarAccess.getMutuallyExclusive_ImplAccess().getColonKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1864:1: ( (lv_questionText_4_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1865:1: (lv_questionText_4_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1865:1: (lv_questionText_4_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1866:3: lv_questionText_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMutuallyExclusive_Impl3899);
            lv_questionText_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1882:2: (otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1882:4: otherlv_5= 'isMandatory' otherlv_6= ':' ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMutuallyExclusive_Impl3912); 

                        	newLeafNode(otherlv_5, grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMutuallyExclusive_Impl3924); 

                        	newLeafNode(otherlv_6, grammarAccess.getMutuallyExclusive_ImplAccess().getColonKeyword_5_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1890:1: ( (lv_isMandatory_7_0= ruleEBoolean ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1891:1: (lv_isMandatory_7_0= ruleEBoolean )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1891:1: (lv_isMandatory_7_0= ruleEBoolean )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1892:3: lv_isMandatory_7_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryEBooleanParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleMutuallyExclusive_Impl3945);
                    lv_isMandatory_7_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"isMandatory",
                            		lv_isMandatory_7_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1908:4: ( ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1908:5: ( (lv_option_8_0= ruleOption ) ) ( (lv_option_9_0= ruleOption ) )*
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1908:5: ( (lv_option_8_0= ruleOption ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1909:1: (lv_option_8_0= ruleOption )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1909:1: (lv_option_8_0= ruleOption )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1910:3: lv_option_8_0= ruleOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getOptionOptionParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMutuallyExclusive_Impl3969);
                    lv_option_8_0=ruleOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"option",
                            		lv_option_8_0, 
                            		"Option");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1926:2: ( (lv_option_9_0= ruleOption ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==23) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1927:1: (lv_option_9_0= ruleOption )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1927:1: (lv_option_9_0= ruleOption )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1928:3: lv_option_9_0= ruleOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getOptionOptionParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleMutuallyExclusive_Impl3990);
                    	    lv_option_9_0=ruleOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"option",
                    	            		lv_option_9_0, 
                    	            		"Option");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1944:5: (otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1944:7: otherlv_10= 'subQuestions' otherlv_11= '<' ( (lv_subquestion_12_0= ruleQuestion ) ) ( (lv_subquestion_13_0= ruleQuestion ) )* otherlv_14= '>' otherlv_15= 'subQuestions'
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMutuallyExclusive_Impl4006); 

                        	newLeafNode(otherlv_10, grammarAccess.getMutuallyExclusive_ImplAccess().getSubQuestionsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMutuallyExclusive_Impl4018); 

                        	newLeafNode(otherlv_11, grammarAccess.getMutuallyExclusive_ImplAccess().getLessThanSignKeyword_7_1());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1952:1: ( (lv_subquestion_12_0= ruleQuestion ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1953:1: (lv_subquestion_12_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1953:1: (lv_subquestion_12_0= ruleQuestion )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1954:3: lv_subquestion_12_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getSubquestionQuestionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMutuallyExclusive_Impl4039);
                    lv_subquestion_12_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"subquestion",
                            		lv_subquestion_12_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1970:2: ( (lv_subquestion_13_0= ruleQuestion ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==26||(LA46_0>=32 && LA46_0<=33)||(LA46_0>=37 && LA46_0<=39)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1971:1: (lv_subquestion_13_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1971:1: (lv_subquestion_13_0= ruleQuestion )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1972:3: lv_subquestion_13_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getSubquestionQuestionParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleMutuallyExclusive_Impl4060);
                    	    lv_subquestion_13_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subquestion",
                    	            		lv_subquestion_13_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMutuallyExclusive_Impl4073); 

                        	newLeafNode(otherlv_14, grammarAccess.getMutuallyExclusive_ImplAccess().getGreaterThanSignKeyword_7_4());
                        
                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMutuallyExclusive_Impl4085); 

                        	newLeafNode(otherlv_15, grammarAccess.getMutuallyExclusive_ImplAccess().getSubQuestionsKeyword_7_5());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMutuallyExclusive_Impl4099); 

                	newLeafNode(otherlv_16, grammarAccess.getMutuallyExclusive_ImplAccess().getGreaterThanSignKeyword_8());
                
            otherlv_17=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMutuallyExclusive_Impl4111); 

                	newLeafNode(otherlv_17, grammarAccess.getMutuallyExclusive_ImplAccess().getMutuallyExclusiveKeyword_9());
                

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
    // $ANTLR end "ruleMutuallyExclusive_Impl"


    // $ANTLR start "entryRuleText"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2012:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2013:2: (iv_ruleText= ruleText EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2014:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText4147);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText4157); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2021:1: ruleText returns [EObject current=null] : (otherlv_0= 'text' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2024:28: ( (otherlv_0= 'text' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2025:1: (otherlv_0= 'text' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2025:1: (otherlv_0= 'text' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2025:3: otherlv_0= 'text' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleText4194); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleText4206); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getColonKeyword_1());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2033:1: ( (lv_content_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2034:1: (lv_content_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2034:1: (lv_content_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2035:3: lv_content_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getContentEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleText4227);
            lv_content_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleImage"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2059:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2060:2: (iv_ruleImage= ruleImage EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2061:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImage_in_entryRuleImage4263);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImage4273); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2068:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_content_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2071:28: ( (otherlv_0= 'image' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2072:1: (otherlv_0= 'image' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2072:1: (otherlv_0= 'image' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2072:3: otherlv_0= 'image' otherlv_1= ':' ( (lv_content_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleImage4310); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleImage4322); 

                	newLeafNode(otherlv_1, grammarAccess.getImageAccess().getColonKeyword_1());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2080:1: ( (lv_content_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2081:1: (lv_content_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2081:1: (lv_content_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2082:3: lv_content_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getContentEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImage4343);
            lv_content_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2106:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2107:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2108:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4380);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4391); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2115:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2118:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2119:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2119:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2119:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2119:2: (kw= '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==42) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2120:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEInt4430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4447); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2140:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2141:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2142:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat4493);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat4504); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2149:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2152:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2153:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2153:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2153:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2153:2: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2154:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEFloat4543); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2159:3: (this_INT_1= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2159:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat4561); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEFloat4581); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat4596); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2179:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=44 && LA53_0<=45)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2179:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2179:2: (kw= 'E' | kw= 'e' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==44) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==45) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2180:2: kw= 'E'
                            {
                            kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEFloat4616); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2187:2: kw= 'e'
                            {
                            kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEFloat4635); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2192:2: (kw= '-' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==42) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2193:2: kw= '-'
                            {
                            kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEFloat4650); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat4667); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
                        

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRulePersonAttribute"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2213:1: entryRulePersonAttribute returns [EObject current=null] : iv_rulePersonAttribute= rulePersonAttribute EOF ;
    public final EObject entryRulePersonAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonAttribute = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2214:2: (iv_rulePersonAttribute= rulePersonAttribute EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2215:2: iv_rulePersonAttribute= rulePersonAttribute EOF
            {
             newCompositeNode(grammarAccess.getPersonAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_entryRulePersonAttribute4714);
            iv_rulePersonAttribute=rulePersonAttribute();

            state._fsp--;

             current =iv_rulePersonAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePersonAttribute4724); 

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
    // $ANTLR end "entryRulePersonAttribute"


    // $ANTLR start "rulePersonAttribute"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2222:1: rulePersonAttribute returns [EObject current=null] : ( (lv_key_0_0= ruleEString ) ) ;
    public final EObject rulePersonAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_key_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2225:28: ( ( (lv_key_0_0= ruleEString ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2226:1: ( (lv_key_0_0= ruleEString ) )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2226:1: ( (lv_key_0_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2227:1: (lv_key_0_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2227:1: (lv_key_0_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:2228:3: lv_key_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPersonAttributeAccess().getKeyEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePersonAttribute4769);
            lv_key_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersonAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"EString");
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
    // $ANTLR end "rulePersonAttribute"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey134 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey155 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey168 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey180 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey201 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_14_in_ruleSurvey216 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey228 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey249 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_rulePerson_in_ruleSurvey272 = new BitSet(new long[]{0x000000000004E000L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleSurvey294 = new BitSet(new long[]{0x000000000004E002L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleSurvey315 = new BitSet(new long[]{0x000000000004E002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion352 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_Impl_in_ruleQuestion409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_ruleQuestion436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_in_ruleQuestion463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNo_in_ruleQuestion490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenField_in_ruleQuestion517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMutuallyExclusive_Impl_in_ruleQuestion544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDescription589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleDescription636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_ruleDescription663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleCategory745 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCategory757 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleCategory769 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategory781 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCategory802 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_14_in_ruleCategory815 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategory827 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCategory848 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_ruleStep_in_ruleCategory871 = new BitSet(new long[]{0x0000000000124000L});
        public static final BitSet FOLLOW_ruleStep_in_ruleCategory892 = new BitSet(new long[]{0x0000000000124000L});
        public static final BitSet FOLLOW_17_in_ruleCategory905 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCategory917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString954 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePerson_in_entryRulePerson1076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePerson1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rulePerson1123 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePerson1135 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rulePerson1156 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_19_in_rulePerson1169 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rulePerson1190 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_rulePerson1204 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePerson1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStep1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleStep1299 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStep1311 = new BitSet(new long[]{0x000000E304000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleStep1332 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleStep1353 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_17_in_ruleStep1366 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStep1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEBoolean1464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEBoolean1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleOption1579 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOption1591 = new BitSet(new long[]{0x0000030003020000L});
        public static final BitSet FOLLOW_24_in_ruleOption1604 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOption1616 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOption1637 = new BitSet(new long[]{0x0000030002020000L});
        public static final BitSet FOLLOW_25_in_ruleOption1652 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOption1664 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOption1685 = new BitSet(new long[]{0x0000030000020000L});
        public static final BitSet FOLLOW_ruleDescription_in_ruleOption1709 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_19_in_ruleOption1722 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_ruleDescription_in_ruleOption1743 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_17_in_ruleOption1759 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleOption1771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_Impl_in_entryRuleMultipleChoice_Impl1807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice_Impl1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice_Impl1854 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice_Impl1866 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMultipleChoice_Impl1878 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice_Impl1890 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice_Impl1911 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_28_in_ruleMultipleChoice_Impl1924 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice_Impl1936 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleMultipleChoice_Impl1957 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMultipleChoice_Impl1971 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice_Impl1983 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl2004 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMultipleChoice_Impl2016 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMultipleChoice_Impl2028 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl2049 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultipleChoice_Impl2071 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMultipleChoice_Impl2092 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_31_in_ruleMultipleChoice_Impl2108 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMultipleChoice_Impl2120 = new BitSet(new long[]{0x000000E304000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMultipleChoice_Impl2141 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMultipleChoice_Impl2162 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice_Impl2175 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMultipleChoice_Impl2187 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultipleChoice_Impl2201 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice_Impl2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking2249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleRanking2296 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRanking2308 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRanking2320 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRanking2332 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking2353 = new BitSet(new long[]{0x0000000090820000L});
        public static final BitSet FOLLOW_28_in_ruleRanking2366 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRanking2378 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleRanking2399 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleRanking2423 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleRanking2444 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_31_in_ruleRanking2460 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRanking2472 = new BitSet(new long[]{0x000000E304000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRanking2493 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRanking2514 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_17_in_ruleRanking2527 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRanking2539 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRanking2553 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleRanking2565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_in_entryRuleRating2601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating2611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleRating2648 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRating2660 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRating2672 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating2684 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating2705 = new BitSet(new long[]{0x0000000410000000L});
        public static final BitSet FOLLOW_28_in_ruleRating2718 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating2730 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleRating2751 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleRating2765 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating2777 = new BitSet(new long[]{0x00000C0000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleRating2798 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleRating2810 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating2822 = new BitSet(new long[]{0x00000C0000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleRating2843 = new BitSet(new long[]{0x0000001080820000L});
        public static final BitSet FOLLOW_36_in_ruleRating2856 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRating2868 = new BitSet(new long[]{0x00000C0000000040L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleRating2889 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleRating2913 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleRating2934 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_31_in_ruleRating2950 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRating2962 = new BitSet(new long[]{0x000000E304000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRating2983 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleRating3004 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_17_in_ruleRating3017 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleRating3029 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRating3043 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleRating3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNo_in_entryRuleYesNo3091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYesNo3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleYesNo3138 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleYesNo3150 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleYesNo3162 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleYesNo3174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleYesNo3195 = new BitSet(new long[]{0x0000000090820000L});
        public static final BitSet FOLLOW_28_in_ruleYesNo3208 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleYesNo3220 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleYesNo3241 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleYesNo3265 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleYesNo3286 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_31_in_ruleYesNo3302 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleYesNo3314 = new BitSet(new long[]{0x000000E304000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleYesNo3335 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleYesNo3356 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_17_in_ruleYesNo3369 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleYesNo3381 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleYesNo3395 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleYesNo3407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenField_in_entryRuleOpenField3443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpenField3453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleOpenField3490 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOpenField3502 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleOpenField3514 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpenField3526 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpenField3547 = new BitSet(new long[]{0x0000000090820000L});
        public static final BitSet FOLLOW_28_in_ruleOpenField3560 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpenField3572 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleOpenField3593 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleOpenField3617 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleOpenField3638 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_31_in_ruleOpenField3654 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOpenField3666 = new BitSet(new long[]{0x000000E304000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleOpenField3687 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleOpenField3708 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_17_in_ruleOpenField3721 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleOpenField3733 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOpenField3747 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleOpenField3759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMutuallyExclusive_Impl_in_entryRuleMutuallyExclusive_Impl3795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMutuallyExclusive_Impl3805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMutuallyExclusive_Impl3842 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMutuallyExclusive_Impl3854 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMutuallyExclusive_Impl3866 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMutuallyExclusive_Impl3878 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMutuallyExclusive_Impl3899 = new BitSet(new long[]{0x0000000090820000L});
        public static final BitSet FOLLOW_28_in_ruleMutuallyExclusive_Impl3912 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMutuallyExclusive_Impl3924 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleMutuallyExclusive_Impl3945 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMutuallyExclusive_Impl3969 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleMutuallyExclusive_Impl3990 = new BitSet(new long[]{0x0000000080820000L});
        public static final BitSet FOLLOW_31_in_ruleMutuallyExclusive_Impl4006 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMutuallyExclusive_Impl4018 = new BitSet(new long[]{0x000000E304000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMutuallyExclusive_Impl4039 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleMutuallyExclusive_Impl4060 = new BitSet(new long[]{0x000000E304020000L});
        public static final BitSet FOLLOW_17_in_ruleMutuallyExclusive_Impl4073 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMutuallyExclusive_Impl4085 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMutuallyExclusive_Impl4099 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMutuallyExclusive_Impl4111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText4147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText4157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleText4194 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleText4206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleText4227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImage_in_entryRuleImage4263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImage4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleImage4310 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleImage4322 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImage4343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEInt4430 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat4493 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEFloat4543 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat4561 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleEFloat4581 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat4596 = new BitSet(new long[]{0x0000300000000002L});
        public static final BitSet FOLLOW_44_in_ruleEFloat4616 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_45_in_ruleEFloat4635 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_42_in_ruleEFloat4650 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat4667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_entryRulePersonAttribute4714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePersonAttribute4724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePersonAttribute4769 = new BitSet(new long[]{0x0000000000000002L});
    }


}