package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class OpenFieldAnswer extends Answer{

    private EditText _editText;

    public OpenFieldAnswer(String _description, Answerable a) {
        super(_description, a);
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
    public void setUpListener() {
        //empty for now
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        _editText = (EditText) inflater.inflate(R.layout.open_field , parent , false );

        return _editText;
    }
}
