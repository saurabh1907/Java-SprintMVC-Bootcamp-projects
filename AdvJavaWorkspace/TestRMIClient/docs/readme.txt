Objective:
------------

To understand RMI protocol.

Modules:
----------

1.	client
	- 	This package contains class 'Pi', which provides implementation that needs to be executed by server, 
		It implements 'Task'.
		
	-	It also contains class 'ComputePi', which contains main().
		It returns the remote reference bound to the specified name in this RMI registry.
		Using this remote reference, which is type of 'Compute',we can execute methods on this remote object.
		
How to run:
-------------		 		 	

Go to command prompt:

0.Change directory to client_project/bin

1. set JAVA_HOME="c:\Program Files\Java\jdk1.6.0_18"
2.set path=%JAVA_HOME%/bin

3.set classpath=../../computeSpecs.jar;.

4.java 
-Djava.security.policy=client.policy 
-Djava.rmi.server.codebase=http://172.16.5.125:8080/BootstrapClientApp/ 
client.ComputePi 
172.16.5.125 
100 	


More about running the application:
------------------------------------------
This server will run on JRE 1.5.

In project's properties  
Go to compiler compliance level. Set to 1.5.
Also in java build path/libraries, 
click 'add library'/JRE System Library/Excecution environment 

It references User Library RMISpecifications, which contains computeSpecs.jar which is created by project "ComputeSpecifications".

setting system properties:

java.rmi.server.codebase		the location where the client serves its classes (the Pi class)

Command line arguments:
	
args[0]:								the host name of the server (so that the client knows where to locate the Compute remote object)
args[1]:								the number of decimal places to use in the pi calculation







	   	