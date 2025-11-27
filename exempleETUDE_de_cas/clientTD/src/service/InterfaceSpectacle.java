package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceSpectacle extends Remote {

    public int consulter(int id) throws RemoteException;

    public String reserver(int id) throws RemoteException;
}
