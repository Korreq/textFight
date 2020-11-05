package Bohaterowie;

public class Paladyni implements Characters{

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Paladyn";
    }





    public void p1(){

        klasa();
        name("Robert");
        runy.steel();

    }






}
