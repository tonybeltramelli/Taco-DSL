package dk.itu.smdp.model;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dk.itu.smdp.Viewable;
import dk.itu.smdp.model.question.Question;

import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public class Page implements Viewable{

    private ArrayList<Question> _questions;


    public Page() {
        _questions = new ArrayList<Question>();
    }

    public void addQuestion( Question q ){
        _questions.add(q);
    }

    public ArrayList<Question> getQuestions(){
        return _questions;
    }


    @Override
    public View getView(Context context, ViewGroup parent) {
        LinearLayout layout = initLayout(context);

        for( Question q : this.getQuestions() ){
            layout.addView(q.getView(context , layout));
        }

        return layout;
    }


    private LinearLayout initLayout(Context context){
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        layout.setLayoutParams(params);
        return layout;
    }

}
