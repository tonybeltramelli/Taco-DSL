package dk.itu.smdp.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import dk.itu.smdp.R;
import dk.itu.smdp.Viewable;

/**
 * Created by centos on 4/13/14.
 */
public class PersonAttribute implements Viewable{


    private String _key;
    private String _value;

    public PersonAttribute(String _key) {
        this._key = _key;
    }


    public String get_key() {
        return _key;
    }

    public void set_key(String _key) {
        this._key = _key;
    }

    public String get_value() {
        return _value;
    }

    public void set_value(String _value) {
        this._value = _value;
    }

    @Override
    public View getView(Context context, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View attributeView = inflater.inflate(R.layout.person_attribute , parent , false);

        TextView label = (TextView) attributeView.findViewById(R.id.person_attribute_key_textview);

        label.setText(_key);

        return attributeView;
    }
}
