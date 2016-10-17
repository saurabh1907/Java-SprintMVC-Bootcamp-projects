Objective:
------------

To understand synchronization in multi-threading.

How to run demo:
----------------------

This project contains 5 applications.

1. This application shows bank account transactions in non-synchronized way.

	java com.seed.unsynch.Test
	----------------------------------
	
2. This application shows bank account transactions in synchronized way using synchronized keyword.		
	
	java com.seed.synchOldWay.Test
	----------------------------------------
	
3. 	This application shows bank account transactions in synchronized way using reentrant lock.

	java com.seed.synch.Test
	-------------------------------
	
4. This application shows condition variables. (Still working on bug)

	java com.seed.synch.intercomm.Test
	---------------------------------------------
	
5. This application shows synchronization with respect to class.
	
	To check class lock, remove comments on line 23 & 28.

	java com.seed.test.classlock.TestSynchWithStatic
	----------------------------------------------------------	 	

Useful Links:
-------------

On volatile...
http://www.ibm.com/developerworks/java/library/j-jtp06197/index.html