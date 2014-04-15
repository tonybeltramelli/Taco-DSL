package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class UserInputAnswer extends BinaryAnswer
{	
	private EditText _editText;
	
	public UserInputAnswer(String description)
	{
		super(description);
	}
	
	@Override
	public String getUserAnswer()
	{
		return _description + " : " + _editText.getText().toString();
	}
	
	@Override
	public void clear()
	{
		super.clear();
		_editText.setText("");
		_editText.setEnabled(false);
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
					answerable.onAnswerSelected(UserInputAnswer.this);
					_editText.setEnabled(true);
				} else
				{
					clear();
					answerable.onAnswerDeselected(UserInputAnswer.this);
				}
			}
		});
	}
	
	@Override
	public View getView(Context context, ViewGroup parent)
	{	
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.user_input_field, parent, false);
		
		_radio = (RadioButton) layout.findViewById(R.id.user_input_field_radiobutton);
		
		_editText = (EditText) layout.findViewById(R.id.user_input_field_edittext);
		
		_radio.setText(_description);
		
		return layout;
	}
}
