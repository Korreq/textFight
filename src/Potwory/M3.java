package Potwory;

import Klasy.Heroes;

abstract class M3 implements Monster, Heroes {


    public int hp() {
        return 50;
    }

    public int ATK() {
        return 34;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}