
import java.util.Scanner;

public class ZarzadzanieDruzyna {

    public static void zarzadzanie(){
        System.out.println("\nPo wyjściu z karczmy masz chwile dla siebie wybierz co chcesz zrobic\n");
        Scanner scanner = new Scanner(System.in);
        boolean oboz = false;
        while(!oboz){
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║       Co chcesz zrobić:       ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ A • Pokaż drużyne             ║");
            System.out.println("║ B • Zmien ustawienia drużyny  ║");
            System.out.println("║ C • Zakończ i wyrusz w podróż ║");
            System.out.println("╚═══════════════════════════════╝");
            char choice = scanner.next().charAt(0);
            char choice2 = Character.toLowerCase(choice);
        switch (choice2){
            case('a')->{
                System.out.println("╔══════════════════╗");
                System.out.println("║ Twoja drużyna    ║");
                System.out.println("╠══════════════════╣");
                for (int i = 0; i < Team.number; i++) {
                    int p1=i+1;
                    System.out.println("║ [" + p1 + "] • " + Team.team[i]+"   ║");
                }
                System.out.println("╚══════════════════╝\n");
            }
            case('b')->{
                if(Team.number == 1){
                    System.out.println("Masz tylko 1 członka");
                    break;
                }
                System.out.println("Kogo chcesz wymienić:");
                int wyb;
                    while (!scanner.hasNextInt()) {
                        System.out.println("╔══════════════╗");
                        System.out.println("║ To nie numer ║");
                        System.out.println("╚══════════════╝");
                        scanner.next(); // this is important!
                    }
                    wyb = scanner.nextInt();
                if(wyb > Team.number || wyb <= 0){
                    System.out.println("╔═══════════════════════════════════════════╗");
                    System.out.println("║ Nie ma takiego członka! Spróbuj ponownie. ║");
                    System.out.println("╚═══════════════════════════════════════════╝\n");
                    break;
                }
                System.out.println("Na kogo:");
                int wyb2;
                    while (!scanner.hasNextInt()) {
                        System.out.println("╔══════════════╗");
                        System.out.println("║ To nie numer ║");
                        System.out.println("╚══════════════╝");
                        scanner.next(); // this is important!
                    }
                    wyb2 = scanner.nextInt();
                if(wyb2 > Team.number || wyb2 <= 0){
                    System.out.println("╔═══════════════════════════════════════════╗");
                    System.out.println("║ Nie ma takiego członka! Spróbuj ponownie. ║");
                    System.out.println("╚═══════════════════════════════════════════╝\n");
                    break;
                }
                Team.bufor[0] = Team.team[wyb-1];
                Team.team[wyb-1] = Team.team[wyb2-1];
                Team.team[wyb2-1] = Team.bufor[0];
            }
            case('c')-> oboz = true;
            default -> {
                System.out.println("╔════════════════════════════════════════╗");
                System.out.println("║ Nie ma takiej opcji! Spróbuj ponownie. ║");
                System.out.println("╚════════════════════════════════════════╝\n");}
        }
    }}
}
