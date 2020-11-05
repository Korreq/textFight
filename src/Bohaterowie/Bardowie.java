package Bohaterowie;

public class Bardowie implements Characters {

    Runy.Runy runy = new Runy.Runy();

    public String name(String imie){
        System.out.println(imie);
        return imie;
    }
    public String klasa(){
        System.out.println("Bard");
        return "Bard";
    }





    public void b1(){

        klasa();
        name("Jan");
        runy.flint();

    }




}
