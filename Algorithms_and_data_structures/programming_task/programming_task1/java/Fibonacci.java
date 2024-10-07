import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

/*
pom.xml:

<dependencies>
        <dependency>
            <groupId>org.jfree</groupId>
            <artifactId>jfreechart</artifactId>
            <version>1.5.3</version>
        </dependency>
  </dependencies>
*/


public class Fibonacci {

    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int nStart = 3;
        int nEnd = 30;

        System.out.println("Fibonacci-Zahlen von n = 3 bis n = 30:");

        long[] recursiveTimes = new long[nEnd - nStart + 1];
        long[] iterativeTimes = new long[nEnd - nStart + 1];

        for (int n = nStart; n <= nEnd; n++) {

            long startTimeRecursive = System.nanoTime();
            long recursiveResult = fibonacciRecursive(n);
            long endTimeRecursive = System.nanoTime();
            recursiveTimes[n - nStart] = endTimeRecursive - startTimeRecursive;

            long startTimeIterative = System.nanoTime();
            long iterativeResult = fibonacciIterative(n);
            long endTimeIterative = System.nanoTime();
            iterativeTimes[n - nStart] = endTimeIterative - startTimeIterative;

            if (recursiveResult != iterativeResult) {
                System.out.println("Fehler: Unterschiedliche Ergebnisse bei n = " + n);
            } else {
                System.out.println("Fib(" + n + ") = " + recursiveResult);
            }
        }

        System.out.println("Rechenzeiten für rekursive Berechnung: " + Arrays.toString(recursiveTimes));
        System.out.println("Rechenzeiten für iterative Berechnung: " + Arrays.toString(iterativeTimes));

        displayChart(recursiveTimes, iterativeTimes, nStart);
    }

    private static DefaultCategoryDataset createDataset(long[] recursiveTimes, long[] iterativeTimes, int nStart) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < recursiveTimes.length; i++) {
            int n = nStart + i;
            dataset.addValue(recursiveTimes[i], "Rekursiv", Integer.toString(n));
            dataset.addValue(iterativeTimes[i], "Iterativ", Integer.toString(n));
        }
        return dataset;
    }

    private static JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createLineChart(
                "Fibonacci Berechnung Rechenzeiten",
                "n",
                "Zeit (Nanosekunden)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        chart.setBackgroundPaint(Color.WHITE);

        final CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);

        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, Color.red);
        renderer.setSeriesPaint(1, Color.green);

        return chart;
    }

    public static void displayChart(long[] recursiveTimes, long[] iterativeTimes, int nStart) {
        DefaultCategoryDataset dataset = createDataset(recursiveTimes, iterativeTimes, nStart);
        JFreeChart chart = createChart(dataset);

        // Display chart in a JFrame
        JFrame frame = new JFrame("Fibonacci Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.getContentPane().add(chartPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
