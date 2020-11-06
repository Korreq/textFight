package Walka;


import Klasy.Rolls;

public class Fight {

    Rolls rolls = new Rolls();



    public void walka(){
        System.out.println("╔═════════╦═════════╦═════════╗");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("╚═════════╩═════════╩═════════╝");

        System.out.println();
        rolls.roll(6);





    }
}
