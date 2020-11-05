package Potwory;

import Klasy.Heroes;

abstract class L1 implements Monster, Heroes {

    public int hp() {
        return 20;
    }

    public int ATK() {
        return 31;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}
