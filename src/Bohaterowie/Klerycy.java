package Bohaterowie;

public class Klerycy implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Kleryk";
    }





    public void c1(){

        klasa();
        name("Ezekiel");
        runy.steel();

    }






}
