package lab.animals;

import lab.interfaces.IMamifer;

/**
 * Created by CristiaN1 on 11/1/2014.
 * Aceasta este clasa abstracta Animale.
 */
public abstract class Animale implements IMamifer {
    private String denumire;
    private boolean ISdomestic;


    public abstract boolean EDomestic(String denumire);

    protected Animale(String den, boolean ISdomestic) {
        this.denumire = den;
        this.ISdomestic = ISdomestic;
    }

    public void setAnimal(String den, boolean danu) {
        this.denumire = den;
        this.ISdomestic = danu;
    }

    public String getDenumire() {
        return denumire;
    }

    public boolean getISdomestic() {
        return ISdomestic;
    }

 }
