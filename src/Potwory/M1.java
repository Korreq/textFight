package Potwory;

import Klasy.Heroes;

abstract class M1 extends Heroes implements Monster {


    public int hp() {
        return 20;
    }

    public int ATK() {
        return 21;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}
