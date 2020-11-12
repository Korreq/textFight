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
        for(int a=0;a < tablicaMagii.magiaognia.length;a++){
            System.out.println(a+1+" - "+tablicaMagii.magiaognia[a]);
        }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go){
            case(1)->{
                pkt=1;
                System.out.println("który rząd");
                int rzad = scanner.nextInt();
                switch (rzad){
                    case(1)->{
                        if(Walka.potworybitwa[0].hp <= 0 && Walka.potworybitwa[3].hp <= 0)
                        {
                            System.out.println("W tym rzędzie nikogo nie ma");
                        }
                        else{
                        if(Walka.potworybitwa[0].hp > 0){
                        int obr = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[0].armor;
                        if(obr <= 0){obr = 0;}
                        Walka.potworybitwa[0].hp = Walka.potworybitwa[0].hp - obr;
                        System.out.println("zadałeś potworowi " + Walka.potworybitwa[0] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[0].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[0]);
                                Walka.potworybitwa[0].hp =0;
                            }}
                        if(Walka.potworybitwa[3].hp > 0){
                        int obr2 = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[3].armor;
                        if(obr2 <= 0){obr2 = 0;}
                        Walka.potworybitwa[3].hp = Walka.potworybitwa[3].hp - obr2;
                        System.out.println("i zadałeś potworowi " + Walka.potworybitwa[3] + " " + obr2 + " obrażeń");
                            if (Walka.potworybitwa[3].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[3]);
                                Walka.potworybitwa[3].hp =0;
                            }}

                        magia = true;


                        }

                    }
                    case(2)->{if(Walka.potworybitwa[1].hp <= 0 && Walka.potworybitwa[4].hp <= 0)
                    {
                        System.out.println("W tym rzędzie nikogo nie ma");
                    }
                    else{
                        if(Walka.potworybitwa[1].hp > 0){
                            int obr = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[1].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[1].hp = Walka.potworybitwa[1].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[1] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[1].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[1]);
                                Walka.potworybitwa[1].hp =0;
                            }}
                        if(Walka.potworybitwa[4].hp > 0){
                            int obr2 = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[4].armor;
                            if(obr2 <= 0){obr2 = 0;}
                            Walka.potworybitwa[4].hp = Walka.potworybitwa[4].hp - obr2;
                            System.out.println("i zadałeś potworowi " + Walka.potworybitwa[4] + " " + obr2 + " obrażeń");
                            if (Walka.potworybitwa[4].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[4]);
                                Walka.potworybitwa[4].hp =0;
                            }}
                        magia = true;

                        }}
                    case(3)->{if(Walka.potworybitwa[2].hp  <= 0 && Walka.potworybitwa[5].hp <= 0)
                    {
                        System.out.println("W tym rzędzie nikogo nie ma");
                    }
                    else{
                        if(Walka.potworybitwa[2].hp > 0){
                            int obr = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[2].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[2].hp = Walka.potworybitwa[2].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[2] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[2].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[2]);
                                Walka.potworybitwa[2].hp =0;
                            }}
                        if(Walka.potworybitwa[5].hp > 0){
                            int obr2 = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[5].armor;
                            if(obr2 <= 0){obr2 = 0;}
                            Walka.potworybitwa[5].hp = Walka.potworybitwa[5].hp - obr2;
                            System.out.println("i zadałeś potworowi " + Walka.potworybitwa[5] + " " + obr2 + " obrażeń");
                            if (Walka.potworybitwa[5].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[5]);
                                Walka.potworybitwa[5].hp =0;
                            }}
                        magia = true;

                        }}
                    default -> System.out.println("Nie ma takiego rzędu");
                }
            }
            case(2)->{
                pkt=2;
                System.out.println("która kolumna");
                int kolumna = scanner.nextInt();
                switch (kolumna){
                    case(1)->{if(Walka.potworybitwa[0].hp >0 && Walka.potworybitwa[1].hp <= 0 && Walka.potworybitwa[2].hp <= 0)
                    {
                        System.out.println("W tej kolumnie nikogo nie ma");
                    }
                    else{
                        if(Walka.potworybitwa[0].hp > 0){
                            int obr = (int) ((Math.random() * (tablicaMagii.fire2.getObrażenia() - 1)) + 1) - Walka.potworybitwa[0].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[0].hp = Walka.potworybitwa[0].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[0] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[0].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[0]);
                                Walka.potworybitwa[0].hp =0;
                            }}

                        if(Walka.potworybitwa[1].hp > 0){
                            int obr = (int) ((Math.random() * (tablicaMagii.fire2.getObrażenia() - 1)) + 1) - Walka.potworybitwa[1].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[1].hp = Walka.potworybitwa[1].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[1] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[1].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[1]);
                                Walka.potworybitwa[1].hp =0;
                            }}

                        if(Walka.potworybitwa[2].hp > 0){
                            int obr = (int) ((Math.random() * (tablicaMagii.fire2.getObrażenia() - 1)) + 1) - Walka.potworybitwa[2].armor;
                            if(obr <= 0){obr = 0;}
                            Walka.potworybitwa[2].hp = Walka.potworybitwa[2].hp - obr;
                            System.out.println("zadałeś potworowi " + Walka.potworybitwa[2] + " " + obr + " obrażeń");
                            if (Walka.potworybitwa[2].hp <= 0)
                            {
                                System.out.println("zabiłeś potwora " + Walka.potworybitwa[2]);
                                Walka.potworybitwa[2].hp =0;
                            }}

                    }magia = true;
                    }
                    case(2)->{
                        if(Walka.potworybitwa[3].hp <= 0 && Walka.potworybitwa[4].hp <= 0 && Walka.potworybitwa[5].hp <= 0)
                        {
                            System.out.println("W tej kolumnie nikogo nie ma");
                        }
                        else{
                            if(Walka.potworybitwa[3].hp > 0){
                                int obr2 = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[3].armor;
                                if(obr2 <= 0){obr2 = 0;}
                                Walka.potworybitwa[3].hp = Walka.potworybitwa[3].hp - obr2;
                                System.out.println("i zadałeś potworowi " + Walka.potworybitwa[3] + " " + obr2 + " obrażeń");
                                if (Walka.potworybitwa[3].hp <= 0)
                                {
                                    System.out.println("zabiłeś potwora " + Walka.potworybitwa[3]);
                                    Walka.potworybitwa[3].hp =0;
                                }}
                            if(Walka.potworybitwa[4].hp > 0){
                                int obr2 = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[4].armor;
                                if(obr2 <= 0){obr2 = 0;}
                                Walka.potworybitwa[4].hp = Walka.potworybitwa[4].hp - obr2;
                                System.out.println("i zadałeś potworowi " + Walka.potworybitwa[4] + " " + obr2 + " obrażeń");
                                if (Walka.potworybitwa[4].hp <= 0)
                                {
                                    System.out.println("zabiłeś potwora " + Walka.potworybitwa[4]);
                                    Walka.potworybitwa[4].hp =0;
                                }}
                            if(Walka.potworybitwa[5].hp > 0){
                                int obr2 = (int) ((Math.random() * (tablicaMagii.fire1.getObrażenia() - 1)) + 1) - Walka.potworybitwa[5].armor;
                                if(obr2 <= 0){obr2 = 0;}
                                Walka.potworybitwa[5].hp = Walka.potworybitwa[5].hp - obr2;
                                System.out.println("i zadałeś potworowi " + Walka.potworybitwa[5] + " " + obr2 + " obrażeń");
                                if (Walka.potworybitwa[5].hp <= 0)
                                {
                                    System.out.println("zabiłeś potwora " + Walka.potworybitwa[5]);
                                    Walka.potworybitwa[5].hp =0;
                                }}
                            magia = true;
                    }}
                    default -> System.out.println("Nie ma takiej kolumny");
                }
            }
            case(3)->{
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
                        Walka.potworybitwa[x].hp =0;
                    }
                }
                magia = true;
            }
            default -> System.out.println("Nie masz takiego spella");
        }
    }


    public static void MagiaWody(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiawody.length;a++){
            System.out.println(a+1+" - "+tablicaMagii.magiawody[a]);
        }
        System.out.println("Którego spella chcesz użyć");
        int go = scanner.nextInt();
        switch (go){
            case(1)->{pkt = 1;
                System.out.println("Kogo chcesz uleczyć?");
                int wyb = scanner.nextInt();
                if(wyb > Team.number)
                {
                    System.out.println("Nie ma takiego członka");
                }
                if(SystemWalka.teamini[wyb].hp == SystemWalka.teamini[wyb].maxhp){
                    System.out.println("Ten członek ma maks hp");
                }
                if(SystemWalka.teamini[wyb].hp == 0){
                    System.out.println("Ten członek nie żyje");
                }
                else
                {
                    SystemWalka.teamini[wyb].hp = SystemWalka.teamini[wyb].maxhp;
                    System.out.println("Członek "+SystemWalka.teamini[wyb]+" został uleczony");
                    magia=true;
                }}
            case(2)->{ pkt = 2;
            System.out.println("Kogo chcesz ochronić?");
            int wyb = scanner.nextInt();
            if(wyb > Team.number)
            {
                System.out.println("Nie ma takiego członka");
            }
            else{
                        if(SystemWalka.teamini[wyb].status != ""){
                            System.out.println("Ten członek ma juz nałożony status");
                        }
                        if(SystemWalka.teamini[wyb].hp == wyb){
                            System.out.println("Ten członek nie żyje");
                        }
                        else
                        {SystemWalka.teamini[wyb].status = "Mgła";
                            System.out.println("Członek "+SystemWalka.teamini[wyb]+" ma status mgła");
                            magia=true;}
                    }

                }
            case(3)->{pkt = 3;
                for(int x=0;x<SystemWalka.teamini.length;x++){
                    if(SystemWalka.teamini[x].hp == SystemWalka.teamini[x].maxhp){

                        hp++;
                    }}
                    if(hp == SystemWalka.teamini.length){
                    System.out.println("cała drużyna ma maxhp");
                    break;}

                for(int x=0;x<SystemWalka.teamini.length;x++){
                SystemWalka.teamini[x].hp = SystemWalka.teamini[x].maxhp;
                System.out.println("cała drużyna została uleczona");
                    magia=true;
            }
            }
            default -> System.out.println("Nie masz takiego spella");
            }
    }
    
    public static void MagiaWiatru(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiawiatru.length;a++){
            System.out.println(a+" - "+tablicaMagii.magiawiatru[a]);
        }
        System.out.println("Którego spella chcesz użyć");
    }
    public static void MagiaZiemi(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiaziemi.length;a++){
            System.out.println(a+" - "+tablicaMagii.magiaziemi[a]);
        }
        System.out.println("Którego spella chcesz użyć");
    }
    public static void MagiaSwiatła(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiaswiatła.length;a++){
            System.out.println(a+" - "+tablicaMagii.magiaswiatła[a]);
        }
        System.out.println("Którego spella chcesz użyć");
    }
    public static void MagiaKrwi(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiakrwi.length;a++){
            System.out.println(a+" - "+tablicaMagii.magiakrwi[a]);
        }
        System.out.println("Którego spella chcesz użyć");
    }
    public static void MagiaBłyskawic(){System.out.println("Lista spelli");
        for(int a=0;a < tablicaMagii.magiabłyskawica.length;a++){
            System.out.println(a+" - "+tablicaMagii.magiabłyskawica[a]);
        }
        System.out.println("Którego spella chcesz użyć");
    }

}
