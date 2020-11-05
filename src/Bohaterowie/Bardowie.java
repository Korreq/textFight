package Bohaterowie;

public class Bardowie implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Bard";
    }





    public void b1(){

        klasa();
        name("Robert");
        runy.flint();

    }




}
