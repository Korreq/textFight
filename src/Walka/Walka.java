package Walka;

import java.util.Scanner;

public class Walka {

    public static void walka() {

        Scanner scanner = new Scanner(System.in);
        WalkaB walkaB = new WalkaB();
        WalkaE walkaE = new WalkaE();


        //int min = 1;
        int max = 20;
        int a = 50;
        int b = 50;
        boolean alive = true;

        while(alive ==true){

        System.out.println("╔═════════╗");
        System.out.println("║    E1   ║");
        System.out.println("║ - - - - ║");
        System.out.println("║    B1   ║");
        System.out.println("╚═════════╝");
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
