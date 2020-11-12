import Bohaterowie.Bohaterowie;
import Magia.TablicaMagii;
import Potwory.Potwory;
import Potwory.TablicaPotworow;
import Runy.Runy;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Walka{

    static Potwory[] potworybitwa = new Potwory[6];

    public static void fight() throws InterruptedException {
        Random random = new Random();
        SystemWalka systemWalka = new SystemWalka();
        TablicaPotworow tablicaPotworow = new TablicaPotworow();

        //losowanie przeciwników
        for (int i = 0; i <= potworybitwa.length - 1; i++) {
            int go = random.nextInt(3);
            potworybitwa[i] = new TablicaPotworow().getPotwory()[go];
        }
        systemWalka.walka();

        System.out.println("Po cięzkiej walce doszło do kolejnej");
        for (int i = 0; i <= potworybitwa.length - 1; i++) {
            int go = random.nextInt(3);
            potworybitwa[i] = new TablicaPotworow().getPotwory()[go+3];
        }
        systemWalka.walka();

        System.out.println("Po cięzkiej walce doszło do kolejnej jeszcze bardziej cięzkiej");
        for (int i = 0; i <= potworybitwa.length - 1; i++) {
            int go = random.nextInt(3);
            potworybitwa[i] = new TablicaPotworow().getPotwory()[go+6];
        }
        systemWalka.walka();

        System.out.println("Czas na Bossa");
        for (int i = 0; i <= potworybitwa.length - 1; i++) {
            int go = random.nextInt(9);
            potworybitwa[i] = new TablicaPotworow().getPotwory()[go];
        }
        int go = random.nextInt(2);
        potworybitwa[1] = new TablicaPotworow().getPotwory()[go+10];
        systemWalka.walka();
        System.out.println("Gratuluję ukonczenia gry");
    }


}