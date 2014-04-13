package dk.itu.smdp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.R;
import dk.itu.smdp.model.Page;
import dk.itu.smdp.model.Survey;
import dk.itu.smdp.model.question.Question;

/**
 * Created by centos on 4/13/14.
 */
public class SurvayActivity extends Activity{

    private Survey _survey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.page);

        _survey = Survey.getInstance();

        TextView categoryTitle = (TextView) this.findViewById(R.id.category_title_text_view);
        categoryTitle.setText(_survey.get_categories().get(0).get_title());

        displayPage();

    }



    private void displayPage(){

        Page page = _survey.get_categories().get(0).get_pages().get(0);

        LinearLayout parent = (LinearLayout) this.findViewById(R.id.questions_linearlayout);

        for(Question q : page.getQuestios() ){
            View questionView = q.getView(this , parent);
            parent.addView(questionView);
        }


    }
}
