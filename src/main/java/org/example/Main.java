package org.example;

public class Main {
    public static void main(String[] args) {
        Fahrzeug fahrzeug1 = new Fahrzeug("AA","AA",2015);
        System.out.println(fahrzeug1);
        Auto auto1 = new Auto("BB","BB",2020,4);
        System.out.println(auto1);
        Motorrad motorrad1 = new Motorrad("CC","CC",2020,"Sportbike");
        System.out.println(motorrad1);
        /*motorrad1.modell ="xxx";
        System.out.println(motorrad1);*/
    }
}