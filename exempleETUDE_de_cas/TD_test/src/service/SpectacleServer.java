package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SpectacleServer {
    public static void main(String[] args) {

        try {
            // Démarrer l’annuaire RMI
            LocateRegistry.createRegistry(1099);

            // Créer l’objet serveur
            GestionnaireSpectacle od = new GestionnaireSpectacle();

            // Enregistrer dans RMI Registry
            Naming.rebind("rmi://localhost:1099/GS", od);

            System.out.println("Serveur RMI démarré...");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


