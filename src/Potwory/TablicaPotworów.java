package Potwory;



public class TablicaPotworów {
    private Potwory S1 = new Potwory("S1",25,25,23,10,0,false);
    private Potwory M1 = new Potwory("M1",20,20,23,10,0,false);
    private Potwory L1 = new Potwory("L1",25,25,33,10,0,false);

    private Potwory S2 = new Potwory("S2",40,40,29,10,0,false);
    private Potwory M2 = new Potwory("M2",35,35,29,10,0,false);
    private Potwory L2 = new Potwory("L2",30,30,29,10,0,false);

    private Potwory S3 = new Potwory("S3",55,55,37,10,0,false);
    private Potwory M3 = new Potwory("M3",50,50,37,10,0,false);
    private Potwory L3 = new Potwory("L3",40,40,45,10,0,false);

    private Potwory B1 = new Potwory("B1",150,150,35,10,5,true);
    private Potwory B2 = new Potwory("B2",250,250,45,10,10,true);

    private Potwory[] potwory = {L1,L2,L3,M1,M2,M3,S1,S2,S3,B1,B2};

    public Potwory getS1() {
        return S1;
    }

    public void setS1(Potwory s1) {
        S1 = s1;
    }

    public Potwory getM1() {
        return M1;
    }

    public void setM1(Potwory m1) {
        M1 = m1;
    }

    public Potwory getL1() {
        return L1;
    }

    public void setL1(Potwory l1) {
        L1 = l1;
    }

    public Potwory getS2() {
        return S2;
    }

    public void setS2(Potwory s2) {
        S2 = s2;
    }

    public Potwory getM2() {
        return M2;
    }

    public void setM2(Potwory m2) {
        M2 = m2;
    }

    public Potwory getL2() {
        return L2;
    }

    public void setL2(Potwory l2) {
        L2 = l2;
    }

    public Potwory getS3() {
        return S3;
    }

    public void setS3(Potwory s3) {
        S3 = s3;
    }

    public Potwory getM3() {
        return M3;
    }

    public void setM3(Potwory m3) {
        M3 = m3;
    }

    public Potwory getL3() {
        return L3;
    }

    public void setL3(Potwory l3) {
        L3 = l3;
    }

    public Potwory getB1() {
        return B1;
    }

    public void setB1(Potwory b1) {
        B1 = b1;
    }

    public Potwory getB2() {
        return B2;
    }

    public void setB2(Potwory b2) {
        B2 = b2;
    }

    public Potwory[] getPotwory() {
        return potwory;
    }

    public void setPotwory(Potwory[] potwory) {
        this.potwory = potwory;
    }
}
