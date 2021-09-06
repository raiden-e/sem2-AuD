package ue08;

class BBaum<T extends Comparable<T>> {
    public BKnoten<T> wurzel;

    public BBaum(BKnoten<T> wurzel) {
        assert (wurzel != null);

        this.wurzel = wurzel;
    }

    public void traversieren() {
        traversieren(wurzel);
    }

    private void traversieren(BKnoten<T> knoten) {
        for (int i = 0; i < knoten.elemente.length; i++) {
            if (knoten.kinder[i] != null)
                traversieren(knoten.kinder[i]);
            System.out.print(knoten.elemente[i] + " ");
        }

        // Man hat immer ein Kind mehr, als Elemente
        if (knoten.kinder[knoten.kinder.length - 1] != null)
            traversieren(knoten.kinder[knoten.kinder.length - 1]);
    }

    public boolean suchen(final T daten) {
        assert (daten != null);

        return suchen(daten, wurzel);
    }

    private boolean suchen(final T daten, BKnoten<T> knoten) {
        if (daten == null || null == knoten)
            return false;

        for (int i = 0; i < knoten.elemente.length; i++)
            if (daten.equals(knoten.elemente[i]))
                return true;

        if (knoten.kinder == null)
            return false;

        int i;
        for (i = 0; i < knoten.elemente.length; i++)
            if (daten.compareTo(knoten.elemente[i]) < 0)
                return suchen(daten, knoten.kinder[i]);

        return suchen(daten, knoten.kinder[i]);
    }
}