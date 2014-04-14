package dk.itu.smdp.model.question;

import dk.itu.smdp.model.answer.BinaryAnswer;

/**
* Created by centos on 4/13/14.
*/
public class YesNoQuestion extends MultipleChoice {

    public YesNoQuestion(boolean _isMandatory, String _questionText) {
        super(_isMandatory, _questionText , 1 , 1);


        super.addAnswer(new BinaryAnswer("Yes" , this));
        super.addAnswer(new BinaryAnswer("No" , this));
    }
}
