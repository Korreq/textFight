package Walka;

import Potwory.TablicaPotworów;

public class Fight {


    TablicaPotworów tablicaPotworów = new TablicaPotworów();
        public  void walka(){
        System.out.println("╔═════════╦═════════╦═════════╗");
        System.out.println("║    "+tablicaPotworów.getPotwory()[4]+"   ║    "+tablicaPotworów.getPotwory()[7]+"   ║    "+tablicaPotworów.getPotwory()[6]+"   ║");
        System.out.println("║    "+tablicaPotworów.getPotwory()[1]+"   ║    "+tablicaPotworów.getPotwory()[2]+"   ║    "+tablicaPotworów.getPotwory()[8]+"   ║");
        System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("║    a    ║    b    ║    c    ║");
        System.out.println("╚═════════╩═════════╩═════════╝");
        System.out.println();




    }
}
