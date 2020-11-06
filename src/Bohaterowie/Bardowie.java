package Bohaterowie;

import Klasy.Bard;

public class Bardowie extends Bard implements Characters{

    public

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        System.out.println(imie);
        return imie;
    }
    public String klasa(){
        System.out.println("Bard");
        return "Bard";
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





    public void b1(){
        klasa();
        name("Jan");
        runy.flint();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }

    public void b2(){
        klasa();
        name("Włodziu");
        runy.earth();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }



}
