package ue02.Aufgabe4;

import java.lang.Math;

public class BesterAlgorithmus {
    // 1000n
    public static double g1(int n) {
        return 1000 * n;
    }

    // 100n * log2(n+1)
    public static double g2(int n) {
        return 100 * n * (Math.log(n) / Math.log(2)) * (n + 1);
    }

    // 10 * n * n
    public static double g3(int n) {
        return 10 * n * n;
    }

    // n * n * n
    public static double g4(int n) {
        return n * n * n;
    }

    // 2 hoch n
    public static double g5(int n) {
        double a = 2;
        for (int i = 1; i < n; i++) {
            a *= 2;
        }
        return a;
    }

    // n!
    public static double g6(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        return m;
    }

    // Bestimmt fuer alle 6 Funktionen den Wert von
    // gi(n) und gibt den Index der Funktion mit
    // dem minimalen Wert zurueck
    public static int gewinnerFuerN(int n) {
        int index[] = { (int) g1(n), (int) g2(n), (int) g3(n), (int) g4(n), (int) g5(n), (int) g6(n) };
        int min = index[0];
        for (int i = 1; i < index.length; i++) {
            if (index[i] < min)
                min = index[i];
        }
        return min;
    }

    // Gibt für jede Zahl n zwischen 1 und 2000 aus, welcher der
    // 6 Algorithmen (A1 .. A6) für das betrachtete n der Beste ist
    public static void main(String[] args) {

        System.out.println(g2(3));
    }
}