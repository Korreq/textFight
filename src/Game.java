public class Game
{
    public static void main(String[] args) throws InterruptedException
    {
        Menu.menu();
        Start.start();
        ZarzadzanieDruzyna.zarzadzanie();
        Walka.fight();
    }
}