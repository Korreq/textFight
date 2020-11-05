import Bohaterowie.Bardowie;
import Walka.Fight;

public class Game {



    public static void main(String[] args) {
        Walka.Fight fight = new Fight();
        Bardowie bardzi = new Bardowie();
        //Game textFight = new Game();

        Start.start();
        bardzi.b1();
        fight.walka();
    }
}