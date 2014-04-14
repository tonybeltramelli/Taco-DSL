package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import dk.itu.smdp.Answerable;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class BinaryAnswer extends Answer {

    protected RadioButton _radio;

    public BinaryAnswer(String _description, Answerable a) {
        super(_description, a);
    }


    @Override
    public String getUserAnswer() {
        return _description;
    }

    @Override
    public void clear() {
        if( _radio.isSelected() ){
            _radio.setSelected(false);
            _radio.setChecked(false);
        }
    }

    @Override
    public void setUpListener() {
        _radio.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !_radio.isSelected() ){
                    _radio.setSelected(true);
                    _answerable.onAnswer(BinaryAnswer.this);
                }
            }
        });
    }

    @Override
    public View getView(Context context, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        _radio = (RadioButton) inflater.inflate(R.layout.boolean_field , parent , false);

        _radio.setText(_description);

        setUpListener();

        return _radio;
    }
}
