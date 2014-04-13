package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import dk.itu.smdp.model.answer.Answer;

/**
 * Created by centos on 4/13/14.
 */
public class MutuallyExclusive extends Question {


    public MutuallyExclusive(boolean _isMandatory, String _questionText) {
        super(_isMandatory, _questionText);
    }


    @Override
    public View getView(Context context, ViewGroup parent) {
        LinearLayout layout = initQuestionLayout(context, parent);

        for(Answer a : _answers ){
            RadioGroup radioGroup = new RadioGroup(context);
            radioGroup.addView(a.getView(context , radioGroup));
            layout.addView(radioGroup);

        }
//        this.populateAnswerViews(context, layout, layout);

//        layout.addView(radioGroup);

        return layout;
    }
}
