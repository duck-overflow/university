package Automobilität;

public class LKW extends Fahrzeug {

    public boolean vollBeladen;
    public LKW(int fin, int anzahlPersonen, int maxZuladung, boolean ahk, boolean vollBeladen) {
        super(fin, anzahlPersonen, maxZuladung, ahk);
        if(anzahlPersonen > 2) setAnzahlPersonen(2);
        this.vollBeladen = vollBeladen;
    }

    public void beladen() {
        this.vollBeladen = true;
    }

    public void entladen() {
        this.vollBeladen = false;
    }

    public static void hupen() {
        System.out.println("tut, tut, tut");
    }

}
