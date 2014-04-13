package dk.itu.smdp.model.answer;

import dk.itu.smdp.Viewable;

/**
 * Created by centos on 4/13/14.
 */
public abstract class Answer implements Viewable{

    protected String _description;


    public Answer(String _description) {
        this._description = _description;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }
}
