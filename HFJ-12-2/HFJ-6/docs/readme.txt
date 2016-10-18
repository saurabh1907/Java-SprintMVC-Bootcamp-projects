Title:
------------

Functions

(
	Ref: Head First JAVAScript
	Chapter#6	Functions
) 

Notes:
--------

THIS IS HOW YOU WRITE A FUNCTION

	function + name + ( ) + {
		body
	} 

e.g. 	function heat(){
			// do something
		}

	function + name + (Arguments) + {
		body
	} 
	
e.g. 	function heat(targetTemp){
			// do something
			alert(targetTemp);
		}
		
JAVAScript supports call-by-value.
Objects as arguments will be discussed in details later  (HFJ-10 -- project name for reference).		
	
	
when a function body appears by itself without a name, it is known as a function literal.

THIS FUNCTION

	function showSeatStatus(seatNum) {
		alert("This seat is " + getSeatStatus(seatNum) + ".");
	}
	
CAN BE REWRITTEN USING FUNCTION LITERAL LIKE THIS

	var showSeatStatus = function(seatNum){
										alert("This seat is " + getSeatStatus(seatNum) + ".");
									}

	var myShowSeatStatus =  showSeatStatus;
	
	// myShowSeatStatus and showSeatStatus are known as function reference
	
	// funtion call can be made using function reference by suffixing parentheses
	
	myShowSeatStatus(23);

So we can say a function is just a variable whose value is a reference to a function body.s

function references provide a convenient way to wire event handler functions to events.
this allows us to cleanly separate JAVAScript code from HTML code.

THIS HTML CODE

	<body onload="initSeats()">
	
CAN BE REWRITTEN IN JAVASCRIPT AS

	window.onload = initSeats;
	
You can't pass arguments to function reference.
So we need to use function literals to create anonymous event handlers

THIS HTML CODE

	<img id="seat23" src="" alt="" onclick="showSeatStatus(23);" />	

CAN BE REWRITTEN IN JAVASCRIPT AS

		document.getElementById("seat23").onclick = function(evt) {
			showSeatStatus(23);
		};

		evt is an event object that is automatically passed to an event handler as first argument (needs to be validated)

the onload event handler is a place where wiring of all events in a page is done.

	// Wire the events
	window.onload = function() {
		// Wire the Find Seat button event
		document.getElementById("findseats").onclick = findSeats;
 	}


 

