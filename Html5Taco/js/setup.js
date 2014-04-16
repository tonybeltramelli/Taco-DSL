//------Ranking------

$(function() {
    $( ".sortable" ).sortable();
    $( ".sortable" ).disableSelection();
});

//------Setup Pagination--------

var no_categories;
var no_current_pages;
var current_category;
var current_page;
var no_steps;
var no_current_step;

$(function() {

	$("#final_message").hide();

	//Hide all categories and pages
    $(".page").hide();

    var category = $($( ".category" )[0]);

    //Show first category and set header
   	setCategoryHeader(category);

    //Show first page
    $($( ".page" )[0]).show();

    //Handle buttons visibilty
    $("#btn_back").hide();

    if($(".category").size == 1){
    	if($(".pages").size == 1){
    		$("#btn_next").hide();
    	}else{
    		$("#btn_submit").hide();
    	}
    }else{
    		$("#btn_submit").hide();
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

function next(){
	var category = $($(".category")[current_category]);

	if(current_page == no_current_cat_pages - 1){
		//Show next category

		$(category.children(".page")[current_page]).hide();

		current_category = current_category + 1;
		current_page = 0;

		category = $($(".category")[current_category]);
		$(category.children(".page")[0]).show();

		no_current_cat_pages = category.children(".page").size();

		if(no_current_cat_pages == 1 && current_category == no_categories - 1){
			$("#btn_next").hide();
			$("#btn_submit").show();
		}

		//Set category header
		setCategoryHeader(category);

	}else if(current_page == no_current_cat_pages - 2){
		//Show last page in category
		
		$(category.children(".page")[current_page]).hide();
		
		current_page = current_page + 1;
		$(category.children(".page")[current_page]).show();

		if(current_category == no_categories - 1){
			$("#btn_next").hide();
			$("#btn_submit").show();
		}

	}else{
		//Show next page
		
		$(category.children(".page")[current_page]).hide();
		current_page = current_page + 1;
		$(category.children(".page")[current_page]).show();
	}

	//Hide personal information after first step
	if ($("#person").length > 0){
		$("#person").hide();
	}

	$("#btn_back").show();

	no_current_step = no_current_step + 1;
	updateProgress();
}

function back(){

	//Handle Submit button visibility
	if(current_page  == no_current_cat_pages - 1 && current_category == no_categories - 1){
		$("#btn_next").show();
		$("#btn_submit").hide();
	}

	var category = $($(".category")[current_category]);
	
	if(current_page == 1 && current_category == 0){
		//Show first page
		
		$(category.children(".page")[current_page]).hide();
		current_page = current_page - 1;
		$(category.children(".page")[current_page]).show();

		$("#btn_back").hide();

		//Show personal information
		if ($("#person").length > 0){
		  $("#person").show();
		}

	}else if(current_page == 0){
		//Show previous category

		$(category.children(".page")[current_page]).hide();

		current_category = current_category - 1;
		category = $($(".category")[current_category]);

		no_current_cat_pages = category.children(".page").size();
		current_page = no_current_cat_pages - 1;

		$(category.children(".page")[current_page]).show();

		//Set category header
		setCategoryHeader(category);		

	}else{
		//Show previous page
		
		$(category.children(".page")[current_page]).hide();
		current_page = current_page - 1;
		$(category.children(".page")[current_page]).show();
	}

	no_current_step = no_current_step - 1;
	updateProgress();
}

function submit(){
	no_current_step = no_current_step + 1;
	updateProgress();
	var category = $($(".category")[current_category]);
	$(category.children(".page")[current_page]).hide();
	$("#btn_back").hide();
	$("#btn_submit").hide();
	$("#category_header").hide();
	$("#final_message").show();

	//TODO Store data
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