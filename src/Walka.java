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

            for(int i = 1;i < team.number;i++)
            {
                    if(i == 3) { System.out.print("\n║  "); }
                    System.out.print(Team.team[i].hp + "/" + Team.team[i].maxhp + "  ║  ");
            }
            if(3 > team.number)
            {
                for(int i = 3;i > team.number;i-- ) { System.out.print("       ║  ");}
            }
            if(6 > team.number && 3 < team.number)
            {
                for(int i = 6;i > team.number;i-- ) { System.out.print("       ║  "); }
            }

            System.out.println();
            System.out.println("╚═════════╩═════════╩═════════╝");
            System.out.println();
        int[] inicjatywa = new int[12];
        for(int i = 0; i<= teamli.length-1; i++)
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
