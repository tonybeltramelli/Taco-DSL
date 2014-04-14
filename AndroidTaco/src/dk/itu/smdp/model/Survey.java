package dk.itu.smdp.model;

import dk.itu.smdp.model.answer.BinaryAnswer;
import dk.itu.smdp.model.answer.UserInputAnswer;
import dk.itu.smdp.model.question.MultipleChoice;
import dk.itu.smdp.model.question.MutuallyExclusive;
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


        MultipleChoice multipleChoice = new MultipleChoice(true , "Chooce dat shit" , 2 , 4);
        multipleChoice.addAnswer(new BinaryAnswer("Green" , multipleChoice));
        multipleChoice.addAnswer(new BinaryAnswer("Red" , multipleChoice));
        multipleChoice.addAnswer(new BinaryAnswer("Blue" , multipleChoice));
        multipleChoice.addAnswer(new BinaryAnswer("Black" , multipleChoice));
        multipleChoice.addAnswer(new BinaryAnswer("White" , multipleChoice));
        multipleChoice.addAnswer(new BinaryAnswer("Purple" , multipleChoice));

        MultipleChoice multipleChoice2 = new MultipleChoice(true , "Chooce dat shit" , 2 , 4);
        multipleChoice2.addAnswer(new BinaryAnswer("Green" , multipleChoice2));
        multipleChoice2.addAnswer(new BinaryAnswer("Red" , multipleChoice2));
        multipleChoice2.addAnswer(new BinaryAnswer("Blue" , multipleChoice2));
        multipleChoice2.addAnswer(new BinaryAnswer("Black" , multipleChoice2));
        multipleChoice2.addAnswer(new BinaryAnswer("White" , multipleChoice2));
        multipleChoice2.addAnswer(new BinaryAnswer("Purple" , multipleChoice2));


        MutuallyExclusive exclusive = new MutuallyExclusive(true , "Pick dat shit");
        exclusive.addAnswer(new BinaryAnswer("Green" , exclusive));
        exclusive.addAnswer(new BinaryAnswer("Red" , exclusive));
        exclusive.addAnswer(new BinaryAnswer("Black" , exclusive));
        exclusive.addAnswer(new BinaryAnswer("White" , exclusive));
        exclusive.addAnswer(new UserInputAnswer("White" , exclusive));


        YesNoQuestion yesNoQuestion = new YesNoQuestion(true , "Are you something?");

        RatingQuestion rating = new RatingQuestion(true , "asdf" , 1 , 5 , 2);

        Category category = new Category("Skata");
        Page page = new Page();

        page.addQuestion(multipleChoice);
        page.addQuestion(multipleChoice2);
        page.addQuestion(exclusive);
        page.addQuestion(yesNoQuestion);
        page.addQuestion(rating);
        category.addPage(page);

        this.addCategory(category);

    }



}
