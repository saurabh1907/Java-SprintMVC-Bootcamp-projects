package com.seed.server;

import java.rmi.RemoteException;

import com.seed.specs.GreetingRemote;

public class GreetingRemoteImpl implements GreetingRemote{
	@Override
	public String greet() throws RemoteException {
		return "Hello, world!";
	}
}
