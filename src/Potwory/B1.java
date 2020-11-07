package Potwory;

import Klasy.Heroes;
import Runy.Runy;

abstract class B1 extends Heroes implements Monster {


    public int hp() {
        return 150;
    }

    public int ATK() {
        return 31;
    }

    public int dex() {
        return 5;
    }

    public int Mdef() {
        return 5;
    }

    public boolean mage() {
        return true;
    }
}
