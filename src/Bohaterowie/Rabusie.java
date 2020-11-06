package Bohaterowie;

import Klasy.Rouge;

public class Rabusie extends Rouge implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie) {
        return imie;
    }

    public String klasa() {
        return "Rabuś";
    }





    public int hp(int h) {
        return super.hp() + h;

    }

    public int dex(int d) {
        return super.dex() + d;


    }

    public int armor(int a) {
        return super.armor() + a;

    }




    public void r1(){

        klasa();
        name("Robert");
        runy.flint();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }

    public void r2(){

        klasa();
        name("Twardo ");
        runy.fire();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }




}
