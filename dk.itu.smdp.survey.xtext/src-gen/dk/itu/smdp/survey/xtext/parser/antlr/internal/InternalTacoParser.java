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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'survey'", "'date'", "'description'", "'category'", "'person'", "','", "'page'", "'A'", "'['", "'input'", "']'", "'sub'", "'end'", "'Q'", "'*'", "'-'", "'rank'", "'y/n'"
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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:76:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'survey' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'date' ( (lv_date_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_person_6_0= rulePerson ) )? ( (lv_categories_7_0= ruleCategory ) ) ( (lv_categories_8_0= ruleCategory ) )* ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_date_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_person_6_0 = null;

        EObject lv_categories_7_0 = null;

        EObject lv_categories_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:79:28: ( (otherlv_0= 'survey' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'date' ( (lv_date_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_person_6_0= rulePerson ) )? ( (lv_categories_7_0= ruleCategory ) ) ( (lv_categories_8_0= ruleCategory ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:80:1: (otherlv_0= 'survey' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'date' ( (lv_date_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_person_6_0= rulePerson ) )? ( (lv_categories_7_0= ruleCategory ) ) ( (lv_categories_8_0= ruleCategory ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:80:1: (otherlv_0= 'survey' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'date' ( (lv_date_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_person_6_0= rulePerson ) )? ( (lv_categories_7_0= ruleCategory ) ) ( (lv_categories_8_0= ruleCategory ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:80:3: otherlv_0= 'survey' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'date' ( (lv_date_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? ( (lv_person_6_0= rulePerson ) )? ( (lv_categories_7_0= ruleCategory ) ) ( (lv_categories_8_0= ruleCategory ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSurvey122); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:84:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:85:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:85:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:86:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey143);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:102:2: (otherlv_2= 'date' ( (lv_date_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:102:4: otherlv_2= 'date' ( (lv_date_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSurvey156); 

                        	newLeafNode(otherlv_2, grammarAccess.getSurveyAccess().getDateKeyword_2_0());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:106:1: ( (lv_date_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:107:1: (lv_date_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:107:1: (lv_date_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:108:3: lv_date_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getDateEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey177);
                    lv_date_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"date",
                            		lv_date_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:124:4: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:124:6: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSurvey192); 

                        	newLeafNode(otherlv_4, grammarAccess.getSurveyAccess().getDescriptionKeyword_3_0());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:128:1: ( (lv_description_5_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:129:1: (lv_description_5_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:129:1: (lv_description_5_0= ruleEString )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:130:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSurvey213);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:146:4: ( (lv_person_6_0= rulePerson ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:147:1: (lv_person_6_0= rulePerson )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:147:1: (lv_person_6_0= rulePerson )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:148:3: lv_person_6_0= rulePerson
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyAccess().getPersonPersonParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePerson_in_ruleSurvey236);
                    lv_person_6_0=rulePerson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
                    	        }
                           		set(
                           			current, 
                           			"person",
                            		lv_person_6_0, 
                            		"Person");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:164:3: ( (lv_categories_7_0= ruleCategory ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:165:1: (lv_categories_7_0= ruleCategory )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:165:1: (lv_categories_7_0= ruleCategory )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:166:3: lv_categories_7_0= ruleCategory
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleSurvey258);
            lv_categories_7_0=ruleCategory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		add(
                   			current, 
                   			"categories",
                    		lv_categories_7_0, 
                    		"Category");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:182:2: ( (lv_categories_8_0= ruleCategory ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:183:1: (lv_categories_8_0= ruleCategory )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:183:1: (lv_categories_8_0= ruleCategory )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:184:3: lv_categories_8_0= ruleCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getCategoriesCategoryParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleSurvey279);
            	    lv_categories_8_0=ruleCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categories",
            	            		lv_categories_8_0, 
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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:208:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:209:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:210:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion316);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion326); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:217:1: ruleQuestion returns [EObject current=null] : (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl ) ;
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
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:220:28: ( (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:221:1: (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:221:1: (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:222:5: this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoice_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_Impl_in_ruleQuestion373);
                    this_MultipleChoice_Impl_0=ruleMultipleChoice_Impl();

                    state._fsp--;

                     
                            current = this_MultipleChoice_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:232:5: this_Ranking_1= ruleRanking
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRankingParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRanking_in_ruleQuestion400);
                    this_Ranking_1=ruleRanking();

                    state._fsp--;

                     
                            current = this_Ranking_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:242:5: this_Rating_2= ruleRating
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getRatingParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRating_in_ruleQuestion427);
                    this_Rating_2=ruleRating();

                    state._fsp--;

                     
                            current = this_Rating_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:252:5: this_YesNo_3= ruleYesNo
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getYesNoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleYesNo_in_ruleQuestion454);
                    this_YesNo_3=ruleYesNo();

                    state._fsp--;

                     
                            current = this_YesNo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:262:5: this_OpenField_4= ruleOpenField
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenFieldParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpenField_in_ruleQuestion481);
                    this_OpenField_4=ruleOpenField();

                    state._fsp--;

                     
                            current = this_OpenField_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:272:5: this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMutuallyExclusive_ImplParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMutuallyExclusive_Impl_in_ruleQuestion508);
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


    // $ANTLR start "entryRuleCategory"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:288:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:289:2: (iv_ruleCategory= ruleCategory EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:290:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory543);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory553); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:297:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'category' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_pages_4_0 = null;

        EObject lv_pages_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:300:28: ( (otherlv_0= 'category' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:301:1: (otherlv_0= 'category' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:301:1: (otherlv_0= 'category' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:301:3: otherlv_0= 'category' ( (lv_title_1_0= ruleEString ) ) (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? ( (lv_pages_4_0= rulePage ) ) ( (lv_pages_5_0= rulePage ) )*
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCategory590); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:305:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:306:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:306:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:307:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCategory611);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:323:2: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:323:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCategory624); 

                        	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getDescriptionKeyword_2_0());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:327:1: ( (lv_description_3_0= ruleEString ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:328:1: (lv_description_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:328:1: (lv_description_3_0= ruleEString )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:329:3: lv_description_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCategoryAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCategory645);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCategoryRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:345:4: ( (lv_pages_4_0= rulePage ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:346:1: (lv_pages_4_0= rulePage )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:346:1: (lv_pages_4_0= rulePage )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:347:3: lv_pages_4_0= rulePage
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleCategory668);
            lv_pages_4_0=rulePage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		add(
                   			current, 
                   			"pages",
                    		lv_pages_4_0, 
                    		"Page");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:363:2: ( (lv_pages_5_0= rulePage ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:364:1: (lv_pages_5_0= rulePage )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:364:1: (lv_pages_5_0= rulePage )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:365:3: lv_pages_5_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCategoryAccess().getPagesPageParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleCategory689);
            	    lv_pages_5_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_5_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:389:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:390:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:391:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString727);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString738); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:398:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:401:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:402:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:402:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:402:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString778); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:410:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString804); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:425:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:426:2: (iv_rulePerson= rulePerson EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:427:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePerson_in_entryRulePerson849);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePerson859); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:434:1: rulePerson returns [EObject current=null] : (otherlv_0= 'person' ( (lv_attribute_1_0= rulePersonAttribute ) ) (otherlv_2= ',' ( (lv_attribute_3_0= rulePersonAttribute ) ) )* ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_attribute_1_0 = null;

        EObject lv_attribute_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:437:28: ( (otherlv_0= 'person' ( (lv_attribute_1_0= rulePersonAttribute ) ) (otherlv_2= ',' ( (lv_attribute_3_0= rulePersonAttribute ) ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:438:1: (otherlv_0= 'person' ( (lv_attribute_1_0= rulePersonAttribute ) ) (otherlv_2= ',' ( (lv_attribute_3_0= rulePersonAttribute ) ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:438:1: (otherlv_0= 'person' ( (lv_attribute_1_0= rulePersonAttribute ) ) (otherlv_2= ',' ( (lv_attribute_3_0= rulePersonAttribute ) ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:438:3: otherlv_0= 'person' ( (lv_attribute_1_0= rulePersonAttribute ) ) (otherlv_2= ',' ( (lv_attribute_3_0= rulePersonAttribute ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePerson896); 

                	newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:442:1: ( (lv_attribute_1_0= rulePersonAttribute ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:443:1: (lv_attribute_1_0= rulePersonAttribute )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:443:1: (lv_attribute_1_0= rulePersonAttribute )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:444:3: lv_attribute_1_0= rulePersonAttribute
            {
             
            	        newCompositeNode(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rulePerson917);
            lv_attribute_1_0=rulePersonAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	        }
                   		add(
                   			current, 
                   			"attribute",
                    		lv_attribute_1_0, 
                    		"PersonAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:460:2: (otherlv_2= ',' ( (lv_attribute_3_0= rulePersonAttribute ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:460:4: otherlv_2= ',' ( (lv_attribute_3_0= rulePersonAttribute ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePerson930); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getCommaKeyword_2_0());
            	        
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:464:1: ( (lv_attribute_3_0= rulePersonAttribute ) )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:465:1: (lv_attribute_3_0= rulePersonAttribute )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:465:1: (lv_attribute_3_0= rulePersonAttribute )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:466:3: lv_attribute_3_0= rulePersonAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersonAccess().getAttributePersonAttributeParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_rulePerson951);
            	    lv_attribute_3_0=rulePersonAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_3_0, 
            	            		"PersonAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRulePage"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:490:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:491:2: (iv_rulePage= rulePage EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:492:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage989);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage999); 

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:499:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_questions_1_0= ruleQuestion ) ) ( (lv_questions_2_0= ruleQuestion ) )* ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_questions_1_0 = null;

        EObject lv_questions_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:502:28: ( (otherlv_0= 'page' ( (lv_questions_1_0= ruleQuestion ) ) ( (lv_questions_2_0= ruleQuestion ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:503:1: (otherlv_0= 'page' ( (lv_questions_1_0= ruleQuestion ) ) ( (lv_questions_2_0= ruleQuestion ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:503:1: (otherlv_0= 'page' ( (lv_questions_1_0= ruleQuestion ) ) ( (lv_questions_2_0= ruleQuestion ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:503:3: otherlv_0= 'page' ( (lv_questions_1_0= ruleQuestion ) ) ( (lv_questions_2_0= ruleQuestion ) )*
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePage1036); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:507:1: ( (lv_questions_1_0= ruleQuestion ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:508:1: (lv_questions_1_0= ruleQuestion )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:508:1: (lv_questions_1_0= ruleQuestion )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:509:3: lv_questions_1_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rulePage1057);
            lv_questions_1_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_1_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:525:2: ( (lv_questions_2_0= ruleQuestion ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:526:1: (lv_questions_2_0= ruleQuestion )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:526:1: (lv_questions_2_0= ruleQuestion )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:527:3: lv_questions_2_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rulePage1078);
            	    lv_questions_2_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_2_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleAnswer"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:553:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:554:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:555:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1117);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1127); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:562:1: ruleAnswer returns [EObject current=null] : ( () otherlv_1= 'A' ( (lv_description_2_0= ruleEString ) ) ( ( (lv_isUserInputAllowed_3_0= '[' ) ) otherlv_4= 'input' otherlv_5= ']' )? (otherlv_6= 'sub' ( (lv_subquestion_7_0= ruleQuestion ) ) ( (lv_subquestion_8_0= ruleQuestion ) )* otherlv_9= 'end' )? ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUserInputAllowed_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;

        EObject lv_subquestion_7_0 = null;

        EObject lv_subquestion_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:565:28: ( ( () otherlv_1= 'A' ( (lv_description_2_0= ruleEString ) ) ( ( (lv_isUserInputAllowed_3_0= '[' ) ) otherlv_4= 'input' otherlv_5= ']' )? (otherlv_6= 'sub' ( (lv_subquestion_7_0= ruleQuestion ) ) ( (lv_subquestion_8_0= ruleQuestion ) )* otherlv_9= 'end' )? ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:566:1: ( () otherlv_1= 'A' ( (lv_description_2_0= ruleEString ) ) ( ( (lv_isUserInputAllowed_3_0= '[' ) ) otherlv_4= 'input' otherlv_5= ']' )? (otherlv_6= 'sub' ( (lv_subquestion_7_0= ruleQuestion ) ) ( (lv_subquestion_8_0= ruleQuestion ) )* otherlv_9= 'end' )? )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:566:1: ( () otherlv_1= 'A' ( (lv_description_2_0= ruleEString ) ) ( ( (lv_isUserInputAllowed_3_0= '[' ) ) otherlv_4= 'input' otherlv_5= ']' )? (otherlv_6= 'sub' ( (lv_subquestion_7_0= ruleQuestion ) ) ( (lv_subquestion_8_0= ruleQuestion ) )* otherlv_9= 'end' )? )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:566:2: () otherlv_1= 'A' ( (lv_description_2_0= ruleEString ) ) ( ( (lv_isUserInputAllowed_3_0= '[' ) ) otherlv_4= 'input' otherlv_5= ']' )? (otherlv_6= 'sub' ( (lv_subquestion_7_0= ruleQuestion ) ) ( (lv_subquestion_8_0= ruleQuestion ) )* otherlv_9= 'end' )?
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:566:2: ()
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:567:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnswerAccess().getAnswerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer1173); 

                	newLeafNode(otherlv_1, grammarAccess.getAnswerAccess().getAKeyword_1());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:576:1: ( (lv_description_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:577:1: (lv_description_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:577:1: (lv_description_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:578:3: lv_description_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getDescriptionEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1194);
            lv_description_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:594:2: ( ( (lv_isUserInputAllowed_3_0= '[' ) ) otherlv_4= 'input' otherlv_5= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:594:3: ( (lv_isUserInputAllowed_3_0= '[' ) ) otherlv_4= 'input' otherlv_5= ']'
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:594:3: ( (lv_isUserInputAllowed_3_0= '[' ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:595:1: (lv_isUserInputAllowed_3_0= '[' )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:595:1: (lv_isUserInputAllowed_3_0= '[' )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:596:3: lv_isUserInputAllowed_3_0= '['
                    {
                    lv_isUserInputAllowed_3_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswer1213); 

                            newLeafNode(lv_isUserInputAllowed_3_0, grammarAccess.getAnswerAccess().getIsUserInputAllowedLeftSquareBracketKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "isUserInputAllowed", true, "[");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnswer1238); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getInputKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnswer1250); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_3_2());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:617:3: (otherlv_6= 'sub' ( (lv_subquestion_7_0= ruleQuestion ) ) ( (lv_subquestion_8_0= ruleQuestion ) )* otherlv_9= 'end' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:617:5: otherlv_6= 'sub' ( (lv_subquestion_7_0= ruleQuestion ) ) ( (lv_subquestion_8_0= ruleQuestion ) )* otherlv_9= 'end'
                    {
                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnswer1265); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnswerAccess().getSubKeyword_4_0());
                        
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:621:1: ( (lv_subquestion_7_0= ruleQuestion ) )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:622:1: (lv_subquestion_7_0= ruleQuestion )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:622:1: (lv_subquestion_7_0= ruleQuestion )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:623:3: lv_subquestion_7_0= ruleQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleAnswer1286);
                    lv_subquestion_7_0=ruleQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		add(
                           			current, 
                           			"subquestion",
                            		lv_subquestion_7_0, 
                            		"Question");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:639:2: ( (lv_subquestion_8_0= ruleQuestion ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==24) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:640:1: (lv_subquestion_8_0= ruleQuestion )
                    	    {
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:640:1: (lv_subquestion_8_0= ruleQuestion )
                    	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:641:3: lv_subquestion_8_0= ruleQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnswerAccess().getSubquestionQuestionParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleAnswer1307);
                    	    lv_subquestion_8_0=ruleQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subquestion",
                    	            		lv_subquestion_8_0, 
                    	            		"Question");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnswer1320); 

                        	newLeafNode(otherlv_9, grammarAccess.getAnswerAccess().getEndKeyword_4_3());
                        

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleMultipleChoice_Impl"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:669:1: entryRuleMultipleChoice_Impl returns [EObject current=null] : iv_ruleMultipleChoice_Impl= ruleMultipleChoice_Impl EOF ;
    public final EObject entryRuleMultipleChoice_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice_Impl = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:670:2: (iv_ruleMultipleChoice_Impl= ruleMultipleChoice_Impl EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:671:2: iv_ruleMultipleChoice_Impl= ruleMultipleChoice_Impl EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoice_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_Impl_in_entryRuleMultipleChoice_Impl1358);
            iv_ruleMultipleChoice_Impl=ruleMultipleChoice_Impl();

            state._fsp--;

             current =iv_ruleMultipleChoice_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice_Impl1368); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:678:1: ruleMultipleChoice_Impl returns [EObject current=null] : (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' ( (lv_answers_8_0= ruleAnswer ) ) ( (lv_answers_9_0= ruleAnswer ) )* ) ;
    public final EObject ruleMultipleChoice_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_questionText_2_0 = null;

        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;

        EObject lv_answers_8_0 = null;

        EObject lv_answers_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:681:28: ( (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' ( (lv_answers_8_0= ruleAnswer ) ) ( (lv_answers_9_0= ruleAnswer ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:682:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' ( (lv_answers_8_0= ruleAnswer ) ) ( (lv_answers_9_0= ruleAnswer ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:682:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' ( (lv_answers_8_0= ruleAnswer ) ) ( (lv_answers_9_0= ruleAnswer ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:682:3: otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_max_6_0= ruleEInt ) ) otherlv_7= ']' ( (lv_answers_8_0= ruleAnswer ) ) ( (lv_answers_9_0= ruleAnswer ) )*
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultipleChoice_Impl1405); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoice_ImplAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:686:1: ( (lv_isMandatory_1_0= '*' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:687:1: (lv_isMandatory_1_0= '*' )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:687:1: (lv_isMandatory_1_0= '*' )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:688:3: lv_isMandatory_1_0= '*'
                    {
                    lv_isMandatory_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMultipleChoice_Impl1423); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getMultipleChoice_ImplAccess().getIsMandatoryAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultipleChoice_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:701:3: ( (lv_questionText_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:702:1: (lv_questionText_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:702:1: (lv_questionText_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:703:3: lv_questionText_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice_Impl1458);
            lv_questionText_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultipleChoice_Impl1470); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoice_ImplAccess().getLeftSquareBracketKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:723:1: ( (lv_min_4_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:724:1: (lv_min_4_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:724:1: (lv_min_4_0= ruleEInt )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:725:3: lv_min_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getMinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl1491);
            lv_min_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMultipleChoice_Impl1503); 

                	newLeafNode(otherlv_5, grammarAccess.getMultipleChoice_ImplAccess().getHyphenMinusKeyword_5());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:745:1: ( (lv_max_6_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:746:1: (lv_max_6_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:746:1: (lv_max_6_0= ruleEInt )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:747:3: lv_max_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getMaxEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl1524);
            lv_max_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultipleChoice_Impl1536); 

                	newLeafNode(otherlv_7, grammarAccess.getMultipleChoice_ImplAccess().getRightSquareBracketKeyword_7());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:767:1: ( (lv_answers_8_0= ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:768:1: (lv_answers_8_0= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:768:1: (lv_answers_8_0= ruleAnswer )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:769:3: lv_answers_8_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultipleChoice_Impl1557);
            lv_answers_8_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_8_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:785:2: ( (lv_answers_9_0= ruleAnswer ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:786:1: (lv_answers_9_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:786:1: (lv_answers_9_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:787:3: lv_answers_9_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoice_ImplAccess().getAnswersAnswerParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultipleChoice_Impl1578);
            	    lv_answers_9_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleChoice_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_9_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleMultipleChoice_Impl"


    // $ANTLR start "entryRuleRanking"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:811:1: entryRuleRanking returns [EObject current=null] : iv_ruleRanking= ruleRanking EOF ;
    public final EObject entryRuleRanking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRanking = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:812:2: (iv_ruleRanking= ruleRanking EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:813:2: iv_ruleRanking= ruleRanking EOF
            {
             newCompositeNode(grammarAccess.getRankingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRanking_in_entryRuleRanking1615);
            iv_ruleRanking=ruleRanking();

            state._fsp--;

             current =iv_ruleRanking; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRanking1625); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:820:1: ruleRanking returns [EObject current=null] : (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'rank' otherlv_5= ']' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* ) ;
    public final EObject ruleRanking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_questionText_2_0 = null;

        EObject lv_answers_6_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:823:28: ( (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'rank' otherlv_5= ']' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:824:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'rank' otherlv_5= ']' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:824:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'rank' otherlv_5= ']' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:824:3: otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'rank' otherlv_5= ']' ( (lv_answers_6_0= ruleAnswer ) ) ( (lv_answers_7_0= ruleAnswer ) )*
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRanking1662); 

                	newLeafNode(otherlv_0, grammarAccess.getRankingAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:828:1: ( (lv_isMandatory_1_0= '*' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:829:1: (lv_isMandatory_1_0= '*' )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:829:1: (lv_isMandatory_1_0= '*' )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:830:3: lv_isMandatory_1_0= '*'
                    {
                    lv_isMandatory_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRanking1680); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getRankingAccess().getIsMandatoryAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRankingRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:843:3: ( (lv_questionText_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:844:1: (lv_questionText_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:844:1: (lv_questionText_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:845:3: lv_questionText_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRanking1715);
            lv_questionText_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRanking1727); 

                	newLeafNode(otherlv_3, grammarAccess.getRankingAccess().getLeftSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRanking1739); 

                	newLeafNode(otherlv_4, grammarAccess.getRankingAccess().getRankKeyword_4());
                
            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRanking1751); 

                	newLeafNode(otherlv_5, grammarAccess.getRankingAccess().getRightSquareBracketKeyword_5());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:873:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:874:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:874:1: (lv_answers_6_0= ruleAnswer )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:875:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleRanking1772);
            lv_answers_6_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_6_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:891:2: ( (lv_answers_7_0= ruleAnswer ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:892:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:892:1: (lv_answers_7_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:893:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRankingAccess().getAnswersAnswerParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleRanking1793);
            	    lv_answers_7_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRankingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_7_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleRanking"


    // $ANTLR start "entryRuleRating"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:917:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:918:2: (iv_ruleRating= ruleRating EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:919:2: iv_ruleRating= ruleRating EOF
            {
             newCompositeNode(grammarAccess.getRatingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRating_in_entryRuleRating1830);
            iv_ruleRating=ruleRating();

            state._fsp--;

             current =iv_ruleRating; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRating1840); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:926:1: ruleRating returns [EObject current=null] : (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_start_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_end_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_interval_8_0= ruleEInt ) ) otherlv_9= ']' ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_questionText_2_0 = null;

        AntlrDatatypeRuleToken lv_start_4_0 = null;

        AntlrDatatypeRuleToken lv_end_6_0 = null;

        AntlrDatatypeRuleToken lv_interval_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:929:28: ( (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_start_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_end_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_interval_8_0= ruleEInt ) ) otherlv_9= ']' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:930:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_start_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_end_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_interval_8_0= ruleEInt ) ) otherlv_9= ']' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:930:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_start_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_end_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_interval_8_0= ruleEInt ) ) otherlv_9= ']' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:930:3: otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' ( (lv_start_4_0= ruleEInt ) ) otherlv_5= '-' ( (lv_end_6_0= ruleEInt ) ) otherlv_7= ',' ( (lv_interval_8_0= ruleEInt ) ) otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRating1877); 

                	newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:934:1: ( (lv_isMandatory_1_0= '*' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:935:1: (lv_isMandatory_1_0= '*' )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:935:1: (lv_isMandatory_1_0= '*' )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:936:3: lv_isMandatory_1_0= '*'
                    {
                    lv_isMandatory_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRating1895); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getRatingAccess().getIsMandatoryAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRatingRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:949:3: ( (lv_questionText_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:950:1: (lv_questionText_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:950:1: (lv_questionText_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:951:3: lv_questionText_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRatingAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRating1930);
            lv_questionText_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRating1942); 

                	newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getLeftSquareBracketKeyword_3());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:971:1: ( (lv_start_4_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:972:1: (lv_start_4_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:972:1: (lv_start_4_0= ruleEInt )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:973:3: lv_start_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingAccess().getStartEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating1963);
            lv_start_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRating1975); 

                	newLeafNode(otherlv_5, grammarAccess.getRatingAccess().getHyphenMinusKeyword_5());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:993:1: ( (lv_end_6_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:994:1: (lv_end_6_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:994:1: (lv_end_6_0= ruleEInt )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:995:3: lv_end_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingAccess().getEndEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating1996);
            lv_end_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRating2008); 

                	newLeafNode(otherlv_7, grammarAccess.getRatingAccess().getCommaKeyword_7());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1015:1: ( (lv_interval_8_0= ruleEInt ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1016:1: (lv_interval_8_0= ruleEInt )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1016:1: (lv_interval_8_0= ruleEInt )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1017:3: lv_interval_8_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRatingAccess().getIntervalEIntParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRating2029);
            lv_interval_8_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRatingRule());
            	        }
                   		set(
                   			current, 
                   			"interval",
                    		lv_interval_8_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRating2041); 

                	newLeafNode(otherlv_9, grammarAccess.getRatingAccess().getRightSquareBracketKeyword_9());
                

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1045:1: entryRuleYesNo returns [EObject current=null] : iv_ruleYesNo= ruleYesNo EOF ;
    public final EObject entryRuleYesNo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYesNo = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1046:2: (iv_ruleYesNo= ruleYesNo EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1047:2: iv_ruleYesNo= ruleYesNo EOF
            {
             newCompositeNode(grammarAccess.getYesNoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYesNo_in_entryRuleYesNo2077);
            iv_ruleYesNo=ruleYesNo();

            state._fsp--;

             current =iv_ruleYesNo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYesNo2087); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1054:1: ruleYesNo returns [EObject current=null] : (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'y/n' otherlv_5= ']' ) ;
    public final EObject ruleYesNo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_questionText_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1057:28: ( (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'y/n' otherlv_5= ']' ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1058:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'y/n' otherlv_5= ']' )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1058:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'y/n' otherlv_5= ']' )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1058:3: otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) otherlv_3= '[' otherlv_4= 'y/n' otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleYesNo2124); 

                	newLeafNode(otherlv_0, grammarAccess.getYesNoAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1062:1: ( (lv_isMandatory_1_0= '*' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1063:1: (lv_isMandatory_1_0= '*' )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1063:1: (lv_isMandatory_1_0= '*' )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1064:3: lv_isMandatory_1_0= '*'
                    {
                    lv_isMandatory_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleYesNo2142); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getYesNoAccess().getIsMandatoryAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getYesNoRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1077:3: ( (lv_questionText_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1078:1: (lv_questionText_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1078:1: (lv_questionText_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1079:3: lv_questionText_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getYesNoAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleYesNo2177);
            lv_questionText_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getYesNoRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleYesNo2189); 

                	newLeafNode(otherlv_3, grammarAccess.getYesNoAccess().getLeftSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleYesNo2201); 

                	newLeafNode(otherlv_4, grammarAccess.getYesNoAccess().getYNKeyword_4());
                
            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleYesNo2213); 

                	newLeafNode(otherlv_5, grammarAccess.getYesNoAccess().getRightSquareBracketKeyword_5());
                

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1115:1: entryRuleOpenField returns [EObject current=null] : iv_ruleOpenField= ruleOpenField EOF ;
    public final EObject entryRuleOpenField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenField = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1116:2: (iv_ruleOpenField= ruleOpenField EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1117:2: iv_ruleOpenField= ruleOpenField EOF
            {
             newCompositeNode(grammarAccess.getOpenFieldRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpenField_in_entryRuleOpenField2249);
            iv_ruleOpenField=ruleOpenField();

            state._fsp--;

             current =iv_ruleOpenField; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpenField2259); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1124:1: ruleOpenField returns [EObject current=null] : (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) ) ;
    public final EObject ruleOpenField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        AntlrDatatypeRuleToken lv_questionText_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1127:28: ( (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1128:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1128:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1128:3: otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOpenField2296); 

                	newLeafNode(otherlv_0, grammarAccess.getOpenFieldAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1132:1: ( (lv_isMandatory_1_0= '*' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1133:1: (lv_isMandatory_1_0= '*' )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1133:1: (lv_isMandatory_1_0= '*' )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1134:3: lv_isMandatory_1_0= '*'
                    {
                    lv_isMandatory_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOpenField2314); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getOpenFieldAccess().getIsMandatoryAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpenFieldRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1147:3: ( (lv_questionText_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1148:1: (lv_questionText_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1148:1: (lv_questionText_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1149:3: lv_questionText_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpenFieldAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpenField2349);
            lv_questionText_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpenFieldRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
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
    // $ANTLR end "ruleOpenField"


    // $ANTLR start "entryRuleMutuallyExclusive_Impl"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1173:1: entryRuleMutuallyExclusive_Impl returns [EObject current=null] : iv_ruleMutuallyExclusive_Impl= ruleMutuallyExclusive_Impl EOF ;
    public final EObject entryRuleMutuallyExclusive_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMutuallyExclusive_Impl = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1174:2: (iv_ruleMutuallyExclusive_Impl= ruleMutuallyExclusive_Impl EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1175:2: iv_ruleMutuallyExclusive_Impl= ruleMutuallyExclusive_Impl EOF
            {
             newCompositeNode(grammarAccess.getMutuallyExclusive_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMutuallyExclusive_Impl_in_entryRuleMutuallyExclusive_Impl2385);
            iv_ruleMutuallyExclusive_Impl=ruleMutuallyExclusive_Impl();

            state._fsp--;

             current =iv_ruleMutuallyExclusive_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMutuallyExclusive_Impl2395); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1182:1: ruleMutuallyExclusive_Impl returns [EObject current=null] : (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) ( (lv_answers_3_0= ruleAnswer ) ) ( (lv_answers_4_0= ruleAnswer ) )* ) ;
    public final EObject ruleMutuallyExclusive_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        AntlrDatatypeRuleToken lv_questionText_2_0 = null;

        EObject lv_answers_3_0 = null;

        EObject lv_answers_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1185:28: ( (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) ( (lv_answers_3_0= ruleAnswer ) ) ( (lv_answers_4_0= ruleAnswer ) )* ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1186:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) ( (lv_answers_3_0= ruleAnswer ) ) ( (lv_answers_4_0= ruleAnswer ) )* )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1186:1: (otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) ( (lv_answers_3_0= ruleAnswer ) ) ( (lv_answers_4_0= ruleAnswer ) )* )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1186:3: otherlv_0= 'Q' ( (lv_isMandatory_1_0= '*' ) )? ( (lv_questionText_2_0= ruleEString ) ) ( (lv_answers_3_0= ruleAnswer ) ) ( (lv_answers_4_0= ruleAnswer ) )*
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMutuallyExclusive_Impl2432); 

                	newLeafNode(otherlv_0, grammarAccess.getMutuallyExclusive_ImplAccess().getQKeyword_0());
                
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1190:1: ( (lv_isMandatory_1_0= '*' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1191:1: (lv_isMandatory_1_0= '*' )
                    {
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1191:1: (lv_isMandatory_1_0= '*' )
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1192:3: lv_isMandatory_1_0= '*'
                    {
                    lv_isMandatory_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMutuallyExclusive_Impl2450); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getMutuallyExclusive_ImplAccess().getIsMandatoryAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMutuallyExclusive_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1205:3: ( (lv_questionText_2_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1206:1: (lv_questionText_2_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1206:1: (lv_questionText_2_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1207:3: lv_questionText_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getQuestionTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMutuallyExclusive_Impl2485);
            lv_questionText_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"questionText",
                    		lv_questionText_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1223:2: ( (lv_answers_3_0= ruleAnswer ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1224:1: (lv_answers_3_0= ruleAnswer )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1224:1: (lv_answers_3_0= ruleAnswer )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1225:3: lv_answers_3_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMutuallyExclusive_Impl2506);
            lv_answers_3_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_3_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1241:2: ( (lv_answers_4_0= ruleAnswer ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1242:1: (lv_answers_4_0= ruleAnswer )
            	    {
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1242:1: (lv_answers_4_0= ruleAnswer )
            	    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1243:3: lv_answers_4_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMutuallyExclusive_ImplAccess().getAnswersAnswerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMutuallyExclusive_Impl2527);
            	    lv_answers_4_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMutuallyExclusive_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_4_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleMutuallyExclusive_Impl"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1267:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1268:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1269:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2565);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2576); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1276:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1279:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1280:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1280:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1280:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1280:2: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1281:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEInt2615); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2632); 

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


    // $ANTLR start "entryRulePersonAttribute"
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1301:1: entryRulePersonAttribute returns [EObject current=null] : iv_rulePersonAttribute= rulePersonAttribute EOF ;
    public final EObject entryRulePersonAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonAttribute = null;


        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1302:2: (iv_rulePersonAttribute= rulePersonAttribute EOF )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1303:2: iv_rulePersonAttribute= rulePersonAttribute EOF
            {
             newCompositeNode(grammarAccess.getPersonAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePersonAttribute_in_entryRulePersonAttribute2677);
            iv_rulePersonAttribute=rulePersonAttribute();

            state._fsp--;

             current =iv_rulePersonAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePersonAttribute2687); 

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
    // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1310:1: rulePersonAttribute returns [EObject current=null] : ( (lv_key_0_0= ruleEString ) ) ;
    public final EObject rulePersonAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_key_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1313:28: ( ( (lv_key_0_0= ruleEString ) ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1314:1: ( (lv_key_0_0= ruleEString ) )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1314:1: ( (lv_key_0_0= ruleEString ) )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1315:1: (lv_key_0_0= ruleEString )
            {
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1315:1: (lv_key_0_0= ruleEString )
            // ../dk.itu.smdp.survey.xtext/src-gen/dk/itu/smdp/survey/xtext/parser/antlr/internal/InternalTaco.g:1316:3: lv_key_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPersonAttributeAccess().getKeyEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePersonAttribute2732);
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\21\uffff";
    static final String DFA5_eofS =
        "\3\uffff\2\7\14\uffff";
    static final String DFA5_minS =
        "\1\30\2\4\2\16\1\6\3\uffff\1\6\1\32\1\uffff\2\6\1\20\2\uffff";
    static final String DFA5_maxS =
        "\1\30\1\31\1\5\2\30\1\34\3\uffff\1\6\1\32\1\uffff\1\32\1\6\1\25"+
        "\2\uffff";
    static final String DFA5_acceptS =
        "\6\uffff\1\6\1\5\1\4\2\uffff\1\2\3\uffff\1\3\1\1";
    static final String DFA5_specialS =
        "\21\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\1\4\23\uffff\1\2",
            "\1\3\1\4",
            "\1\7\2\uffff\1\7\1\6\1\5\3\uffff\2\7",
            "\1\7\2\uffff\1\7\1\6\1\5\3\uffff\2\7",
            "\1\12\23\uffff\1\11\1\13\1\10",
            "",
            "",
            "",
            "\1\12",
            "\1\14",
            "",
            "\1\16\23\uffff\1\15",
            "\1\16",
            "\1\17\4\uffff\1\20",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "221:1: (this_MultipleChoice_Impl_0= ruleMultipleChoice_Impl | this_Ranking_1= ruleRanking | this_Rating_2= ruleRating | this_YesNo_3= ruleYesNo | this_OpenField_4= ruleOpenField | this_MutuallyExclusive_Impl_5= ruleMutuallyExclusive_Impl )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSurvey122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey143 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_12_in_ruleSurvey156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey177 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_13_in_ruleSurvey192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSurvey213 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rulePerson_in_ruleSurvey236 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleSurvey258 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleSurvey279 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_Impl_in_ruleQuestion373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRanking_in_ruleQuestion400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRating_in_ruleQuestion427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNo_in_ruleQuestion454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenField_in_ruleQuestion481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMutuallyExclusive_Impl_in_ruleQuestion508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCategory590 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCategory611 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_13_in_ruleCategory624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCategory645 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_rulePage_in_ruleCategory668 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_rulePage_in_ruleCategory689 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePerson_in_entryRulePerson849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePerson859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePerson896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rulePerson917 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_rulePerson930 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_rulePerson951 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rulePage1036 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_rulePage1057 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rulePage1078 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1117 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAnswer1173 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1194 = new BitSet(new long[]{0x0000000000480002L});
        public static final BitSet FOLLOW_19_in_ruleAnswer1213 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAnswer1238 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnswer1250 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleAnswer1265 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleAnswer1286 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleAnswer1307 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleAnswer1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_Impl_in_entryRuleMultipleChoice_Impl1358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice_Impl1368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMultipleChoice_Impl1405 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleMultipleChoice_Impl1423 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice_Impl1458 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultipleChoice_Impl1470 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl1491 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleMultipleChoice_Impl1503 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMultipleChoice_Impl1524 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMultipleChoice_Impl1536 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultipleChoice_Impl1557 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultipleChoice_Impl1578 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleRanking_in_entryRuleRanking1615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRanking1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleRanking1662 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleRanking1680 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRanking1715 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRanking1727 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleRanking1739 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRanking1751 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleRanking1772 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleRanking1793 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleRating_in_entryRuleRating1830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRating1840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleRating1877 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleRating1895 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRating1930 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRating1942 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating1963 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleRating1975 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating1996 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRating2008 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRating2029 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRating2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNo_in_entryRuleYesNo2077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYesNo2087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleYesNo2124 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleYesNo2142 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleYesNo2177 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleYesNo2189 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleYesNo2201 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleYesNo2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpenField_in_entryRuleOpenField2249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpenField2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleOpenField2296 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleOpenField2314 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpenField2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMutuallyExclusive_Impl_in_entryRuleMutuallyExclusive_Impl2385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMutuallyExclusive_Impl2395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMutuallyExclusive_Impl2432 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleMutuallyExclusive_Impl2450 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMutuallyExclusive_Impl2485 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMutuallyExclusive_Impl2506 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMutuallyExclusive_Impl2527 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEInt2615 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePersonAttribute_in_entryRulePersonAttribute2677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePersonAttribute2687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePersonAttribute2732 = new BitSet(new long[]{0x0000000000000002L});
    }


}