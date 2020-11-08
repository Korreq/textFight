package Walka;

public class WalkaB {

    int hp1;
    int hp2;
    int maxHP = 50;
    int dmgTaken;

    public int atak(int min, int max) {
        return dmgTaken = (int) ((Math.random() * (max - min)) + min);
    }

    public int getHp1() {
        return hp1 = maxHP - dmgTaken;
    }

    public int getHp2() {
        return hp2 = hp1 - dmgTaken;
    }

}
