package service;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface InterfaceSpectacle extends Remote{


    int consulter(int id) throws RemoteException;

    String reserver(int id) throws RemoteException;}


