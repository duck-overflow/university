package Automobilität;

public class Halter {

    public void Haltermain() {
        Fahrzeug[] fahrzeuge = new Fahrzeug[2];
        fahrzeuge[0] = new Fahrzeug(1, 4, 6000, false);
        fahrzeuge[1] = new LKW(2, 2, 10000, true, false);
        Werkstatt ws = new Werkstatt();
        ws.hupeTesten(fahrzeuge[0]);
        ws.hupeTesten(fahrzeuge[1]);
    }

}
