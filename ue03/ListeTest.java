package ue03;

public class ListeTest {
    public static void main(String[] args) {
        new ListeGUI().setVisible(true);

        Link<String> mittleresElement = new Link<String>("Test", null);
        Link<String> letzter = new Link<String>("letzer", null);
        mittleresElement.naechster = letzter;
        Link<String> anfang = new Link<String>("Erster", mittleresElement);
    }
}