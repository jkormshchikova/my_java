
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    private final static double EPSILON = 0.0001;

    public static void main(String[] args) {

        task2();
        task3();
        task4();
        task5();
    }

    private static void task5() {
        int n = 10;

        short[][] mass = new short[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) + 1 == n)
                    mass[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }

    private static void task4() {
        int n = 5;
        Random rand = new Random();

        double[] a = new double[2 * n];
        double[] b = new double[n];
        for (int i = 0; i < 2 * n; i++) a[i] = rand.nextDouble();

        for (int i = 0; i < n; i++) {
            b[i] = a[i] + a[2 * n - i - 1];
        }

        double max = b[0];
        for (int i = 1; i < n; i++) {
            if (max < b[i]) {
                max = b[i];
            }
        }
        System.out.println(max);
    }

    private static void task2() {
        int i = 1;
        double a = 1 / pow(i + 1, 2);
        System.out.println("a_" + i + " = " + a);

        while (a >= EPSILON) {
            i++;
            a = 1 / pow(i + 1, 2);
            System.out.println("a_" + i + " = " + a);
        }
        System.out.println("Minimum number = " + i);
    }

    private static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: a = ");
        double a = sc.nextInt();
        System.out.print("Enter: b = ");
        double b = sc.nextInt();
        System.out.print("Enter: h = ");
        double h = sc.nextDouble();
        System.out.println("x      F(x)");
        while (a <= b) {
            System.out.print(String.format("%.3f", a) + "  " + String.format("%.3f", F(a)));
            System.out.println();
            a = a + h;
        }
    }

    private static double F(double x) {
        return Math.tan(2 * x) - 3;
    }

}
