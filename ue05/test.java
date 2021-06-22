package ue05;

import StopUhr.StopUhr;

public class test {
    static StopUhr uhr = new StopUhr();

    public static void rev1(int n) {
        System.out.print(n % 10);
        if (n > 9)
            rev1(n / 10);
    }

    public static void revIt1(int n) {
        do
            System.out.print(n % 10);
        while ((n /= 10) > 0);
    }

    public static int rev2(int n) {
        if (n <= 9)
            return n;
        int logn = (int) Math.log10(n);
        int zehnHochLogn = (int) Math.pow(10, logn);
        return (n % 10) * zehnHochLogn + rev2(n / 10);
    }

    public static int ulam(int n) {
        assert n > 0;
        return n == 1 ? 1 : (n % 2 == 0 ? ulam(n / 2) : ulam(3 * n + 1));
    }

    public static int ulamIt(int n) {
        assert n > 0;
        while (n > 1)
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        return n;
    }

    public static void main(String args[]) {
        uhr.start();
        rev1(1234);
        uhr.stop();
        System.out.println();
        System.out.println("Zeit: " + uhr.getDuration());

        uhr.start();
        rev1(5678);
        uhr.stop();
        System.out.println();
        System.out.println("Zeit: " + uhr.getDuration());

        uhr.start();
        System.out.println(rev2(1234));
        uhr.stop();
        System.out.println("Zeit: " + uhr.getDuration());

        uhr.start();
        System.out.println(rev2(5678));
        uhr.stop();
        System.out.println("Zeit: " + uhr.getDuration());
    }
}
