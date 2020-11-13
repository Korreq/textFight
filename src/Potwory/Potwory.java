package Potwory;

import Klasy.Heroes;

public class Potwory extends Heroes {

    public Potwory(String name,int maxhp,int atk,int dex,int armor,boolean mage,String status){
        this.name = name;
        this.maxhp = maxhp;
        this.hp = maxhp;
        this.atk = atk;
        this.dex = dex;
        this.armor= armor;
        this.mage = mage;
        this.status = status;
        this.NRMaga = NRMaga;

    }
    public String toString() { return name;}


}
