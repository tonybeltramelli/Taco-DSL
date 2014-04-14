package dk.itu.smdp.model;

import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public class Category {

    private String _title;
    private String _description;

    private ArrayList<Page> _pages;

    public Category( String title ){
        _title = title;
        _pages = new ArrayList<Page>();
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

    public ArrayList<Page> get_pages() {
        return _pages;
    }

    public void addPage(Page p){
        _pages.add(p);
    }
}
