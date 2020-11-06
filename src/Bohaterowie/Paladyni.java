package Bohaterowie;

import Klasy.Paladyn;

public class Paladyni extends Paladyn implements Characters{

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Paladyn";
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




    public void p1(){

        klasa();
        name("Robert");
        runy.steel();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));

    }

    public void p2(){

        klasa();
        name("Kresul ");
        runy.light();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }





}
