package ue08;

class BBaum<T extends Comparable<T>> {
    public BKnoten<T> wurzel;

    public BBaum(BKnoten<T> wurzel) {
        assert (wurzel != null);

        this.wurzel = wurzel;
    }

    // Wrapper-Methode
    public void traversieren() {
        traversieren(wurzel);
    }

    // Eigentliche Implementierung
    private void traversieren(BKnoten<T> knoten) {
        // TODO
    }

    // Wrapper-Methode
    public boolean suchen(final T daten) {
        assert (daten != null);

        return suchen(daten, wurzel);
    }

    // Eigentliche Implementierung
    private boolean suchen(final T daten, BKnoten<T> knoten) {
        // TODO
        return false;
    }
}