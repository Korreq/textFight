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





    public void w1(){

       klasa();
       name("Albert");
       runy.wolf();
    }

    public void w2(){

        klasa();
        name("Zabiast");
        runy.water();
    }








}
