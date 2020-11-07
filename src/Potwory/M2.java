package Potwory;

import Klasy.Heroes;

abstract class M2 extends Heroes implements Monster {


    public int hp() {
        return 35;
    }

    public int ATK() {
        return 27;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}
