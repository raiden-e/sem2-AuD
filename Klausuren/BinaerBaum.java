package Klausuren;

public class BinaerBaum {
    private Knoten wurzel;

    public BinaerBaum(Knoten k) {
        this.wurzel = k;
    }

    private boolean istTeilbaumKleiner(Knoten k, int wert) {
        if (k.schluessel > wert)
            return false;

        return (k.linkesKind == null || istTeilbaumKleiner(k.linkesKind, k.schluessel))
                && (k.rechtesKind == null || istTeilbaumKleiner(k.rechtesKind, k.schluessel));
    }

    private boolean istTeilbaumGroesser(Knoten k, int wert) {
        if (k.schluessel < wert)
            return false;

        return (k.linkesKind == null || istTeilbaumGroesser(k.linkesKind, wert))
                && (k.rechtesKind == null || istTeilbaumGroesser(k.rechtesKind, wert));
    }

    private boolean istSuchbaum(Knoten k) {
        return istTeilbaumGroesser(k.rechtesKind, k.schluessel) && istTeilbaumKleiner(k.linkesKind, k.schluessel);
    }

    public boolean istSuchbaum() {
        return istSuchbaum(wurzel);
    }
}
