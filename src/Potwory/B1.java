package Potwory;

import Klasy.Heroes;
import Runy.Runy;

abstract class B1 extends Runy implements Monster, Heroes {


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

    public void thunder() {
        super.thunder();
    }
}
