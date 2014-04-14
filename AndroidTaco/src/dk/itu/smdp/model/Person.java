package dk.itu.smdp.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dk.itu.smdp.R;
import dk.itu.smdp.Viewable;

import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public class Person implements Viewable {

    private ArrayList<PersonAttribute> _keys;

    public Person() {
        _keys = new ArrayList<PersonAttribute>();
    }

    public void addAttribute(PersonAttribute attr) {
        _keys.add(attr);
    }

    public PersonAttribute getAttribute(int index) {

        return _keys.get(index);
    }

    public ArrayList<PersonAttribute> getAttributes() {
        return _keys;
    }


    @Override
    public View getView(Context context, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.person_attributes, parent , false);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        for (PersonAttribute attr : _keys) {
            layout.addView(attr.getView(context, layout) , params);
        }

        return layout;
    }
}
