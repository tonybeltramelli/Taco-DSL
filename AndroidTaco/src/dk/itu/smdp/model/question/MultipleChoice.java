package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by centos on 4/14/14.
 */
public class MultipleChoice extends Question{

    private int _min;
    private int _max;


    public MultipleChoice(boolean _isMandatory, String _questionText) {
        super(_isMandatory, _questionText);
    }


    public MultipleChoice(boolean isMandatory , String questionText , int min , int max ){
        super(isMandatory , questionText);
        _min = min;
        _max = max;

    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        return null;
    }
}
