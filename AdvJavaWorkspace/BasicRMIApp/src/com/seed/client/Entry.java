package com.seed.client;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.seed.specs.GreetingRemote;

public class Entry {
	public static void main(String[] args) {
		try {
			String name = "Greeting";
			Registry registry = LocateRegistry.getRegistry();
			GreetingRemote stub = (GreetingRemote) registry.lookup(name);
			
			System.out.println("Stub ref: "+ stub);

			String message = stub.greet();
			
			System.out.println("Message from server: "+ message);
		} catch (AccessException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}	
