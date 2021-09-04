package ue08;

import javax.lang.model.element.Element;

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
        if (null == knoten)
            return;
        for (int i = 0; i < knoten.elemente.length; i++) {
            if (knoten.kinder != null)
                traversieren(knoten.kinder[i]);
            System.out.print(knoten.elemente[i] + " ");
        }
        if (knoten.kinder[knoten.kinder.length - 1] != null)
            traversieren(knoten.kinder[knoten.kinder.length - 1]);
    }

    // Wrapper-Methode
    public boolean suchen(final T daten) {
        assert (daten != null);

        return suchen(daten, wurzel);
    }

    // Eigentliche Implementierung
    private boolean suchen(final T daten, BKnoten<T> knoten) {
        if (daten == null || null == knoten)
            return false;

        for (int i = 0; i < knoten.elemente.length; i++) {
            if (daten.equals(knoten.elemente[i]))
                return true;
        }
        if (knoten.kinder == null)
            return false;

        int i;
        for (i = 0; i < knoten.elemente.length; i++)
            if (daten.compareTo(knoten.elemente[i]) < 0)
                return suchen(daten, knoten.kinder[i]);

        return suchen(daten, knoten.kinder[i]);
    }
}