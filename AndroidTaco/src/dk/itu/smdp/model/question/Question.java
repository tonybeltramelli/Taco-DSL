package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.R;
import dk.itu.smdp.Viewable;
import dk.itu.smdp.model.answer.Answer;

import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public abstract class Question implements Viewable{

    protected boolean _isMandatory;

    protected String _questionText;

    protected ArrayList<Answer> _answers;

    protected boolean isQuestionAnswered = false;


    public Question(boolean _isMandatory, String _questionText) {
        this._isMandatory = _isMandatory;
        this._questionText = _questionText;
        _answers = new ArrayList<Answer>();
    }


    public boolean is_isMandatory() {
        return _isMandatory;
    }

    public String get_questionText() {
        return _questionText;
    }

    public ArrayList<Answer> get_answers() {
        return _answers;
    }

    public void addAnswer( Answer a ){
        _answers.add(a);
    }


    protected void populateAnswerViews( Context context , ViewGroup parent  , ViewGroup container ){
        for( Answer a : _answers )
            container.addView(a.getView(context , parent));
    }

    protected LinearLayout initQuestionLayout(Context context , ViewGroup parent ){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.question , parent , false);

        TextView titleView = (TextView)layout.findViewById(R.id.question_textview);
        titleView.setText(_questionText);

        return layout;
    }

    public boolean isQuestionAnswered(){
        return isQuestionAnswered;
    }



}
