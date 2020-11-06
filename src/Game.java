import Bohaterowie.Team;
import Walka.Fight;

public class Game {



    public static void main(String[] args) {
        Walka.Fight fight = new Fight();
        Team team = new Team();
        //Game textFight = new Game();

        Start.start();
        //team.squad();
        fight.walka();
    }
}