public interface Heroes {

    int hp();
    int dex();
    int armor();
    boolean mage();

}

class Warrior implements Heroes{

    public int hp(){
        return 30;
    }
    public int dex(){
        return 0;
    }
    public int armor(){
        return 15;
    }
    public boolean mage(){
        return false;
    }


}

class Rouge implements Heroes{

    public int hp(){
        return 0;
    }
    public int dex(){
        return 10;
    }
    public int armor(){

    }
    public boolean mage(){
        return false;
    }


}

class Bard implements Heroes{

    public int hp(){
        return 0;
    }
    public int dex(){}
    public int armor(){}
    public boolean mage(){
        return false;
    }

}

class Paladyn implements Heroes{

    public int hp(){
        return 25;
    }
    public int dex(){
        return 0;
    }
    public int armor(){
        return 10;
    }
    public boolean mage(){
        return true;
    }

}

class Mage implements Heroes{

    public int hp(){
        return 0;
    }
    public int dex(){}
    public int armor(){}
    public boolean mage(){
        return true;
    };

}

class Cleric implements Heroes{

    public int hp(){
        return 0;
    }
    public int dex(){}
    public int armor(){}
    public boolean mage(){
        return true;
    };

}