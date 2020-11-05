package Bohaterowie;

import Klasy.Rouge;

public class Rabusie extends Rouge implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Rabuś";
    }





    public void r1(){

        klasa();
        name("Robert");
        runy.flint();

    }

    public void r2(){

        klasa();
        name("Twardo ");
        runy.fire();

    }




}
