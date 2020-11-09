import Bohaterowie.Bohaterowie;
import Potwory.TablicaPotworów;

import java.util.Arrays;
import java.util.Scanner;

public class Walka {

    public static void walka() {

        Scanner scanner = new Scanner(System.in);


        TablicaPotworów tablicaPotworów = new TablicaPotworów();
        Team team = new Team();
        Bohaterowie[] teamli = new Bohaterowie[Team.number];
        System.arraycopy(Team.team,0,teamli,0,Team.number);
        for(int i = 0; i<= teamli.length-1; i++)
        {
            System.out.println(teamli[i]);
        }
        boolean alive = true;

    //    while(alive ==true){

            System.out.println("╔═════════╦═════════╦═════════╗");
            System.out.println("║  " + tablicaPotworów.potwory[4].hp + "/" + tablicaPotworów.potwory[4].maxhp + "  ║  " + tablicaPotworów.potwory[2].hp + "/" + tablicaPotworów.potwory[2].maxhp + "  ║  " + tablicaPotworów.potwory[1].hp + "/" + tablicaPotworów.potwory[1].maxhp + "  ║");
            System.out.println("║  " + tablicaPotworów.potwory[7].hp + "/" + tablicaPotworów.potwory[7].maxhp + "  ║  " + tablicaPotworów.potwory[3].hp + "/" + tablicaPotworów.potwory[3].maxhp + "  ║  " + tablicaPotworów.potwory[8].hp + "/" + tablicaPotworów.potwory[8].maxhp + "  ║");
            System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");

            System.out.print("║  " + Team.team[0].hp + "/" + Team.team[0].maxhp + "  ║  ");
            if(Team.team[1]==null)
            {
                System.out.print("       ║");
            }
            else
            {
                System.out.print(Team.team[1].hp + "/" + Team.team[1].maxhp + "  ║  ");
            }
            if(Team.team[2]==null)
            {
                System.out.println("       ║");
            }
            else
            {
                System.out.println(Team.team[2].hp + "/" + Team.team[2].maxhp + "  ║  ");
            }
            if(Team.team[3]==null)
            {
                System.out.print("║         ║");
            }
            else
            {
                System.out.print("║  "+Team.team[3].hp + "/" + Team.team[3].maxhp + "  ║  ");
            }
            if(Team.team[4]==null)
            {
                System.out.print("      ║  ");
            }
            else
            {
                System.out.print(Team.team[4].hp + "/" + Team.team[4].maxhp + "  ║  ");
            }
            if(Team.team[5]==null)
            {
                System.out.println("       ║");
            }
            else
            {
                System.out.println(Team.team[5].hp + "/" + Team.team[5].maxhp + "  ║  ");
            }

            System.out.println("╚═════════╩═════════╩═════════╝");
            System.out.println();
        int[] inicjatywa = new int[12];
        for(int i = 0; i<= teamli.length; i++)
        {
            inicjatywa[i]= teamli[i].dex;
        }
        inicjatywa[6]=tablicaPotworów.potwory[1].dex;
        inicjatywa[7]=tablicaPotworów.potwory[2].dex;
        inicjatywa[8]=tablicaPotworów.potwory[3].dex;
        inicjatywa[9]=tablicaPotworów.potwory[4].dex;
        inicjatywa[10]=tablicaPotworów.potwory[7].dex;
        inicjatywa[11]=tablicaPotworów.potwory[8].dex;
for(int i=0;i<= inicjatywa.length-1;i++){
        System.out.println(inicjatywa[i]);
        }
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
