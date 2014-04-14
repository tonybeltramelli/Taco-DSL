package dk.itu.smdp.model;

import dk.itu.smdp.model.answer.BinaryAnswer;
import dk.itu.smdp.model.answer.UserInputAnswer;
import dk.itu.smdp.model.question.MutuallyExclusive;
import dk.itu.smdp.model.question.OpenFieldQuestion;
import dk.itu.smdp.model.question.RatingQuestion;
import dk.itu.smdp.model.question.YesNoQuestion;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by centos on 4/13/14.
 */
public class Survey {

    private String _title;
    private String _description;
    private Date _date;
    private boolean _isAnonymous;

    private Person _person;



    private ArrayList<Category> _categories;


    private static Survey _instance;

    public static Survey getInstance(){
        if( _instance == null )
            _instance = new Survey();

        return _instance;
    }



    private Survey(){
        _categories = new ArrayList<Category>();
        _isAnonymous = true;
        init();
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public Date get_date() {
        return _date;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }

    public void setPerson( Person person ){
        _isAnonymous = false;
        _person = person;
    }

    public Person getPerson(){
        return _person;
    }

    public boolean isAnonymous(){
        return _isAnonymous;
    }

    public ArrayList<Category> get_categories() {
        return _categories;
    }

    public void set_categories(ArrayList<Category> _categories) {
        this._categories = _categories;
    }

    public void addCategory(Category c){
        _categories.add(c);
    }


    //dummy method just to test
    private void init(){


        this.set_title("The survey");
        this.set_description("bla bla bla bla");

        PersonAttribute name = new PersonAttribute("Name");
        PersonAttribute age = new PersonAttribute("Age");
        PersonAttribute sex = new PersonAttribute("Sex");

        Person p = new Person();
        p.addAttribute(name);
        p.addAttribute(age);
        p.addAttribute(sex);
        this.setPerson(p);


        YesNoQuestion q1 = new YesNoQuestion(true , "Are you married?");
        YesNoQuestion q2 = new YesNoQuestion(true , "Are you gay?");
        YesNoQuestion q3 = new YesNoQuestion(true , "Are you stupid?");

        MutuallyExclusive mE = new MutuallyExclusive(true , "Choose something...");
        mE.addAnswer(new BinaryAnswer("Red"));
        mE.addAnswer(new BinaryAnswer("Green"));
        mE.addAnswer(new BinaryAnswer("Blue"));
        mE.addAnswer(new BinaryAnswer("Brown"));
        mE.addAnswer(new BinaryAnswer("Yellow"));
        mE.addAnswer(new BinaryAnswer("Black"));
        mE.addAnswer(new UserInputAnswer("Other"));

        RatingQuestion r = new RatingQuestion(true , "Rate dat shit..." , 0 , 10 , 1);


        OpenFieldQuestion oQ = new OpenFieldQuestion(true , "Please write a comment...");



        Page page = new Page();
        page.addQuestion(q1);
        page.addQuestion(q2);
        page.addQuestion(q3);
        page.addQuestion(mE);
        page.addQuestion(r);
        page.addQuestion(oQ);


        Category c = new Category("Personal information");
        c.addPage(page);

        this.addCategory(c);

    }



}
