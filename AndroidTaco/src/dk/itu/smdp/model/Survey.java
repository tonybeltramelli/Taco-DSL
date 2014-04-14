package dk.itu.smdp.model;

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

    }



}
