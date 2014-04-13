package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.BinaryAnswer;

/**
 * Created by centos on 4/13/14.
 */
public class YesNoQuestion extends Question {

    public YesNoQuestion(boolean _isMandatory, String _questionText) {
        super(_isMandatory, _questionText);


        super.addAnswer(new BinaryAnswer("Yes"));
        super.addAnswer(new BinaryAnswer("No"));
    }

    @Override
    public void addAnswer(Answer a) {
        //empty implementation
    }


    @Override
    public View getView(Context context, ViewGroup parent) {
        LinearLayout layout = initQuestionLayout(context , parent);
        RadioGroup radioGroup = new RadioGroup(context);
        this.populateAnswerViews(context , layout , radioGroup);


        layout.addView(radioGroup);

        return layout;
    }
}
