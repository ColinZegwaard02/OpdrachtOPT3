package com.company;

import java.util.ArrayList;

class Manager extends Medewerker
{
    private static Manager manager;

    private Manager(String naam, double salaris, ArrayList<Product> vult)
    {
        super(naam, salaris, vult);
    }

    public static Manager getInstance()
    {
        return manager;
    }

    @Override
    public ArrayList<String> taak() {
        String taak1 = "Promotie plekken opbouwen";
        String taak2 = "Producten bestellen";

        ArrayList<String> taken = new ArrayList<>();
        taken.add(taak1);
        taken.add(taak2);

        return taken;
    }
}