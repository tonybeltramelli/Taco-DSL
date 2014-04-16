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
	
	private Activity _context;
	
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
	
	public Activity getContext()
	{
		return _context;
	}
	
	public void setContext(Activity context)
	{
		this._context = context;
	}
	
	// dummy method just to test
	private void init()
	{
		this.setTitle("The survey");
		this.setDescription("bla bla bla bla");
		
		PersonAttribute name = new PersonAttribute("Name");
		PersonAttribute age = new PersonAttribute("Age");
		PersonAttribute sex = new PersonAttribute("Sex");
		
		Person p = new Person();
		p.addAttribute(name);
		p.addAttribute(age);
		p.addAttribute(sex);
		this.setPerson(p);
		
		Question q1 = QuestionFactory.create(Question.YES_NO, true, "Are you bla?");
		Question q2 = QuestionFactory.create(Question.RATING, true, "Rate dat shit", 1, 10, 1);
		
		Question q3 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Pick something");
		q3.addAnswer(AnswerFactory.create(Answer.BINARY, "Black"));
		q3.addAnswer(AnswerFactory.create(Answer.BINARY, "White"));
		q3.addAnswer(AnswerFactory.create(Answer.BINARY, "Blue"));
		q3.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "Red"));
		
		Question q4 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "Choose something", 2, 3);
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "White"));
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "Black"));
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "Red"));
		q4.addAnswer(AnswerFactory.create(Answer.BINARY, "Blue"));
		
		Question q5 = QuestionFactory.create(Question.OPEN_FIELD, true, "Say something");
		
		Question q6 = QuestionFactory.create(Question.RANKING, true, "Rate your favorite booze");
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "Cocktail"));
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "Beer"));
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "Wine"));
		q6.addAnswer(AnswerFactory.create(Answer.RANKING, "Liquor"));
		
		Category category = new Category("Skata");
		Page page = new Page();
		page.addQuestion(q1);
		page.addQuestion(q2);
		page.addQuestion(q3);
		page.addQuestion(q4);
		page.addQuestion(q5);
		page.addQuestion(q6);
		
		category.addPage(page);
		
		this.addCategory(category);
	}
}
