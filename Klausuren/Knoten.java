package Klausuren;

public class Knoten {
    public int schluessel;
    public Knoten linkesKind;
    public Knoten rechtesKind;

    public Knoten(int schluessel, Knoten linkesKind, Knoten rechtesKind) {
        this.linkesKind = linkesKind;
        this.schluessel = schluessel;
        this.rechtesKind = rechtesKind;
    }
}
