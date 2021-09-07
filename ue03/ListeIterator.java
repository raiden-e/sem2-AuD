package ue03;

import java.util.*;

public class ListeIterator<T> implements Iterator<T> {
    private Link<T> zeiger;
    private Link<T> ende;

    ListeIterator(Link<T> start, Link<T> ende) {
        zeiger = start;
        this.ende = ende;
    }

    public boolean hasNext() {
        return zeiger != null;
    }

    public T next() {
        final T daten = zeiger.daten;
        zeiger = zeiger.naechster;

        return daten;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void printEnde(){
        System.out.println(ende);
    }
}