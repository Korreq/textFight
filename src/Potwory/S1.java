package Potwory;

import Klasy.Heroes;

abstract class S1 implements Monster, Heroes {

    public int hp() {
        return 25;
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
