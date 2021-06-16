package ue05;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib_rec(5));
        System.out.println(fib_it(5));
    }

    public static int fib_rec(int n) {
        return n <= 1 ? n : fib_rec(n - 1) + fib_rec(n - 2);
    }

    public static int fib_it(int n) {
        if (n <= 1)
            return n;
        int x = 1;
        int y = 1;
        for (int i = 2; i < n; i++) {
            int temp = x;
            x += y;
            y = temp;
        }
        return x;
    }
}
