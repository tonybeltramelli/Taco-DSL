package dk.itu.smdp.model.question;

import dk.itu.smdp.R;
import dk.itu.smdp.model.Survey;
import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.BinaryAnswer;

/**
 * Created by centos on 4/13/14.
 */
public class YesNoQuestion extends MutuallyExclusive
{
	public YesNoQuestion(boolean isMandatory, String questionText)
	{
		super(isMandatory, questionText);
		
		super.addAnswer(new BinaryAnswer("Yes"));
		super.addAnswer(new BinaryAnswer("No"));
		
		// Survey.getInstance().getContext().getResources().getString(R.string.boolean_answer_yes)
		// Survey.getInstance().getContext().getResources().getString(R.string.boolean_answer_no)
	}
	
	@Override
	public void addAnswer(Answer a)
	{
	}
}
