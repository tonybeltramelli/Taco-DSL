package dk.itu.smdp.model.question;

/**
 * Created by centos on 4/13/14.
 */
public class MutuallyExclusive extends MultipleChoice
{	
	public MutuallyExclusive(boolean isMandatory, String questionText)
	{
		super(isMandatory, questionText, 1, 1);
	}	
}
