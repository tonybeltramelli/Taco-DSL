package dk.itu.smdp.activity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import dk.itu.smdp.model.Survey;

/**
 * @author Tony Beltramelli www.tonybeltramelli.com
 */
public abstract class AbtractActivity extends Activity
{
	protected Survey _survey;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		_survey = Survey.getInstance();
        _survey.setContext(this);
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}
}
