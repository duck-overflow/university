package Mathe;
import java.util.Arrays;

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

    public static void matrix() {
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        double[][] matrixB = {{4, 5, 6}, {7, 8, 9}};
        double[][] matrixC = {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}};
    }

    public static double[][] matrixMultiplikation(double[][] matrixA, double[][] matrixB) {
        double[][] matrixC = new double[matrixA.length][matrixB[0].length];
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixB[0].length; j++) {
                for(int k = 0; k < matrixA[0].length; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }

    public static void printMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5.2f", matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
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

    public static void transponierMatrix(double[][] matrix) {
        double[][] transponiert = new double[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                transponiert[i][j] = matrix[j][i];
            }
        }
        printMatrix(transponiert);
    }

}
