package org.example;

import java.util.Objects;

public class Motorrad extends Fahrzeug{
    protected String art;

    public Motorrad(){
        super();
    }
    public Motorrad(String art) {
        super();
        this.art = art;
    }

    public Motorrad(String hersteller, String modell, int baujahr, String art) {
        super(hersteller, modell, baujahr);
        this.art = art;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorrad motorrad = (Motorrad) o;
        return Objects.equals(art, motorrad.art);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), art);
    }

    @Override
    public String toString() {
        return "Motorrad{" +
                "art='" + art + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
