package hansung.designpatterns.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	protected MyRemoteImpl() throws RemoteException {}

	public String sayHello() throws RemoteException {
		return "Server syas, 'Hey'";
	}
	
	public static void main(String[] args) {
		try{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
