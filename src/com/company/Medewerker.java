package com.company;

import java.util.ArrayList;

abstract class Medewerker
{
    private String naam;
    private double uurLoon;
    private ArrayList<Product> vult;

    public Medewerker(String naam, double salaris, ArrayList<Product> vult)
    {
        this.naam = naam;
        this.uurLoon = salaris;
        this.vult = vult;
    }
    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getUurLoon()
    {
        return uurLoon;
    }

    public void setUurLoon(double uurLoon)
    {
        this.uurLoon = uurLoon;
    }

    public ArrayList<Product> getVult()
    {
        return vult;
    }

    public void setVult(ArrayList<Product> vult)
    {
        this.vult = vult;
    }

    public abstract ArrayList<String> taak();
}