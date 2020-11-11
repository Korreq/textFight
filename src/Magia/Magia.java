package Magia;

public class Magia {
    public String nazwa;
    public String typ;
    public int pktmagii;
    public int obrażenia;

    public Magia(String nazwa,String typ,int pktmagii,int obrażenia)
    {
        this.nazwa = nazwa;
        this.typ = typ;
        this.pktmagii = pktmagii;
        this.obrażenia = obrażenia;

    }

    public String toString() { return nazwa+" koszt:"+pktmagii;}


}
