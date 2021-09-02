package ue01;

import java.util.Scanner;

public class SiebDesEratosthenes2 {
    static boolean[] liste = new boolean[] { false };

    public static void main(String[] args) {
        System.out.println("Bitte größe des Arrays eingeben: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int i = 0;
        liste = new boolean[n + 1];
        liste[1] = true;

        for (i = 2; i * i <= n; i++)
            if (!istDurchgestrichen(i))
                streicheDurch(i);

        for (i = 0; i < n; i++)
            if (!liste[i])
                System.out.print(i + ", ");
    }

    public static boolean istDurchgestrichen(int i) {
        if (i >= liste.length)
            return true;

        return liste[i];
    }

    public static void streicheDurch(int i) {
        for (int a = 2 * i; a < liste.length; a += i)
            liste[a] = true;
    }
}
