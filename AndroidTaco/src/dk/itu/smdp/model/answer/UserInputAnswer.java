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
public class UserInputAnswer extends BinaryAnswer{

    private EditText _editText;

    public UserInputAnswer(String _description, Answerable a) {
        super(_description, a);
    }

    @Override
    public String getUserAnswer() {
        return _description + " : " + _editText.getText().toString();
    }

    @Override
    public void clear() {
        super.clear();
        _editText.setText("");
    }

    @Override
    public View getView(Context context, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.user_input_field , parent , false);

        _radio =  (RadioButton) layout.findViewById(R.id.user_input_field_radiobutton);

        _editText = (EditText) layout.findViewById(R.id.user_input_field_edittext);

        _radio.setText(_description);

        super.setUpListener();

        return layout;
    }
}
