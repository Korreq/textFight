package Magia;

public class Magia {


    private String nazwa;
    private String typ;
    private int pktmagii;
    private int obrażenia;


    public Magia(String nazwa,String typ,int pktmagii,int obrażenia)
    {
        this.nazwa = nazwa;
        this.typ = typ;
        this.pktmagii = pktmagii;
        this.obrażenia = obrażenia;

    }

    public String toString() { return nazwa+" koszt:"+pktmagii;}

}
