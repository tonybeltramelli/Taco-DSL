package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.AnswerFactory;

/**
 * Created by centos on 4/13/14.
 */
public class OpenFieldQuestion extends MultipleChoice
{
	public OpenFieldQuestion(boolean isMandatory, String questionText)
	{
		super(isMandatory, questionText, 1, 1);
		
		Answer a = AnswerFactory.create(Answer.OPEN_FIELD, "");
		super.addAnswer(a);
	}
	
	@Override
	public void addAnswer(Answer a)
	{
	}

	
	@Override
	public View getView(Context context, ViewGroup parent)
	{	
		LinearLayout layout = initQuestionLayout(context, parent);
		
		populateAnswerViews(context, layout, layout, this);

        initQuestion();
		
		return layout;
	}


    @Override
    public void onAnswerSelected(Answer answer) {
        //dont call super because it clears the answer and text will be gone
        _answeredAnswers.pushAndPopExtraItem(answer);
        this.onAnswerUpdated(answer);
    }

    @Override
    public void onAnswerDeselected(Answer answer) {
        //dont call super
        _answeredAnswers.pop();
        this.onAnswerUpdated(answer);
    }
}
