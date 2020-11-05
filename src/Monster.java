import Runy.Runy;

public interface Monster {
    int Hp();
    int ATK();
    int Def();
    int Mdef();
}

class L1 implements Monster
{

    public int Hp() {
        return 20;
    }

    public int ATK() {
        return 31;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class S1 implements Monster
{

    public int Hp() {
        return 25;
    }

    public int ATK() {
        return 21;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class M1 implements Monster
{


    public int Hp() {
        return 20;
    }

    public int ATK() {
        return 21;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class L2 implements Monster
{

    public int Hp() {
        return 30;
    }

    public int ATK() {
        return 37;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class S2 implements Monster
{

    public int Hp() {
        return 40;
    }

    public int ATK() {
        return 27;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class M2 implements Monster
{


    public int Hp() {
        return 35;
    }

    public int ATK() {
        return 27;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class L3 implements Monster
{

    public int Hp() {
        return 40;
    }

    public int ATK() {
        return 43;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class S3 implements Monster
{

    public int Hp() {
        return 55;
    }

    public int ATK() {
        return 34;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

class M3 implements Monster
{


    public int Hp() {
        return 50;
    }

    public int ATK() {
        return 34;
    }

    public int Def() {
        return 0;
    }

    public int Mdef() {
        return 0;
    }
}

abstract class B1 extends Runy implements Monster,Heroes
{


    public int Hp() {
        return 150;
    }

    public int ATK() {
        return 31;
    }

    public int Def() {
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


    public int Hp() {
        return 250;
    }

    public int ATK() {
        return 41;
    }

    public int Def() {
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