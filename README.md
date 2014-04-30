Taco-DSL
========

![Taco DSL survey generator - logo](https://raw.github.com/tonybeltramelli/Taco-DSL/master/TacoDSL/Resources/logo/logo_taco.png)

The Taco domain specific language to generate surveys.  
Model Driven Development Spring 2014 - [IT University of Copenhagen](www.itu.dk/en)

####Target
Code generation for two platforms:
* HTML5 responsive using Bootstrap
* Android application

####Workflow
After creating a .taco file and typing a valid instance in the Eclipse IDE, two files will be generated inside the folder src-gen at the project root. Those files then need to be moved to the relevant platform folder in order to work.

*src-gen/android/Survey.java -> AndroidTaco/src/dk/itu/smdp/model/Survey.java*  
*src-gen/html5/taco.html -> Taco-DSL/Html5Taco/taco.html*

####Usage
(Instance example: dk.itu.smdp.survey.xtext/instance_example/example.taco)

```java

survey "Survey"
date "01/01/2014"
description "Survey example instance."

person "name", "age"

category "Category number 1 about cool stuffs."
	description "Your cool information."
	
	page

		Q "What is your point of view ?"

		Q "What is your favorite color ?" [2-3]
			A "RED"
			A "YELLOW"
			A "BLUE"		
			A "GREEN"
			A "OTHER" [input]
			
		Q* "How much do you like the canteen's coffee ?" [1-10,1]
	
	page
	
		Q* "Select your favorite cat"
			A "First option"
				sub Q "Why?" end
			A "Second option"
				sub Q "What?" [2-2]
					A "Option 1"
					A "Option 2"
				end
			A "Third option"
			A "Fourth option"

		Q "Are you married ?" [y/n]

category "Professioanl information?" 
	description "Your professioanl information"
		
	page
		
		Q "Rate those stuffs by preference order" [rank]
			A "french fries"
			A "smorebrod"
			A "mousaka"
			A "hamburger"
			A "tacos"

		Q* "How much do you like this language ?" [1-10,1] 
		
		Q "What is your favorite identifier ?"

		Q "How often do you use this language ?"
			A "every second"
			A "every hour"
			A "every day"
			A "every week"
			A "every month"
			A "every year"

```