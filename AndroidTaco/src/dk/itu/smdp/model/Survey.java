package dk.itu.smdp.model;

import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.AnswerFactory;
import dk.itu.smdp.model.question.Question;
import dk.itu.smdp.model.question.QuestionFactory;

/**
 * Created by centos on 4/13/14.
 */
public class Survey
{	
	private String _title;
	private String _description;
	private Date _date;
	private boolean _isAnonymous;
	
	private Person _person;
	
	private ArrayList<Category> _categories;
	
	private static Survey _instance;
	
	public static Survey getInstance()
	{
		if (_instance == null) _instance = new Survey();
		
		return _instance;
	}
	
	private Survey()
	{
		_categories = new ArrayList<Category>();
		_isAnonymous = true;
		init();
	}
	
	public String getTitle()
	{
		return _title;
	}
	
	public void setTitle(String title)
	{
		this._title = title;
	}
	
	public String getDescription()
	{
		return _description;
	}
	
	public void setDescription(String description)
	{
		this._description = description;
	}
	
	public Date getDate()
	{
		return _date;
	}
	
	public void setDate(Date date)
	{
		this._date = date;
	}
	
	public void setPerson(Person person)
	{
		_isAnonymous = false;
		_person = person;
	}
	
	public Person getPerson()
	{
		return _person;
	}
	
	public boolean isAnonymous()
	{
		return _isAnonymous;
	}
	
	public ArrayList<Category> getCategories()
	{
		return _categories;
	}
	
	public void setCategories(ArrayList<Category> categories)
	{
		this._categories = categories;
	}
	
	public void addCategory(Category c)
	{
		_categories.add(c);
	}
	
	// dummy method just to test
	private void init()
	{
		this.setTitle("Survey");
		this.setDescription("Survey example instance.");
		
		PersonAttribute name = new PersonAttribute("Name");
		PersonAttribute age = new PersonAttribute("Age");
		
		Person p = new Person();
		p.addAttribute(name);
		p.addAttribute(age);
		this.setPerson(p);
		
		Question q1 = QuestionFactory.create(Question.OPEN_FIELD, true, "What is your point of view ?");
		
		Question q2 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "What is your favorite color ?", 2, 3);
		q2.addAnswer(AnswerFactory.create(Answer.BINARY, "RED"));
		q2.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
		q2.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
		q2.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
		q2.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));
		
		Question q3 = QuestionFactory.create(Question.RATING, true, "How much do you like the canteen's coffee ?", 1, 10, 1);
		
		Question q4 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Select your favorite cat");
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "First option"));
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "Second option"));
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "Third option"));
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "Fourth option"));

		Question q5 = QuestionFactory.create(Question.YES_NO, true, "Are you married ?");
		
		Question q6 = QuestionFactory.create(Question.RANKING, true, "Rate those stuffs by preference order");
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "french fries"));
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "smorebrod"));
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "mousaka"));
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "hamburger"));
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "tacos"));
		
		Category category = new Category("Category number 1 about cool stuffs.", "Your cool information.");
		
		Page page1 = new Page();
		page1.addQuestion(q1);
		page1.addQuestion(q2);
		page1.addQuestion(q3);
		
		Page page2 = new Page();
		page2.addQuestion(q4);
		page2.addQuestion(q5);
		page2.addQuestion(q6);
		
		category.addPage(page1);
		category.addPage(page2);
		
		this.addCategory(category);
	}
}
