package Potwory;

import Klasy.Heroes;

public class Potwory extends Heroes
{
    public Potwory(String name,int maxhp,int atk,int dex,int armor,boolean mage,String status)
    {
        this.name = name;
        this.maxhp = maxhp;
        this.hp = maxhp;
        this.atk = atk;
        this.dex = dex;
        this.armor= armor;
        this.mage = mage;
        if(mage){
            if(name.equals("B1")){
                type = "fire";
            }
            else{
                type = "thunder";
            }
        }
        this.status = status;
    }
    public String toString() { return name;}
}
