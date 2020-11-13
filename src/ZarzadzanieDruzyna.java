
import java.util.Scanner;

public class ZarzadzanieDruzyna {

    public static void zarzadzanie(){
        Scanner scanner = new Scanner(System.in);
        boolean oboz = false;
        while(!oboz){
        System.out.println("Po wyjściu z karczmy masz chwile dla siebie wybierz co chcesz zrobic");
        System.out.println("1: pokaż drużyne");
        System.out.println("2: zmien ustawienia drużyny");
        System.out.println("3: indeks");// pewnie potem tu damy żeby ludzie wiedzieli co robia spelle
        System.out.println("4: wyrusz w podróz");
        int wyb = scanner.nextInt();
        switch (wyb){
            case(1)->{
                System.out.println("╔══════════════════╗");
                System.out.println("║ Twoja drużyna    ║");
                System.out.println("╠══════════════════╣");
                for (int i = 0; i < Team.number; i++) {
                    int p1=i+1;
                    System.out.println("║ [" + p1 + "] • " + Team.team[i]+"   ║");
                }
                System.out.println("╚══════════════════╝");
            }
            case(2)->{
                System.out.println("Kogo chcesz wymienić:");
                wyb = scanner.nextInt();
                if(wyb > Team.number){
                    System.out.println("Nie ma takiego członka");
                }
                System.out.println("Na kogo:");
                int wyb2 = scanner.nextInt();
                if(wyb2 > Team.number){
                    System.out.println("Nie ma takiego członka");
                }
                Team.bufor[0] = Team.team[wyb];
                Team.team[wyb] = Team.team[wyb2];
                Team.team[wyb2] = Team.bufor[0];
            }
            case(3)->{
                System.out.println("coś");
            }
            case(4)->{
                oboz = true;
            }
            default -> System.out.println("Nie ma takiej opcji");
        }
    }}
}
