Title:
------------

DOM in JAVAScript

(
	Ref: Head First JAVAScript
	Chapter#8	Wrangling the page
) 

Notes:
--------

JAVAScript supports complex data type in the form of custom objects.
Custom object contains properties(data) and methods(actions).

template (class definition) can be created by writing a special method called constructor.
Every custom object requires its own constructor, which is named the same as object.
this is a JAVAScript keyword used to refer to an object.
Object properties are created and initialized in a constructor by using object notation(the dot operator) and this keyowrd. 
		
		function Invitation(who, what, when, where){
		
		// this.who is a property
		// who is a local variable
			this.who = who;
			
			this.what = what;
			this.when = when;
			this.where = where;	
		}

new operator is used to create an object.

		var invitation = new Invitation("Somebody","something","sometime","somewhere");

object can contain other objects.

		var blogEntry = new Blog("Nothing going on ...",new Date("10,31,2008")); 

Arrays in JAVA are treated as object. there's a method named sort() to sort the data in an array.
custom comparison function can be passed to an array to change the behavior of sort.

		var nums = {51,11,34,29};
		// default sort behavior
		nums.sort();
		
		//custom comparison function; 
		//return value of a function is a number that determines sort order of x as compared to y
		function compare(x,y){
			return x -y;
		}
		
		//inject custom sort behavior by passing reference of compare() into sort()
		nums.sort(compare);

ABOVE CODE CAN BE MADE SIMPLE WITH FUNCTION LITERALS

		var nums = {51,11,34,29};
		// default sort behavior
		nums.sort();

		//inject custom sort behavior by passing function literal directly into sort()
		nums.sort(function(x,y){
			return x - y;
		});
 
method is created in custom object by assigning function literal to a method reference
 
 		function Blog(body){
 			this.body = body;
 			
 			//	containsText is a method of Blog object
 			this.containsText = function(text){
				return this.body.indexOf(text) != -1; 			
 			}
 		} 
 
String is built-in object with methods like substring(),charAt(),toLowerCase(),toUpperCase(),indexOf() etc.
Math object is an organizational object which contains utility methods like round(), ceiling(), floor() etc and constants like PI.