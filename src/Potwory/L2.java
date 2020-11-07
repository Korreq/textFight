package Potwory;

import Klasy.Heroes;

abstract class L2 extends Heroes implements Monster {

    public int hp() {
        return 30;
    }

    public int ATK() {
        return 37;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}
