Title:
------------

Core JAVAScript Language

(
	Ref: Head First JAVAScript
	Chapter#2	Storing data
) 

Notes:
--------

Variables in JAVAScript can be of basic 3 data types;text, number or boolean.

JAVAScript keyword var is used to create variables.
Data type of a variable is decided by its value.  
But it can be explicit; controlled by programmer. will be discussed in details later (HFJ-6 -- project name for reference).

e.g. 	var numberOfHits;

JAVAScript keyword const is used to create constants

e.g. const TAXRATE;

Some points about using variables

	text can be enclosed within quotes (") or apostrophe(')
	
	To convert text to number use parseInt() and parseFloat()
	
	numbers can be either integer or whole numbers
	
	when numbers and characters are mixed, the data is always considered text.
	
	NaN is a value that isn't a number 
	
	Uninitialized variables/constants doesn't contain default values; they're in a state called UNDEFINED
	Using uninitialized variables/constants is coding error
	
	when web page is loaded, script data gets reset
 
 Rules for identifiers
 
	Identifiers are unique names that identify constants and variables
 
	An identifier must be at least one character in length
	
	The first character in an identifier must be a letter,underscore, or a dollar sign ($)
	
	Each character  after the first character in an identifier can be a letter,underscore, or a dollar sign ($) or a number.
	
	Spaces and special characters other than _ and $ are not allowed in any part of the identifier.
 
 	lower camel case is used to  name multi-word variables
 	
 	constant names should be in ALL CAPS 
 	
 	Use camel case (with the first word CAPITALIZED)for naming Objects. Objects will be discussed in details later.
 	
Data Validations in JAVAScript

	An empty string in a form field means it has no data
	
	isNaN() checks whether the value entered is a number or not
	
	document.getElementById() returns the form filed as a JAVAScript object
	
	