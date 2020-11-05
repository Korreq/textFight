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





    public void m1(){

        klasa();
        name("Darek");
        runy.fire();
    }

    public void m2(){

        klasa();
        name("Darionha");
        runy.wind();
    }



}
