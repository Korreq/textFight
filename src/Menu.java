import java.util.Scanner;

public class Menu
{
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        boolean Menu = true;
        while (Menu)
        {
            System.out.println("                                                                                                 ");
            System.out.println("                                                                                                 ");
            System.out.println(Color.CYAN + "  ##                           ##     " + Color.RESET + " #######    ##              ###        ##    ");
            System.out.println(Color.CYAN + "  ##                           ##     " + Color.RESET + "  ##   #                     ##        ##    ");
            System.out.println(Color.CYAN + " #####      ####    ##  ##    #####   " + Color.RESET + "  ## #     ###      ### ##   ##       #####  ");
            System.out.println(Color.CYAN + "  ##       ##  ##    ####      ##     " + Color.RESET + "  ####      ##     ##  ##    #####     ##    ");
            System.out.println(Color.CYAN + "  ##       ######     ##       ##     " + Color.RESET + "  ## #      ##     ##  ##    ##  ##    ##    ");
            System.out.println(Color.CYAN + "  ## ##    ##        ####      ## ##  " + Color.RESET + "  ##        ##      #####    ##  ##    ## ## ");
            System.out.println(Color.CYAN + "   ###      #####   ##  ##      ###   " + Color.RESET + " ####      ####        ##   ###  ##     ###  ");
            System.out.println("                                                        #####                     ");
            System.out.println();
            System.out.println("Opcje:");
            System.out.println("1 : Nowa gra");
            System.out.println("2 : Credits");
            System.out.println("3 : Encyklopedia");
            System.out.println("4 : Wyjdz");
            System.out.println("\nv. 0.99(Final Stop )");
            int choice;
            while (!scanner.hasNextInt())
            {
                System.out.println("╔══════════════╗");
                System.out.println("║ To nie numer ║");
                System.out.println("╚══════════════╝");
                scanner.next(); // this is important!
            }
            choice = scanner.nextInt();
            switch (choice)
            {
                case (1) ->
                        {
                            System.out.println("Nowa historia własnie się rozpoczęła");
                            Menu = false;
                        }
                case (2) ->
                        {
                            System.out.println("Twórcy: Bartosz Kolberg,Łukasz Korycki,Szymon Baniewicz");
                            System.out.println("Lektor: Łukasz Korycki");
                            System.out.println("Początkowa nazwa gry:");
                            System.out.println(Color.GREEN+"  #####   ###                        ###          "+Color.RESET+"   ######              ##       ##      ###                         ##                                        ");
                            System.out.println(Color.GREEN+" ##   ##   ##                         ##          "+Color.RESET+"    ##  ##             ##       ##       ##                        ####                                       ");
                            System.out.println(Color.GREEN+" ##        ##      ######    ####     ##  ##      "+Color.RESET+"    ##  ##            #####    #####     ##      ####             ##  ##   ######    ####    #####            ");
                            System.out.println(Color.GREEN+"  #####    #####    ##  ##  ##  ##    ## ##       "+Color.RESET+"    #####    ####      ##       ##       ##     ##  ##            ##  ##    ##  ##  ##  ##   ##  ##    ####   ");
                            System.out.println(Color.GREEN+"      ##   ##  ##   ##      ######    ####        "+Color.RESET+"    ##  ##  #    #     ##       ##       ##     ######            ######    ##      ######   ##  ##   #    #  ");
                            System.out.println(Color.GREEN+" ##   ##   ##  ##   ##      ##        ## ##       "+Color.RESET+"    ##  ##  #   ##     ## ##    ## ##    ##     ##                ##  ##    ##      ##       ##  ##   #   ##  ");
                            System.out.println(Color.GREEN+"  #####   ###  ##  ####      #####    ##  ##      "+Color.RESET+"   ######    ### #      ###      ###    ####     #####            ##  ##   ####      #####   ##  ##    ### #  \n");
                        }
                case (3) ->
                        {
                            System.out.println("Wielka encyklopedia");
                            System.out.println("╔═══╦════════════════════════════════════╗");
                            System.out.println("║   ║    Czego chcesz się dowiedzieć?    ║");
                            System.out.println("║   ║ - - - - - - - - - - - - - - - - -  ║");
                            System.out.println("║ 1 ║ Podstawy gry                       ║");
                            System.out.println("║ 2 ║ Magia (runy)                       ║");
                            System.out.println("╚═══╩════════════════════════════════════╝");
                            int choice2;
                            choice2 = scanner.nextInt();
                            switch (choice2)
                            {
                                case (1) -> {
                                    System.out.print("Po wprowadzeniu w świat gry, wybierasz od jednego do sześciu bohaterów z których będzie się składała twoja drużyna.");
                                    System.out.println("\nBohaterowie pojawiający się w karczmie są za każdym razem losowani z puli bohaterów. Walki odbywają się na polu 2x3:");
                                    System.out.println("╔═══════════╗");
                                    System.out.println("║ 5   4   3 ║");
                                    System.out.println("║ 0   1   2 ║");
                                    System.out.println("║ - - - - - ║");
                                    System.out.println("║ 0   1   2 ║");
                                    System.out.println("║ 3   4   5 ║");
                                    System.out.println("╚═══════════╝");
                                    System.out.print("Twoi bohaterowie zostają rozstawieni na dolnym polu. Położenie swoich bohaterów możesz dowolnie modyfikować.");
                                    System.out.println("Wrodzy bohaterowie zostają rozstawieni na górnym polu.\nAby zaatakować wroga znajdującego się w danym miejscu należy wybrac cyfrę od 0-6 która reprezentuje jego położenie na polu bitwy.");
                                    System.out.println("Podczas walki bohaterowie mogą korzystać z zwykłych ataków oraz czarów lub umiejętności zależnych od posiadanej runy.");
                                    System.out.println("Walka dobiega końca gdy wszyscy twoi lub wrodzy bohaterowie zostaną zabici.");
                                }
                                case (2) -> {
                                        System.out.println("╔═══╦════════════════════════════════════╗");
                                        System.out.println("║   ║          Wybierz runę              ║");
                                        System.out.println("║   ║ - - - - - - - - - - - - - - - - -  ║");
                                        System.out.println("║ 1 ║ Runa ognia                         ║");
                                        System.out.println("║ 2 ║ Runa wody                          ║");
                                        System.out.println("║ 3 ║ Runa wiatru                        ║");
                                        System.out.println("║ 4 ║ Runa ziemi                         ║");
                                        System.out.println("║ 5 ║ Runa światła                       ║");
                                        System.out.println("║ 6 ║ Runa krwi                          ║");
                                        System.out.println("║ 7 ║ Runa błyskawic                     ║");
                                        System.out.println("╚═══╩════════════════════════════════════╝");
                                    int choice3;
                                    choice3 = scanner.nextInt();
                                    switch (choice3)
                                    {
                                        case (1) -> {
                                            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║                                          Magia Ognia                                          ║");
                                            System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════════════════╣");
                                            System.out.println("║ Obszarowe obrażenia.                                                                          ║");
                                            System.out.println("║ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ║");
                                            System.out.println("║ 1. Ognista włócznia - średnie obrażenia zadane dla danej kolumny przeciwników.                ║");
                                            System.out.println("║ 2. Ściana ognia - średnie obrażenia dla danego rzędu przeciwników.                            ║");
                                            System.out.println("║ 3. Deszcz ognia - duże obrażenia  zadane wszystkim przeciwnikom na polu bitwy.                ║");
                                            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        }
                                        case (2) -> {
                                            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║                                          Magia Wody                                           ║");
                                            System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════════════════╣");
                                            System.out.println("║ Odnawianie sił życiowych i zaklęcia defensywne.                                               ║");
                                            System.out.println("║ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ║");
                                            System.out.println("║ 1. Kropla życia - jeden sojusznik odzyskuje część życia.                                      ║");
                                            System.out.println("║ 2. Mgła - jeden sojusznik zostaje osłoniony mgłą, przez co unika trafień w najbliższej turze. ║");
                                            System.out.println("║ 3. Fala życia  - wszyscy sojusznicy odzyskują pełne życie.                                    ║");
                                            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        }
                                        case (3) -> {
                                            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║                                         Magia Wiatru                                          ║");
                                            System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════════════════╣");
                                            System.out.println("║ Zaklęcia hybrydowe.                                                                           ║");
                                            System.out.println("║ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ║");
                                            System.out.println("║ 1. Świst wiatru - jeden przeciwnik otrzymuje średnią ilość obrażeń.                           ║");
                                            System.out.println("║ 2. Ciepła bryza - jeden sojusznik odzyskuje część życia.                                      ║");
                                            System.out.println("║ 3. Trąba powietrzna - wszyscy wrogowie otrzymują duże obrażenia.                              ║");
                                            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        }
                                        case (4) -> {
                                            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║                                          Magia Ziemi                                          ║);
                                            System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════════════════╣");
                                            System.out.println("║ Zaklęcia defensywne.                                                                          ║");
                                            System.out.println("║ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ║");
                                            System.out.println("║ 1. Kokon - wskazany sojusz otrzymuje połowę mniejsze obrażenia w następnej turze.             ║");
                                            System.out.println("║ 2. Pnącza - wskazany wróg zostaje oplątany na jedną turę i nie może wykonać żadnej akcji.     ║");
                                            System.out.println("║ 3.  Całun flory - cała twoja drużyna otrzymuje połowę mniejsze obrażenia.                     ║");
                                            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        }
                                        case (5) -> {
                                            System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║                                         Magia Światła                                          ║");
                                            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════╣");
                                            System.out.println("║ Zaklęcia kontrolne.                                                                            ║");
                                            System.out.println("║ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ║");
                                            System.out.println("║ 1. Boska pomoc - ulecz wskazanego sojusznika.                                                  ║");
                                            System.out.println("║ 2. Boski promień - oślep wskazanego przeciwnika przez co nie będzie mógł wykonać żadnej akcji. ║");
                                            System.out.println("║ 3. Oświecenie - oślep wszystkich przeciwników.                                                 ║");
                                            System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        }
                                        case (6) -> {
                                            System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║                                                                     Magia Krwi                                                                     ║");
                                            System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
                                            System.out.println("║ Zaklęcia ofensywne kosztujące życie.                                                                                                               ║");
                                            System.out.println("║ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ║");
                                            System.out.println("║ 1. Krwawy akt - wskazanemu wrogowi zostaje zniszczony pancerz.                                                                                     ║");
                                            System.out.println("║ 2. Krwawa więź - powiąż więzami krwi dwóch wskazanych wrógów. Zadanie obrażeń jednemu z tych wrogów sprawi że ten drugi również otrzyma obrażenia. ║");
                                            System.out.println("║ 3. Krwawy rytuał - wszyscy wrogowie otrzymują średnią ilość obrażeń.                                                                               ║");
                                            System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
                                        }
                                        case (7) -> {
                                            System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════╗");
                                            System.out.println("║                                        Magia Błyskawic                                        ║");
                                            System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════════════════╣");
                                            System.out.println("║ Duże obrażenia!                                                                               ║");
                                            System.out.println("║ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ║");
                                            System.out.println("║ 1. Piorun strzelisty - jeden przeciwnik otrzymuje średnią ilość obrażeń.                      ║");
                                            System.out.println("║ 2. Strzelista włócznia - wskazana kolumna przeciwników otrzymuje średnie obrażenia.           ║");
                                            System.out.println("║ 3. Gniew Magnira - jeden przeciwnik otrzymuje losową ilość obrażeń.                           ║");
                                            System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════╝\n");
                                        }
                                        default -> System.out.println("Nie ma takiej opcji");
                                    }

                                }

                                default -> System.out.println("Nie ma takiej opcji");
                            }
                        }
                case (4) -> System.exit(0);
                default -> System.out.println("Nope");
            }
        }
    }
}

