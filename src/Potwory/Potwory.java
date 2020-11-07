package Potwory;

import Klasy.Heroes;

public class Potwory extends Heroes {

    public Potwory(String name,int hp,int dex,int armor,boolean mage){
        this.name = name;
        this.hp = hp;
        this.dex = dex;
        this.armor= armor;
        this.mage = mage;

    }
    public String toString() { return name;}


}
