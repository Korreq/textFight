public class Game
{

    public static void main(String[] args) throws InterruptedException
    {
        Walka fight = new Walka();
        Menu.menu();
        Start.start();
        ZarzadzanieDruzyna.zarzadzanie();
        fight.fight();

    }




}