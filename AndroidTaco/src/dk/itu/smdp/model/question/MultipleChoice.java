package dk.itu.smdp.model.question;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.utils.FixedStack;

/**
 * Created by centos on 4/14/14.
 */
public class MultipleChoice extends Question
{
	private int _min;
	private int _max;
	
	public MultipleChoice(boolean isMandatory, String questionText)
	{
		this(isMandatory, questionText, 1, 1);
	}
	
	public MultipleChoice(boolean isMandatory, String questionText, int min, int max)
	{
		super(isMandatory, questionText);
		_min = min;
		_max = max;
		
		// create a stack for the maximum answers
		_answeredAnswers = new FixedStack<Answer>(_max);
	}
	
	@Override
	public boolean isQuestionAnswered()
	{
		return _answeredAnswers.size() >= _min && _answeredAnswers.size() <= _max;
	}
	
	@Override
	public View getView(Context context, ViewGroup parent)
	{
		LinearLayout layout = initQuestionLayout(context, parent);
		
		this.populateAnswerViews(context, layout, layout, this);
		
		return layout;
	}
	
	@Override
	public void onAnswerSelected(Answer answer)
	{
		Answer popedItem = _answeredAnswers.pushAndPopExtraItem(answer);
		if (popedItem != null) popedItem.clear();
		
		for (int i = 0; i < _answeredAnswers.size(); i++)
			Log.i("TAG", "A : " + _answeredAnswers.get(i).getUserAnswer());
		
		super.onAnswerSelected(answer);
	}
	
	@Override
	public void onAnswerDeselected(Answer answer)
	{
		_answeredAnswers.remove(answer);
		super.onAnswerDeselected(answer);
	}
}