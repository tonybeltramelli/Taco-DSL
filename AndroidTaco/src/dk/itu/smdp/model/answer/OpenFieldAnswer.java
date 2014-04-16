package dk.itu.smdp.model.answer;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class OpenFieldAnswer extends Answer
{
	private EditText _editText;
	private Context _context;
	
	public OpenFieldAnswer(String description)
	{
		super(description);
	}
	
	@Override
	public String getUserAnswer()
	{
		return _editText.getText().toString();
	}
	
	@Override
	public void clear()
	{
		_editText.setText("");
	}
	
	@Override
	public void setUpListener(final Answerable answerable)
	{
		_editText.addTextChangedListener(new TextWatcher()
		{
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count)
			{
				answerable.onAnswerUpdated(OpenFieldAnswer.this);
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after)
			{
			}
			
			@Override
			public void afterTextChanged(Editable s)
			{
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
		
		_editText = (EditText) inflater.inflate(R.layout.open_field, parent, false);
		
		_context = context;
		
		return _editText;
	}
}
