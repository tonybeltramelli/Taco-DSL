package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.RatingAnswer;

/**
 * Created by centos on 4/13/14.
 */
public class RatingQuestion extends Question{


    public RatingQuestion(boolean _isMandatory, String _questionText) {
        this(_isMandatory, _questionText , 0 , 10 , 1);
    }


    public RatingQuestion(boolean isMandatory , String questionText , int min , int max , int interval){
        super(isMandatory, questionText);
        super.addAnswer(new RatingAnswer("" , min , max , interval));
    }


    @Override
    public void addAnswer(Answer a) {
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        LinearLayout layout = initQuestionLayout(context , parent);

        this.populateAnswerViews(context , layout , layout);

        return layout;
    }
}
