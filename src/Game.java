import Bohaterowie.Bardowie;
import Walka.Fight;

public class Game {



    public static void main(String[] args) {
        Walka.Fight fight = new Fight();
        Start start = new Start();
        Bardowie bardzi = new Bardowie();
        //Game textFight = new Game();

        start.main();
        bardzi.b1();
        fight.walka();
    }
}