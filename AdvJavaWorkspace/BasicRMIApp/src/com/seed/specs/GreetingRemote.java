package com.seed.specs;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GreetingRemote extends Remote{
	public String greet() throws RemoteException;
}
