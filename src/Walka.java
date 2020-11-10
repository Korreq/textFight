import Bohaterowie.Bohaterowie;
import Potwory.Potwory;
import Potwory.TablicaPotworów;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Walka {
    static Potwory[] potworybitwa = new Potwory[6];


    public static void walka() throws InterruptedException
    {

        Scanner scanner = new Scanner(System.in);


        TablicaPotworów tablicaPotworów = new TablicaPotworów();
        Team team = new Team();
        Sortowanie sortowanie = new Sortowanie();
        Random random = new Random();
        int zyc=0;

        Bohaterowie[] teamini = new Bohaterowie[Team.number];
        System.arraycopy(Team.team, 0, teamini, 0, Team.number);

        Arrays.sort(teamini, sortowanie);
        boolean alive = true;

        //losowanie przeciwników
        for(int i=0;i<= potworybitwa.length-1;i++){
            int go = random.nextInt(9);
            potworybitwa[i] = tablicaPotworów.potwory[go];
        }






        System.out.println("Pole bitwy");
        System.out.println();


            //tu zaczyna się tura
        while(alive)
        {
            PoleBitwy.main();

            System.out.println("Kolejność ataku :");


            for (int i = 0; i <= teamini.length - 1; i++) { System.out.println(teamini[i]); }
            for (int i = 0; i <= teamini.length - 1; i++) { if(!alive){break; }

            if (teamini[i].hp > 0) 
            {
                System.out.println("co chcesz zrobić (jesteś teraz " + teamini[i] + ")");
                System.out.println("1: Atak");
                System.out.println("2: Zobacz Planszę");
                System.out.println("3: Zobacz szczegóły");
                int wyb = scanner.nextInt();
                switch (wyb) {
                    case (1) -> {
                        System.out.println("Wybierz cel");
                        int atak = scanner.nextInt(6);
                        if (potworybitwa[atak].hp > 0) {
                            int obr = (int) ((Math.random() * (teamini[i].atk - 1)) + 1)*100 - potworybitwa[atak].armor;//Mega obrażenia
                            if(obr <= 0){obr = 0;}
                            potworybitwa[atak].hp = potworybitwa[atak].hp - obr;
                            System.out.println("zadałeś potworowi " + potworybitwa[atak] + " " + obr + " obrażeń");
                            if (potworybitwa[atak].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + potworybitwa[atak]);
                                potworybitwa[atak].hp =0;

                                int mori = 0;
                                for(int x = 0;x < potworybitwa.length;x++)
                                {
                                    if(potworybitwa[x].hp <= 0){ mori++;}
                                    if (mori == potworybitwa.length)
                                    {
                                        alive = false;
                                        System.out.println("Wygrałeś bitwę");
                                    }
                                }
                            }
                        } else {
                            System.out.println("ten potwór nie żyję wybierz jeszcze raz");
                            i--;
                        }
                    }
                    case 2 ->{PoleBitwy.main();
                        i--;}
                        case(3)->{PoleBitwy.main();
                            System.out.println("\ninformacje na temat bohaterów: \n");
                            for(int a=0;a<= teamini.length-1;a++) {
                                System.out.println(teamini[a].lit +" nazwa: "+teamini[a].name+" klasa: "+teamini[a].klasa+" hp: " + teamini[a].hp + "/" + teamini[a].maxhp);
                            }

                            System.out.println("\ninformacje na temat potworów: \n");
                            for(int a=0;a<= potworybitwa.length-1;a++) {
                                System.out.println(potworybitwa[a] + " hp: " + potworybitwa[a].hp + "/" + potworybitwa[a].maxhp);
                            }
                            System.out.println();
                            i--;
                        }
                    default -> {
                        System.out.println("nie ma takiej opcji");
                        i--;
                    }
                }
            }
        }
                if(!alive){break;}
                System.out.println("Czas na turę potworów");
            for(int i = 0;i<= potworybitwa.length-1;i++)
            {
                if(!alive){break;}


                if (potworybitwa[i].hp > 0)
                {
                    int wyb = random.nextInt(1);
                    switch (wyb)
                    {
                        case (0) ->
                                {
                                    int atak = random.nextInt(Team.number);
                                    if (teamini[atak].hp > 0)
                                    {

                                        //zadawanie obrażeń przez potwory
                                        int obr = (int) ((Math.random() * (potworybitwa[i].atk - 1)) + 1) - teamini[atak].armor * 100; //pomnożone do 100 żeby bohaterowie nie umierali
                                        if(obr <= 0){obr = 0;}
                                        teamini[atak].hp = teamini[atak].hp - obr;

                                        System.out.println("potwór zadał bohaterowi " + teamini[atak] + " " + obr + " obrażen");
                                        Thread.sleep(2000);

                                        //sprawdzenie czy potówr nie zabił bohatera
                                        if (teamini[atak].hp <= 0)
                                        {
                                            System.out.println("potwory zabiły bohatera " + teamini[atak]);
                                            teamini[atak].hp = 0;


                                            for (int a = 0; a <= Team.number - 1; a++)
                                            {
                                                if (teamini[a].hp <= 0) { zyc++; }
                                            }
                                            if (zyc == Team.number)
                                            {
                                                alive = false;
                                                System.out.println("Zostałesz pokonany");
                                                i = potworybitwa.length - 1;
                                            }
                                        }
                                    }
                                    else { i--; }
                                }
                    }
                }

                //ty dobrze wiesz czemu jest to skomentowane
               //

            }
               if(zyc!=Team.number){ System.out.println("Koniec tury potworów czas na twoją");}

            }
              System.out.println("Koniec walki");

    }

}