package dk.itu.smdp;

import dk.itu.smdp.model.answer.Answer;

/**
 * Created by centos on 4/14/14.
 */
public interface Answerable {
    public void onAnswerSelected(Answer answer);
    public void onAnswerDeselected(Answer answer);
}
