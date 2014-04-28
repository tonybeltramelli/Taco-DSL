package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;
import dk.itu.smdp.model.question.Question;

import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public class BinaryAnswer extends Answer
{
	protected RadioButton _radio;

	public BinaryAnswer(String description)
	{
		super(description);
        _subQuestions = new ArrayList<Question>();
	}

    @Override
    public boolean hasSubQuestions() {
        return true;
    }

    @Override
	public String getUserAnswer()
	{
		return _description;
	}
	
	@Override
	public void clear()
	{
		if (_radio.isSelected())
		{
			_radio.setSelected(false);
			_radio.setChecked(false);
		}
	}
	
	@Override
	public void setUpListener(final Answerable answerable)
	{
		_radio.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				if (!_radio.isSelected())
				{
					_radio.setSelected(true);
					_radio.setChecked(true);
					answerable.onAnswerSelected(BinaryAnswer.this);
				} else
				{
					clear();
					answerable.onAnswerDeselected(BinaryAnswer.this);
				}
			}
		});	
	}
	
	@Override
	public View getView(Context context, ViewGroup parent)
	{
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		_radio = (RadioButton) inflater.inflate(R.layout.boolean_field, parent, false);
		
		_radio.setText(_description);
		
		return _radio;
	}
}
