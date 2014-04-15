package dk.itu.smdp.model;

import dk.itu.smdp.model.question.Question;

import java.util.ArrayList;

/**
 * Created by centos on 4/13/14.
 */
public class Page
{
	private ArrayList<Question> _questions;
	
	public Page()
	{
		_questions = new ArrayList<Question>();
	}
	
	public void addQuestion(Question q)
	{
		_questions.add(q);
	}
	
	public ArrayList<Question> getQuestions()
	{
		return _questions;
	}	
}
