package ue02.Aufgabe5;

import StopUhr.StopUhr;

public class Zeitmessung {
    private static double tuwas() {
        return Math.random();
    }

    // Linear
    public static double func1(int n) {
        double summe = 0;

        for (int a = 0; a < n; a++)
            summe += tuwas();

        return summe;
    }

    // Quadratisch
    public static double func2(int n) {
        double summe = 0;

        for (int a = 0; a < n; a++)
            for (int b = 0; b < n; b++)
                summe += tuwas();

        return summe;
    }

    // log2(n)
    public static double func6(int n) {
        double summe = 0;

        while (n > 0) {
            summe += tuwas();
            n /= 2;
        }

        return summe;
    }

    public static void main(String[] args) {
        StopUhr uhr = new StopUhr();

        for (int x : new int[] { 1000, 10000, 100000, 1000000 }) {
            System.out.println("Misst Anzahl: " + x);
            // func1
            uhr.start();
            func1(x);
            uhr.stop();
            System.out.println("func1 duration: " + uhr.getDuration());
            // func2
            uhr.start();
            func2(x);
            uhr.stop();
            System.out.println("func2 duration: " + uhr.getDuration());
            // func6
            uhr.start();
            func6(x);
            uhr.stop();
            System.out.println("func6 duration: " + uhr.getDuration());
        }

    }
}
