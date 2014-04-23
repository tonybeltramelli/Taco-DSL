package dk.itu.smdp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.QuestionContainable;
import dk.itu.smdp.R;
import dk.itu.smdp.model.Page;
import dk.itu.smdp.model.question.Question;

/**
 * Created by centos on 4/13/14.
 */
public class SurveyActivity extends AbtractActivity implements QuestionContainable
{	
	private int _currentCategory = 0;
	private int _currentPage = 0;
	private int _mandatoryQuestionsNumber = 0;
	private View _nextButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.page);
		
		_displayCategory();
		_displayPage();
	}
	
	private void _displayCategory()
	{
		TextView categoryTitle = (TextView) this.findViewById(R.id.category_title_text_view);
		TextView categoryDescription = (TextView) this.findViewById(R.id.category_description_text_view);
		
		categoryTitle.setText(_survey.getCategories().get(_currentCategory).getTitle());
		categoryDescription.setText(_survey.getCategories().get(_currentCategory).getDescription());
	}

	private void _displayPage()
	{
		Page page = _survey.getCategories().get(_currentCategory).getPages().get(_currentPage);
		
		LinearLayout parent = (LinearLayout) this.findViewById(R.id.questions_linearlayout);
		parent.removeAllViews();
		
		_mandatoryQuestionsNumber = 0;
		
		for (Question q : page.getQuestions())
		{
			q.setContainer(this);
			View questionView = q.getView(this, parent);
			parent.addView(questionView);
			
			if (q.isMandatory())
			{
				_mandatoryQuestionsNumber++;
			}
		}

		View sendButton = findViewById(R.id.page_screen_send_button);
		
		if(_currentCategory == _survey.getCategories().size())
		{
			sendButton.setVisibility(View.VISIBLE);
		}else{
			sendButton.setVisibility(View.INVISIBLE);
		}
		
		_nextButton = findViewById(R.id.page_screen_next_button);
		_nextButton.setVisibility(View.INVISIBLE);
		
		View prevButton = findViewById(R.id.page_screen_previous_button);
		
		if(_currentPage == 0 && _currentCategory == 0)
		{
			prevButton.setVisibility(View.INVISIBLE);
		}else{
			prevButton.setVisibility(View.VISIBLE);
		}
	}
	
	@Override
	public void updateQuestionAnswer(Question question)
	{
		int answeredQuestions = 0;
		
		if (question.isMandatory() && question.isQuestionAnswered())
		{
			Page page = _survey.getCategories().get(_currentCategory).getPages().get(_currentPage);
			
			for (Question q : page.getQuestions())
			{
				if (q.isMandatory() && q.isQuestionAnswered())
				{
					answeredQuestions++;
				}
			}	
		}
		
		if (answeredQuestions == _mandatoryQuestionsNumber)
		{
			_nextButton.setVisibility(View.VISIBLE);
		} else
		{
			_nextButton.setVisibility(View.INVISIBLE);
		}
	}
	
	public void prevButtonClickHandler(View view)
	{
		if(_currentPage == 0)
		{
			if(_currentCategory == 0)
			{
				return;
			}else{
				_currentCategory --;
			}
		}
		
		_currentPage --;
		
		_displayPage();
	}
	
	public void nextButtonClickHandler(View view)
	{
		if(_currentPage == _survey.getCategories().get(_currentCategory).getPages().size() - 1)
		{
			if(_currentCategory == _survey.getCategories().size() - 1)
			{
				return;
			}else{
				_currentCategory ++;
			}
		}
		
		_currentPage ++;
		
		_displayPage();
	}
}
