import Automobilität.Halter;
import Mathe.EinfacheMathematik;
import Other.ScannerClass;
import helloObjekte.ArrayTest;
import Automobilität.LKW;
import helloObjekte.ObjektDemo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayTest AT = new ArrayTest();
        AT.sort();
        AT.search();
        AT.compare();
        double[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        EinfacheMathematik EM = new EinfacheMathematik();
        EM.transponierMatrix(matrixA);
        System.out.println(Arrays.toString(AT.sortMethod(AT.testMethod())));

        ScannerClass sc = new ScannerClass();
        //sc.secondScannerTest();

        ObjektDemo OD = new ObjektDemo();
        OD.wrapperTest();

        LKW MAN = new LKW(1, 2, 5, true, true);

        Halter ht = new Halter();
        ht.Haltermain();
    }
}