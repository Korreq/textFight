package Bohaterowie;

import Klasy.Heroes;
import Runy.Runy;

public class Bohaterowie extends Heroes {
    Runy runy = new Runy();

    public void runes(String type)
    {
        switch (type)
        {

            case "fire"->{
            runy.fire();
            }
            case "water"->{
            runy.water();
            }
            case "wind"->{
                runy.wind();
            }
            case "earth"->{
                runy.earth();
            }
            case "thunder"->{
                runy.thunder();
            }
            case "light"->{
                runy.light();
            }
            case "blood"->{
                runy.blood();
            }
            case "steel"->{
                runy.steel();
            }
            case "flint"->{
                runy.flint();
            }
            case "wolf"->{
                runy.wolf();
            }


            default-> System.out.println("to nie runa");
        }


    }


    public Bohaterowie(String name,String klasa,String type,int maxhp,int hp,int dex,int armor,boolean mage){
        this.name = name;
        this.klasa = klasa;
        this.maxhp = maxhp;
        this.hp = hp;
        this.dex = dex;
        this.armor= armor;
        this.mage = mage;
        runes(type);
    }

      public String toString() { return name+" "+klasa;}

}
