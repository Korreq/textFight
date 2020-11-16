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
            System.out.println("\nv. 0.09(Bugs of the Dead)");

            int choice;
                while (!scanner.hasNextInt()) {
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
                            System.out.println("║ 3 ║ Klasy                              ║");
                            System.out.println("╚═══╩════════════════════════════════════╝");
                            int choice2;
                            choice2 = scanner.nextInt();
                            switch (choice2) {
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
                                    
                                }
                                case (3) -> {

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

