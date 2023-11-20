package Automobilität;

import java.util.ArrayList;

public class Halter {

    public void Haltermain() {
        Fahrzeug[] fahrzeuge = new Fahrzeug[2];
        fahrzeuge[0] = new Fahrzeug(1, 4, 6000, false);
        fahrzeuge[1] = new LKW(2, 2, 10000, true, false);
        Werkstatt ws = new Werkstatt();
        ws.hupeTesten(fahrzeuge[0]);
        ws.hupeTesten(fahrzeuge[1]);

        ArrayList<Fahrzeug> fahrzeugs = new ArrayList<>();
        fahrzeugs.add(new Fahrzeug(1, 4, 6000, false));
        fahrzeugs.add(new LKW(2, 2, 10000, true, false));
        fahrzeugs.add(new Fahrrad(3, 1, 100, false));
        fahrzeugs.add(new PKW(4, 5, 1000, true));
        for(Fahrzeug fahrzeug : fahrzeugs) {
            System.out.println(fahrzeug);
        }
    }

}
