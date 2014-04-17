package dk.itu.smdp.model.question;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.AnswerFactory;

/**
 * Created by centos on 4/13/14.
 */
public class RatingQuestion extends MutuallyExclusive
{	
	private int _min;
	private int _max;
	private int _interval;
	
	private SeekBar _seekBar;
	
	public RatingQuestion(boolean isMandatory, String questionText)
	{
		this(isMandatory, questionText, 1, 10, 1);
	}
	
	public RatingQuestion(boolean isMandatory, String questionText, int min, int max, int interval)
	{
		super(isMandatory, questionText);
		_min = min;
		_max = max;
		_interval = interval;

        //add binary answers
        for( int i = _min ; i <= _max ; i += _interval ){
            Log.i("TAG" , "Rating " + String.valueOf(i));
            super.addAnswer(AnswerFactory.create(Answer.RATING, String.valueOf(i)));
        }

        //TODO
        //check if should be added here
        super.onAnswerSelected(_answers.get(0));
	}
	
	@Override
	public void addAnswer(Answer a)
	{
	}
	
	@Override
	public View getView(Context context, ViewGroup parent)
	{
		LinearLayout layout = initQuestionLayout(context, parent);
		
		setUpSeekBar(context);
		
		layout.addView(_seekBar);

		return layout;
	}
	
	private void setUpSeekBar(Context context)
	{
		_seekBar = new SeekBar(context);
        _seekBar.setProgress(0);
		_seekBar.setMax((_max - _min) / _interval);

		_seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
		{
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
			{
                RatingQuestion.super.onAnswerSelected(_answers.get(progress));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar)
			{
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar)
			{
				
			}
		});
	}
}
