import Bohaterowie.Bohaterowie;
import Bohaterowie.TablicaBohaterów;

public class Team {

    static Bohaterowie[] team = new Bohaterowie[6];

    public void aaaa(){

        this.team = team;


    }





}

class Dru extends Team{

    public void dru(){

        for (int i = 0;i < team.length;i++){

            System.out.println(team[i]);
        }


    }


}