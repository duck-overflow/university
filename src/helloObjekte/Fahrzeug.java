package helloObjekte;

public class Fahrzeug {

    private int fin;
    private int anzahlPersonen;
    private int maxZuladung;
    private boolean ahk;

    public Fahrzeug(int fin, int anzahlPersonen, int maxZuladung, boolean ahk) {
        this.fin = fin;
        this.anzahlPersonen = anzahlPersonen;
        this.maxZuladung = maxZuladung;
        this.ahk = ahk;
    }

    public static void fahren() {
        System.out.println("brumm, brumm");
    }
    public static void hupen() {
        System.out.println("tut, tut");
    }

    public int getFin() {
        return fin;
    }
    public int setFin(int fin) {
        this.fin = fin;
        return fin;
    }
    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }
    public int setAnzahlPersonen(int anzahlPersonen) {
        this.anzahlPersonen = anzahlPersonen;
        return anzahlPersonen;
    }
    public int getMaxZuladung() {
        return maxZuladung;
    }
    public int setMaxZuladung(int maxZuladung) {
        this.maxZuladung = maxZuladung;
        return maxZuladung;
    }
    public boolean getAhk() {
        return ahk;
    }
    public boolean setAhk(boolean ahk) {
        this.ahk = ahk;
        return ahk;
    }

}
