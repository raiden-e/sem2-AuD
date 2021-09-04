package ue02.Aufgabe5;

import java.lang.reflect.InvocationTargetException;
// import java.lang.reflect.Method;

import StopUhr.StopUhr;

public class Zeitmessung2 {
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

    public static void wrap(java.lang.reflect.Method method, int arg)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        StopUhr uhr = new StopUhr();

        uhr.start();
        method.invoke(null, arg);
        uhr.stop();
        var dur = uhr.getDuration();
        String spacing = "";
        for (int i = 0; i < 8 - Integer.toString(arg).length(); i++)
            spacing += " ";
        System.out.println(method.getName() + ": i=" + arg + spacing + "time:" + dur);
    }

    public static void main(String[] args) {
        String[] methods = { "func1", "func2", "func6" };
        Class<? extends Zeitmessung2> zeitung = new Zeitmessung2().getClass();
        java.lang.reflect.Method method;

        for (int i = 10; i <= 100000; i *= 10) {
            for (String x : methods) {
                try {
                    method = zeitung.getMethod(x, int.class);
                } catch (NoSuchMethodException | SecurityException e1) {
                    e1.printStackTrace();
                    continue;
                }
                try {
                    wrap(method, i);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
