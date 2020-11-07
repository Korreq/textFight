package Potwory;

import Klasy.Heroes;
import Runy.Runy;

abstract class B2 extends Runy implements Monster {


    public int hp() {
        return 250;
    }

    public int ATK() {
        return 41;
    }

    public int dex() {
        return 10;
    }

    public int Mdef() {
        return 10;
    }

    public boolean mage() {
        return true;
    }

}
