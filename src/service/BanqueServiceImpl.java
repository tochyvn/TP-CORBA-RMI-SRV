package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

@SuppressWarnings("serial")
public class BanqueServiceImpl extends UnicastRemoteObject implements IBanqueRemote {

	protected BanqueServiceImpl() throws RemoteException {
		super();
		
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		return 11 * mt;
	}

	@Override
	public Date getServerDate() throws RemoteException {
		return new Date();
	}

}
