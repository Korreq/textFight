package Bohaterowie;

import Klasy.Heroes;
import Runy.Runy;

public class Bohaterowie extends Heroes {
    Runy runy = new Runy();




    public Bohaterowie(String name,String klasa,int maxhp,int hp,int dex,int armor,boolean mage){
        this.name = name;
        this.klasa = klasa;
        this.maxhp = maxhp;
        this.hp = hp;
        this.dex = dex;
        this.armor= armor;
        this.mage = mage;

    }
      public String toString() { return name+" "+klasa;}

}
