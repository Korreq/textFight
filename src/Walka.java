import Bohaterowie.Bohaterowie;
import Potwory.Potwory;
import Potwory.TablicaPotworów;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Walka {

    public static void walka() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);


        TablicaPotworów tablicaPotworów = new TablicaPotworów();
        Team team = new Team();
        Sortowanie sortowanie = new Sortowanie();
        Random random = new Random();
        int zyc=0;
        Bohaterowie[] teamli = new Bohaterowie[Team.number];
        Bohaterowie[] teamini = new Bohaterowie[Team.number];
        System.arraycopy(Team.team, 0, teamli, 0, Team.number);
        System.arraycopy(Team.team, 0, teamini, 0, Team.number);

        Arrays.sort(teamini, sortowanie);
        boolean alive = true;
        Potwory[] potworybitwa = new Potwory[6];
        potworybitwa[0] = tablicaPotworów.potwory[4];
        potworybitwa[1] = tablicaPotworów.potwory[2];
        potworybitwa[2] = tablicaPotworów.potwory[1];
        potworybitwa[3] = tablicaPotworów.potwory[7];
        potworybitwa[4] = tablicaPotworów.potwory[3];
        potworybitwa[5] = tablicaPotworów.potwory[8];
        System.out.println("Pole bitwy");
        System.out.println();
            while(alive){

        System.out.println("╔═════════╦═════════╦═════════╗");
        System.out.println("║  " + tablicaPotworów.potwory[4].hp + "/" + tablicaPotworów.potwory[4].maxhp + "  ║  " + tablicaPotworów.potwory[2].hp + "/" + tablicaPotworów.potwory[2].maxhp + "  ║  " + tablicaPotworów.potwory[1].hp + "/" + tablicaPotworów.potwory[1].maxhp + "  ║");
        System.out.println("║  " + tablicaPotworów.potwory[7].hp + "/" + tablicaPotworów.potwory[7].maxhp + "  ║  " + tablicaPotworów.potwory[3].hp + "/" + tablicaPotworów.potwory[3].maxhp + "  ║  " + tablicaPotworów.potwory[8].hp + "/" + tablicaPotworów.potwory[8].maxhp + "  ║");
        System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");

        System.out.print("║  " + Team.team[0].hp + "/" + Team.team[0].maxhp + "  ║  ");

        for (int i = 1; i < Team.number; i++) {
            if (i == 3) {
                System.out.print("\n║  ");
            }
            System.out.print(Team.team[i].hp + "/" + Team.team[i].maxhp + "  ║  ");
        }
        if (3 > Team.number) {
            for (int i = 3; i > Team.number; i--) {
                System.out.print("       ║  ");
            }
        }
        if (6 > Team.number && 3 < Team.number) {
            for (int i = 6; i > Team.number; i--) {
                System.out.print("       ║  ");
            }
        }
        System.out.println();
        System.out.println("╚═════════╩═════════╩═════════╝");
        System.out.println("Kolejność ataku :");
        for (int i = 0; i <= teamini.length - 1; i++) {
            System.out.println(teamini[i]);
        }
        for (int i = 0; i <= teamli.length - 1; i++) {
            if(!alive){break;}
            if (teamli[i].hp > 0) {
                System.out.println("co chcesz zrobić (jesteś teraz " + teamli[i] + ")");
                System.out.println("1: Atak");
                System.out.println("2: Zobacz Planszę");
                int wyb = scanner.nextInt();
                switch (wyb) {
                    case (1) -> {
                        System.out.println("Wybierz cel");
                        int atak = scanner.nextInt(6);
                        if (potworybitwa[atak].hp > 0) {
                            int obr = (int) ((Math.random() * (teamli[i].atk - 1)) + 1) - potworybitwa[atak].armor;
                            if(obr <= 0){obr = 0;}
                            potworybitwa[atak].hp = potworybitwa[atak].hp - obr;
                            System.out.println("zadałesz potworowi " + potworybitwa[atak] + " " + obr + " obrażen");
                            if (potworybitwa[atak].hp <= 0) {
                                System.out.println("zabiłesz potwora " + potworybitwa[atak]);
                                potworybitwa[atak].hp =0;
                                    if(potworybitwa[0].hp <= 0){
                                        if(potworybitwa[1].hp <= 0){
                                            if(potworybitwa[2].hp <= 0){
                                                if(potworybitwa[3].hp <= 0){
                                                    if(potworybitwa[4].hp <= 0){
                                                        if(potworybitwa[5].hp <= 0){
                                                            alive = false;
                                                            System.out.println("Wygrałesz bitwę");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                            }
                        } else {
                            System.out.println("ten potwór nie żyję wybierz jeszcze raz");
                            i--;
                        }
                    }
                    case 2 ->{System.out.println("╔═════════╦═════════╦═════════╗");
                        System.out.println("║  " + tablicaPotworów.potwory[4].hp + "/" + tablicaPotworów.potwory[4].maxhp + "  ║  " + tablicaPotworów.potwory[2].hp + "/" + tablicaPotworów.potwory[2].maxhp + "  ║  " + tablicaPotworów.potwory[1].hp + "/" + tablicaPotworów.potwory[1].maxhp + "  ║");
                        System.out.println("║  " + tablicaPotworów.potwory[7].hp + "/" + tablicaPotworów.potwory[7].maxhp + "  ║  " + tablicaPotworów.potwory[3].hp + "/" + tablicaPotworów.potwory[3].maxhp + "  ║  " + tablicaPotworów.potwory[8].hp + "/" + tablicaPotworów.potwory[8].maxhp + "  ║");
                        System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");

                        System.out.print("║  " + Team.team[0].hp + "/" + Team.team[0].maxhp + "  ║  ");

                        for (int a = 1; a < Team.number; a++) {
                            if (a == 3) {
                                System.out.print("\n║  ");
                            }
                            System.out.print(Team.team[a].hp + "/" + Team.team[a].maxhp + "  ║  ");
                        }
                        if (3 > Team.number) {
                            for (int a = 3; a > Team.number; a--) {
                                System.out.print("       ║  ");
                            }
                        }
                        if (6 > Team.number && 3 < Team.number) {
                            for (int a = 6; a > Team.number; a--) {
                                System.out.print("       ║  ");
                            }
                        }
                        System.out.println();
                        System.out.println("╚═════════╩═════════╩═════════╝");
                        i--;}
                    default -> {
                        System.out.println("nie ma takiej opcji");
                        i--;
                    }
                }
            }
        }
                if(!alive){break;}
                System.out.println("Czas na turę potworów");
            for(int i = 0;i<= potworybitwa.length-1;i++) {
                if(!alive){break;}
                if (potworybitwa[i].hp >= 0) {
                    int wyb = random.nextInt(1);
                    switch (wyb) {
                        case (0) -> {
                            int atak = random.nextInt(Team.number);
                            if (teamli[atak].hp > 0) {
                                int obr = (int) ((Math.random() * (potworybitwa[i].atk - 1)) + 1) - teamini[atak].armor;
                                if(obr <= 0){obr = 0;}
                                teamini[atak].hp = teamini[atak].hp - obr;
                                System.out.println("potwór zadał bohaterowi " + teamini[atak] + " " + obr + " obrażen");
                                if (teamli[atak].hp <= 0) {
                                    System.out.println("potwory zabiły bohatera " + teamini[atak]);
                                    teamini[atak].hp = 0;
                                    for (int a = 0; a <= Team.number - 1; a++) {
                                        if (teamli[a].hp <= 0) {
                                            zyc++;
                                        }
                                    }
                                    if (zyc == Team.number) {
                                        alive = false;
                                        System.out.println("Zostałesz pokonany");
                                        i = potworybitwa.length - 1;

                                    }
                                }
                            } else {
                                i--;
                            }
                        }
                    }
                }


                Thread.sleep(2000);

            }
               if(zyc!=Team.number){ System.out.println("Koniec tury potworów czas na twoją");}


            }
              System.out.println("Koniec walki");


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
