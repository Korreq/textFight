package Potwory;

import Klasy.Heroes;

abstract class L3 extends Heroes implements Monster {

    public int hp() {
        return 40;
    }

    public int ATK() {
        return 43;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}
