package Walka;

import java.util.Scanner;

public class Walka {

    public static void walka() {

        Scanner scanner = new Scanner(System.in);
        WalkaB walkaB = new WalkaB();
        WalkaE walkaE = new WalkaE();
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


        boolean a = true;
        do {
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
                System.out.println(walkaB.getHp1(50));

            default:

                break;

        }

        }while(a==true);
    }

}
