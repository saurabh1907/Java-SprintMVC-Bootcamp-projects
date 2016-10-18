Title:
------------

Objects in JAVAScript

(
	Ref: Head First JAVAScript
	Chapter#10 Creating custom objects
) 

Notes:
--------

In JAVAScript, instance methods can be owned by an instance or by the class.

we saw in HFJ-9,
method is created in custom object by assigning function literal to a method reference. 
containsText method is owned by instance, so it will be duplicated in each instance of Blog. 
 
 		function Blog(body){
 			this.body = body;
 			
 			//	containsText is a method of Blog object
 			this.containsText = function(text){
				return this.body.indexOf(text) != -1; 			
 			}
 		} 
 		
The prototype object is a hidden object that exists in every object as a property.
It allows you to set properties and methods that are owned at the class level. 		
 
 ABOVE CODE CAN BE REWRITTEN TO MAKE containsText() OWNED BY THE CLASS.
 Now, all instances of Blog class will share containsText() method, so it won't be duplicated in each instance of Blog.
 
 		function Blog(body){
 			this.body = body;
 		}	// end of constructor
 		
 		//	containsText is a method of Blog object
 		Blog.prototype.containsText = function(text){
 			return this.body.indexOf(text) != -1; 			
 		}
 		
class properties are owned by class, not by any instance. So there's a single copy available to all instances.   
class properties have to be accessed through an instance (?????)

 		function Blog(body){
 			this.body = body;
 		}	// end of constructor
 		
		Blog.prototype.signature = "Puzzler Ruby";		
 		
The prototype object allows you to extend built-in JAVAScript object.
Built-in object String can be extended this way

			String.prototype.scramble = function(){
				// return scrambled String
			}  		
 		
 			// call it on signature which is type of String
 			alert(this.signature.scramble);
 		
JAVAScript supports creating class method, which is a method owned by a class that cannot access instance properties.

		Blog.showSignature = function(){
			alert("This blog created by "+ Blog.prototype.signature);
		}

Constructor overloading is not allowed in JAVAScript. 





  		
 		
 
 
  