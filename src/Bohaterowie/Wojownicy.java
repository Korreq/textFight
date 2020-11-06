package Bohaterowie;

import Klasy.Warrior;

public class Wojownicy extends Warrior implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Wojownik";
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




    public void w1(){

       klasa();
       name("Albert");
       runy.wolf();
       System.out.println(hp(1));
       System.out.println(dex(-2));
       System.out.println(armor(2));
    }

    public void w2(){

        klasa();
        name("Zabiast");
        runy.water();
        System.out.println(hp(1));
        System.out.println(dex(-2));
        System.out.println(armor(2));
    }








}
