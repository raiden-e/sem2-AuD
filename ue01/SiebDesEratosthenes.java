package ue01;

import java.util.Scanner;

public class SiebDesEratosthenes {
    static boolean[] liste = { false };

    public static void main(String[] args) {
        System.out.println("Bitte n eingeben:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Obergrenze n einlesen
        int a;
        sc.close();
        for (a = 1; a <= n; a++) { // Schreibe Zahlen von 1 bis n auf
            hinschreiben(a);
        }
        durchstreichen(1); // Streiche die Zahl 1 durch
        a = 2;
        do {
            if (!istDurchgestrichen(a))
                durchstreichenVielfache(a, n); // Streiche alle Vielfachen von adurch
            a++;
        } while (a * a <= n);
        for (a = 1; a <= n; a++) { // Ausgabe der Primzahlen
            if (!istDurchgestrichen(a)) {
                System.out.println(a);
            }
        }
    }

    public static void hinschreiben(int a) {
        boolean[] lst = new boolean[a + 1];
        for (int i = 0; i < liste.length; i++) {
            lst[i] = liste[i];
        }
        lst[a] = true;
        liste = lst;
    }

    public static void durchstreichen(int a) {
        if (liste[a])
            liste[a] = false;
    }

    public static boolean istDurchgestrichen(int a) {
        try {
            return liste[a] ? false : true;
        } catch (ArrayIndexOutOfBoundsException exception) {
            return true;
        }
    }

    public static void durchstreichenVielfache(int a, int n) {
        int i = a;
        while (a <= n) {
            if (!istDurchgestrichen(a) && i != a)
                durchstreichen(a);
            a += i;
        }
    }
}