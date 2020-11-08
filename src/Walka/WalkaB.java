package Walka;

public class WalkaB {

    int hp1 = 50;
    int hp2;
    //int maxHP = 50;
    int dmgTaken;

    public int atak(int min, int max) {
        return dmgTaken = (int) ((Math.random() * (max - min)) + min);
    }

    public int getHp1(int maxHP) {

        maxHP = hp1;
        return hp1 = maxHP - dmgTaken;

    }


}
