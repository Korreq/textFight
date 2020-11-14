package Bohaterowie;

import Klasy.Heroes;
import Klasy.KlasyBohaterów;


public class Bohaterowie extends Heroes {

    KlasyBohaterów heroClass = new KlasyBohaterów();
    public void classes(String klasa)
    {
        switch (klasa)
        {
            case "Wojownik"-> heroClass.warrior();
            case "Paladyn"-> heroClass.paladin();
            case "Łotrzyk"-> heroClass.rouge();
            case "Bard"-> heroClass.bard();
            case "Mag"-> heroClass.mage();
            case "Kapłan"->heroClass.cleric();
            default-> System.out.println("to nie klasa");


        }



    }


    public Bohaterowie(String name,String klasa,String type,int maxhp,int dex,int armor,int atk,boolean mage,String lit,String status){
        this.name = name;
        this.klasa = klasa;
        if(klasa.equals("Paladyn")) {
            this.maxhp = (int) (1.2*maxhp);
            this.hp = (int) (1.2*maxhp);
        }
        else
        {
            this.maxhp = maxhp;
            this.hp = maxhp;
        }
        this.dex = dex;
        this.armor= armor;


        if(type.equals("flint"))
        {
            this.atk = (int)(1.5 * atk);
        }
        else{
            this.atk = atk;
        }

        this.mage = mage;
        this.lit = lit;
        this.type = type;
        if(mage)
        {if(klasa.equals("Paladyn"))
        {
            this.pktmagii = 6;
        }
        else
        {
            this.pktmagii = 9;
        }}
        else
        {this.pktmagii = 0;}
        classes(klasa);
        this.status = status;
        this.NRMaga = NRMaga;
    }

    public int getDex() {
        return dex;
    }

    public String toString() { return name+" "+klasa;}

}
