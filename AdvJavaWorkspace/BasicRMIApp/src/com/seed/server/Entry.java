package com.seed.server;

import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.seed.specs.GreetingRemote;

public class Entry {
	public static void main(String[] args) {
//		remote object id is Greeting
		String name = "Greeting";
		
		GreetingRemote remote = new GreetingRemoteImpl();
		
//		exportObject() method exports the supplied remote object so that it can 
//		receive invocations of its remote methods from remote clients.
		
		try {
			GreetingRemote stub = (GreetingRemote) UnicastRemoteObject
					.exportObject(remote, 0);
			
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(name, stub);
			
			System.out.println("GreetingRemote now bound!");
			System.out.println("Ready to receive client requests....");
		} catch (AccessException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
	}
}
