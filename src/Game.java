public class Game {

    Start start = new Start();
    static Dru team = new Dru();



    public static void main(String[] args) throws InterruptedException {
        Walka fight = new Walka();
        Menu.Menu();
        Start.start();
        fight.walka();

    }




}