package dk.itu.smdp.model.answer;

/**
 * Created by centos on 4/14/14.
 */
public final class AnswerFactory {

    public static Answer create( String type , String text ){

        if( type.equals(Answer.BINARY))
            return new BinaryAnswer(text);
        else if( type.equals(Answer.OPEN_FIELD))
            return new OpenFieldAnswer(text);
        else if (type.equals(Answer.RANKING))
            return new RankingAnswer(text);
        else if (type.equals(Answer.USER_INPUT))
            return new UserInputAnswer(text);
        else
            throw new IllegalArgumentException("Type specified is unknown to the answer factory");
    }
}
