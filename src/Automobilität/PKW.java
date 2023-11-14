package Automobilität;

public class PKW extends Fahrzeug {

    public PKW(int fin, int anzahlPersonen, int maxZuladung, boolean ahk) {
        super(fin, anzahlPersonen, maxZuladung, ahk);
        if(anzahlPersonen > 5) setAnzahlPersonen(5);
    }
}
