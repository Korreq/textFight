import java.util.Scanner;

public class Menu {

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        boolean Menu = true;
        while (Menu) {
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
            System.out.println("3 : Wyjdz");
            System.out.println("\nv. 0.04(Magic Errors)");

            int wybór = (scanner.nextInt());


            switch (wybór) {
                case (1) -> {
                    System.out.println("Nowa historia własnie się rozpoczęła");
                    Menu = false;
                    break;
                }
                case (2) -> {
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
                case (3) -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Nope");
                }
            }
        }


    }
}


