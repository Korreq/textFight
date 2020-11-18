package Magia;

public class Magia {


    private String nazwa;
    private String typ;
    private int pktmagii;
    private int obrażenia;
    private String cele;


    public Magia(String nazwa,String typ,int pktmagii,int obrażenia,String cele)
    {
        this.nazwa = nazwa;
        this.typ = typ;
        this.pktmagii = pktmagii;
        this.obrażenia = obrażenia;
        this.cele = cele;
    }

    public String toString() { return nazwa+" koszt:"+pktmagii+" cele: "+cele;}

    public int getObrażenia() {
        return obrażenia;
    }
}
