import Magia.TablicaMagii;

import java.util.Random;
import java.util.Scanner;

public class MagiaWWalce {
    static TablicaMagii tablicaMagii = new TablicaMagii();
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static boolean magia = false;
    static int pkt;
    static int wyb;
    static int hp = 0;

    public static void MagiaOgnia()
    {
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiaognia.length;a++){System.out.println(a+1+" - "+tablicaMagii.magiaognia[a]);}
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt=1;
                        if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                            System.out.println("Nie masz many na spell");
                            break;
                        }
                        System.out.println("która kolumna");
                        int kolumna = scanner.nextInt();
                        if(kolumna < 1 || kolumna > 3) { System.out.println("To nie kolumna"); break; }
                        for (int i = kolumna-1;i<=kolumna+2;i = i+3)
                        {
                            if (Walka.potworybitwa[i].hp <= 0) { System.out.println("W komórce "+ i +" nikogo nie ma"); }
                            else {
                                if (Walka.potworybitwa[i].hp > 0)
                                {
                                    int obr = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[i].armor;
                                    if (obr <= 0) { obr = 0; }
                                    Walka.potworybitwa[i].hp = Walka.potworybitwa[i].hp - obr;
                                    System.out.println("zadałeś potworowi " + Walka.potworybitwa[i] + " " + obr + " obrażeń");
                                    if (Walka.potworybitwa[i].hp <= 0)
                                    {
                                        System.out.println("zabiłeś potwora " + Walka.potworybitwa[i]);
                                        Walka.potworybitwa[i].hp = 0;
                                        SystemWalka.mortem++;
                                    }
                                }
                            }
                            if(Walka.potworybitwa.length < 4){break;}
                        }
                        magia = true;
                    }
            case(2) -> {
                        pkt = 2;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("który rząd");
                        int rzad = scanner.nextInt();
                        if (rzad < 1 || rzad > 2) { System.out.println("To nie rząd"); break; }
                        if (rzad == 2) { rzad = 4; if(Walka.potworybitwa.length < 4){System.out.println("Takiego rzędu nie ma"); break;} }
                        for (int i = rzad-1; i <= rzad + 1; i++)
                        {
                            if (Walka.potworybitwa[rzad].hp <= 0) { System.out.println("W tym rzędzie nikogo nie ma"); }
                            else {
                                if (Walka.potworybitwa[rzad].hp > 0)
                                {
                                    int obr = (int) ((Math.random() * (tablicaMagii.fire2.getObrażenia() - 1)) + 1) - Walka.potworybitwa[i].armor;
                                    if (obr <= 0) { obr = 0; }
                                    Walka.potworybitwa[i].hp = Walka.potworybitwa[i].hp - obr;
                                    System.out.println("zadałeś potworowi " + Walka.potworybitwa[i] + " " + obr + " obrażeń");
                                    if (Walka.potworybitwa[i].hp <= 0)
                                    {
                                        System.out.println("zabiłeś potwora " + Walka.potworybitwa[i]);
                                        Walka.potworybitwa[i].hp = 0;
                                        SystemWalka.mortem++;
                                    }
                                }
                            }
                        }
                        magia = true;
                    }
            case(3) -> {
                        pkt=3;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        for(int x = 0;x < Walka.potworybitwa.length;x++)
                        {
                            if(Walka.potworybitwa[x].hp != 0){
                                int obr = (int) ((Math.random() * (tablicaMagii.fire3.getObrażenia() - 1)) + 1) - Walka.potworybitwa[x].armor;
                                if(obr <= 0){obr = 0;}
                                Walka.potworybitwa[x].hp = Walka.potworybitwa[x].hp - obr;
                                System.out.println("zadałeś potworowi " + Walka.potworybitwa[x] + " " + obr + " obrażeń");
                                if (Walka.potworybitwa[x].hp <= 0)
                                {
                                    System.out.println("zabiłeś potwora " + Walka.potworybitwa[x]);
                                    Walka.potworybitwa[x].hp = 0;
                                    SystemWalka.mortem++;
                                }
                            }
                        }
                        magia = true;
                    }
            default -> System.out.println("Nie masz takiego zaklęcia");
        }
    }

    public static void MagiaWody()
    {
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiawody.length;a++){ System.out.println(a+1+" - "+tablicaMagii.magiawody[a]); }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt = 1;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Kogo chcesz uleczyć?");
                        int wyb = scanner.nextInt();
                        if(wyb > Team.number) { System.out.println("Nie ma takiego członka"); }
                        if(SystemWalka.teamini[wyb].hp == SystemWalka.teamini[wyb].maxhp){ System.out.println("Ten członek ma maks hp"); }
                        if(SystemWalka.teamini[wyb].hp == 0){ System.out.println("Ten członek nie żyje"); }
                        else
                        {
                            SystemWalka.teamini[wyb].hp = SystemWalka.teamini[wyb].maxhp;
                            System.out.println("Członek "+SystemWalka.teamini[wyb]+" został uleczony");
                            magia=true;
                        }
                    }
            case(2) -> {
                        pkt = 2;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Kogo chcesz ochronić?");
                        int wyb = scanner.nextInt();
                        if(wyb > Team.number) { System.out.println("Nie ma takiego członka"); }
                        else {
                            if(!SystemWalka.teamini[wyb].status.equals("")){ System.out.println("Ten członek ma juz nałożony status"); }
                            if(SystemWalka.teamini[wyb].hp == wyb){ System.out.println("Ten członek nie żyje"); }
                            else {
                                SystemWalka.teamini[wyb].status = "Mgła";
                                System.out.println("Członek "+SystemWalka.teamini[wyb]+" ma status mgła");
                                magia=true;
                            }
                        }
                    }
            case(3) -> {
                        pkt = 3;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        for(int x=0;x<SystemWalka.teamini.length;x++) { if(SystemWalka.teamini[x].hp == SystemWalka.teamini[x].maxhp){ hp++; } }
                        if(hp == SystemWalka.teamini.length){ System.out.println("cała drużyna ma maxhp"); break;}
                        for(int x=0;x<SystemWalka.teamini.length;x++)
                        {
                            SystemWalka.teamini[x].hp = SystemWalka.teamini[x].maxhp;
                            System.out.println("cała drużyna została uleczona");
                            magia=true;
                        }
                    }
            default -> System.out.println("Nie masz takiego spella");
        }
    }
    
    public static void MagiaWiatru()
    {
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiawiatru.length;a++){ System.out.println(a+1+" - "+tablicaMagii.magiawiatru[a]); }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt = 1;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Kogo chcesz zaatakować");
                        int wyb = scanner.nextInt();
                        if(wyb > Walka.potworybitwa.length) { System.out.println("Nie ma takiego potwora"); }
                        int obr = (int) ((Math.random() * (tablicaMagii.wind1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[wyb].armor;
                        if(obr <= 0){obr = 0;}
                        Walka.potworybitwa[wyb].hp = Walka.potworybitwa[wyb].hp - obr;
                        System.out.println("zadałeś potworowi " + Walka.potworybitwa[wyb] + " " + obr + " obrażeń");
                        if (Walka.potworybitwa[wyb].hp <= 0)
                        {
                            System.out.println("zabiłeś potwora " + Walka.potworybitwa[wyb]);
                            Walka.potworybitwa[wyb].hp =0;
                            SystemWalka.mortem++;
                        }
                    }
            case(2) -> {
                        pkt = 2;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Kogo chcesz uleczyć?");
                        int wyb = scanner.nextInt();
                        if(wyb > Team.number) { System.out.println("Nie ma takiego członka"); }
                        if(SystemWalka.teamini[wyb].hp == SystemWalka.teamini[wyb].maxhp){ System.out.println("Ten członek ma maks hp"); }
                        if(SystemWalka.teamini[wyb].hp == 0){ System.out.println("Ten członek nie żyje"); }
                        else
                        {
                            SystemWalka.teamini[wyb].hp = SystemWalka.teamini[wyb].maxhp;
                            System.out.println("Członek "+SystemWalka.teamini[wyb]+" został uleczony");
                            magia=true;
                        }
                    }
            case(3) -> {
                        pkt = 3;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        for(int x = 0;x < Walka.potworybitwa.length;x++)
                        {
                            if(Walka.potworybitwa[x].hp != 0){
                            int obr = (int) ((Math.random() * (tablicaMagii.wind3.getObrażenia() - 1)) + 1) - Walka.potworybitwa[x].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[x].hp = Walka.potworybitwa[x].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[x] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[x].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[x]);
                                Walka.potworybitwa[x].hp =0;
                                SystemWalka.mortem++;
                            }
                        }}
                        magia = true;
                    }
            default -> System.out.println("Nie ma takiego spella");}
    }

    public static void MagiaZiemi()
    {
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiaziemi.length;a++){ System.out.println(a+1+" - "+tablicaMagii.magiaziemi[a]); }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt = 1;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Kogo chcesz ochronić?");
                        int wyb = scanner.nextInt();
                        if(wyb > Team.number) { System.out.println("Nie ma takiego członka"); }
                        else {
                            if(!SystemWalka.teamini[wyb].status.equals("")){ System.out.println("Ten członek ma juz nałozony status"); }
                            if(SystemWalka.teamini[wyb].hp == wyb){ System.out.println("Ten członek nie żyje"); }
                            else {
                                SystemWalka.teamini[wyb].status = "Kokon";
                                System.out.println("Członek "+SystemWalka.teamini[wyb]+" ma status kokon");
                                magia=true;
                            }
                        }
                    }
            case(2) -> {
                        pkt = 2;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Na jakiego przeciwnika chcesz oplątać?");
                        int wyb = scanner.nextInt();
                        if(wyb > Walka.potworybitwa.length) { System.out.println("Nie ma takiego potwora"); }
                        else{
                            if(!Walka.potworybitwa[wyb].status.equals("")){ System.out.println("Ten potwór ma juz nałozony status"); }
                            if(Walka.potworybitwa[wyb].hp == 0){ System.out.println("Ten potwór nie żyje"); }
                            else {
                                Walka.potworybitwa[wyb].status = "Oplątanie";
                                System.out.println("Członek "+Walka.potworybitwa[wyb]+" ma status oplątanie");
                                magia=true;
                            }
                        }
                    }
            case(3) -> {
                        pkt = 3;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        for(int x = 0;x < SystemWalka.teamini.length;x++) { SystemWalka.teamini[x].status = "Kokon"; }
                        System.out.println("cała drużyna na status kokon");
                        magia = true;
                    }
            default -> System.out.println("Nie ma takiego spella");}
    }
    public static void MagiaSwiatła(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiaswiatła.length;a++){
            System.out.println(a+1+" - "+tablicaMagii.magiaswiatła[a]);
        }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go){
            case(1)->{pkt = 1;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                System.out.println("Kogo chcesz uleczyć?");
                int wyb = scanner.nextInt();
                if(wyb > Team.number) { System.out.println("Nie ma takiego członka"); }
                if(SystemWalka.teamini[wyb].hp == SystemWalka.teamini[wyb].maxhp){ System.out.println("Ten członek ma maks hp"); }
                if(SystemWalka.teamini[wyb].hp == 0){ System.out.println("Ten członek nie żyje"); }
                else
                {
                    SystemWalka.teamini[wyb].hp = SystemWalka.teamini[wyb].maxhp;
                    System.out.println("Członek "+SystemWalka.teamini[wyb]+" został uleczony");
                    magia=true;
                }
            }
            case(2)->{pkt = 2;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                for(int x = 0;x < Walka.potworybitwa.length;x++)
                {
                    if(Walka.potworybitwa[x].hp != 0){
                        if(!Walka.potworybitwa[wyb].status.equals("")){}
                        else{
                        if(Walka.potworybitwa[wyb].hp == 0){}
                        else {
                            Walka.potworybitwa[wyb].status = "Swiatło";
                            System.out.println("Członek " + Walka.potworybitwa[wyb] + " ma status Swiatło");
                            magia = true;
                        } }
                    }
                }
                magia = true;
            }
            case(3)->{pkt = 3;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                System.out.println("Jakieku przeciwnikowi chcesz obniżyc armor?");
                int wyb = scanner.nextInt();
                if(wyb > Walka.potworybitwa.length) { System.out.println("Nie ma takiego potwora"); }
                else{
                    if(Walka.potworybitwa[wyb].hp == wyb){ System.out.println("Ten potwór nie żyje"); }
                    else {
                        Walka.potworybitwa[wyb].armor = 0;
                        System.out.println("Potwór "+Walka.potworybitwa[wyb]+" ma zniszcony armor");
                        magia=true;
                    }
                }
            }
            default -> System.out.println("Nie ma takiego spella");}
    }

    public static void MagiaKrwi(){
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiakrwi.length;a++){
            System.out.println(a+1+" - "+tablicaMagii.magiakrwi[a]);
        }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go){
            case(1)->{if(SystemWalka.teamini[SystemWalka.i].hp < SystemWalka.teamini[SystemWalka.i].hp*0.1){
                System.out.println("Nie masz życia by rzucić spell");
            }
            else
            {System.out.println("Na kogo chcesz rzucić?");
                wyb = scanner.nextInt();
                if(wyb >= Walka.potworybitwa.length){
                    System.out.println("Nie ma takiego potwora");
                }
                SystemWalka.teamini[SystemWalka.i].hp = (int) (SystemWalka.teamini[SystemWalka.i].hp -SystemWalka.teamini[SystemWalka.i].hp*0.1);
                Walka.potworybitwa[wyb].status="Krew";
                Walka.potworybitwa[wyb].NRMaga = SystemWalka.teamini[SystemWalka.i].NRMaga;
                Walka.potworybitwa[wyb].armor = 0;
                System.out.println("Potwór "+Walka.potworybitwa[wyb]+" ma zniszcony armor");
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
            case(3)->{if(SystemWalka.teamini[SystemWalka.i].hp < SystemWalka.teamini[SystemWalka.i].hp/2){
                System.out.println("Nie masz życia by rzucić spell");
            }
            else
            {
                SystemWalka.teamini[SystemWalka.i].hp = SystemWalka.teamini[SystemWalka.i].hp -SystemWalka.teamini[SystemWalka.i].hp/2;
                for(int x = 0;x < Walka.potworybitwa.length;x++)
                {
                    int obr = (int) ((Math.random() * (SystemWalka.teamini[SystemWalka.i].maxhp/2 - 1)) + 1) - Walka.potworybitwa[x].armor;
                    if(obr <= 0){obr = 0;}
                    Walka.potworybitwa[x].hp = Walka.potworybitwa[x].hp - obr;
                    System.out.println("zadałeś potworowi " + Walka.potworybitwa[x] + " " + obr + " obrażeń");
                    if (Walka.potworybitwa[x].hp <= 0)
                    {
                        System.out.println("zabiłeś potwora " + Walka.potworybitwa[x]);
                        Walka.potworybitwa[x].hp =0;
                        SystemWalka.mortem++;
                        SystemWalka.teamini[SystemWalka.i].hp = (int) (SystemWalka.teamini[SystemWalka.i].hp + SystemWalka.teamini[SystemWalka.i].hp*0.1);
                        if(SystemWalka.teamini[SystemWalka.i].hp > SystemWalka.teamini[SystemWalka.i].maxhp){SystemWalka.teamini[SystemWalka.i].hp=SystemWalka.teamini[SystemWalka.i].maxhp;}
                    }
                }
                MagiaWWalce.magia = true;}
            }
            default -> System.out.println("Nie ma takiego spella");}}

    public static void MagiaBłyskawic()
    {
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiabłyskawica.length;a++){ System.out.println(a+1+" - "+tablicaMagii.magiabłyskawica[a]); }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt = 1;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Kogo chcesz zaatakować");
                        int wyb = scanner.nextInt();
                        if(wyb > Walka.potworybitwa.length){ System.out.println("Nie ma takiego potwora"); }
                        else{
                            if(Walka.potworybitwa[wyb].hp <=0){
                                System.out.println("Ten potwór nie żyje");break;}
                        int obr = (int) ((Math.random() * (tablicaMagii.thunder1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[wyb].armor;
                        if(obr <= 0){obr = 0;}
                        Walka.potworybitwa[wyb].hp = Walka.potworybitwa[wyb].hp - obr;
                        System.out.println("zadałeś potworowi " + Walka.potworybitwa[wyb] + " " + obr + " obrażeń");
                        if (Walka.potworybitwa[wyb].hp <= 0)
                        {
                            System.out.println("zabiłeś potwora " + Walka.potworybitwa[wyb]);
                            Walka.potworybitwa[wyb].hp =0;
                            SystemWalka.mortem++;
                        }
                        magia = true;
                    }}
            case(2) -> {
                        pkt = 2;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("która kolumna");
                        int kolumna = scanner.nextInt();
                        if (kolumna < 1 || kolumna > 3) { System.out.println("To nie kolumna"); break; }
                        for (int i = kolumna - 1; i <= kolumna + 2; i = i + 3)
                        {
                            if (Walka.potworybitwa[i].hp <= 0) { System.out.println("W komórce " + i + " nikogo nie ma"); }
                            else {
                                if (Walka.potworybitwa[i].hp > 0)
                                {
                                    int obr = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[i].armor;
                                    if (obr <= 0) { obr = 0; }
                                    Walka.potworybitwa[i].hp = Walka.potworybitwa[i].hp - obr;
                                    System.out.println("zadałeś potworowi " + Walka.potworybitwa[i] + " " + obr + " obrażeń");
                                    if (Walka.potworybitwa[i].hp <= 0)
                                    {
                                        System.out.println("zabiłeś potwora " + Walka.potworybitwa[i]);
                                        Walka.potworybitwa[i].hp = 0;
                                        SystemWalka.mortem++;
                                    }
                                }
                            }
                            if(Walka.potworybitwa.length < 4){break;}
                        }
                        magia = true;
                    }
            case(3) -> {
                        pkt = 3;
                if(SystemWalka.teamini[SystemWalka.i].pktmagii < pkt){
                    System.out.println("Nie masz many na spell");
                    break;
                }
                        System.out.println("Kogo chcesz zaatakować");
                        int wyb = scanner.nextInt();
                        if(wyb > Walka.potworybitwa.length){ System.out.println("Nie ma takiego potwora"); }
                        else{
                            if(Walka.potworybitwa[wyb].hp <=0){
                                System.out.println("Ten potwór nie żyje");break;}
                        int obr = (int) ((Math.random() * (tablicaMagii.thunder3.getObrażenia() - 1)) + 1) - Walka.potworybitwa[wyb].armor;
                        if(obr <= 0){obr = 0;}
                        Walka.potworybitwa[wyb].hp = Walka.potworybitwa[wyb].hp - obr;
                        System.out.println("zadałeś potworowi " + Walka.potworybitwa[wyb] + " " + obr + " obrażeń");
                        if (Walka.potworybitwa[wyb].hp <= 0)
                        {
                            System.out.println("zabiłeś potwora " + Walka.potworybitwa[wyb]);
                            Walka.potworybitwa[wyb].hp =0;
                            SystemWalka.mortem++;
                        }
                        magia = true;
                    }}
            default -> System.out.println("Nie ma takiego spella");}
    }

    public static void MagiaOgniaBoss()
    {

        int go = random.nextInt(2);
        switch (go)
        {
            case(0) -> {
                int i = random.nextInt(SystemWalka.teamini.length);
                        if (Team.team[i].hp != 0)
                        {
                            System.out.print("Boss używa magii ognia ");
                            int obr = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Team.team[i].armor;
                            if (obr <= 0) { obr = 0; }
                            Team.team[i].hp = Team.team[i].hp - obr;
                            System.out.println(Team.team[i] + " otrzymał " + obr + " obrażeń1");
                            if (Team.team[i].hp <= 0)
                            {
                                System.out.println(Team.team[i]+" zginął");
                                Team.team[i].hp = 0;
                                SystemWalka.zyc++;
                                System.out.println(SystemWalka.zyc);
                            }
                            magia = true;
                        }
                    }
            case(1) -> {
                System.out.print("Boss używa magii ognia ");
                for(int x = 0;x < SystemWalka.teamini.length;x++)
                {

                    if(Team.team[x].hp != 0){
                        int obr = (int) ((Math.random() * (tablicaMagii.fire3.getObrażenia() - 1)) + 1) - Team.team[x].armor;
                        if(obr <= 0){obr = 0;}
                        Team.team[x].hp = Team.team[x].hp - obr;
                        System.out.println(Team.team[x] + " otrzymał " + obr + " obrażeń2");
                        if (Team.team[x].hp <= 0)
                        {
                            System.out.println(Team.team[x]+" zginął");
                            Team.team[x].hp = 0;
                            SystemWalka.zyc++;
                            System.out.println(SystemWalka.zyc);
                        }
                        magia = true;
                    }
                }
            }
        }
    }
    public static void MagiaBłyskawicBoss()
    {

        int go = random.nextInt(2);
        switch (go)
        {
            case(0) -> {
                int wyb = random.nextInt(SystemWalka.teamini.length);
                if (Team.team[wyb].hp > 0)
                {
                    System.out.print("Boss używa magii błyskawic ");
                int obr = (int) ((Math.random() * (tablicaMagii.thunder1.getObrażenia() - 1)) + 1) - Team.team[wyb].armor;
                if(obr <= 0){obr = 0;}
                    Team.team[wyb].hp = Team.team[wyb].hp - obr;
                    System.out.println(Team.team[wyb] + " otrzymał " + obr + " obrażeń1");
                if (Team.team[wyb].hp <= 0)
                {
                    System.out.println(Team.team[wyb]+" zginął");
                    Team.team[wyb].hp =0;
                    SystemWalka.zyc++;
                    System.out.println(SystemWalka.zyc);
                }
                magia = true;
            }}
            case(1) -> {
                int wyb = random.nextInt(SystemWalka.teamini.length);
                if (Team.team[wyb].hp > 0)
                {
                    System.out.print("Boss używa magii błyskawic ");
                    int obr = (int) ((Math.random() * (tablicaMagii.thunder3.getObrażenia() - 1)) + 1) - Team.team[wyb].armor;
                    if(obr <= 0){obr = 0;}
                    Team.team[wyb].hp = Team.team[wyb].hp - obr;
                    System.out.println(Team.team[wyb] + " otrzymał " + obr + " obrażeń2");
                    if (Team.team[wyb].hp <= 0)
                    {
                        System.out.println(Team.team[wyb]+" zginął");
                        Team.team[wyb].hp =0;
                        SystemWalka.zyc++;
                        System.out.println(SystemWalka.zyc);
                    }
                    magia = true;
                }}
    }
}}
