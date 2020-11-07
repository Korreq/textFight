package Walka;

import Klasy.Rolls;
import Potwory.TablicaPotworów;

public class Fight {

    Rolls rolls = new Rolls();
    TablicaPotworów tablicaPotworów = new TablicaPotworów();
        public  void walka(){
        System.out.println("╔═════════╦═════════╦═════════╗");
        System.out.println("║    "+tablicaPotworów.potwory[4]+"   ║    "+tablicaPotworów.potwory[7]+"   ║    "+tablicaPotworów.potwory[6]+"   ║");
        System.out.println("║    "+tablicaPotworów.potwory[1]+"   ║    "+tablicaPotworów.potwory[2]+"   ║    "+tablicaPotworów.potwory[8]+"   ║");
        System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("╚═════════╩═════════╩═════════╝");
        System.out.println();
        rolls.roll(6);



    }
}
