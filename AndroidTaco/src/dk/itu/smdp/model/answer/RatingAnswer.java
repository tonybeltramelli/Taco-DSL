package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

/**
 * Created by centos on 4/13/14.
 */
public class RatingAnswer extends Answer {

    private int _min;
    private int _max;
    private int _interval;


    public RatingAnswer(String _description) {
        super(_description);
    }

    public RatingAnswer(String _description, int min, int max, int interval) {
        this(_description);
        _min = min;
        _max = max;
        _interval = interval;

    }

    @Override
    public View getView(Context context, ViewGroup parent) {

        SeekBar bar = new SeekBar(context);
        bar.setMax(_max);
        bar.incrementProgressBy(_interval);
        return bar;
    }
}
