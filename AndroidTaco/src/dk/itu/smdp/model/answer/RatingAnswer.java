package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import dk.itu.smdp.Answerable;

/**
 * Created by centos on 4/13/14.
 */
public class RatingAnswer extends BinaryAnswer {


    public RatingAnswer(String _description, Answerable a) {
        super(_description, a);
    }

    @Override
    public String getUserAnswer() {
        return super.getUserAnswer();
    }

    @Override
    public void clear() {
        //empty implementation
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        //empty implementation
        return null;
    }
}
