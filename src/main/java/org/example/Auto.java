package org.example;

import java.util.Objects;

public class Auto extends Fahrzeug{
    protected int anzahlTüren;

    public Auto(){

    }
    public Auto(int anzahlTüren) {
        super();
        this.anzahlTüren = anzahlTüren;
    }

    public Auto(String hersteller, String modell, int baujahr, int anzahlTüren) {
        super(hersteller, modell, baujahr);
        this.anzahlTüren = anzahlTüren;
    }

    public int getAnzahlTüren() {
        return anzahlTüren;
    }

    public void setAnzahlTüren(int anzahlTüren) {
        this.anzahlTüren = anzahlTüren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return anzahlTüren == auto.anzahlTüren;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), anzahlTüren);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "anzahlTüren=" + anzahlTüren +
                ", hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
