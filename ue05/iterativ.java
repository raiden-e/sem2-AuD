package ue05;

public class iterativ {
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

    public static int revIt2(int n) {
        if (n <= 9)
            return n;
        int logn = (int) Math.log10(n);
        int zehnHochLogn = (int) Math.pow(10, logn);
        return (n % 10) * zehnHochLogn + rev2(n / 10);
    }

    public static void main(String args[]) {
        uhr.start();
        revIt1(1234);
        uhr.stop();
        System.out.println();
        System.out.println("Zeit: " + uhr.getDuration());
    }
}
