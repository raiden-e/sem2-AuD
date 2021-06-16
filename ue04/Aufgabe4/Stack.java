package ue04.Aufgabe4;

// import java.rmi.server.ObjID;
// import java.util.concurrent.ArrayBlockingQueue;

// import javax.management.RuntimeErrorException;

public class Stack<E> implements StackI<E> {
    // Array, in dem die Elemente des Stacks gespeichert werden.
    // Das oberes Ende des Stacks liegt an Position pos-1.
    // Ein Array mit Elementen vom Typ E kann zwar deklariert, aber
    // nicht über new erzugt werden (Java-Mangel)!
    private Object[] st;

    // Nächste freie Position im Array
    // Gleichzeitig Anzahl der im Array/Stack gespeicherten Elemente
    // private int pos;

    // Erzeugt ein Stack-Objekt, in dem maximal size Elemente
    // abgespeichert werden können
    public Stack(int size) {
        st = new Object[size];
    }

    public int length() {
        return st.length;
    }

    // Legt übergebenes Element auf den Stack, sofern noch Platz
    // vorhanen ist. Das Element wird an Position pos gespeichert.
    public void push(E element) {
        Object[] stTmp = new Object[st.length + 1];
        for (int i = 0; i < st.length; i++)
            stTmp[i] = st[i];
        stTmp[st.length] = element;
        st = stTmp;
    }

    // Holt oberstes Element vom Stack, sofern der Stack nicht leer ist.
    public void pop() {
        assert !isEmpty();
        Object[] stTmp = new Object[st.length - 1];
        for (int i = 0; i < stTmp.length; i++)
            stTmp[i] = st[i];
        st = stTmp;
    }

    // Gibt oberstes Element auf dem Stack zurück, sofern der Stack nicht
    // leer ist. Bei leerem Stack wird null zurückgegeben.
    public E top() {
        return isEmpty() ? null : (E) st[st.length - 1];
    }

    // Gibt true zurück, falls der Stack leer ist
    public boolean isEmpty() {
        return st.length == 0;
    }
}