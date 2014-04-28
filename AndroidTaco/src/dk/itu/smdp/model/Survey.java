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
		_title = "Survey";
		_description = "Survey example instance.";
		_isAnonymous = false;
		_date = "01/01/2014";
		_email = "deebay@jubii.dk";
		
		Person p = new Person();
		
		PersonAttribute personAttribute1 = new PersonAttribute("name");
		p.addAttribute(personAttribute1);
		PersonAttribute personAttribute2 = new PersonAttribute("age");
		p.addAttribute(personAttribute2);
		
		this.setPerson(p);
		
		Category category1 = new Category("Category number 1 about cool stuffs.", "Your cool information.");
		
		Page page1 = new Page();
		
		Question question1 = QuestionFactory.create(Question.OPEN_FIELD, false, "What is your point of view ?");
		
		page1.addQuestion(question1);
		
		Question question2 = QuestionFactory.create(Question.MULTIPLE_CHOICE, false, "What is your favorite color ?", 2, 3);
		
		question2.addAnswer(AnswerFactory.create(Answer.BINARY, "RED"));
		question2.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
		question2.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
		question2.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
		question2.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));
		page1.addQuestion(question2);
		
		Question question3 = QuestionFactory.create(Question.RATING, true, "How much do you like the canteen's coffee ?", 1, 10, 1);
		page1.addQuestion(question3);
		
		category1.addPage(page1);
		
		Page page2 = new Page();
		
		Question question4 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Select your favorite cat");
		
		Answer answer0 = AnswerFactory.create(Answer.BINARY, "First option");
		question4.addAnswer(answer0);
		
		Question question4_0 = QuestionFactory.create(Question.OPEN_FIELD, false, "Why?");
		
		answer0.addSubQuestion(question4_0);
		Answer answer1 = AnswerFactory.create(Answer.BINARY, "Second option");
		question4.addAnswer(answer1);
		
		Question question4_1 = QuestionFactory.create(Question.MULTIPLE_CHOICE, false, "What?", 2, 2);
		
		Answer answer2 = AnswerFactory.create(Answer.BINARY, "Option 1");
		question4_1.addAnswer(answer2);
		
		Question question4_1_2 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, false, "Select a letter?");
		
		question4_1_2.addAnswer(AnswerFactory.create(Answer.BINARY, "A"));
		question4_1_2.addAnswer(AnswerFactory.create(Answer.BINARY, "B"));
		Answer answer3 = AnswerFactory.create(Answer.BINARY, "C");
		question4_1_2.addAnswer(answer3);
		
		Question question4_1_2_3 = QuestionFactory.create(Question.OPEN_FIELD, false, "How?");
		
		answer3.addSubQuestion(question4_1_2_3);
		question4_1_2.addAnswer(AnswerFactory.create(Answer.BINARY, "D"));
		question4_1_2.addAnswer(AnswerFactory.create(Answer.BINARY, "E"));
		answer2.addSubQuestion(question4_1_2);
		question4_1.addAnswer(AnswerFactory.create(Answer.BINARY, "Option 2"));
		answer1.addSubQuestion(question4_1);
		question4.addAnswer(AnswerFactory.create(Answer.BINARY, "Third option"));
		question4.addAnswer(AnswerFactory.create(Answer.BINARY, "Fourth option"));
		page2.addQuestion(question4);
		
		Question question5 = QuestionFactory.create(Question.YES_NO, false, "Are you married ?");
		page2.addQuestion(question5);
		
		category1.addPage(page2);
		
		this.addCategory(category1);
		
		Category category2 = new Category("Professioanl information?", "Your professioanl information");
		
		Page page3 = new Page();
		
		Question question6 = QuestionFactory.create(Question.RANKING, false, "Rate those stuffs by preference order");
		
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "french fries"));
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "smorebrod"));
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "mousaka"));
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "hamburger"));
		question6.addAnswer(AnswerFactory.create(Answer.RANKING, "tacos"));
		
		page3.addQuestion(question6);
		
		Question question7 = QuestionFactory.create(Question.RATING, true, "How much do you like this language ?", 1, 10, 1);
		page3.addQuestion(question7);
		Question question8 = QuestionFactory.create(Question.OPEN_FIELD, false, "What is your favorite identifier ?");
		
		page3.addQuestion(question8);
		
		Question question9 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, false, "How often do you use this language ?");
		
		question9.addAnswer(AnswerFactory.create(Answer.BINARY, "every second"));
		question9.addAnswer(AnswerFactory.create(Answer.BINARY, "every hour"));
		question9.addAnswer(AnswerFactory.create(Answer.BINARY, "every day"));
		question9.addAnswer(AnswerFactory.create(Answer.BINARY, "every week"));
		question9.addAnswer(AnswerFactory.create(Answer.BINARY, "every month"));
		question9.addAnswer(AnswerFactory.create(Answer.BINARY, "every year"));
		page3.addQuestion(question9);
		
		category2.addPage(page3);
		
		this.addCategory(category2);
		
	}
}
