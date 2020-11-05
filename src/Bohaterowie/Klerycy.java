package Bohaterowie;

import Klasy.Cleric;

public class Klerycy extends Cleric implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Kleryk";
    }





    public void c1(){

        klasa();
        name("Ezekiel");
        runy.steel();

    }

    public void c2(){

        klasa();
        name("Algird ");
        runy.water();

    }






}
