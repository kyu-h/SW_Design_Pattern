package hansung.designpatterns.proxy;

import java.rmi.*;
 
public class GumballMonitorTestDrive {
 
	public static void main(String[] args) {
		String location;
		if (args.length > 0){
            location = "rmi://" + args[0] + "/gumballmachine";
       
            GumballMonitor monitor=null;
			try {
           		GumballMachineRemote machine = 
						(GumballMachineRemote) Naming.lookup(location);
           		monitor = new GumballMonitor(machine);
				System.out.println(monitor);
        	} catch (Exception e) {
            	e.printStackTrace();
        	}
			monitor.report();
		}
	}
}
