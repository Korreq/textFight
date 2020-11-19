import Bohaterowie.Bohaterowie;
import Bohaterowie.TablicaBohaterów;
import java.util.*;

public class Start
{
    public static void start()
    {
        Scanner myScanner = new Scanner(System.in);
        TablicaBohaterów tablicaBohaterów = new TablicaBohaterów();
        Bohaterowie[] kopiaboh = tablicaBohaterów.boh;
        Collections.shuffle(Arrays.asList(kopiaboh));
        Bohaterowie[] karczma = new Bohaterowie[12];
        System.arraycopy(kopiaboh, 0, karczma, 0, 12);

        System.out.println("Jesteś w karczmie wybierz bohaterów aby utworzyć drużynę.\n");
        Bohaterowie[] dru = Team.team;
        boolean dosc = false;
        do {
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║   Liczba osób w drużynie: "+Team.number+"   ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ A • Dodaj członka drużyny     ║");
            System.out.println("║ B • Wyświetl aktualną drużynę ║");
            System.out.println("║ C • Zakończ i wyrusz w drogę  ║");
            System.out.println("╚═══════════════════════════════╝");
            char choice = myScanner.next().charAt(0);
            char choice2 = Character.toLowerCase(choice);
            switch (choice2)
            {
                case ('a') -> {
                            System.out.println("╔═══════════════════════════════════════╗");
                            System.out.println("║      Osoby znajdujące się w tawernie  ║");
                            for (int i = 0; i < karczma.length; i++)
                            {
                                if(karczma[i] != null)
                                {
                                    System.out.println("╠═══════════════════════════════════════╣");
                                    System.out.println("║ [" + i + "] " + karczma[i] + "                    ");
                                }
                            }
                            System.out.println("╚═══════════════════════════════════════╝");
                            int wyb;
                            while (!myScanner.hasNextInt())
                            {
                            System.out.println("╔══════════════╗");
                            System.out.println("║ To nie numer ║");
                            System.out.println("╚══════════════╝");
                            myScanner.next();
                            }
                            wyb = myScanner.nextInt();
                            if ( wyb >= 0 && wyb < karczma.length)
                            {
                                if (karczma[wyb] != null)
                                {
                                    dru[Team.number] = karczma[wyb];
                                    karczma[wyb] = null;
                                    Team.number++;
                                }
                                else
                                {
                                    System.out.println("╔════════════════════════════════════════╗");
                                    System.out.println("║       Postać została już wybrana.      ║");
                                    System.out.println("╚════════════════════════════════════════╝");
                                }
                                if (Team.number == 6) dosc = true;
                            }
                            else {
                                System.out.println("╔════════════════════════════════════════╗");
                                System.out.println("║ Nie ma takiej opcji! Spróbuj ponownie. ║");
                                System.out.println("╚════════════════════════════════════════╝");
                            }
                }
                case ('b') -> {
                            if (Team.number == 0) System.out.println("Musisz mieć przynajmiej jednego członka w drużynie");
                            else {
                                System.out.println("╔══════════════════╗");
                                System.out.println("║ Twoja drużyna    ║");
                                System.out.println("╠══════════════════╣");
                                for (int i = 0; i < Team.number; i++) { int p1=i+1;System.out.println("║ [" + p1 + "] • " + dru[i]+"   ║"); }
                                System.out.println("╚══════════════════╝");
                            }
                }
                case ('c') -> {
                            if (Team.number == 0) System.out.println("Musisz mieć przynajmiej jednego członka w drużynie");
                            else { dosc = true; }
                }
                default -> {
                    System.out.println("╔════════════════════════════════════════╗");
                    System.out.println("║ Nie ma takiej opcji! Spróbuj ponownie. ║");
                    System.out.println("╚════════════════════════════════════════╝");
                }
            }
        }while (!dosc);
        System.out.println("╔══════════════════╗");
        System.out.println("║ Twoja drużyna    ║");
        System.out.println("╠══════════════════╣");
        for (int i = 0; i < Team.number; i++) { int p1=i+1;System.out.println("║ [" + p1 + "] • " + dru[i]+"   ║"); }
        System.out.println("╚══════════════════╝");
    }
}

