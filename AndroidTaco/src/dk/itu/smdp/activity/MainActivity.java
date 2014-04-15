package dk.itu.smdp.activity;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import dk.itu.smdp.R;

public class MainActivity extends AbtractActivity implements
        View.OnClickListener,
        TextWatcher {
	
    Button _startButton;


    ArrayList<EditText> _editTexts;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        _startButton = (Button) this.findViewById(R.id.home_screen_start_button);
        _startButton.setOnClickListener(this);

        //set title
        ((TextView) this.findViewById(R.id.home_screen_survey_title_text_view)).setText(_survey.getTitle());
        //set description
        ((TextView) this.findViewById(R.id.home_screen_survey_description_text_view)).setText(_survey.getDescription());

        if (!_survey.isAnonymous()) {
            populatePersonAttributes();
            setUpEditTexts();
        }
    }


    private void setUpEditTexts() {
        _editTexts = new ArrayList<EditText>();
        LinearLayout attributes = (LinearLayout) this.findViewById(R.id.person_attributes_linearlayout);

        //save all editTexts
        //this is the linear layout for all attributes
        for (int i = 0; i < attributes.getChildCount(); i++) {
            //this is the linear layout of a single attribute
            //search for edit texts in this layout
            LinearLayout singleAttribute = (LinearLayout) attributes.getChildAt(i);
            for (int j = 0; j < singleAttribute.getChildCount(); j++) {
                if (singleAttribute.getChildAt(j) instanceof EditText) {

                    EditText e = (EditText) singleAttribute.getChildAt(j);

                    e.addTextChangedListener(this);

                    _editTexts.add(e);
                }
            }
        }
    }

    private void populatePersonAttributes() {
        //disable start button
        _startButton.setEnabled(false);
        //show hint
        ((TextView) this.findViewById(R.id.home_screen_label_text_view)).setVisibility(View.VISIBLE);

        ScrollView parent = (ScrollView) this.findViewById(R.id.home_screen_scrollview);
        LinearLayout attributes = (LinearLayout) _survey.getPerson().getView(this, parent);

        //add attribues view to parent
        parent.addView(attributes, getLayoutParams());
    }

    private ScrollView.LayoutParams getLayoutParams() {
        ScrollView.LayoutParams params = new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT,
                ScrollView.LayoutParams.MATCH_PARENT
        );
        return params;
    }

    @Override
    public void onClick(View v) {

        Log.i("TAG", "asdfasdfasdf");

        //if the survey is not anonymous save first the attributes
        if (!_survey.isAnonymous())
            for (int i = 0; i < _editTexts.size(); i++)
                _survey.getPerson().getAttribute(i).set_value(_editTexts.get(i).getText().toString());

        //start the survey
        Intent intent = new Intent(this, SurveyActivity.class);
        this.startActivity(intent);
        //finish this activity so the user cannot go back to home screen
        this.finish();

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        boolean flag = true;
        //check all editTexts. if all of them have text enable the start button.
        //otherwise leave it disabled
        for (EditText e : _editTexts) {
            if (e.getText().toString().equals("")) {
                flag = false;
                break;
            }
        }

        if (flag)
            _startButton.setEnabled(true);
        else
            _startButton.setEnabled(false);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
