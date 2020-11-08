package Walka;

import RPGtest.walkaB;
import RPGtest.walkaE;

import java.util.Scanner;

public class Walka {

    public static void walka() {

        Scanner scanner = new Scanner(System.in);
        walkaB walkaB = new walkaB();
        walkaE walkaE = new walkaE();
        int min = 1;
        int max = 20;

        System.out.println("╔═════════╗");
        System.out.println("║    E1   ║");
        System.out.println("║ - - - - ║");
        System.out.println("║    B1   ║");
        System.out.println("╚═════════╝");
        System.out.println("╔══════════╗");
        System.out.println("║          ║");
        System.out.println("║ - - - -  ║");
        System.out.println("║          ║");
        System.out.println("╚══════════╝");
        System.out.println();

        System.out.println("Wybierz swoją akcje: \n [1] Atak\n [2] Życie\n");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Zadałeś ");
                System.out.print(walkaB.atak(min, max));
                System.out.println(" obrażeń!");
                break;

            case 2:
                System.out.print("Twoje HP ");
                System.out.println(walkaB.getHp1());

            default:

                break;

        }
        boolean a = true;
        do {
            System.out.println("Wybierz swoją akcje: \n [1] Atak\n [2] Życie\n");
            int choice2 = scanner.nextInt();

            switch (choice2) {
                case 1:
                    System.out.print("Zadałeś ");
                    System.out.print(walkaB.atak(min, max));
                    System.out.println(" obrażeń!");
                    break;

                case 2:
                    System.out.print("Twoje HP ");
                    System.out.println(walkaB.getHp2());


                default:

                    break;

            }
        }while(a==true);
    }

}
