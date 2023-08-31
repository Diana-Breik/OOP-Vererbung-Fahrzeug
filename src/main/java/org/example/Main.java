package org.example;

public class Main {
    public static void main(String[] args) {

        //Installieren der Infos der Fahrzeuge und sie ausgeben.
        Fahrzeug fahrzeug1 = new Fahrzeug("AA","AA",2015);
        System.out.println(fahrzeug1);
        Auto auto1 = new Auto("BB","BB",2020,4);
        System.out.println(auto1);
        Motorrad motorrad1 = new Motorrad("CC","CC",2020,"Sportbike");
        System.out.println(motorrad1);
        /*motorrad1.modell ="xxx";
        System.out.println(motorrad1);*/

        System.out.println("--------------------^-^-----------------------");

        // Vergleichen zwischen 2 Autos also die Objekte auto1 und auto2, mithilfe der Methode equals()
        Auto auto2 = new Auto("BB","BB",2020,4);
        System.out.println("Q: Sind die beiden Autos gleich?");
        if(auto1.equals(auto2)){
            System.out.println("A: Jaa, sie sind gleich :)");
        }
        else {
            System.out.println("A: Nein, sie sind verschieden :)");
        }
        ;
    }
}