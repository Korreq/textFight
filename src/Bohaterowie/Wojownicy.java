package Bohaterowie;

public class Wojownicy implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        return imie;
    }
    public String klasa(){
        return "Wojownik";
    }





    public void w1(){

       klasa();
       name("Albert");


    }









}
