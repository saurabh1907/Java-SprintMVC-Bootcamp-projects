Objective:
------------

To understand RMI protocol.

To create a distributed application that can enable a number of client machines
 to make use of a particularly powerful machine 
or a machine that has specialized hardware.

Modules:
----------

1. engine
	-	This package contains class 'ComputeEngine', which provides implementation of Remote interface 'Compute'.
		
	- 	It also contains class 'Server', which contains main().
		It exports the remote object to make it available to receive incoming calls, using the particular supplied port.
		It associates a name to the remote object in RMI registry.

Things to remember:

1.	When a remote invocation on the registry is made, a stub for the remote object is passed instead of a copy of the remote object itself. 
Remote implementation objects, such as instances of ComputeEngine, never leave the Java virtual machine in which they were created. 
Thus, when a client performs a lookup in a server's remote object registry, a copy of the stub is returned. 
Remote objects in such cases are thus effectively passed by (remote) reference rather than by value.

#To make stub implementation of Compute (i.e. ComputeEngine) network accessible,
don't forget to set system property- java.rmi.server.codebase in above point(5).
#stub will be provided to client dynamically.
#When starting the server, the java.rmi.server.codebase property must be specified, 
#so that the stub class can be dynamically downloaded to the registry and then to the client.

2.	For security reasons, an application can only bind, unbind, or rebind remote object references with a registry running on the same host.





		
How to run:
-------------
Go to command prompt:

0.Change directory to server_project/bin

1.	set JAVA_HOME="c:\Program Files\Java\jdk1.5.0_03"

2.	set path=%JAVA_HOME%/bin

3.	set classpath=../../computeSpecs.jar;.	 	

4.	start rmiregistry -J-Djava.security.policy=./server.policy

5.	java -Djava.security.policy=server.policy -Djava.rmi.server.codebase=http://localhost:8080/BootstrapServerApp/computeSpecs.jar  -Djava.rmi.server.hostname=localhost engine.Server localhost

More about running the application:
------------------------------------------

This server will run on JRE 1.6.
It references User Library RMISpecifications, which contains computeSpecs.jar which is created by project "ComputeSpecifications".
classpath shuld be also set in step 5 , so that Remote interfaces should be available locally also.

setting System properties:

java.security.policy:			code is granted the security permissions it needs to run.

java.rmi.server.hostname:	specifies the host name or address to put in the stubs for remote objects exported in this Java virtual machine. 
										This value is the host name or address used by clients when they attempt to communicate remote method invocations.	

java.rmi.server.codebase: 	It specifies the location, a codebase URL, 
										from which the definitions for classes originating from this server can be downloaded. 

command line arguments:

args[0]:								host name of RMI registry. 
										
										
















