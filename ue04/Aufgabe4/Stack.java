package ue04.Aufgabe4;

public class Stack<E> implements StackI<E> {
    // Array, in dem die Elemente des Stacks gespeichert werden.
    // Das oberes Ende des Stacks liegt an Position pos-1.
    // Ein Array mit Elementen vom Typ E kann zwar deklariert, aber
    // nicht über new erzugt werden (Java-Mangel)!
    private Object[] st;

    // Nächste freie Position im Array
    // Gleichzeitig Anzahl der im Array/Stack gespeicherten Elemente
    private int pos;

    // Erzeugt ein Stack-Objekt, in dem maximal size Elemente
    // abgespeichert werden können
    public Stack(int size) {
        st = new Object[size];
    }

    // Legt übergebenes Element auf den Stack, sofern noch Platz
    // vorhanen ist. Das Element wird an Position pos gespeichert.
    public void push(E element) {
        if (pos < st.length)
            st[pos++] = element;
    }

    // Holt oberstes Element vom Stack, sofern der Stack nicht leer ist.
    public void pop() {
        if (st[pos - 1] != null)
            st[pos-- - 1] = null;
    }

    // Gibt oberstes Element auf dem Stack zurück, sofern der Stack nicht
    // leer ist. Bei leerem Stack wird null zurückgegeben.
    public E top() {
        return isEmpty() ? null : (E) st[pos - 1];
    }

    // Gibt true zurück, falls der Stack leer ist
    public boolean isEmpty() {
        return pos <= 0;
    }
}