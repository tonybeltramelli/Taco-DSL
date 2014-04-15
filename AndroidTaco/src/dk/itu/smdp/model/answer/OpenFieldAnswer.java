package dk.itu.smdp.model.answer;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.EditText;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class OpenFieldAnswer extends Answer{

    private EditText _editText;

    public OpenFieldAnswer(String _description) {
        super(_description);
    }


    @Override
    public String getUserAnswer() {
        return _editText.getText().toString();
    }

    @Override
    public void clear() {
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
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        _editText = (EditText) inflater.inflate(R.layout.open_field , parent , false );

        return _editText;
    }
}
