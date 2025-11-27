package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class GestionnaireSpectacle extends UnicastRemoteObject implements InterfaceSpectacle {

    ArrayList<Spectacle> spectacles;

    public GestionnaireSpectacle() throws RemoteException {
        spectacles = new ArrayList<>();

        spectacles.add(new Spectacle(1, "A", 50));
        spectacles.add(new Spectacle(2, "B", 30));
        spectacles.add(new Spectacle(3, "C", 0));
    }

    @Override
    public int consulter(int id) throws RemoteException {
        for (Spectacle s : spectacles) {
            if (s.id == id) {
                return s.places;
            }
        }
        return -1;
    }

    @Override
    public String reserver(int id) throws RemoteException {
        for (Spectacle s : spectacles) {
            if (s.id == id) {
                if (s.places > 0) {
                    s.places--;
                    return "succès";
                }
                return "échec";
            }
        }
        return "introuvable";
    }
}

