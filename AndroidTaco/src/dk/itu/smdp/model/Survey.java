package dk.itu.smdp.model;

import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.AnswerFactory;
import dk.itu.smdp.model.question.Question;
import dk.itu.smdp.model.question.QuestionFactory;

import java.util.ArrayList;
import java.util.Date;

public class Survey
{	
	private String _title;
	private String _description;
	private String _date;
	private String _email;
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
	
	public String getDate()
	{
		return _date;
	}
	
	public String getEmail()
	{
		return _email;
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
	
	private void init()
	{
		_title = "Survey example";
		_description = "Survey example instance";
		_isAnonymous = false;
		_date = "30/04/2014";
		_email = "deebay@jubii.dk";
		
		Person p = new Person();
		
		PersonAttribute personAttribute1 = new PersonAttribute("name");
		p.addAttribute(personAttribute1);
		PersonAttribute personAttribute2 = new PersonAttribute("age");
		p.addAttribute(personAttribute2);
		PersonAttribute personAttribute3 = new PersonAttribute("address");
		p.addAttribute(personAttribute3);
		
		this.setPerson(p);
		
		
		
		Category category1 = new Category("IT University of Copenhagen", "The topic of this section is about IT University of Copenhagen");
		
		
		Page page1 = new Page();
		
		Question question1 = QuestionFactory.create(Question.OPEN_FIELD, false, "What do you thing about IT University of Copenhagen?");								            
		
			
		page1.addQuestion(question1);
		
			
		Question question2 = QuestionFactory.create(Question.MULTIPLE_CHOICE, false, "How did you know about ITU?", 2, 3);
			
		question2.addAnswer(AnswerFactory.create(Answer.BINARY, "University"));
		question2.addAnswer(AnswerFactory.create(Answer.BINARY, "Internet"));
		question2.addAnswer(AnswerFactory.create(Answer.BINARY, "Friends"));
		question2.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "Other"));
		page1.addQuestion(question2);
		
			
		Question question3 = QuestionFactory.create(Question.RATING, true, "How much do you like the canteen's coffee?", 0, 10, 1);
		page1.addQuestion(question3);
		
		category1.addPage(page1);
		
		Page page2 = new Page();
		
		
			
		Question question4 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Select your favorite ITU course");
			
		Answer answer0 = AnswerFactory.create(Answer.BINARY, "SPCT");
		question4.addAnswer(answer0);
		
		
			
		Question question4_0 = QuestionFactory.create(Question.MULTIPLE_CHOICE, false, "Which platforms are you interested in?", 1, 2);
			
		Answer answer1 = AnswerFactory.create(Answer.BINARY, "Android");
		question4_0.addAnswer(answer1);
		
		
			
		Question question4_0_1 = QuestionFactory.create(Question.RATING, false, "Rate lectures Android content?", 0, 100, 10);
		answer1.addSubQuestion(question4_0_1);
		question4_0.addAnswer(AnswerFactory.create(Answer.BINARY, "iPhone"));
		question4_0.addAnswer(AnswerFactory.create(Answer.BINARY, "Windows Phone"));
		answer0.addSubQuestion(question4_0);
		question4.addAnswer(AnswerFactory.create(Answer.BINARY, "SAD1"));
		page2.addQuestion(question4);
		
		category1.addPage(page2);
		
		this.addCategory(category1);
		
		
		
		Category category2 = new Category("Professional information?", "The topic is about your professional carrier");
		
		
		Page page3 = new Page();
		
		
			
		Question question5 = QuestionFactory.create(Question.YES_NO, false, "Are you currently working?");
		page3.addQuestion(question5);
		
		Question question6 = QuestionFactory.create(Question.RANKING, false, "Rate the next companies according to your preferences");
		
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "Microsoft"));		
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "Apple"));		
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "Google"));		
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "Amazon"));		
			
		page3.addQuestion(question6);
		
		category2.addPage(page3);
		
		this.addCategory(category2);
		
	}
}
