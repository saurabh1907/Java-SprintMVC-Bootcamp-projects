package engine;

import java.rmi.RemoteException;

import compute.Compute;
import compute.Task;

public class ComputeEngine implements Compute {
 
    public ComputeEngine() {
    }
 
//	implementation of remote method
 
    public <T> T executeTask(Task<T> arg0) throws RemoteException {
    	// TODO Auto-generated method stub
    	return arg0.execute();
    }
   
}