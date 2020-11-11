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

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getPktmagii() {
        return pktmagii;
    }

    public void setPktmagii(int pktmagii) {
        this.pktmagii = pktmagii;
    }

    public int getObrażenia() {
        return obrażenia;
    }

    public void setObrażenia(int obrażenia) {
        this.obrażenia = obrażenia;
    }

}
