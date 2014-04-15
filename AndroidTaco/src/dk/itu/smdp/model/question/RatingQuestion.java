package dk.itu.smdp.model.question;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import dk.itu.smdp.model.answer.Answer;

/**
 * Created by centos on 4/13/14.
 */
public class RatingQuestion extends MutuallyExclusive {

    private int _min;
    private int _max;
    private int _interval;

    private SeekBar _seekBar;

    public RatingQuestion(boolean _isMandatory, String _questionText) {
        this(_isMandatory, _questionText, 1, 10, 1);
    }


    public RatingQuestion(boolean isMandatory, String questionText, int min, int max, int interval) {
        super(isMandatory, questionText);
        _min = min;
        _max = max;
        _interval = interval;
    }


    @Override
    public void addAnswer(Answer a) {
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        LinearLayout layout = initQuestionLayout(context, parent);

        setUpSeekBar(context);

        layout.addView(_seekBar);

        return layout;
    }


    private void setUpSeekBar(Context context){
        _seekBar = new SeekBar(context);
        _seekBar.setMax(_max);
        _seekBar.incrementProgressBy(_interval);

        //TODO
        //set up proper min and max values
        //make callbacks on change
        //check if the first answer needs to be on the _answeredAnswers manually

        _seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("TAG" , "value  " + progress );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
