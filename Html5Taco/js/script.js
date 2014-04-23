// Taco DSL JavaScript/jQuery implementation
// Pervasive Computing (SPCT-SPRING 2014)
// IT University of Copenhagen
// Authors:
//    Daniel Garcia garcia - dgac@itu.dk
//    Dennis Sadeler Shapira - dssh@itu.dk
// Date: 
//    2014-04-17
// Summary:
//    JavaScript/JQuery implementation for HTML5 Taco DSL instances 

//------Subquestions------------

//Setup subquestions
$(function() {

	$.each($(".subquestions"),function(index,subquestion){
	    $(subquestion).fadeOut("slow");
	});

	//Radio nested subquestions
	$("input:radio").click(function(){
	    var subquestions = $(this).parent().siblings(".subquestions");
	    var parent_subquestions = $(this).parent().parent().parent().find(".subquestions");

	    //Hide all subquestions
	    $.each(parent_subquestions,function(index,subquestion){
	    	$(subquestion).fadeOut("slow");
	    	cleanSubquestion($(subquestion));
	    });

	    //Show corresponding subquestion
	    $.each(subquestions,function(index,subquestion){
	    	$(subquestion).fadeIn("slow");
	    });
	});

	//Checkbox nested subquestions
	$("input:checkbox").click(function(){
	    var subquestions = $(this).parent().siblings(".subquestions");
	    var parent_subquestions = $(this).parent().parent().parent().find(".subquestions");

	    //Show corresponding subquestion
	    $.each(subquestions,function(index,subquestion){
	    	$(subquestion).toggle();
	    	if($(subquestion).is(':visible')){
	    		cleanSubquestion($(subquestion));
	    	}
	    });
	});
});

//Clean subquestion content
function cleanSubquestion(subquestion){
	$.each(subquestion.find("input:radio,input:checkbox"),function(index,input){
		$(input).attr('checked', false);
	});
	$.each(subquestion.find("input:text"),function(index,input){
		$(input).val("");
	});
}

//------Ranking-----------------

//Setup ranking
$(function() {
    $( ".sortable" ).sortable();
    $( ".sortable" ).disableSelection();
});

//------Pagination--------------

var no_categories;
var no_current_pages;
var current_category;
var current_page;
var no_steps;
var no_current_step;

//Setup pagination
$(function() {

	$("#final_message").fadeOut("slow");

	//Hide all categories and pages
    $(".page").fadeOut("slow");

    var category = $($( ".category" )[0]);

    //Show first category and set header
   	setCategoryHeader(category);

    //Show first page
    $($( ".page" )[0]).fadeIn("slow");

    //Handle buttons visibilty
    $("#btn_back").fadeOut("slow");

    if($(".category").size == 1){
    	if($(".pages").size == 1){
    		$("#btn_next").fadeOut("slow");
    	}else{
    		$("#btn_submit").fadeOut("slow");
    	}
    }else{
    		$("#btn_submit").fadeOut("slow");
    }

    //Setting global variables
    no_categories = $(".category").size();
	no_current_cat_pages = category.children(".page").size();
	current_category = 0;
	current_page = 0;
	
	no_steps = $(".page").size();
	no_current_step = 0;
});

//*Pagination button handlers

//Go next page
function next(){
	var category = $($(".category")[current_category]);
	var questions_in_step = $(category.children(".page")[current_page]).children(".question.required");

	//Validate current step
	if(validate(questions_in_step)){

		//Hide previous error messages
		hideError();

		if(current_page == no_current_cat_pages - 1){
		//Show next category

			$(category.children(".page")[current_page]).fadeOut("slow");

			current_category = current_category + 1;
			current_page = 0;

			category = $($(".category")[current_category]);
			$(category.children(".page")[0]).fadeIn("slow");

			no_current_cat_pages = category.children(".page").size();

			if(no_current_cat_pages == 1 && current_category == no_categories - 1){
				$("#btn_next").fadeOut("slow");
				$("#btn_submit").fadeIn("slow");
			}

			//Set category header
			setCategoryHeader(category);

		}else if(current_page == no_current_cat_pages - 2){
		//Show last page in category
			
			$(category.children(".page")[current_page]).fadeOut("slow");
			
			current_page = current_page + 1;
			$(category.children(".page")[current_page]).fadeIn("slow");

			if(current_category == no_categories - 1){
				$("#btn_next").fadeOut("slow");
				$("#btn_submit").fadeIn("slow");
			}

		}else{
		//Show next page
			
			$(category.children(".page")[current_page]).fadeOut("slow");
			current_page = current_page + 1;
			$(category.children(".page")[current_page]).fadeIn("slow");
		}

		//Hide personal information after first step
		if ($("#person").length > 0){
			$("#person").fadeOut("slow");
		}

		$("#btn_back").fadeIn("slow");

		no_current_step = no_current_step + 1;
		updateProgress();

	}else{
		//Display error message
		$("#error_message").fadeIn("slow").delay(3000).fadeOut("slow");
	}
}

//Go previous page
function back(){

	//Handle Submit button visibility
	if(current_page  == no_current_cat_pages - 1 && current_category == no_categories - 1){
		$("#btn_next").fadeIn("slow");
		$("#btn_submit").fadeOut("slow");
	}

	var category = $($(".category")[current_category]);
	
	if(current_page == 1 && current_category == 0){
		//Show first page
		
		$(category.children(".page")[current_page]).fadeOut("slow");
		current_page = current_page - 1;
		$(category.children(".page")[current_page]).fadeIn("slow");

		$("#btn_back").fadeOut("slow");

		//Show personal information
		if ($("#person").length > 0){
		  $("#person").fadeIn("slow");
		}

	}else if(current_page == 0){
		//Show previous category

		$(category.children(".page")[current_page]).fadeOut("slow");

		current_category = current_category - 1;
		category = $($(".category")[current_category]);

		no_current_cat_pages = category.children(".page").size();
		current_page = no_current_cat_pages - 1;

		$(category.children(".page")[current_page]).fadeIn("slow");

		//Set category header
		setCategoryHeader(category);		

	}else{
		//Show previous page
		
		$(category.children(".page")[current_page]).fadeOut("slow");
		current_page = current_page - 1;
		$(category.children(".page")[current_page]).fadeIn("slow");
	}

	no_current_step = no_current_step - 1;
	updateProgress();
}

//Submit survey
function submit(){
	no_current_step = no_current_step + 1;
	updateProgress();
	var category = $($(".category")[current_category]);
	$(category.children(".page")[current_page]).fadeOut("slow");
	$("#btn_back").fadeOut("slow");
	$("#btn_submit").fadeOut("slow");
	$("#category_header").fadeOut("slow");
	$("#required_message").fadeOut("slow");
	$("#final_message").fadeIn("slow");

	storeSurveyData();
}

//*Pagination misc

//Set category header
function setCategoryHeader(category){
	var title = $(category.children()[0]).val();
	var description = $(category.children()[1]).val();
	$("#category_title").html(title);
	$("#category_description").html(description);
}

//Update progress bar
function updateProgress(){
	var bar = $(".progress-bar");
	var perc = no_current_step * 100 / no_steps;
	bar.html(perc + "%");
	bar.width(perc + "%");
}

//--------------Rating------------

//Set numerical value on top
$(function() {
	//On change
	$(".range").change(
		function(){
		var range = $(this);
	  	var box = $(range.parent().parent().parent().find(".rate-val"));
		box.html(range.val());
	});
});

//-------------Validation---------

//Hide error message when page loads
$(function(){hideError();});

//Remove error message from screen
function hideError(){
	$("#error_message").fadeOut("slow");
	error = false;
}

//Validate a set of questions
function validate(questions){

	var is_valid = true;

	//Validate each question
	$.each(questions,function(index,question){

		//openField questions
		if($(question).hasClass("openField")){
			$.each($(question).find(".answer"),function(index,textarea){
				if($(textarea).val() == ""){
					is_valid = false;
					return false;
				}
			});
		}

		//multipleChoice questions
		else if($(question).hasClass("multipleChoice")){
			var max = $($(question).find(".max")).html();
			var min = $($(question).find(".min")).html();
			var count = 0;

			var answers = getChoiceAnswers(this);

			$.each(answers,function(index,answer){
				if($(answer).is(":checked")){
					count = count + 1;

					//Validate subquestions and input answers
					is_valid_sub = validateSubQuestions(answer);
					is_valid_input = validateInputAswer(answer);

					if(!is_valid_sub || !is_valid_input){
						return false;
					}
				}
			});

			if((!(count <= max && count >= min)) || !is_valid_sub || !is_valid_input){
				is_valid = false;
				return false;
			}
		}

		//mutuallyExc questions
		else if($(question).is(".mutuallyExc, .yesno")){
			var checked = false;
			var answers = getChoiceAnswers(this);

			$.each(answers,function(index,answer){
				if($(answer).is(":checked")){

					//Validate subquestions and input answers
					if(validateInputAswer(answer) && validateSubQuestions(answer)){
						checked = true;
					}else{
						checked = false;
					}
					return false;
				}
			});
			
			if(!checked){
				is_valid = false;
				return false;
			}
		}
	});
	return is_valid;
}

//Get checkbox or radio in question
function getChoiceAnswers(question){
	return $($($($(question).children(".panel-body")).children(".input-group")).children(".input-group-addon")).children(".answer");
}

//Parse answer to get subquestions and call validation
function validateSubQuestions(answer){
	var span = $(answer).parent();
	var div = $(span).siblings(".subquestions");
	var subquestions = $(div).children(".question.required");
	return validate(subquestions);
}

//Validate input text on choice question answer
function validateInputAswer(answer){
	var is_valid = true;
	//Validate input text options
	var input_text = ($(answer).parent()).siblings("input[type=text]");
	if(input_text.length > 0){
		if($($(input_text)[0]).val() == ""){
			is_valid = false;
		}
	}
	return is_valid;
}

//--------Save survey results---------

function storeSurveyData(){
	//TODO
}

