package Bohaterowie;

import Klasy.Mage;

public class Magowie extends Mage implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Mag";
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




    public void m1(){

        klasa();
        name("Darek");
        runy.fire();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }

    public void m2(){

        klasa();
        name("Darionha");
        runy.wind();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }



}
