package dk.itu.smdp.model.answer;

import dk.itu.smdp.Answerable;
import dk.itu.smdp.Viewable;

/**
 * Created by centos on 4/13/14.
 */
public abstract class Answer implements Viewable{

    protected String _description;

    protected Answerable _answerable;

    public Answer(String _description , Answerable a) {
        this._description = _description;
        this._answerable = a;
    }

    public String getDescription() {
        return _description;
    }

    public abstract String getUserAnswer();

    public abstract void clear();

    public abstract void setUpListener();

}
