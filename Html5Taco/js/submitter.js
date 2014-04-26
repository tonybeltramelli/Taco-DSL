var formData = new FormData();
var questionDict = {};
var message;

function submitForm(element) {
	for(w=0 ; w < element.length ; w++) {	
	
		if(element[w].parentNode.className == "subquestions")continue;
	
		var questionInnerElements = element[w].getElementsByClassName("text");	
		var questionText = questionInnerElements[0].childNodes[0].data;
		var answerInnerElements = element[w].getElementsByClassName("answer");
		if(element[w].parentNode.parentNode.parentNode.className == "subquestions" || 
		   element[w].parentNode.parentNode.parentNode.parentNode.className == "subquestions" ||
		   element[w].parentNode.parentNode.parentNode.parentNode.parentNode.className == "subquestions")continue;
		
		getData(questionText, answerInnerElements);
	}	
	
	//Render results on final page
	//var targetDiv = document.getElementById("surveyResults")
	var surveyResultsDiv = document.createElement("div")
	var targetDiv = document.getElementById("final_message")
	surveyResultsDiv.innerHTML += "<h3 id='testt'>Survey Results</h3><br />"
	for(var propName in questionDict) {
		var propValue = questionDict[propName];
		surveyResultsDiv.innerHTML += "<div>Q: "+propName+"  A: "+propValue+ "</div><br />";
		message += "Q: "+propName+"  A: "+propValue+" \n";
	}
	targetDiv.appendChild(surveyResultsDiv)
	
	//Send email
	var	companyEmail = document.getElementById("Email").value
	var email = encodeURIComponent(companyEmail)
	var subject = "Taco Surveys* Your survey results"
	var from = "Taco Surveys Inc."
		
	var xhr = new XMLHttpRequest();
	xhr.open("GET", "http://projectdee.com/EmailController.php?sendTo="+email+"&subject="+subject+"&message="+encodeURIComponent(message)+"&from="+from, true);  
	xhr.send();
	alert("The survey has been submitted to "+companyEmail);
}
	
    

function getData(questionText, answerInnerElements) {
	
	var answerClassname = answerInnerElements[0].className.split(' ')[1]
	
	switch (answerClassname)
	{	
	case "openFieldAnswer":
	case "ratingAnswer":
		var answer = answerInnerElements[0].value
		formData.append(questionText, answer);
		questionDict[questionText] = [answer];
		var subQuestionObj = checkForSubQuestion(answerInnerElements[0], answer)
		if(subQuestionObj){
			getData(subQuestionObj[0], subQuestionObj[1])					
		}
		break;

	case "multipleChoiceAnswer":
		var answersChecked = [];
		for(x=0 ; x < answerInnerElements.length ; x++) {
			if(answerInnerElements[x].checked){
				if(answerInnerElements[x].value === "Other"){
					var answer = answerInnerElements[x].parentNode.parentNode.childNodes[3].value
					answersChecked.push(answer);	
					questionDict[questionText] = [answersChecked];
				}else{
					var answer = answerInnerElements[x].value								
					answersChecked.push(answer);
					questionDict[questionText] = [answersChecked];
					var subQuestionObj = checkForSubQuestion(answerInnerElements[x], answer)
					if(subQuestionObj){
						getData(subQuestionObj[0], subQuestionObj[1])					
					}
				}
			}			
		}
		break;
	
	case "mutuallyExcAnswer":
		for(z=0 ; z < answerInnerElements.length ; z++) {				
			if(answerInnerElements[z].checked == true){
				if(answerInnerElements[z].value === "Other"){
					var answer = answerInnerElements[z].parentNode.parentNode.childNodes[3].value
					questionDict[questionText] = [answer];
				}else{
					var answer = answerInnerElements[z].value
					questionDict[questionText] = [answer];
					var subQuestionObj = checkForSubQuestion(answerInnerElements[z], answer)
					if(subQuestionObj){
						getData(subQuestionObj[0], subQuestionObj[1])					
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
		questionDict[questionText] = [rankedArray];
		break;		
	}
}	


function checkForSubQuestion(element, sourceAnswer) {

	//var elementsToCheck = element.parentNode.parentNode.getElementsByClassName("subquestion")
	var elementsToCheck = element.parentNode.parentNode.getElementsByClassName("subquestions")	
	if(elementsToCheck.length == 0){return;}
	elementsToCheck = elementsToCheck[0].getElementsByClassName("question")
	//alert("elementsToCheck: "+elementsToCheck[0].innerHTML)
	for(i=0 ; i < elementsToCheck.length ; i++) {
		var subQuestionInnerElements = elementsToCheck[i].getElementsByClassName("text");	
		var subQuestionText = "SubQ for "+sourceAnswer+": "+subQuestionInnerElements[0].childNodes[0].data					
		var subAnswerInnerElements = elementsToCheck[i].getElementsByClassName("answer");
		if(elementsToCheck[i].parentNode.parentNode.parentNode.className == "subquestions" || 
		   elementsToCheck[i].parentNode.parentNode.parentNode.parentNode.className == "subquestions" ||
		   elementsToCheck[i].parentNode.parentNode.parentNode.parentNode.parentNode.className == "subquestions")continue;
		return[subQuestionText, subAnswerInnerElements]
	}
}