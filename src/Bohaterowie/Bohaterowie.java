package Bohaterowie;

import Klasy.Heroes;
import Klasy.KlasyBohaterów;
import Runy.Runy;

public class Bohaterowie extends Heroes {
    Runy runy = new Runy();
    KlasyBohaterów heroClass = new KlasyBohaterów();
    public void runes(String type)
    {
        switch (type)
        {
            case "fire"-> runy.fire();
            case "water"-> runy.water();
            case "wind"->runy.wind();
            case "earth"-> runy.earth();
            case "thunder"-> runy.thunder();
            case "light"-> runy.light();
            case "blood"-> runy.blood();

            case "steel"-> runy.steel(maxhp);
            case "flint"-> runy.flint();
            case "wolf"-> runy.wolf();

            default-> System.out.println("to nie runa");
        }
    }

    //przygotowane na utworzenie nowej klasy dla klas postaci
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


    public Bohaterowie(String name,String klasa,String type,int maxhp,int hp,int dex,int armor,int m_armor,int atk,boolean mage,String lit){
        this.name = name;
        this.klasa = klasa;
        this.maxhp = maxhp;
        this.hp = hp;
        this.dex = dex;
        this.armor= armor;
        this.m_armor = m_armor;
        this.atk = atk;
        this.mage = mage;
        this.lit = lit;
        runes(type);
        classes(klasa);
    }

    public int getDex() {
        return dex;
    }

    public String toString() { return name+" "+klasa;}

}
