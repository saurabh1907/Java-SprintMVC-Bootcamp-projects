Title:
------------

Forms and validations

(
	Ref: Head First JAVAScript
	Chapter#7	Forms and validations
) 

Notes:
--------

Every form field has form object.
This form object has array that holds all fields of the form.

Items in this array are accessible using unique identifier set in the name attribute; noy using numeric indexes.

In JavaScript

	validateLength(1, 32, form["message"], form["message_help"]
	
In HTML

	<input id="message" name="message"
				type="text" size="32"
				onblur="validateLength(1, 32, this, document.getElementById('message_help'))" 
	/>	
				
Entering data into a form sets off a chain of interesting JavaScript events like onfocus, onblur/onchange,onkeypress,onkeyup.
				
Note: 

onchange won't trigger when a form is loaded even if a user navigates through empty form fields 
it may be used to check whether data is edited. whereas

onblur always gets called every time field loses focus,even if data hasn't changed

Regular expressions is used to match patterns in text a pattern is a description of text that can appear in a string 
but not necessary text itself.

JavaScript provides built-in object RegExp.
It has test() method that is used to test a string for a regular expression pattern

Regular expressions can contain special symbols known as metacharacters
Metacharacters are special symbols used to create highly descriptive text patterns

	\s 			matches a whitespace character
	\d 		matches any numeric digit
	\w 		matches any alphanumeric character
	^ 			string must begin with the pattern
	$ 			string must end with the pattern"
	. 			matches any charcter

Regular expressions always start and end with a forward slash.

e.g.		/^d\d{5}$/

charcters with special meaning can be escaped with a backslash 
e.g 	$ can be specified using \$"

Quantifiers are applied to sub-patterns to control how many times a sub-pattern appears in a pattern

	* 				zero ot many
	+ 				one or many
	? 				Zero or One
	() 				group characters
	{n} 			preceding sub-pattern must appear exactly n times in a row
	{min,max} controls how many times a sub-pattern can appear as a minmum and maximum range
	
Character Class is a set of regular expression rules for matching a single character.
It offers an effiecient way to control optional characters in regular expressions.
They're always enclosed within square brackets [].
It can be used for formulating email pattern for data validation, because there are quite a few variations on the basic email format 

e.g. /d[iu]g/ matches dig and dug


	

				
				
				