package helloObjekte;

public class Fahrzeug {

    private int fin;
    private int anzahlPersonen;
    private int maxZuladung;
    private boolean ahk;
    private static int anzErzeugterFahrzeuge = 0;
    private static final int hoechsgeschwindigkeitInnerorts = 50;


    public Fahrzeug(int fin, int anzahlPersonen, int maxZuladung, boolean ahk) {
        this.fin = fin;
        this.anzahlPersonen = anzahlPersonen;
        this.maxZuladung = maxZuladung;
        this.ahk = ahk;
        anzErzeugterFahrzeuge++;
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
        if(anzahlPersonen < 0) anzahlPersonen*=-1;
        this.anzahlPersonen = anzahlPersonen;
        return anzahlPersonen;
    }
    public int getMaxZuladung() {
        return maxZuladung;
    }
    public int setMaxZuladung(int maxZuladung) {
        if (maxZuladung < 0) maxZuladung*=-1;
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

    public static int getAnzErzeugterFahrzeuge() {
        return anzErzeugterFahrzeuge;
    }
}
