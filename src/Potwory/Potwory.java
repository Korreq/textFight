package Potwory;

import Klasy.Heroes;

public class Potwory extends Heroes {

    public Potwory(String name,int maxhp,int hp,int atk,int dex,int armor,boolean mage){
        this.name = name;
        this.maxhp = maxhp;
        this.hp = hp;
        this.atk = atk;
        this.dex = dex;
        this.armor= armor;
        this.mage = mage;

    }
    public String toString() { return name;}


}
