import Magia.TablicaMagii;

import java.util.Scanner;

public class MagiaWWalce {
    static TablicaMagii tablicaMagii = new TablicaMagii();
    static Scanner scanner = new Scanner(System.in);
    static boolean magia = false;
    static int pkt;
    static int hp =0;

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
                                    }
                                }
                            }
                        }
                        magia = true;
                    }
            case(2) -> {
                        pkt = 2;
                        System.out.println("który rząd");
                        int rzad = scanner.nextInt();
                        if (rzad < 1 || rzad > 2) { System.out.println("To nie rząd"); break; }
                        if (rzad == 2) { rzad = 4; }
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
                                    }
                                }
                            }
                        }
                        magia = true;
                    }
            case(3) -> {
                        pkt=3;
                        for(int x = 0;x < Walka.potworybitwa.length;x++)
                        {
                            int obr = (int) ((Math.random() * (tablicaMagii.fire3.getObrażenia() - 1)) + 1) - Walka.potworybitwa[x].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[x].hp = Walka.potworybitwa[x].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[x] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[x].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[x]);
                                Walka.potworybitwa[x].hp = 0;
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
        for(int a=0;a < tablicaMagii.magiawiatru.length;a++){ System.out.println(a+" - "+tablicaMagii.magiawiatru[a]); }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt = 1;
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
                        }
                    }
            case(2) -> {
                        pkt = 2;
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
                        for(int x = 0;x < Walka.potworybitwa.length;x++)
                        {
                            int obr = (int) ((Math.random() * (tablicaMagii.wind3.getObrażenia() - 1)) + 1) - Walka.potworybitwa[x].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[x].hp = Walka.potworybitwa[x].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[x] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[x].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[x]);
                                Walka.potworybitwa[x].hp =0;
                            }
                        }
                        magia = true;
                    }
            default -> System.out.println("Nie ma takiego spella");}
    }

    public static void MagiaZiemi()
    {
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiaziemi.length;a++){ System.out.println(a+" - "+tablicaMagii.magiaziemi[a]); }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt = 1;
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
                        System.out.println("Na jakiego przeciwnika chcesz oplątać?");
                        int wyb = scanner.nextInt();
                        if(wyb > Walka.potworybitwa.length) { System.out.println("Nie ma takiego potwora"); }
                        else{
                            if(!Walka.potworybitwa[wyb].status.equals("")){ System.out.println("Ten potwór ma juz nałozony status"); }
                            if(Walka.potworybitwa[wyb].hp == wyb){ System.out.println("Ten potwór nie żyje"); }
                            else {
                                Walka.potworybitwa[wyb].status = "Oplątanie";
                                System.out.println("Członek "+Walka.potworybitwa[wyb]+" ma status oplątanie");
                                magia=true;
                            }
                        }
                    }
            case(3) -> {
                        pkt = 3;
                        for(int x = 0;x < SystemWalka.teamini.length;x++) { SystemWalka.teamini[x].status = "Kokon"; }
                        System.out.println("cała drużyna na status kokon");
                        magia = true;
                    }
            default -> System.out.println("Nie ma takiego spella");}
    }
    //Trzeba to jeszcze dokończyć
    public static void MagiaSwiatła(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiaswiatła.length;a++){
            System.out.println(a+" - "+tablicaMagii.magiaswiatła[a]);
        }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go){
            case(1)->pkt = 1;
            case(2)->pkt = 2;
            case(3)->pkt = 3;
            default -> System.out.println("Nie ma takiego spella");}
    }
    //A to trzeba komuś zaaplikować
    public static void MagiaBłyskawic()
    {
        System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiabłyskawica.length;a++){ System.out.println(a+" - "+tablicaMagii.magiabłyskawica[a]); }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go)
        {
            case(1) -> {
                        pkt = 1;
                        System.out.println("Kogo chcesz zaatakować");
                        int wyb = scanner.nextInt();
                        if(wyb > Walka.potworybitwa.length){ System.out.println("Nie ma takiego potwora"); }
                        int obr = (int) ((Math.random() * (tablicaMagii.thunder1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[wyb].armor;
                        if(obr <= 0){obr = 0;}
                        Walka.potworybitwa[wyb].hp = Walka.potworybitwa[wyb].hp - obr;
                        System.out.println("zadałeś potworowi " + Walka.potworybitwa[wyb] + " " + obr + " obrażeń");
                        if (Walka.potworybitwa[wyb].hp <= 0)
                        {
                            System.out.println("zabiłeś potwora " + Walka.potworybitwa[wyb]);
                            Walka.potworybitwa[wyb].hp =0;
                        }
                        magia = true;
                    }
            case(2) -> {
                        pkt = 2;
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
                                    }
                                }
                            }
                        }
                        magia = true;
                    }
            case(3) -> {
                        pkt = 3;
                        System.out.println("Kogo chcesz zaatakować");
                        int wyb = scanner.nextInt();
                        if(wyb > Walka.potworybitwa.length){ System.out.println("Nie ma takiego potwora"); }
                        int obr = (int) ((Math.random() * (tablicaMagii.thunder3.getObrażenia() - 1)) + 1) - Walka.potworybitwa[wyb].armor;
                        if(obr <= 0){obr = 0;}
                        Walka.potworybitwa[wyb].hp = Walka.potworybitwa[wyb].hp - obr;
                        System.out.println("zadałeś potworowi " + Walka.potworybitwa[wyb] + " " + obr + " obrażeń");
                        if (Walka.potworybitwa[wyb].hp <= 0)
                        {
                            System.out.println("zabiłeś potwora " + Walka.potworybitwa[wyb]);
                            Walka.potworybitwa[wyb].hp =0;
                        }
                        magia = true;
                    }
            default -> System.out.println("Nie ma takiego spella");}
    }
}
