package Other;
import java.util.Scanner;

public class ScannerClass {

    public void scannerTest() {
        Scanner sc = new Scanner(System.in);
        int summe = 0;
        System.out.println("Bitte jeweils durch Leerzeichen getrennt ein paar Zahlen eingeben:");
        while (sc.hasNextInt()) {
            summe = summe + sc.nextInt();
        }
        System.out.println("Summe: " + summe);
        sc = new Scanner(System.in);
    }

    public void secondScannerTest() {
        Scanner sc = new Scanner(System.in).useDelimiter("\\s*,\\s*");
        int summe = 0;
        if(sc.hasNextLine()) {
            Scanner sc2 = new Scanner(sc.nextLine());
            sc2.useDelimiter("\\s*,\\s*[\\r?\\n]");
            while (sc2.hasNextInt()) {
                summe = summe + sc2.nextInt();
            }
            System.out.println("Summe: " + summe);
        }
    }

}
