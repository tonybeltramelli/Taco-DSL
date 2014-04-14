package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import dk.itu.smdp.Answerable;

/**
 * Created by centos on 4/13/14.
 */
public class RankingAnswer extends Answer {
    public RankingAnswer(String _description) {
        super(_description);
    }

    @Override
    public String getUserAnswer() {
        return null;
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
