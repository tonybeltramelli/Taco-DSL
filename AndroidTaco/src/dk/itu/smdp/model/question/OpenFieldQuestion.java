package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.AnswerFactory;
import dk.itu.smdp.model.answer.OpenFieldAnswer;

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
		// add it immediately because there are no listeners for open field
		_answeredAnswers.add(a);
	}
	
	@Override
	public void addAnswer(Answer a)
	{
	}
	
	@Override
	public boolean isQuestionAnswered()
	{
		return !((OpenFieldAnswer) _answers.get(0)).getUserAnswer().isEmpty();
	}
	
	@Override
	public View getView(Context context, ViewGroup parent)
	{	
		LinearLayout layout = initQuestionLayout(context, parent);
		
		populateAnswerViews(context, layout, layout, this);
		
		return layout;
	}
}
