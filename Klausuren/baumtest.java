package Klausuren;

public class baumtest {
    public static void main(String[] args){
        Knoten kindL = new Knoten(0, null, null);
        Knoten links = new Knoten(1, kindL, null);
        Knoten rechts = new Knoten(4, null, null);
        Knoten wurzel = new Knoten(2, links, rechts);
        BinaerBaum baum = new BinaerBaum(wurzel);

        System.out.println(baum.istSuchbaum());
    }
}
