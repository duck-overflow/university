package helloObjekte;

import Automobilität.Fahrzeug;

public class ObjektDemo {

    public static void objectDemo() {
        //Arrays
        int[] inttestArray = new int[100];
        Fahrzeug[] fahrzeugTestArray = new Fahrzeug[7];
        int[][] testmdInt = new int[10][10];

        //Objekte
        Fahrzeug meinAuto = new Fahrzeug(1, 1, 5, true);
        Fahrzeug meinAuto2 = new Fahrzeug(1, 1, 5, true);

        //Ausgabe
        System.out.println(meinAuto.getFin());
        System.out.println(meinAuto.getAnzahlPersonen());
        System.out.println(meinAuto.getMaxZuladung());
        System.out.println(meinAuto.getAhk());
        System.out.println(Fahrzeug.getAnzErzeugterFahrzeuge());

        //Test ob meinAuto, meinAuto2 ist
        if(meinAuto == meinAuto2) {
            System.out.println("meinAuto == meinAuto2");
        } else {
            System.out.println("meinAuto != meinAuto2");
        }

        //Fülle Array mit Zahlen von 1 bis 100
        for(int i = 1; i <= 100; i++) {
            inttestArray[i-1] = i;
        }

        //Fülle Array mit Fahrzeugen
        for(int j = 2; j < 9; j++) {
            fahrzeugTestArray[j-2] = new Fahrzeug(j-2, j, j, true);
        }

        //Generation 100-Tafel und Ausgabe
        for(int k = 0; k < 10; k++) {
            for(int l = 0; l < 10; l++) {
                testmdInt[k][l] = l + 1 + (k*10);
                System.out.printf("%3d", testmdInt[k][l]);
            }
            System.out.println();
        }
    }

    public static void parameterÜbergabeTest(Fahrzeug einAuto, int eineZahl) {
        einAuto.setAnzahlPersonen(eineZahl);
        eineZahl = 4;
        einAuto = new Fahrzeug(3, 3, 3, true);
        return;
    }

    //Testen ob ein char eine Zahl ist
    public void wrapperTest() {
        char acht = '8';
        char x = 'x';
        if(Character.isDigit(acht)) {
            System.out.println("acht ist eine Ziffer");
        } else {
            System.out.println("acht ist keine Ziffer");
        }
    }

}
