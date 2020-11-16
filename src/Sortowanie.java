import Bohaterowie.Bohaterowie;

import java.util.Comparator;

public class Sortowanie implements Comparator<Bohaterowie>
{
    public int compare(Bohaterowie p1, Bohaterowie p2)
    {
        if(p2 == null) return -1;
        return Integer.compare(p2.getDex(), p1.getDex());
    }
}