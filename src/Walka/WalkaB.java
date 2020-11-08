package Walka;

public class WalkaB {

    int hp;
    int maxHP = 50;

    public int atak(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public int getHp() {
        return (int) maxHP;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
