package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class BinaryAnswer extends Answer {
    public BinaryAnswer(String _description) {
        super(_description);
    }

    @Override
    public View getView(Context context, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        RadioButton radio = (RadioButton) inflater.inflate(R.layout.boolean_field , parent , false);

        radio.setText(_description);

        return radio;
    }
}
