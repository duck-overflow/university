package Automobilität;

public class Fahrrad extends Fahrzeug {
    public Fahrrad(int fin, int anzahlPersonen, int maxZuladung, boolean ahk) {
        super(fin, anzahlPersonen, maxZuladung, ahk);
        if(anzahlPersonen > 1) setAnzahlPersonen(1);
    }
    public static void hupen() {
        System.out.println("kling, kling");
    }
}
