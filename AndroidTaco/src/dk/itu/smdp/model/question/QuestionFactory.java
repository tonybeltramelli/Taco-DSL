package dk.itu.smdp.model.question;

/**
 * Created by centos on 4/14/14.
 */
public final class QuestionFactory
{
	public static Question create(String type, boolean isMandatory, String questionText, int... params)
	{
		if (type.equals(Question.YES_NO))
			return new YesNoQuestion(isMandatory, questionText);
		else if (type.equals(Question.MUTUALLY_EXCLUSIVE))
			return new MutuallyExclusive(isMandatory, questionText);
		else if (type.equals(Question.MULTIPLE_CHOICE))
		{
			if (params.length < 2) throw new IllegalArgumentException("Multiple choice question requires min and max");
			
			return new MultipleChoice(isMandatory, questionText, params[0], params[1]);
		} else if (type.equals(Question.OPEN_FIELD))
			return new OpenFieldQuestion(isMandatory, questionText);
		
		else if (type.equals(Question.RATING))
		{
			if (params.length < 3)
				throw new IllegalArgumentException("Rating question requires min, max and interval");
			
			return new RatingQuestion(isMandatory, questionText, params[0], params[1], params[2]);
		} else if (type.equals(Question.RANKING))
		{
			return new RankingQuestion(isMandatory, questionText);
		} else
			throw new IllegalArgumentException("Type specified is unknown to the factory");
	}
}
