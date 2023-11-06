package Mathe;

public class EinfacheMathematik {

    public static double maxDreierZahl(double a, double b, double c) {
        if(a > b && a > c) return a;
        if(b > a && b > c) return b;
        return c;
    }

    public static int ggT(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        if(a == b) return a;
        if(a > b) return ggT(a-b, b);
        return ggT(a, b-a);
    }

    public static void rekursionDemo(int tiefe) {
        if(tiefe < 1) {
            System.out.println("Bin an der Abbruchbedingung angekommen");
            return;
        } else {
            System.out.println("Bin in Methode mit Parameter: " + tiefe + " angekommen und benutze gleich die Methode mit Parameter: " + (tiefe - 1) + ".");
            rekursionDemo(tiefe - 1);
            System.out.println("Bin immer noch in Methode mit Parameter: " + tiefe + " und habe die Methode mit Parameter: " + (tiefe - 1) + " begonnen.");
            return;
        }
    }

}
