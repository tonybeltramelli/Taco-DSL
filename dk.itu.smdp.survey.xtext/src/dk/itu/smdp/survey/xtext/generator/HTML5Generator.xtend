package dk.itu.smdp.survey.xtext.generator

import SurveyModel.MultipleChoice
import SurveyModel.MutuallyExclusive
import SurveyModel.OpenField
import SurveyModel.Question
import SurveyModel.Ranking
import SurveyModel.Rating
import SurveyModel.Survey
import SurveyModel.YesNo
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class HTML5Generator extends SurveyGenerator
{
	def override generate(Resource resource, IFileSystemAccess fsa)
	{
		resource.allContents.toIterable.filter(typeof(Survey)).forEach [ Survey it |
			fsa.generateFile("html5/taco.html", it.compile)
		]
	}
	
	def override compile(Survey it) {
		''' 
			<!DOCTYPE html>
			<html lang="en">
			  <head>
			    <meta charset="utf-8">
			    <meta http-equiv="X-UA-Compatible" content="IE=edge">
			    <meta name="viewport" content="width=device-width, initial-scale=1">
			    <meta name="description" content="«description»">
			    <!--Style-->
			    <link href="css/bootstrap.min.css" rel="stylesheet">
			    <link href="css/style.css" rel="stylesheet">
			    <title>«title»</title>
			
			</head>
			<body>
			
			    <!--Survey header-->
			  	<div class="page-header">
			        <h1><span id="survey_title">«title»</span><span id="survey_description"><small>«description»</small></span></h1>
			    </div>
			
			    <input type="hidden" id="survey_date" value="«date»"/>
			
			    <!--Progress bar-->
			    <h4><small>Progress</small></h4>
			    <div class="progress progress-striped active">
			        <div class="progress-bar"  role="progressbar" aria-valuemin="0" aria-valuemax="100" style="width: 0%">0%</div>
			    </div>
			    
			    «IF person != null»
				    <!--Personal information-->
				    <div id="person" class="panel panel-primary">
				        <div class="panel-heading"><h3 class="panel-title">Personal information:</h3></div>
				        <table class="table">
				        	«FOR attribute : person.attribute»
					            <tr>
					                <td>
					                    <div class="input-group">
					                        <span class="key input-group-addon">«attribute.key»</span><input type="text" class="value form-control">
					                    </div>
					                </td>
					            </tr>
				            «ENDFOR»
				        </table>
				    </div>
			    «ENDIF»
			
			    <span id="required_message" class="red small">Questions marked with * are required</span>
				
				<!--Category header-->
				<div id="category_header">
					<h3 id="category_title"></h3> 
					<div class="panel-header blue">
				    	<div class="alert alert-info"><strong><span id="category_description"/></strong></div>
				    </div>
				</div>
				
				<!--Questions-->
				    
			    «FOR category : categories»
				
				    <div class="category">
				        <input class="category_title" type="hidden" value="«category.title»"/>
				        <input class="category_description" type="hidden" value="«category.description»"/>
				
						«FOR page : category.pages»
						
					        <div class="page">
					
					            «FOR question : page.questions»
					            
					            	«compileQuestion(question)»
					            	
					            «ENDFOR»
					
					        </div><!--End of page-->
					        
				        «ENDFOR»
				
				    </div><!--End of category-->
			    			    
			    «ENDFOR»
			
			    <!--Error message-->
			    <div id="error_message" class="alert alert-danger centered">
			        <span>Please fill the required fields before continue! (*)</span>
			    </div>
			
			    <!--Action buttons-->    
			    <div class="centered">
			        <button type="button" class="btn btn-large btn-primary" id="btn_back" onClick="back()">Back</button>
			        <button type="button" class="btn btn-large btn-primary" id="btn_next" onClick="next()">Next</button>
			        <button type="button" class="btn btn-large btn-primary" id="btn_submit" onClick="submit()">Submit</button>
			    </div>
			
			    <!--Final message-->
			    <div id="final_message" class="panel panel-default">
			        <h1 class="text-center">Survey complete! Tanks for answering.</h1>
			    </div>
			
			    <!--JavaScript-->
			
			    <!--[if lt IE 9]>
			      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
			    <![endif]-->
			
			    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
			    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
			    <script src="js/bootstrap.min.js"></script>
			    <script src="js/script.js"></script>
			
			  </body>
			</html>
		''' 
	}
	
	def override String compileQuestion(Question it)
	{
		'''
		«IF (it instanceof OpenField)»
			<!--Open field-->
			<div class="question openField «IF isMandatory»required«ENDIF» panel panel-default">
				<div class="text panel-heading">«questionText» «IF isMandatory»<span class="red">*</span> «ENDIF» </div>
								                
				<div class="panel-body">
					<textarea class="answer form-control" rows="3"></textarea>
				</div>
			</div>					            
		«ENDIF»
		
		«IF (it instanceof Ranking)»
			<!--Ranking-->
            <div class="question ranking «IF isMandatory»required«ENDIF» panel panel-default">
                <div class="text panel-heading">«questionText» «IF isMandatory»<span class="red">*</span> «ENDIF» </div>
                
                <div class="panel-body">
                    <ul class="list-group sortable">
                        
                        «FOR answer : answers»
                        	<li class="list-group-item">
                            	<span>&#x21C5;</span>«answer.description»
                        	</li>
                        «ENDFOR»
                        
                    </ul>
                </div>
            </div>
		«ENDIF»
		
		«IF (it instanceof YesNo)»
			<!--Yes/No-->
            <div class="question yesno «IF isMandatory»required«ENDIF» panel panel-default">
                <div class="text panel-heading">«questionText» «IF isMandatory»<span class="red">*</span> «ENDIF» </div>
                
                <div class="panel-body">   
                    <div class="input-group">
                      <span class="input-group-addon"><input name="radio_2" class="answer" type="radio" value="yes"></span>
                      <strong><span class="answer_text form-control">Yes</span></strong>

                      <span class="input-group-addon"><input name="radio_2" class="answer" type="radio" value="no"></span>
                      <strong><span class="answer_text form-control">No</span></strong>
                    </div>
                </div>
            </div>
		«ELSEIF (it instanceof Rating)»
			<!--Rating-->
            <div class="question rating «IF isMandatory»required«ENDIF» panel panel-default">
                <div class="text panel-heading">
                    <div class="text panel-heading">«questionText» «IF isMandatory»<span class="red">*</span> «ENDIF» </div>
                    <div class="rating-box"><h4><span class="rate-val">--</span></h4></div>
                </div>
                <div class="panel-body">
                    <div class="input-group">
                        <span class="min input-group-addon">«(it as Rating).start»</span>
                        <input type="range" class="form-control range" min="«(it as Rating).start»" max="«(it as Rating).end»">
                        <span class="max input-group-addon">«(it as Rating).end»</span>
                    </div>
                </div>
            </div>
		«ELSEIF (it instanceof MutuallyExclusive)»
			<!--Mutually exclusive-->
            <div class="question mutuallyExc «IF isMandatory»required«ENDIF» panel panel-default">
               	<div class="text panel-heading">«questionText» «IF isMandatory»<span class="red">*</span> «ENDIF» </div>
                
                <div class="panel-body">
                	«FOR answer : answers»
	                    <div class="input-group">
	                        <span class="input-group-addon"><input name="radio_1" class="answer" type="radio" value="«answer.description»"></span>
	                        
	                        «IF !answer.isUserInputAllowed»
	                        	<strong><span class="answer_text form-control">«answer.description»</span></strong>              
	                        «ELSE»
	                        	<input type="text" class="answer_text form-control" placeholder="«answer.description»*"/>
	                        «ENDIF»
	                        
	                        «IF answer.subquestion.length != 0»
		                        <!--Subquestion-->
		                        <div class="subquestions">
		                        
		                        «FOR subquestion : answer.subquestion»	
		                        	«compileQuestion(subquestion)»
		                        «ENDFOR»
		                        	
		                        </div><!--End Subquestion-->
	                        «ENDIF»
	                    </div>
                    «ENDFOR»
                </div>
            </div>
		«ELSEIF (it instanceof MultipleChoice)»
			<!--Multiple choice-->
            <div class="question multipleChoice «IF isMandatory»required«ENDIF» panel panel-default">
                <div class="text panel-heading">«questionText» «IF isMandatory»<span class="red">*</span> «ENDIF» </div>
                
                «IF (it as MultipleChoice).min != (it as MultipleChoice).max»
                	<div class="panel-footer">Select <span class="min">«(it as MultipleChoice).min»</span> to <span class="max">«(it as MultipleChoice).max»</span> options. </div>
                «ELSE»
                	<div class="panel-footer">Select «(it as MultipleChoice).min» options. </div>
                «ENDIF»
                
                <div class="panel-body">
                	«FOR answer : answers»
	                    <div class="input-group">
	                        <span class="input-group-addon"><input class="answer" type="checkbox" value="«answer.description»"></span>
	                        
	                        «IF !answer.isUserInputAllowed»
	                        	<strong><span class="answer_text form-control">«answer.description»</span></strong>
	                        «ELSE»
	                        	<input type="text" class="answer_text form-control" placeholder="«answer.description»*"/>
	                        «ENDIF»
	                        
	                        «IF answer.subquestion.length != 0»
		                        <!--Subquestion-->
		                        <div class="subquestions">
		                        
		                        «FOR subquestion : answer.subquestion»	
		                        	«compileQuestion(subquestion)»
		                        «ENDFOR»
		                        	
		                        </div><!--End Subquestion-->
	                        «ENDIF»
	                    </div>
                    «ENDFOR»
                </div>
            </div>
		«ENDIF»
		
		'''
	}
}