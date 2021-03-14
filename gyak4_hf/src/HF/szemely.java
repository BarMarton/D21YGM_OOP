package HF;

public class szemely {
    private String nev;
    private int suly;
    private float magassag;

    public szemely(String nev, int suly, float magassag) {
        this.nev = nev;
        this.suly = suly;
        this.magassag = magassag;
    }


    public String tti() {
        float tti;
        tti = this.suly / (this.magassag * this.magassag);
        if (tti < 18.5) return "sovány";
        else if (tti > 25) return "kövér";
        else return "normál";
    }

    @Override
    public String toString( ) {
        return this.nev + " " + this.suly + "kg " + this.magassag + "m " + this.tti();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public float getMagassag() {
        return magassag;
    }

    public void setMagassag(float magassag) {
        this.magassag = magassag;
    }
}
