package Potwory;

import Klasy.Heroes;

abstract class S2 implements Monster, Heroes {

    public int hp() {
        return 40;
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
