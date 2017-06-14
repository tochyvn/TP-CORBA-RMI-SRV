package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {

	public static void main(String[] args) {
		
		try {
			LocateRegistry.createRegistry(1099);
			IBanqueRemote obj = new BanqueServiceImpl();
			System.out.println(obj.toString());
			Naming.rebind("rmi://localhost:1099/DK", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
