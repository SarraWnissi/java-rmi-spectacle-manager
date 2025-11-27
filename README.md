# java-rmi-spectacle-manager

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![RMI](https://img.shields.io/badge/RMI-Remote%20Method%20Invocation-brightgreen)](https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/)


---

## 📝 Énoncé du projet

### Partie client du Gestionnaire du Spectacle
Il est à vous maintenant de compléter le TP en créant les **classes et interfaces nécessaires**.  
Vous devez **sérialiser votre objet** à envoyer par RMI.

### Partie serveur du Gestionnaire du Spectacle
1. **Écrire une interface distante `InterfaceSpectacle`** qui définit deux méthodes et qui étend `java.rmi.Remote` :

   a. `int consulter(int id)` :  
   Cette méthode permet de passer en paramètre l’ID d’un spectacle au serveur et de retourner le nombre de places disponibles.

   b. `String reserver(int id)` :  
   Cette méthode permet de passer en paramètre l’ID d’un spectacle et de retourner un message `"succès"` si la réservation est réussie, `"échec"` sinon.

2. **Écrire la classe `GestionnaireSpectacle`** qui implémente les méthodes de l’interface précédente et qui étend `java.rmi.server.UnicastRemoteObject`.  
   - Ajouter un `ArrayList` statique et global contenant tous les spectacles proposés par le serveur.

3. **Écrire une classe `Enregistrement`** avec une méthode `main` qui enregistre l’objet `GestionnaireSpectacle` dans le registre RMI.

   
## 🚀 Description

**java-rmi-spectacle-manager** est un projet Java démontrant l’utilisation de **RMI** pour créer un gestionnaire de spectacles.  
Il permet de consulter les places disponibles et de réserver des spectacles depuis un client Java.


## 📌 Fonctionnalités

- **Consultation d’un spectacle** : Retourne le nombre de places disponibles pour un spectacle donné.  
- **Réservation de places** : Réserve un spectacle et renvoie un message `"succès"` ou `"échec"`.  
- **Gestion centralisée côté serveur** : Liste globale de tous les spectacles disponibles.  
- **Communication via RMI** : Sérialisation et transmission des objets entre client et serveur.

