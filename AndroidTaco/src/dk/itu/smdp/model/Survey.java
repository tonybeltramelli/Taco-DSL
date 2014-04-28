package dk.itu.smdp.model;

import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.AnswerFactory;
import dk.itu.smdp.model.question.Question;
import dk.itu.smdp.model.question.QuestionFactory;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by centos on 4/13/14.
 */
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
		_isAnonymous = true;
		_date = "";
		_email = "";
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


        Question q1 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "What is your favorite color ?", 2, 3);
        Answer a = AnswerFactory.create(Answer.BINARY, "RED");
        q1.addAnswer(a);
        q1.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
        q1.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
        q1.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
        q1.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));



        Question q2 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "What is your favorite color ?", 2, 3);
        Answer b = AnswerFactory.create(Answer.BINARY, "RED");
        q2.addAnswer(b);
        b.addSubQuestion(q1);
        q2.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
        q2.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
        q2.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
        q2.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));


        Question q3 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "What is your favorite color ?", 2, 3);
        Answer c = AnswerFactory.create(Answer.BINARY, "RED");
        q3.addAnswer(c);
//        c.addSubQuestion(q2);
        q3.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
        q3.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
        q3.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
        q3.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));

        Question q4 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "What is your favorite color ?", 2, 3);
        Answer d = AnswerFactory.create(Answer.BINARY, "RED");
        q4.addAnswer(d);
        d.addSubQuestion(q3);
        q4.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
        q4.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
        q4.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
        q4.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));

        Question q5 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "What is your favorite color ?", 2, 3);

        Answer e = AnswerFactory.create(Answer.BINARY, "RED");
        q5.addAnswer(e);
        e.addSubQuestion(q4);
        e.addSubQuestion(q2);
        q5.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
        q5.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
        q5.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
        q5.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));


        Page page = new Page();
        page.addQuestion(q5);
        Category category = new Category("skata");
        category.addPage(page);
        this.addCategory(category);


        Page page2 = new Page();

        Question q6 = QuestionFactory.create(Question.YES_NO , true , "sadfasdf");

         Question q7 = QuestionFactory.create(Question.OPEN_FIELD , true , "sadfasdf");

        Question q8 = QuestionFactory.create(Question.MULTIPLE_CHOICE, true, "What is your favorite color ?", 2, 3);
        Answer aa = AnswerFactory.create(Answer.BINARY, "RED");
        aa.addSubQuestion(q6);
        aa.addSubQuestion(q7);
        q8.addAnswer(aa);
        q8.addAnswer(AnswerFactory.create(Answer.BINARY, "YELLOW"));
        q8.addAnswer(AnswerFactory.create(Answer.BINARY, "BLUE"));
        q8.addAnswer(AnswerFactory.create(Answer.BINARY, "GREEN"));
        q8.addAnswer(AnswerFactory.create(Answer.USER_INPUT, "OTHER"));


        Question q9 = QuestionFactory.create(Question.RATING , true , "adf" , 0,10,1);

        page2.addQuestion(q8);
        page2.addQuestion(q9);

        category.addPage(page2);

        Question q10 = QuestionFactory.create(Question.YES_NO , true , "asdf");
        Page page3 = new Page();

        page3.addQuestion(q10);

        Category category2 = new Category("asdf");
        category2.addPage(page3);
        this.addCategory(category2);
	}
}
