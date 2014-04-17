package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import dk.itu.smdp.Answerable;

/**
 * Created by centos on 4/17/14.
 */
public class RatingAnswer extends Answer{
    public RatingAnswer(String description) {
        super(description);
    }

    @Override
    public String getUserAnswer() {
        return _description;
    }

    @Override
    public void clear() {

    }

    @Override
    public void setUpListener(Answerable answerable) {

    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        return null;
    }
}
