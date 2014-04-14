package dk.itu.smdp.model.question;

import dk.itu.smdp.model.answer.Answer;
import dk.itu.smdp.model.answer.BinaryAnswer;

/**
 * Created by centos on 4/13/14.
 */
public class YesNoQuestion extends MutuallyExclusive {

    public YesNoQuestion(boolean _isMandatory, String _questionText) {
        super(_isMandatory, _questionText);

        super.addAnswer(new BinaryAnswer("Yes"));
        super.addAnswer(new BinaryAnswer("No"));
    }

    @Override
    public void addAnswer(Answer a) {
    }
}
