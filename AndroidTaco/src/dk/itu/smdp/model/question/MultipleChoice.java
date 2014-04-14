package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.utils.FixedStack;

/**
 * Created by centos on 4/14/14.
 */
public class MultipleChoice extends Question {

    private int _min;
    private int _max;

    public MultipleChoice(boolean _isMandatory, String _questionText) {
        this(_isMandatory, _questionText, 1, 1);
    }

    public MultipleChoice(boolean isMandatory, String questionText, int min, int max) {
        super(isMandatory, questionText);
        _min = min;
        _max = max;

        //create a stack for the maximum answers
        _answeredAnswers = new FixedStack<>(_max);
    }

    @Override
    public boolean isQuestionAnswered() {
        return _answeredAnswers.size() >= _min && _answeredAnswers.size() <= _max;
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        LinearLayout layout = initQuestionLayout(context, parent);

        this.populateAnswerViews(context, layout, layout);

        return layout;
    }

    @Override
    public void onAnswerSelected(Answer answer) {
        Answer popedItem = _answeredAnswers.pushAndPopExtraItem(answer);
        if (popedItem != null)
            popedItem.clear();
    }

    @Override
    public void onAnswerDeselected(Answer answer) {
        _answeredAnswers.remove(answer);
    }
}
