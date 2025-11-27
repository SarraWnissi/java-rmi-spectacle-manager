package com.exemple.client;

import service.InterfaceSpectacle;

import java.rmi.Naming;

public class ClientSpectacle {
    public static void main(String[] args) {

        try {
            InterfaceSpectacle stub =
                    (InterfaceSpectacle) Naming.lookup("rmi://localhost:1099/GS");

            System.out.println("Places : " + stub.consulter(1));
            System.out.println("Réservation : " + stub.reserver(1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}