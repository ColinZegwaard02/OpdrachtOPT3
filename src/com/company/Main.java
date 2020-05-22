package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> vers = new ArrayList<>();
        Product Yoghurt = new Zuivel("Campina", 1, "Yoghurt");
        Product Melk = new Zuivel("De Zaanse Hoeve", 2, "Melk");
        vers.add(Yoghurt);
        vers.add(Melk);

        ArrayList<Product> houdbaar = new ArrayList<>();
        Product bonen = new Geconserveerd("Hak", 1, true);
        houdbaar.add(bonen);

        Manager manager = Manager.getInstance();
        houdbaarheidProduct obj = new houdbaarheidProduct();
        System.out.println(obj.getInstance("Kort houdbaar"));
        System.out.println(obj.getInstance("Lang houdbaar"));
    }
}
