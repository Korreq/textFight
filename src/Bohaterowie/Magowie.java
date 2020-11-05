package Bohaterowie;

public class Magowie implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Mag";
    }





    public void m1(){

        klasa();
        name("Darek");
        runy.fire();

    }


}
