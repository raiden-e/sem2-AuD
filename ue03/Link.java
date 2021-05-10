package ue03;

public class Link<T> {
    public T daten;
    public Link<T> naechster;

    public Link(T daten, Link<T> naechster) {
        assert (daten != null);

        this.daten = daten;
        this.naechster = naechster;
    }

    public String toString() {
        return daten.toString();
    }

    public static void main(String args[]) {
        Link<String> mittleresElement = new Link<String>("Test", null);
        mittleresElement.naechster = new Link<String>("Letzter", mittleresElement);
        Link<String> anfang = new Link<String>("Erster", mittleresElement);

        System.out.println(anfang);
        System.out.println(mittleresElement);
        System.out.println(mittleresElement.naechster);
    }
}