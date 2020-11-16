public class PoleBitwy {


    public static void main() {

        System.out.println("╔═════════╦═════════╦═════════╗");
        if(Walka.potworybitwa.length > 3){System.out.println("║    " + Walka.potworybitwa[3] + "   ║    " + Walka.potworybitwa[4] + "   ║    " + Walka.potworybitwa[5] + "   ║");}
        System.out.println("║    " + Walka.potworybitwa[0] + "   ║    " + Walka.potworybitwa[1] + "   ║    " + Walka.potworybitwa[2] + "   ║");
        System.out.println("║ -  -  - ║ -  -  - ║ -  -  - ║");
        System.out.print("║    " + Team.team[0].lit + "    ║    ");

        for (int i = 1; i < Team.number; i++)
        {
            if (i == 3) { System.out.print("\n║    "); }
            System.out.print(Team.team[i].lit + "    ║     ");
        }
        if (3 > Team.number)
        {
            for (int i = 3; i > Team.number; i--) { System.out.print("     ║    "); }
        }
        if (6 > Team.number && 3 < Team.number)
        {
            for (int i = 6; i > Team.number; i--) { System.out.print("     ║    "); }
        }
        System.out.println();
        System.out.println("╚═════════╩═════════╩═════════╝");
    }

}
