import Bohaterowie.Bohaterowie;
import Magia.TablicaMagii;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class SystemWalka
{
    static int i = 0;
    static Bohaterowie[] teamini = new Bohaterowie[Team.number];
    int mori = 0;
    static int mortem = 0;
    boolean alive = true;

    public void walka() throws InterruptedException
    {
        int zyc=0;
        int bard = 0;
        mori = 0;
        mortem = 0;
        alive = true;
        Scanner scanner = new Scanner(System.in);
        Sortowanie sortowanie = new Sortowanie();
        Random random = new Random();
        TablicaMagii tablicaMagii = new TablicaMagii();
        int b =0;
        System.arraycopy(Team.team, 0, teamini, 0, Team.number);

        for (Bohaterowie bohaterowie : teamini)
        {
            if (bohaterowie.klasa.equals("Bard"))
            {
                bard++;
                System.out.println(bohaterowie.name + " jest bardem. Chowajcie dzieci!");
            }
        }

        Arrays.sort(teamini, sortowanie);

        for (Bohaterowie value : teamini) {
            if (value.klasa.equals("Kapłan")) {
                value.NRMaga = b;
                b++;
            }
        }

        System.out.println("Pole bitwy");
        System.out.println();
        //tu zaczyna się tura
        while(alive)
        {
            PoleBitwy.main();
            System.out.println("\nKolejność ataku :");

            for (int i = 0; i <= teamini.length - 1; i++) { System.out.println(teamini[i]); }
            i = 0;
            for (; i < teamini.length; i++)
            {

                for(int x = 0;x < Walka.potworybitwa.length;x++) {
                    if (Walka.potworybitwa[x].hp <= 0){
                        if(mortem == Walka.potworybitwa.length){
                            alive = false;
                        }
                    }
                }
                if(!alive){break;}
                if (teamini[i].hp > 0)
                {
                    System.out.println("\n╔═══╦════════════════════════════════════╗");
                    System.out.println("║   ║ Co chcesz zrobić? (jesteś teraz "+ teamini[i] + ")  ║");
                    System.out.println("║   ║ - - - - - - - - - - - - - - - - -  ║");
                    System.out.println("║ 1 ║ Atak                               ║");
                    System.out.println("║ 2 ║ Zobacz planszę                     ║");
                    System.out.println("║ 3 ║ Zobacz szczegóły                   ║");
                    System.out.println("║ 4 ║ Użyj runy                          ║");
                    System.out.println("║ 5 ║ Użyj magii                         ║");
                    System.out.println("╚═══╩════════════════════════════════════╝");

                    int wyb;
                        while (!scanner.hasNextInt()) {
                            System.out.println("╔══════════════╗");
                            System.out.println("║ To nie numer ║");
                            System.out.println("╚══════════════╝");
                            scanner.next(); // this is important!
                        }
                        wyb = scanner.nextInt();
                    switch (wyb)
                    {
                        case (1) ->
                                {
                                    System.out.println("Wybierz cel");
                                    int atak;
                                    while (!scanner.hasNextInt()) {
                                        System.out.println("╔══════════════╗");
                                        System.out.println("║ To nie numer ║");
                                        System.out.println("╚══════════════╝");
                                        scanner.next(); // this is important!
                                    }
                                    atak = scanner.nextInt();
                                    if(atak < 0 || atak >= Walka.potworybitwa.length){
                                        System.out.println("Nie ma takiego potwora");i--;break;
                                    }
                                    if (Walka.potworybitwa[atak].hp > 0)
                                    {
                                        int obr = (int) ((Math.random() * (teamini[i].atk - 1)) + 1) - Walka.potworybitwa[atak].armor;
                                        if(obr <= 0){obr = 0;}
                                        Walka.potworybitwa[atak].hp = Walka.potworybitwa[atak].hp - obr;
                                        System.out.println("zadałeś potworowi " + Walka.potworybitwa[atak] + " " + obr + " obrażeń");
                                        if (Walka.potworybitwa[atak].hp <= 0)
                                        {
                                            System.out.println("zabiłeś potwora " + Walka.potworybitwa[atak]);
                                            Walka.potworybitwa[atak].hp = 0;
                                            mortem++;
                                        }
                                        for(int x = 0;x < Walka.potworybitwa.length;x++) {
                                            if (Walka.potworybitwa[x].hp <= 0) {
                                                if (Walka.potworybitwa[x].status.equals("Krew")) {
                                                    Walka.potworybitwa[x].status = "";
                                                    for (Bohaterowie bohaterowie : teamini) {
                                                        if (Walka.potworybitwa[x].NRMaga == bohaterowie.NRMaga) {
                                                            bohaterowie.hp = (int) (bohaterowie.hp + bohaterowie.hp * 0.1);
                                                            System.out.println("Przez to ze potwór" + Walka.potworybitwa[x] + " miał status Krew to bohater" + teamini[i] + " odzyskuje cześć zdrowia");
                                                        }
                                                    }
                                                }
                                                if (Walka.potworybitwa[x].status.equals("Więz krwi")) {
                                                    for (int a = 0; a < Walka.potworybitwa.length; a++) {
                                                        if (Walka.potworybitwa[x].status.equals(Walka.potworybitwa[a].status)) {
                                                            Walka.potworybitwa[a].hp = 0;
                                                            mortem++;
                                                            Walka.potworybitwa[i].status = "";
                                                            Walka.potworybitwa[a].status = "";
                                                            System.out.println("Przez to że potwór " + Walka.potworybitwa[i] + " i " + Walka.potworybitwa[a] + " są powiązanie więzłami krwi" + Walka.potworybitwa[a] + " też umiera");
                                                        }
                                                    }
                                                }


                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("ten potwór nie żyję wybierz jeszcze raz");
                                        i--;
                                    }
                                }
                        case (2) -> { PoleBitwy.main();i--; }
                        case (3)->
                                {
                                    PoleBitwy.main();
                                    System.out.println("\ninformacje na temat bohaterów: \n");
                                    for(int a=0;a<= teamini.length-1;a++) { System.out.println(teamini[a].lit +" nazwa: "+teamini[a].name+" klasa: "+teamini[a].klasa+" hp: " + teamini[a].hp + "/" + teamini[a].maxhp+" pkt magii: "+teamini[a].pktmagii); }

                                    System.out.println("\ninformacje na temat potworów: \n");
                                    for(int a=0;a<= Walka.potworybitwa.length-1;a++) { System.out.println(Walka.potworybitwa[a] + " hp: " + Walka.potworybitwa[a].hp + "/" + Walka.potworybitwa[a].maxhp+" status: "+Walka.potworybitwa[a].status); }
                                    i--;
                                }
                        case (4)->
                                {
                                    if (teamini[i].type.equals("steel")){



                                    }
                                    i--;
                                }
                        case (5)->
                                {
                                    if(teamini[i].mage){
                                        switch(teamini[i].type){
                                            case("fire")-> MagiaWWalce.MagiaOgnia();
                                            case("water")-> MagiaWWalce.MagiaWody();
                                            case("wind")-> MagiaWWalce.MagiaWiatru();
                                            case("earth")-> MagiaWWalce.MagiaZiemi();
                                            case("light")-> MagiaWWalce.MagiaSwiatła();
                                            case("blood")-> {System.out.println("Lista spelli");
                                            for(int a=0;a < tablicaMagii.magiakrwi.length;a++){
                                                System.out.println(a+1+" - "+tablicaMagii.magiakrwi[a]);
                                            }
                                            System.out.println("Którego spella chcesz użyć");
                                            int go = scanner.nextInt();
                                            switch (go){
                                                case(1)->{if(teamini[i].hp < teamini[i].hp*0.1){
                                                    System.out.println("Nie masz życia by rzucić spell");
                                                }
                                                else
                                                {System.out.println("Kogo chcesz zaatakować");
                                                    wyb = scanner.nextInt();
                                                    if(wyb >= Walka.potworybitwa.length){
                                                        System.out.println("Nie ma takiego potwora");
                                                    }
                                                    teamini[i].hp = (int) (teamini[i].hp -teamini[i].hp*0.1);
                                                    Walka.potworybitwa[wyb].status="Krew";
                                                    Walka.potworybitwa[wyb].NRMaga = teamini[i].NRMaga;
                                                    int obr = (int) ((Math.random() * (teamini[i].hp*0.1 - 1)) + 1) - Walka.potworybitwa[wyb].armor;

                                                    if(obr <= 0){obr = 0;}
                                                    Walka.potworybitwa[wyb].hp = Walka.potworybitwa[wyb].hp - obr;
                                                    System.out.println("zadałeś potworowi " + Walka.potworybitwa[wyb] + " " + obr + " obrażeń");
                                                    if (Walka.potworybitwa[wyb].hp <= 0)
                                                    {
                                                        System.out.println("zabiłeś potwora " + Walka.potworybitwa[wyb]);
                                                        Walka.potworybitwa[wyb].hp =0;
                                                        mortem++;
                                                    }
                                                    MagiaWWalce.magia=true;}

                                                }
                                                case(2)->{
                                                    System.out.println("wybierz pierwszego potwora");
                                                    wyb = scanner.nextInt();
                                                    if(wyb >= Walka.potworybitwa.length){
                                                        System.out.println("nie ma takiego potwora");
                                                    }
                                                    System.out.println("wybierz drugiego potwora");
                                                    int wyb2 = scanner.nextInt();
                                                    if(wyb2 >= Walka.potworybitwa.length){
                                                        System.out.println("nie ma takiego potwora");
                                                    }
                                                    Walka.potworybitwa[wyb].status = "Więz krwi";
                                                    Walka.potworybitwa[wyb2].status = "Więz krwi";
                                                    System.out.println("Potwór "+Walka.potworybitwa[wyb]+" i "+Walka.potworybitwa[wyb2]+" są powiązanie więzłami krwi");
                                                }
                                                case(3)->{if(teamini[i].hp < teamini[i].hp/2){
                                                    System.out.println("Nie masz życia by rzucić spell");
                                                }
                                                else
                                                {
                                                    teamini[i].hp = teamini[i].hp -teamini[i].hp/2;
                                                    for(int x = 0;x < Walka.potworybitwa.length;x++)
                                                {
                                                    int obr = (int) ((Math.random() * (teamini[i].maxhp/2 - 1)) + 1) - Walka.potworybitwa[x].armor;
                                                    if(obr <= 0){obr = 0;}
                                                    Walka.potworybitwa[x].hp = Walka.potworybitwa[x].hp - obr;
                                                    System.out.println("zadałeś potworowi " + Walka.potworybitwa[x] + " " + obr + " obrażeń");
                                                    if (Walka.potworybitwa[x].hp <= 0)
                                                    {
                                                        System.out.println("zabiłeś potwora " + Walka.potworybitwa[x]);
                                                        Walka.potworybitwa[x].hp =0;
                                                        mortem++;
                                                        teamini[i].hp = (int) (teamini[i].hp + teamini[i].hp*0.1);
                                                        if(teamini[i].hp > teamini[i].maxhp){teamini[i].hp=teamini[i].maxhp;}
                                                    }
                                                }
                                                    MagiaWWalce.magia = true;}
                                                }
                                                default -> System.out.println("Nie ma takiego spella");}}
                                            case("thunder")-> MagiaWWalce.MagiaBłyskawic();
                                        }
                                        if(!MagiaWWalce.magia){ i--; }
                                        else{MagiaWWalce.magia = false;
                                        teamini[i].pktmagii = teamini[i].pktmagii - MagiaWWalce.pkt;
                                            for(int x = 0;x < Walka.potworybitwa.length;x++) {
                                                if (Walka.potworybitwa[x].hp <= 0) {
                                                    if (Walka.potworybitwa[x].status.equals("Krew")) {
                                                        Walka.potworybitwa[x].status = "";
                                                        for (Bohaterowie bohaterowie : teamini) {
                                                            if (Walka.potworybitwa[x].NRMaga == bohaterowie.NRMaga) {
                                                                bohaterowie.hp = (int) (bohaterowie.hp + bohaterowie.hp * 0.1);
                                                                System.out.println("Przez to ze potwór" + Walka.potworybitwa[x] + " miał status Krew to bohater" + teamini[i] + " odzyskuje cześć zdrowia");
                                                            }
                                                        }
                                                    }
                                                    if (Walka.potworybitwa[x].status.equals("Więz krwi")){
                                                        for (int a = 0; a < Walka.potworybitwa.length; a++) {
                                                            if (Walka.potworybitwa[a].status.equals("Więz krwi")) {
                                                            if (Walka.potworybitwa[x].status.equals(Walka.potworybitwa[a].status)) {
                                                                Walka.potworybitwa[a].hp = 0;
                                                                mortem++;
                                                                Walka.potworybitwa[i].status = "";
                                                                Walka.potworybitwa[a].status = "";
                                                                System.out.println("Przez to że potwór " + Walka.potworybitwa[i] + " i " + Walka.potworybitwa[a] + " są powiązanie więzłami krwi " + Walka.potworybitwa[a] + " też umiera");
                                                            }
                                                        }}
                                                    }


                                                }
                                            }

                                    }}
                                    else{
                                        System.out.println("nie jesteś magiem");
                                        i--;
                                    }
                                }
                        default ->
                                {
                                    System.out.println("nie ma takiej opcji");
                                    i--;
                                }
                    }
                }
            }
            for(int x = 0;x < Walka.potworybitwa.length;x++)
            {
                if (Walka.potworybitwa.length == mortem)
                {
                    alive = false;
                    System.out.println("Wygrałeś bitwę");
                    break;
                }
            }
            if(!alive){break;}
            System.out.println("Czas na turę potworów");
            for(int i = 0;i < Walka.potworybitwa.length;i++)
            {
                if(Walka.potworybitwa[i].status.equals("Oplątanie")){break;}
                if(!alive){break;}


                if (Walka.potworybitwa[i].hp > 0)
                {
                    int wyb = random.nextInt(2);
                    switch (wyb)
                    {
                        case (0) ->
                                {
                                    int atak = random.nextInt(Team.number);
                                    if (teamini[atak].hp > 0)
                                    {
                                        if(teamini[atak].status.equals("Mgła")){
                                            {if(teamini.length ==1){break;} i--; }}
                                        else{

                                        //zadawanie obrażeń przez potwory
                                        int obr = (int) ((Math.random() * (Walka.potworybitwa[i].atk - 1)) + 1) - teamini[atak].armor;
                                        if(obr <= 0){obr = 0;}
                                            if(teamini[atak].status.equals("Kokon")){teamini[atak].hp = teamini[atak].hp - obr/2;}
                                            else {
                                                teamini[atak].hp = teamini[atak].hp - obr;
                                            }
                                        System.out.println("potwór zadał bohaterowi " + teamini[atak] + " " + obr + " obrażen");
                                        Thread.sleep(1000);

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
                                                i = Walka.potworybitwa.length - 1;
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    }
                                    else { i--; }
                                }
                        case (1)->     //trzeba zwiększyć ilość licz dla case(0) żeby wszystkie potwory nie uciekały przed bardami + ten case może służyć jako miejsce na specjalne efekty potworów
                                {
                                    if (bard > 0)
                                    {
                                        if (Walka.potworybitwa[i].hp < 10 * bard)
                                        {
                                            Walka.potworybitwa[i].hp = 0;
                                            mortem++;
                                            System.out.println("Bestia usłyszawsza katofonie wykonaną ze strony barda uciekła z pola bitwy");
                                        }
                                        else
                                        {
                                            System.out.println("Potwór usłyszawszy katofonie ze strony barda został oszołomiony");
                                        }
                                        Thread.sleep(1000);
                                    }
                                    else{
                                        i--;
                                    }


                                }
                    }
                }


            }
            if(zyc!=Team.number){
                for (Bohaterowie bohaterowie : teamini) {
                    bohaterowie.status = "";
                }
                System.out.println("Koniec tury potworów czas na twoją");}

        }
        System.out.println("Koniec walki");

    }
}
