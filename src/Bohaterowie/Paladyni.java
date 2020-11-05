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





    public void p1(){

        klasa();
        name("Robert");
        runy.steel();
    }

    public void p2(){

        klasa();
        name("Kresul ");
        runy.light();
    }





}
