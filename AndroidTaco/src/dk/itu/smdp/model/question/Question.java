package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.QuestionContainable;
import dk.itu.smdp.R;
import dk.itu.smdp.Viewable;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.utils.FixedStack;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by centos on 4/13/14.
 */
public abstract class Question implements Viewable, Answerable
{
	public static final String MULTIPLE_CHOICE = "multiple_choice";
	public static final String MUTUALLY_EXCLUSIVE = "mutually_exclusive";
	public static final String YES_NO = "yes_no";
	public static final String RATING = "rating";
	public static final String OPEN_FIELD = "open_field";
	public static final String RANKING = "ranking";
	
	protected boolean _isMandatory;
	
	protected String _questionText;
	
	protected ArrayList<Answer> _answers;
	
	protected FixedStack<Answer> _answeredAnswers;
	
	private QuestionContainable _container;
	
	public Question(boolean isMandatory, String questionText)
	{
		this._isMandatory = isMandatory;
		this._questionText = questionText + (_isMandatory ? " *" : "");
		_answers = new ArrayList<Answer>();
	}
	
	@Override
	public void onAnswerSelected(Answer answer)
	{
		_updateAnswer();
	}
	
	@Override
	public void onAnswerDeselected(Answer answer)
	{
		_updateAnswer();
	}
	
	@Override
	public void onAnswerUpdated(Answer answer)
	{
		_updateAnswer();
	}
	
	private void _updateAnswer()
	{
		if (_container != null)
		{
			_container.updateQuestionAnswer();
		}
	}

    public ArrayList<Answer> getUserAnswers(){
        ArrayList<Answer> userAnswers = new ArrayList<Answer>();

        ListIterator<Answer> iterator = _answeredAnswers.listIterator();
        while( iterator.hasNext() )
            userAnswers.add(iterator.next());

        return userAnswers;
    }

    public String getQuestionText(){
        return _questionText;
    }
	
	public boolean isMandatory()
	{
		return _isMandatory;
	}
	
	public ArrayList<Answer> getAnswers()
	{
		return _answers;
	}
	
	public void addAnswer(Answer a)
	{
		_answers.add(a);
	}
	
	protected void populateAnswerViews(Context context, ViewGroup parent, ViewGroup container, Answerable answerable)
	{
		for (Answer a : _answers)
		{
			container.addView(a.getView(context, parent));
			a.setUpListener(answerable);
		}
	}
	
	protected LinearLayout initQuestionLayout(Context context, ViewGroup parent)
	{
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.question, parent, false);
		
		TextView titleView = (TextView) layout.findViewById(R.id.question_title_textview);
		titleView.setText(_questionText);
		
		return layout;
	}
	
	public abstract boolean isQuestionAnswered();
	
	public void setContainer(QuestionContainable container)
	{
		_container = container;
	}
}
