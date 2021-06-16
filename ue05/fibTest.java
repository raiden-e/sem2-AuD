package ue05;

import ue02.Aufgabe5.StopUhr;

public class fibTest {
    public static void main(String[] args) {
        StopUhr meineUhr = new StopUhr();
        meineUhr.start();
        for (int a = 1; a <= 50; a++)
            fibonacci.fib_rec(a);
        meineUhr.stop();
        System.out.println("Laufzeit bei rekursiver Berechnung: " + meineUhr.getDuration() / 1000000.0 + " msec");
        meineUhr.start();
        for (int a = 1; a <= 50; a++)
            fibonacci.fib_it(a);
        meineUhr.stop();
        System.out.println("Laufzeit bei iterativer Berechnung: " + meineUhr.getDuration() / 1000000.0 + " msec");
    }

}
