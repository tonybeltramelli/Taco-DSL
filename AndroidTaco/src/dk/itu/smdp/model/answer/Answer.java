package dk.itu.smdp.model.answer;

import dk.itu.smdp.Answerable;
import dk.itu.smdp.Viewable;

/**
 * Created by centos on 4/13/14.
 */
public abstract class Answer implements Viewable
{
	public static final String BINARY = "binary";
	public static final String USER_INPUT = "user_input";
	public static final String OPEN_FIELD = "open_field";
	public static final String RANKING = "ranking";
    public static final String RATING = "rating";
	
	protected String _description;
	
	public Answer(String description)
	{
		this._description = description;
	}
	
	public String getDescription()
	{
		return _description;
	}
	
	public abstract String getUserAnswer();
	
	public abstract void clear();
	
	public abstract void setUpListener(final Answerable answerable);
}
