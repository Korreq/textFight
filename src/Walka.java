import Potwory.TablicaPotworów;

import java.util.Scanner;

public class Walka {

    public static void walka() {

        Scanner scanner = new Scanner(System.in);
     //   WalkaB walkaB = new WalkaB();
      //  WalkaE walkaE = new WalkaE();

        TablicaPotworów tablicaPotworów = new TablicaPotworów();
        Team team = new Team();

        //int min = 1;
        int max = 20;
        int a = 50;
        int b = 50;
        boolean alive = true;

    //    while(alive ==true){

            System.out.println("╔═════════╦═════════╦═════════╗");
            System.out.println("║  " + tablicaPotworów.potwory[4].hp + "/" + tablicaPotworów.potwory[4].maxhp + "  ║  " + tablicaPotworów.potwory[2].hp + "/" + tablicaPotworów.potwory[2].maxhp + "  ║  " + tablicaPotworów.potwory[1].hp + "/" + tablicaPotworów.potwory[1].maxhp + "  ║");
            System.out.println("║  " + tablicaPotworów.potwory[7].hp + "/" + tablicaPotworów.potwory[7].maxhp + "  ║  " + tablicaPotworów.potwory[3].hp + "/" + tablicaPotworów.potwory[3].maxhp + "  ║  " + tablicaPotworów.potwory[8].hp + "/" + tablicaPotworów.potwory[8].maxhp + "  ║");
            System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");

            System.out.print("║  " + team.team[0].hp + "/" + team.team[0].maxhp + "  ║  ");
            if(team.team[1]==null)
            {
                System.out.print("       ║");
            }
            else
            {
                System.out.print(team.team[1].hp + "/" + team.team[1].maxhp + "  ║  ");
            }
            if(team.team[2]==null)
            {
                System.out.println("       ║");
            }
            else
            {
                System.out.println(team.team[2].hp + "/" + team.team[2].maxhp + "  ║  ");
            }
            if(team.team[3]==null)
            {
                System.out.print("║         ║");
            }
            else
            {
                System.out.print("║  "+team.team[3].hp + "/" + team.team[3].maxhp + "  ║  ");
            }
            if(team.team[4]==null)
            {
                System.out.print("      ║  ");
            }
            else
            {
                System.out.print(team.team[4].hp + "/" + team.team[4].maxhp + "  ║  ");
            }
            if(team.team[5]==null)
            {
                System.out.println("       ║");
            }
            else
            {
                System.out.println(team.team[5].hp + "/" + team.team[5].maxhp + "  ║  ");
            }

            System.out.println("╚═════════╩═════════╩═════════╝");
            System.out.println();
      //  }
        /*
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

*/
    }

}
