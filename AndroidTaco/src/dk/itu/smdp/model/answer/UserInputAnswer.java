package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class UserInputAnswer extends BinaryAnswer
{	
	private EditText _editText;
	private Context _context;
	
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
		
		_editText.setOnEditorActionListener(new OnEditorActionListener()
		{
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
			{
				if (event.getKeyCode() == KeyEvent.KEYCODE_ENTER || actionId == EditorInfo.IME_ACTION_DONE)
				{
					InputMethodManager inputMethodManager = (InputMethodManager) _context.getSystemService(Context.INPUT_METHOD_SERVICE);
					inputMethodManager.hideSoftInputFromWindow(_editText.getWindowToken(), 0);
				}
				return false;
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
			
		_context = context;
		
		_radio.setText(_description);
		
		return layout;
	}
}
