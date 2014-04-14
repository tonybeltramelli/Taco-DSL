package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.utils.FixedStack;

/**
 * Created by centos on 4/14/14.
 */
public class MultipleChoice extends Question{

    private int _min;
    private int _max;


    public MultipleChoice(boolean _isMandatory, String _questionText) {
        this(_isMandatory, _questionText , 1 , 1);
    }

    @Override
    public boolean isQuestionAnswered() {
        return _answeredAnswers.size() >= _min && _answeredAnswers.size() <= _max;
    }


    public MultipleChoice(boolean isMandatory , String questionText , int min , int max ){
        super(isMandatory , questionText);
        _min = min;
        _max = max;

        //create a stack for the maximum answers
        _answeredAnswers = new FixedStack<Answer>(_max);

    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        return null;
    }

    @Override
    public void onAnswer(Answer answer) {
        Answer popedItem = _answeredAnswers.pushAndPopExtraItem(answer);
        popedItem.clear();
    }
}
