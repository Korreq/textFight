import Bohaterowie.Bohaterowie;
import Klasy.Heroes;

import java.util.Comparator;

public class Sortowanie implements Comparator<Bohaterowie>
{


    public int compare(Bohaterowie p1, Bohaterowie p2) {
        if(p2 == null) return -1;
        if(p1.getDex() > p2.getDex()) return 1;
        else if(p1.getDex() < p2.getDex()) return -1;
        else return 0;
    }
}