package compute;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Compute extends Remote{
//	This is a business method
	<T> T executeTask(Task<T> t) throws RemoteException;
}
