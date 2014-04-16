package dk.itu.smdp.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.QuestionContainable;
import dk.itu.smdp.R;
import dk.itu.smdp.model.Page;
import dk.itu.smdp.model.question.Question;
import dk.itu.smdp.model.question.RankingQuestion;
import dk.itu.smdp.model.question.RatingQuestion;

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
		
		for (Question q : page.getQuestions())
		{
			q.setContainer(this);
			View questionView = q.getView(this, parent);
			parent.addView(questionView);
			
			if (q.isMandatory() && !(q instanceof RatingQuestion) && !(q instanceof RankingQuestion))
			{
				_mandatoryQuestionsNumber++;
			}
		}
		
		_nextButton = findViewById(R.id.page_screen_next_button);
		_nextButton.setVisibility(View.INVISIBLE);
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
		if(_currentPage <= 0) return;
		
		_currentPage --;
		
		_displayPage();
	}
	
	public void nextButtonClickHandler(View view)
	{
		if(_currentPage >= _survey.getCategories().get(_currentCategory).getPages().size()) return; 
		
		_currentPage ++;
		
		_displayPage();
	}
}
