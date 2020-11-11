import Bohaterowie.Bohaterowie;
import Bohaterowie.TablicaBohaterow;

public class Team {

    static Bohaterowie[] team = new Bohaterowie[6];
    static int number;
    public void aaaa(){

        this.team = team;
        this.number = number;

    }





}

class Dru extends Team{

    public void dru(){

        for (int i = 0;i < team.length;i++){

            System.out.println(team[i]);
        }


    }


}