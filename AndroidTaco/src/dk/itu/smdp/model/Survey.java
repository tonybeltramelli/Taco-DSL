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
		_title = "Woooooaaaahh";
		_description = "That's cool";
		_isAnonymous = false;
		_date = "02/05/2014";
		_email = "tonb@itu.dk";
		
		Person p = new Person();
		
		PersonAttribute personAttribute1 = new PersonAttribute("name");
		p.addAttribute(personAttribute1);
		
		this.setPerson(p);
		
		
		
		Category category1 = new Category("what's up", "");
		
		
		Page page1 = new Page();
		
		
		Question question1 = QuestionFactory.create(Question.RANKING, true, "Rank your hangover state today");
		
		question1.addAnswer(AnswerFactory.create(Answer.RANKING, "soooo bad"));		
		question1.addAnswer(AnswerFactory.create(Answer.RANKING, "comme si, comme ca"));		
		question1.addAnswer(AnswerFactory.create(Answer.RANKING, "just need another beer"));		
		question1.addAnswer(AnswerFactory.create(Answer.RANKING, "just get me a coffe"));		
		question1.addAnswer(AnswerFactory.create(Answer.RANKING, "did I really brought that girl home"));		
			
		page1.addQuestion(question1);
		
			
		Question question2 = QuestionFactory.create(Question.RATING, false, "Rate how much you want to swim today", 0, 1000, 100);
		page1.addQuestion(question2);
		
		category1.addPage(page1);
		
		Page page2 = new Page();
		
		Question question3 = QuestionFactory.create(Question.OPEN_FIELD, false, "What's up ?");								            
		
			
		page2.addQuestion(question3);
		
			
		Question question4 = QuestionFactory.create(Question.MULTIPLE_CHOICE, false, "What would you like to drink ?", 3, 5);
			
		Answer answer0 = AnswerFactory.create(Answer.BINARY, "beer");
		question4.addAnswer(answer0);
		
		
			
		Question question4_0 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Which brand ?");
			
		question4_0.addAnswer(AnswerFactory.create(Answer.BINARY, "Tuborg"));
		question4_0.addAnswer(AnswerFactory.create(Answer.BINARY, "Heineken"));
		answer0.addSubQuestion(question4_0);
		Answer answer1 = AnswerFactory.create(Answer.BINARY, "wine");
		question4.addAnswer(answer1);
		
		
			
		Question question4_1 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Which wine ?");
			
		question4_1.addAnswer(AnswerFactory.create(Answer.BINARY, "cote du rhone"));
		question4_1.addAnswer(AnswerFactory.create(Answer.BINARY, "bordeau"));
		question4_1.addAnswer(AnswerFactory.create(Answer.BINARY, "savagnin"));
		question4_1.addAnswer(AnswerFactory.create(Answer.BINARY, "merlot"));
		question4_1.addAnswer(AnswerFactory.create(Answer.BINARY, "tempramillo"));
		answer1.addSubQuestion(question4_1);
		question4.addAnswer(AnswerFactory.create(Answer.BINARY, "water"));
		question4.addAnswer(AnswerFactory.create(Answer.BINARY, "juice"));
		question4.addAnswer(AnswerFactory.create(Answer.BINARY, "whisky"));
		question4.addAnswer(AnswerFactory.create(Answer.BINARY, "gin"));
		page2.addQuestion(question4);
		
		category1.addPage(page2);
		
		this.addCategory(category1);
		
		
		
		Category category2 = new Category("who is that chicks", "she is cute");
		
		
		Page page3 = new Page();
		
		
			
		Question question5 = QuestionFactory.create(Question.YES_NO, false, "Is she single ?");
		page3.addQuestion(question5);
		
			
		Question question6 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Where do you wanna bring her ?");
			
		Answer answer2 = AnswerFactory.create(Answer.BINARY, "restaurant");
		question6.addAnswer(answer2);
		
		
			
		Question question6_2 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, false, "which kind of food ?");
			
		Answer answer3 = AnswerFactory.create(Answer.BINARY, "asian");
		question6_2.addAnswer(answer3);
		
		
			
		Question question6_2_3 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "which country");
			
		question6_2_3.addAnswer(AnswerFactory.create(Answer.BINARY, "japan"));
		question6_2_3.addAnswer(AnswerFactory.create(Answer.BINARY, "chinese"));
		question6_2_3.addAnswer(AnswerFactory.create(Answer.BINARY, "thai"));
		answer3.addSubQuestion(question6_2_3);
		question6_2.addAnswer(AnswerFactory.create(Answer.BINARY, "danish"));
		question6_2.addAnswer(AnswerFactory.create(Answer.BINARY, "fucking fast food"));
		answer2.addSubQuestion(question6_2);
		question6.addAnswer(AnswerFactory.create(Answer.BINARY, "bar"));
		page3.addQuestion(question6);
		
		category2.addPage(page3);
		
		Page page4 = new Page();
		
		
			
		Question question7 = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, true, "Is taco the best language in the world ?");
			
		question7.addAnswer(AnswerFactory.create(Answer.BINARY, "yes"));
		question7.addAnswer(AnswerFactory.create(Answer.BINARY, "nope"));
		question7.addAnswer(AnswerFactory.create(Answer.BINARY, "fuck it"));
		question7.addAnswer(AnswerFactory.create(Answer.BINARY, "maybe"));
		question7.addAnswer(AnswerFactory.create(Answer.BINARY, "I don't care"));
		question7.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "kind of"));
		page4.addQuestion(question7);
		
		category2.addPage(page4);
		
		this.addCategory(category2);
		
	}
}
