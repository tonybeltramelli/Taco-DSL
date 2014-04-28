package dk.itu.smdp.model.answer;

import dk.itu.smdp.Answerable;
import dk.itu.smdp.Viewable;
import dk.itu.smdp.model.question.Question;

import java.util.ArrayList;

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

    protected ArrayList<Question> _subQuestions;


    protected boolean isExpanded;

	public abstract String getUserAnswer();

    //defaule for every answer is not to have subs.
    //only the binary answer will override
    public boolean hasSubQuestions(){
        return false;
    }

    public void addSubQuestion(Question q){
       if( hasSubQuestions() )
           _subQuestions.add(q);
    }

    public ArrayList<Question> getSubQuestions(){
        if(hasSubQuestions())
            return _subQuestions;

        return new ArrayList<Question>();
    }
	
	public abstract void clear();
	
	public abstract void setUpListener(final Answerable answerable);


    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean isExpanded) {
        this.isExpanded = isExpanded;
    }
}
