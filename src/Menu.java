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
            System.out.println("3: Encyklopedia");
            System.out.println("4 : Wyjdz");
            System.out.println("\nv. 0.06(Magic Fixes Redux)");

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
                        }
                case (4) -> System.exit(0);
                default -> System.out.println("Nope");

            }
        }
    }
}


