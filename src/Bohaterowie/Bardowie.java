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





    public void b1(){
        klasa();
        name("Jan");
        runy.flint();
    }

    public void b2(){
        klasa();
        name("Włodziu");
        runy.earth();
    }



}
