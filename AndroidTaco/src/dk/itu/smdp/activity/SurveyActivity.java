package dk.itu.smdp.activity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.QuestionContainable;
import dk.itu.smdp.R;
import dk.itu.smdp.model.Category;
import dk.itu.smdp.model.Page;
import dk.itu.smdp.model.PersonAttribute;
import dk.itu.smdp.model.Survey;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.question.Question;
import dk.itu.smdp.request.HTTPRequestTask;
import dk.itu.smdp.request.RequestDelegate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public class SurveyActivity extends AbtractActivity implements QuestionContainable, RequestDelegate {
    private int _currentCategory = 0;
    private int _currentPage = 0;
    private int _mandatoryQuestionsNumber = 0;
    private View _nextButton;
    private View _sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.page);

        _displayCategory();
        _displayPage();
    }

    private void _displayCategory() {
        TextView categoryTitle = (TextView) this.findViewById(R.id.category_title_text_view);
        TextView categoryDescription = (TextView) this.findViewById(R.id.category_description_text_view);

        categoryTitle.setText(_survey.getCategories().get(_currentCategory).getTitle());
        categoryDescription.setText(_survey.getCategories().get(_currentCategory).getDescription());
    }

    private void _displayPage() {
        Page page = _survey.getCategories().get(_currentCategory).getPages().get(_currentPage);

        _sendButton = findViewById(R.id.page_screen_send_button);
        _sendButton.setVisibility(View.INVISIBLE);

        _nextButton = findViewById(R.id.page_screen_next_button);
        _nextButton.setVisibility(View.INVISIBLE);

        View prevButton = findViewById(R.id.page_screen_previous_button);

        if (_currentPage == 0 && _currentCategory == 0) {
            prevButton.setVisibility(View.INVISIBLE);
        } else {
            prevButton.setVisibility(View.VISIBLE);
        }

        LinearLayout parent = (LinearLayout) this.findViewById(R.id.questions_linearlayout);
        parent.removeAllViews();

        _mandatoryQuestionsNumber = 0;

        for (Question q : page.getQuestions()) {
            q.setContainer(this);
            View questionView = q.getView(this, parent);
            parent.addView(questionView);

            if (q.isMandatory()) {
                _mandatoryQuestionsNumber++;
            }
        }

        updateQuestionAnswer();
    }

    @Override
    public void updateQuestionAnswer() {
        int answeredQuestions = 0;

        Page page = _survey.getCategories().get(_currentCategory).getPages().get(_currentPage);

        for (Question q : page.getQuestions()) {
            if (q.isMandatory() && q.isQuestionAnswered()) {
                answeredQuestions++;
            }
        }

        if (answeredQuestions == _mandatoryQuestionsNumber) {
            if (_currentPage == _survey.getCategories().get(_currentCategory).getPages().size() - 1
                    && _currentCategory == _survey.getCategories().size() - 1) {
                _sendButton.setVisibility(View.VISIBLE);
            } else {
                _nextButton.setVisibility(View.VISIBLE);
            }
        } else {
            _sendButton.setVisibility(View.INVISIBLE);
            _nextButton.setVisibility(View.INVISIBLE);
        }
    }

    public void prevButtonClickHandler(View view) {
        if (_currentPage == 0) {
            if (_currentCategory == 0) {
                return;
            } else {
                _currentCategory--;
                _currentPage = _survey.getCategories().get(_currentCategory).getPages().size() - 1;
            }
        } else {
            _currentPage--;
        }

        _displayPage();
    }

    public void nextButtonClickHandler(View view) {
        if (_currentPage == _survey.getCategories().get(_currentCategory).getPages().size() - 1) {
            if (_currentCategory == _survey.getCategories().size() - 1) {
                return;
            } else {
                _currentPage = 0;
                _currentCategory++;
            }
        } else {
            _currentPage++;
        }

        _displayPage();
    }


    public void sendButtonClickHandler(View v) {

        final String SURVEY_SD_CARD_FILE = Environment.getExternalStoragePublicDirectory("") + "/Survey.taco";

        File file = new File(SURVEY_SD_CARD_FILE);

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));

            writer.write("Survey : " + _survey.getTitle() + "\n");
            writer.write("Date : " + _survey.getDate() + "\n");
            writer.write("Description : " + _survey.getDescription() + "\n");
            writer.write("\n");
            if (!_survey.isAnonymous()) {
                writer.write("Person attributes\n");
                for (PersonAttribute attr : _survey.getPerson().getAttributes())
                    writer.write(attr.getKey() + " : " + attr.getValue() + "\n");

                writer.write("\n");
            }


            ArrayList<Category> categories = _survey.getCategories();

            for (Category category : categories) {
                writer.write("-----Category : " + category.getTitle() + "-----\n");
                writer.write("Description : " + category.getDescription() + "\n");
                writer.write("\n");
                for (Page page : category.getPages()) {
                    writer.write("--Page--\n\n");

                    for (Question question : page.getQuestions()) {
                        printQuestion(writer, question, "   ");

                    }
                    writer.write("\n");
                }
                writer.write("\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        HTTPRequestTask httpRequestTask = new HTTPRequestTask(this);
        httpRequestTask.execute("", Survey.getInstance().getEmail());
    }
    
//recursion
    private void printQuestion(BufferedWriter writer, Question question, String delimiter) {

        try {
            writer.write(delimiter + "Q  " + question.getQuestionText() + "\n");

            for (Answer a : question.getUserAnswers()) {
                writer.write(delimiter + delimiter + "A  " + a.getUserAnswer() + "\n");

                if (a.hasSubQuestions() && a.isExpanded())
                    for (Question innerQ : a.getSubQuestions()) {
                        writer.write(delimiter);
                        printQuestion(writer , innerQ , delimiter + delimiter);
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

	@Override
	public void onRequestSuccess()
	{
	}
}
