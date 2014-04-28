package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.utils.FixedStack;

/**
 * Created by centos on 4/14/14.
 */

public class MultipleChoice extends Question
{
	private int _min;
	private int _max;

    private Context _context;
	
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
		return !isMandatory() ? true : _answeredAnswers.size() >= _min && _answeredAnswers.size() <= _max && subQuestionsAreAnswered(this);
	}

    @Override
    protected void initQuestion() {
        // create a stack for the maximum answers
        _answeredAnswers = new FixedStack<Answer>(_max);
    }


    //recursion
    private boolean subQuestionsAreAnswered(Question q){
        boolean flag = true;
        for( Answer a : q._answers ){
            if( a.hasSubQuestions() && a.isExpanded() )
                for( Question innerQ : a.getSubQuestions() ) {
                    subQuestionsAreAnswered(innerQ);
                    if( flag == true )
                        flag = innerQ.isQuestionAnswered();
                }
        }

        return flag;
    }


    @Override
    public View getView(Context context, ViewGroup parent) {
        LinearLayout layout = initQuestionLayout(context, parent);
        _questionView = layout;

        _context = context;

        if (_min != 1 && _max != 1) {
            String description;

            if (_min != _max) {
                description = context.getResources().getString(R.string.question_label_min_max_interval);

                description = description.replace("{A}", String.valueOf(_min));
                description = description.replace("{B}", String.valueOf(_max));
            } else {
                description = context.getResources().getString(R.string.question_label_min_max_value);
                description = description.replace("{A}", String.valueOf(_min));
            }

            TextView descriptionView = (TextView) layout.findViewById(R.id.question_description_textview);
            descriptionView.setText(description);
        }

        this.populateAnswerViews(context, layout, layout, this);

        this.populateSubQuestions(context, layout, layout, this);

	    initQuestion();

        return layout;
    }

    @Override
    public void onAnswerSelected(Answer answer) {
        Answer popedItem = _answeredAnswers.pushAndPopExtraItem(answer);
        if (popedItem != null){
            popedItem.clear();
            toggleAnswerState(popedItem, false);
        }

        //activate subQuestions
        toggleAnswerState(answer , true);

        super.onAnswerSelected(answer);
    }



    @Override
    public void onAnswerDeselected(Answer answer) {
        _answeredAnswers.remove(answer);
        //deactivate subQuestions
        toggleAnswerState(answer , false);

        super.onAnswerDeselected(answer);
    }


    private void toggleAnswerState(Answer answer , boolean expanded){
        if( answer.hasSubQuestions() )
            for( Question q : answer.getSubQuestions() ) {
                if (expanded)
                    q.setVisibility(View.VISIBLE);
                else
                    q.setVisibility(View.GONE);
            }

        answer.setExpanded(expanded);
    }


    public void populateSubQuestions(Context context, LinearLayout parent, LinearLayout container, Answerable callback) {

        for (Answer a : _answers) {
            if (a.hasSubQuestions())
                a.setExpanded(false);
                for (Question q : a.getSubQuestions() ){
                    View qV = q.getView(context , parent);
                    qV.setVisibility(View.GONE);
                    parent.addView(qV);
                }
        }
    }
}
