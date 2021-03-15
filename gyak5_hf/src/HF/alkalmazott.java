package HF;

public class alkalmazott {
    private String nev;
    private int fizetes;

    public alkalmazott(String nev, int fizetes) {
        this.nev = nev;
        this.fizetes = fizetes;
    }

    public alkalmazott(String nev) {
        this.nev = nev;
        this.fizetes = 250000;
    }

    public void increaseFizetes(int x) {
        this.fizetes += x;
    }

    @Override
    public String toString() {
        return this.nev + " " + this.fizetes;
    }

    public boolean inLimit(int lower, int upper) {
        return lower < this.fizetes && this.fizetes < upper;
    }

    public double ado() {
        return this.fizetes * 0.16;
    }

    public boolean isFizetesLarger(alkalmazott other) {
        return this.fizetes > other.fizetes;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getFizetes() {
        return fizetes;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }
}
