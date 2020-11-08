package Walka;

public class WalkaE extends Walka{

    WalkaB bitewaka = new WalkaB();


    int hp2;
    int maxHP = 50;
    int hp1 = maxHP;
    int dmgTaken;


    public int atak(int min, int max) {
        return dmgTaken = (int) ((Math.random() * (max - min)) + min);
    }

    public int showhp(){

        return hp2 = hp1;

    }


    public int getHp1(int maxHP) {

        maxHP = hp1;// hp1 = 50 = maxHP //
        return hp1 = maxHP - dmgTaken;//hp1 = 50 -dmg


    }

}
