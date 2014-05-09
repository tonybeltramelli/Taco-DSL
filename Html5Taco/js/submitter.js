var formData = new FormData();
var questionDict = {};
var message ="";
var surveyResultsDiv = document.createElement("div")

function submitForm(element) {

	for(w=0 ; w < element.length ; w++) {	
	
		if(element[w].parentNode.className == "page"){
			
			var answerFromBox;
			var questionInnerElements = element[w].getElementsByClassName("text");	
			var questionText = questionInnerElements[0].childNodes[0].data;
			var answerInnerElements = element[w].getElementsByClassName("answer");
			var ratingAnswerElements = element[w].getElementsByClassName("rate-val");
			if(ratingAnswerElements[0]){
				var answerFromBox = ratingAnswerElements[0].innerHTML
			}
			element[w].classList.add("checked")
			if(element[w].parentNode.parentNode.parentNode.className == "subquestions" || 
			   element[w].parentNode.parentNode.parentNode.parentNode.className == "subquestions" ||
			   element[w].parentNode.parentNode.parentNode.parentNode.parentNode.className == "subquestions")continue;
			
			getData(questionText, answerInnerElements, answerFromBox);
		}
	}	
	
	getSurveyInfo()
	getPersonInfo()
	
	//Render results on final page
	var targetDiv = document.getElementById("final_message")
	surveyResultsDiv.innerHTML += "<br /><h4>Survey Results</h4><div class='table-responsive'>"
	var table = document.createElement("table")
	table.className = 'table table-bordered table-striped'
	
	var headingRow = table.insertRow(-1);
	var cellHeading1 = headingRow.insertCell(0);
	var cellHeading2 = headingRow.insertCell(1);		
	cellHeading1.innerHTML = "<b>Questions<b>";
	cellHeading2.innerHTML = "<b>Answers</b>";
		
	for(var propName in questionDict) {
		var propValue = questionDict[propName];
		var row = table.insertRow(-1);
		var cell1 = row.insertCell(0);
		var cell2 = row.insertCell(1);		
		cell1.innerHTML = propName;
		cell2.innerHTML = propValue;
		//surveyResultsDiv.innerHTML += "<tr><td>Q: "+propName+"</td><td>A: "+propValue+ "</td></tr>";
		message += " \nQ: "+propName+"  A: "+propValue;
	}
	
	surveyResultsDiv.appendChild(table)
	targetDiv.appendChild(surveyResultsDiv)
	
	//Send email
	var	companyEmail = document.getElementById("email").value
	var email = encodeURIComponent(companyEmail)
	var subject = "Taco Surveys* Your survey results"
	var from = "Taco Surveys Inc."
	
	if(email){
		var xhr = new XMLHttpRequest();
		xhr.open("GET", "http://projectdee.com/EmailController2.php?sendTo="+email+"&subject="+subject+"&message="+encodeURIComponent(message)+"&from="+from, true);  
		xhr.send();	
		alert("The survey has been submitted to "+companyEmail);
	}
}
	
    

function getData(questionText, answerInnerElements, ratingAnswer) {

	var answerClassname = answerInnerElements[0].className.split(' ')[1]
	
	switch (answerClassname)
	{	
	case "openFieldAnswer":
		var answer = answerInnerElements[0].value
		if(answer){
			formData.append(questionText, answer);
			questionDict[questionText] = [answer];
			var subQuestionObj = checkForSubQuestion(answerInnerElements[0], answer)
			if(subQuestionObj){
				getData(subQuestionObj[0], subQuestionObj[1], subQuestionObj[2])					
			}
		}
		break;
		
	case "ratingAnswer":
		var answer = answerInnerElements[0].value
		if(ratingAnswer !== "--"){
			formData.append(questionText, answer);
			questionDict[questionText] = [answer];
			var subQuestionObj = checkForSubQuestion(answerInnerElements[0], answer)
			if(subQuestionObj){
				getData(subQuestionObj[0], subQuestionObj[1], subQuestionObj[2])					
			}
		}
		break;

	case "multipleChoiceAnswer":
		var answersChecked = [];
		for(x=0 ; x < answerInnerElements.length ; x++) {
			if(answerInnerElements[x].checked){
				if(answerInnerElements[x].parentNode.parentNode.childNodes[3].nodeName == "INPUT"){
					var answer = answerInnerElements[x].parentNode.parentNode.childNodes[3].value
					if(answerInnerElements[x].parentNode.parentNode.parentNode.parentNode.classList.contains("checked")){							
						answersChecked.push(answer);
					}	
					questionDict[questionText] = [answersChecked.join('<br>')];
				}else{
					var answer = answerInnerElements[x].value
					if(answerInnerElements[x].parentNode.parentNode.parentNode.parentNode.classList.contains("checked")){							
						answersChecked.push(answer);
					}
					questionDict[questionText] = [answersChecked.join('<br>')];
					var subQuestionObj = checkForSubQuestion(answerInnerElements[x], answer)
					if(subQuestionObj){
						getData(subQuestionObj[0], subQuestionObj[1], subQuestionObj[2])					
					}
				}
			}			
		}
		break;
	
	case "mutuallyExcAnswer":
		for(z=0 ; z < answerInnerElements.length ; z++) {				
			if(answerInnerElements[z].checked == true){
				if(answerInnerElements[z].parentNode.parentNode.childNodes[3].nodeName == "INPUT"){
					var answer = answerInnerElements[z].parentNode.parentNode.childNodes[3].value
					questionDict[questionText] = [answer];
				}else{
					var answer = answerInnerElements[z].value
					questionDict[questionText] = [answer];
					var subQuestionObj = checkForSubQuestion(answerInnerElements[z], answer)
					if(subQuestionObj){
						getData(subQuestionObj[0], subQuestionObj[1], subQuestionObj[2])					
					}
				}
			}
		}
		break;
	
	case "rankingAnswer":
		var rankedArray = []
		for(y=0 ; y < answerInnerElements.length ; y++) {							
			var answer = answerInnerElements[y].childNodes[2].nodeValue;
			rankedArray.push(answer)
		}
		questionDict[questionText] = [rankedArray.join('<br>')];
		break;		
	}
}	


function checkForSubQuestion(element, sourceAnswer) {
	var subquestionsElements = element.parentNode.parentNode.getElementsByClassName("subquestions")	
	if(subquestionsElements.length == 0){return;}
	var elementsToCheck = subquestionsElements[0].getElementsByClassName("question")
	subquestionsElements[0].classList.add("cheked")
	
	for(i=0 ; i < elementsToCheck.length ; i++) {
		if(elementsToCheck[i].parentNode.className == "cheked")continue;
		
		var answerFromBox;
		var subQuestionInnerElements = elementsToCheck[i].getElementsByClassName("text");	
		var subQuestionText = "SubQ for "+sourceAnswer+": "+subQuestionInnerElements[0].childNodes[0].data					
		var subAnswerInnerElements = elementsToCheck[i].getElementsByClassName("answer");
		var ratingAnswerElements = elementsToCheck[i].getElementsByClassName("rate-val");
			if(ratingAnswerElements[0]){
				var answerFromBox = ratingAnswerElements[0].innerHTML
			}
		if(elementsToCheck[i].parentNode.parentNode.parentNode.className == "subquestions" || 
		   elementsToCheck[i].parentNode.parentNode.parentNode.parentNode.className == "subquestions" ||
		   elementsToCheck[i].parentNode.parentNode.parentNode.parentNode.parentNode.className == "subquestions")continue;
		return[subQuestionText, subAnswerInnerElements, answerFromBox]
	}
}

function getSurveyInfo() {
	var surveyTitle = document.getElementById("survey_title")
	var surveyDescription = document.getElementById("survey_description")
	
	surveyResultsDiv.innerHTML += "<h3>"+surveyTitle.innerHTML+"</h3><span>Description: "+surveyDescription.innerHTML+"</span><br /><br />"
	message += surveyTitle.innerHTML+"\nDescripition: "+surveyDescription.childNodes[0].innerHTML+" \n\n"
}

function getPersonInfo() {
	var personDiv = document.getElementById("person")
	if(!personDiv)return;
	var personAttributeElements = personDiv.getElementsByClassName("input-group")

	surveyResultsDiv.innerHTML += "<span><strong>Respondent Details:</strong></span><br />"
	message += "Respondent Details: \n"
	
	for(i=0; i<personAttributeElements.length; i++) {
		var attributeKey = personAttributeElements[i].childNodes[1].childNodes[0].nodeValue;
		var attributeValue =personAttributeElements[i].childNodes[2].value
		surveyResultsDiv.innerHTML += attributeKey+": "+attributeValue+"<br />";
		message += attributeKey+": "+attributeValue+" \n"
	}
}

