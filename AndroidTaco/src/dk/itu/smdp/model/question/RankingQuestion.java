package dk.itu.smdp.model.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Tony Beltramelli www.tonybeltramelli.com
 */
public class RankingQuestion extends Question
{
	public RankingQuestion(boolean _isMandatory, String _questionText)
	{
		super(_isMandatory, _questionText);
	}
	
	@Override
	public View getView(Context context, ViewGroup parent)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isQuestionAnswered()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
