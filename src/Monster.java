import Runy.Runy;

public interface Monster {
    int ATK();
    int Mdef();

}

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

abstract class S1 implements Monster,Heroes
{

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

abstract class M1 implements Monster,Heroes
{


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

abstract class L2 implements Monster,Heroes
{

    public int hp() {
        return 30;
    }

    public int ATK() {
        return 37;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

abstract class S2 implements Monster,Heroes
{

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

abstract class M2 implements Monster,Heroes
{


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

abstract class L3 implements Monster,Heroes
{

    public int hp() {
        return 40;
    }

    public int ATK() {
        return 43;
    }

    public int dex() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

abstract class S3 implements Monster,Heroes
{

    public int hp() {
        return 55;
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

abstract class M3 implements Monster,Heroes
{


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

abstract class B1 extends Runy implements Monster,Heroes
{


    public int hp() {
        return 150;
    }

    public int ATK() {
        return 31;
    }

    public int dex() {
        return 5;
    }

    public int Mdef() {
        return 5;
    }
    
    public  boolean mage(){
        return true;
    }

    public void thunder() {
        super.thunder();
    }
}

abstract class B2 extends Runy implements Monster, Heroes {


    public int hp() {
        return 250;
    }

    public int ATK() {
        return 41;
    }

    public int dex() {
        return 10;
    }

    public int Mdef() {
        return 10;
    }

    public boolean mage() {
        return true;
    }

    public void fire() {
        super.fire();
    }
}