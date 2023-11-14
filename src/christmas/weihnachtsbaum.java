package christmas;

public class weihnachtsbaum {

    public static String[][] baumErzeugen(int anzahlEtagen, int etagenHöhe) {
        String[][] baum = new String[anzahlEtagen * etagenHöhe][anzahlEtagen * 2 - 1];

        for (int i = 0; i < baum.length; i++) {
            for (int j = 0; j < baum[i].length; j++) {
                baum[i][j] = "*";
            }
        }

        for (int i = 0; i < baum.length; i++) {
            for (int j = 0; j < baum[i].length; j++) {
                if (j < baum[i].length / 2 - i || j > baum[i].length / 2 + i) {
                    baum[i][j] = " ";
                }
            }
        }
        return baum;
    }


    public static void baumAusgeben(String[][] baum) {
        for (int i = 0; i < baum.length; i++) {
            for (int j = 0; j < baum[i].length; j++) {
                System.out.print(baum[i][j]);
            }
            System.out.println();
        }
    }


}
