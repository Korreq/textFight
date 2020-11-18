package Potwory;

public class TablicaPotworow
{
    private Potwory S1 = new Potwory("S1",25,10,10,0,false,"");
    private Potwory M1 = new Potwory("M1",20,10,10,0,false,"");
    private Potwory L1 = new Potwory("L1",25,10,10,0,false,"");

    private Potwory S2 = new Potwory("S2",40,16,10,0,false,"");
    private Potwory M2 = new Potwory("M2",35,16,10,0,false,"");
    private Potwory L2 = new Potwory("L2",30,16,10,0,false,"");

    private Potwory S3 = new Potwory("S3",55,20,10,0,false,"");
    private Potwory M3 = new Potwory("M3",50,20,10,0,false,"");
    private Potwory L3 = new Potwory("L3",40,20,10,0,false,"");

    private Potwory B1 = new Potwory("B1",150,35,10,5,true,"");
    private Potwory B2 = new Potwory("B2",250,45,10,10,true,"");

    private Potwory[] potwory = {L1,S1,M1,L2,S2,M2,L3,S3,M3,B1,B2};

    public Potwory getS3() {
        return S3;
    }
    public Potwory getM3() {
        return M3;
    }
    public Potwory getL3() {
        return L3;
    }

    public Potwory[] getPotwory() {
        return potwory;
    }
}
