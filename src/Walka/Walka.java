package Walka;

import Potwory.TablicaPotworów;

import java.util.Scanner;

public class Walka {

    public static void walka() {

        Scanner scanner = new Scanner(System.in);
        WalkaB walkaB = new WalkaB();
        WalkaE walkaE = new WalkaE();

        TablicaPotworów tablicaPotworów = new TablicaPotworów();
        
        //int min = 1;
        int max = 20;
        int a = 50;
        int b = 50;
        boolean alive = true;

        while(alive ==true){

            System.out.println("╔═════════╦═════════╦═════════╗");
            System.out.println("║  " + tablicaPotworów.potwory[4].hp + "/" + tablicaPotworów.potwory[4].maxhp + "  ║  " + tablicaPotworów.potwory[2].hp + "/" + tablicaPotworów.potwory[2].maxhp + "  ║  " + tablicaPotworów.potwory[1].hp + "/" + tablicaPotworów.potwory[1].maxhp + "  ║");
            System.out.println("║  " + tablicaPotworów.potwory[7].hp + "/" + tablicaPotworów.potwory[7].maxhp + "  ║  " + tablicaPotworów.potwory[3].hp + "/" + tablicaPotworów.potwory[3].maxhp + "  ║  " + tablicaPotworów.potwory[8].hp + "/" + tablicaPotworów.potwory[8].maxhp + "  ║");
            System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");

            System.out.print("║  " + dru[0].hp + "/" + dru[0].maxhp + "  ║  ");
            if(dru[1]==null)
            {
                System.out.print("       ║");
            }
            else
            {
                System.out.print(dru[1].hp + "/" + dru[1].maxhp + "  ║  ");
            }
            if(dru[2]==null)
            {
                System.out.println("       ║");
            }
            else
            {
                System.out.println(dru[2].hp + "/" + dru[2].maxhp + "  ║  ");
            }
            if(dru[3]==null)
            {
                System.out.print("║         ║");
            }
            else
            {
                System.out.print("║  "+dru[3].hp + "/" + dru[3].maxhp + "  ║  ");
            }
            if(dru[4]==null)
            {
                System.out.print("      ║  ");
            }
            else
            {
                System.out.print(dru[4].hp + "/" + dru[4].maxhp + "  ║  ");
            }
            if(dru[5]==null)
            {
                System.out.println("       ║");
            }
            else
            {
                System.out.println(dru[5].hp + "/" + dru[5].maxhp + "  ║  ");
            }

            System.out.println("╚═════════╩═════════╩═════════╝");
            System.out.println();
        }
        System.out.println("╔══════════╗");
        System.out.println("║     "+walkaE.showhp()+"/"+walkaE.maxHP+"     ║");
        System.out.println("║ - - - -  ║");
        System.out.println("║   "+walkaB.showhp()+"/"+walkaB.maxHP+"      ║");
        System.out.println("╚══════════╝");
        System.out.println();



        System.out.println("Wybierz swoją akcje: \n [1] Atak\n [2] Życie\n");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Zadałeś ");
                System.out.print(walkaE.atak(max));
                System.out.println(" obrażeń!");
                if(walkaE.getHp1(a) <= 0){
                    alive = false;
                    break;
                }
                System.out.print("Przeciwnik zadał ci ");
                System.out.print(walkaB.atak(5)+"\n");
                if(walkaB.getHp1(b) <= 0){
                    alive = false;
                    break;

                }

                break;

            default:

                break;

        }


        }

        System.out.println("Hurra Kurwa pisowska gryzie gruz!!!");


    }

}
