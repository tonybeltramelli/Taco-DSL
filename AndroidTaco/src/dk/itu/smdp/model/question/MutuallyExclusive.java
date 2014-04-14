package dk.itu.smdp.model.question;

/**
* Created by centos on 4/13/14.
*/
public class MutuallyExclusive extends MultipleChoice {


    public MutuallyExclusive(boolean _isMandatory, String _questionText) {
        super(_isMandatory, _questionText , 1 , 1);
    }

}
