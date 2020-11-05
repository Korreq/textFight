package Bohaterowie;

public class Rabusie implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Rabuś";
    }





    public void r1(){

        klasa();
        name("Robert");
        runy.flint();

    }



}
