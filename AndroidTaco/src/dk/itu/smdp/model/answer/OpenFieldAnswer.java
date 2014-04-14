package dk.itu.smdp.model.answer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dk.itu.smdp.R;

/**
 * Created by centos on 4/13/14.
 */
public class OpenFieldAnswer extends Answer{
    public OpenFieldAnswer(String _description) {
        super(_description);
    }

    @Override
    public View getView(Context context, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        return inflater.inflate(R.layout.open_field , parent , false);
    }
}
