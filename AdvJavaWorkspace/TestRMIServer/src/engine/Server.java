package engine;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


import compute.Compute;

public class Server {
	public static void main(String[] args) {
		
//		use server.policy for execution 
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}		
		
		try {
//			remote object id is Compute
			String name = "Compute";
			
//			object of Remote interface implementation is created and 
			Compute engine = new ComputeEngine();			
			
//			exportObject() method exports the supplied remote object so that it can 
//			receive invocations of its remote methods from remote clients.
			
			Compute stub = (Compute) UnicastRemoteObject
					.exportObject(engine, 0);
			
			Registry registry = LocateRegistry.getRegistry(args[0]);
			
			System.out.println("------------------------------------------------");
			
//			Dynamic proxy pattern
//			To make stub implementation of Compute (i.e. ComputeEngine) network accessible,
//			don't forget to set system property- java.rmi.server.codebase	[refer notes in readme.txt)
			registry.rebind(name, stub);
//			registry.bind(name, stub);
			
			
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("CodeBase "+ System.getProperty("java.rmi.server.codebase"));			
			System.out.println("ComputeEngine bound");
		} catch (Exception e) {
			System.err.println("ComputeEngine exception:");
			e.printStackTrace();
		}
	}
}
