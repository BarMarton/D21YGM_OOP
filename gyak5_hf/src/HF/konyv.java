package HF;

public class konyv {
    private String cim, szerzo;
    private int megjelenes, ar;

    public konyv(String cim, String szerzo, int megjelenes, int ar) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.megjelenes = megjelenes;
        this.ar = ar;
    }

    public konyv(String cim, String szerzo) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ar = 2500;
        java.time.LocalDate currentd = java.time.LocalDate.now();
        this.megjelenes = currentd.getYear();
    }

    public void bumpPrice(double incr) {
        this.ar = (int) (((incr / 100) + 1) * this.ar);
    }

    @Override
    public String toString() {
        return this.cim + " " + this.szerzo + " " + this.megjelenes + " " + this.ar;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getMegjelenes() {
        return megjelenes;
    }

    public void setMegjelenes(int megjelenes) {
        this.megjelenes = megjelenes;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }
}
