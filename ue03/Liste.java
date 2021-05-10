package ue03;

import java.util.*;

public class Liste<T> {
    protected Link<T> anfang;
    protected Link<T> ende;

    public Liste() {
        // Leere Liste: alle Zeiger sind null (Standardwerte)
    }

    // Einfachster Fall und gleichzeitig Sonderfall:
    // Element am Anfang einfügen
    public void einfuegen(final T daten) {
        // Funktioniert immer
        anfang = new Link<T>(daten, anfang);

        // Bei einer leeren Liste muss auch ende gesetzt werden
        if (ende == null)
            ende = anfang;
    }

    // Einfachster Fall und gleichzeitig Sonderfall:
    // Element am Anfang entfernen
    public T entfernen() {
        T opfer = null;

        // Clowns könnten diese Methode bei leerer Liste aufrufen
        if (!istLeer()) {
            // Bei einer Liste mit nur noch einem Element muss
            // auch ende gelüscht werden
            if (anfang == ende)
                ende = null;

            opfer = anfang.daten;
            anfang = anfang.naechster;
        }

        return opfer;
    }

    // Einfacher Fall: Anfügen am Ende der Liste
    public void anfuegen(final T daten) {
        // Neuen Link anlegen
        Link<T> neu = new Link<T>(daten, null);

        // Wenn die Liste leer ist, müssen anfang und ende gesetzt werden
        if (istLeer()) {
            // Neuen Link als anfang der Liste
            anfang = ende = neu;
        } else {
            // Anfügen des Elements an das bisherige ende
            ende = ende.naechster = neu;
        }
    }

    // EINFüGEN AN EINER BESTIMMTEN STELLE
    // Der Programmcode ist so gestaltet, dass er fehlerhafte Eingaben
    // (z.B. eine negative oder zu hohe Position) elegant verarbeitet
    // ohne abzustürzen.
    public void einfuegen(final T daten, int position) {
        // Wenn die Liste leer oder die Position 0 ist, entspricht dies
        // einem Einfügen am Anfang
        if (istLeer() || (position <= 0)) {
            einfuegen(daten);

            return;
        }

        // VORGüNGER ZUR POSITION FINDEN
        // Dessen Vorgünger muss es geben: lediglich bei einer leeren
        // Liste oder für position==0 gibt es keinen. Genau diese Fülle
        // wurden aber oben bereits behandelt! Wird eine zu hohe position
        // übergeben, wird automatisch das letzte Element zum Vorgünger.
        Link<T> vorgaenger = anfang;

        while ((--position > 0) && (vorgaenger.naechster != null))
            vorgaenger = vorgaenger.naechster;

        // Neues Element erzeugen
        vorgaenger.naechster = new Link<T>(daten, vorgaenger.naechster);

        // Beim Einfügen als letztes Element muss auch ende gesetzt werden
        if (vorgaenger == ende)
            ende = vorgaenger.naechster;
    }

    public T entfernen(int position) {
        // Wenn die Liste leer oder die position < 0 ist, wird kein Element
        // entfernt
        if (istLeer() || (position < 0))
            return null;

        // Wenn die position 0 ist, wird am Anfang der Liste gelüscht
        if (position == 0)
            return entfernen();

        // VORGüNGER ZUR POSITION FINDEN
        // Bei einer leeren Liste oder für position==0 gibt es keinen Vorgünger;
        // genau diese Fülle wurden oben bereits behandelt. Es gibt aber auch
        // keinen Vorgüner, wenn position zu groü ist! In diesem Fall wird das
        // letzte Element NICHT Vorgünger, damit nur tatsüchlich existierende
        // Elemente aus der Liste entfernt werden.
        Link<T> vorgaenger = anfang;

        while ((--position > 0) && (vorgaenger != null))
            vorgaenger = vorgaenger.naechster;

        // Gibt es ein Element zum lüschen?
        if ((vorgaenger == null) || (vorgaenger.naechster == null))
            return null;

        final T opfer = vorgaenger.naechster.daten;

        // Element lüschen und ggf. ende anpassen beim Lüschen des letzten
        // Listen-Elements
        if ((vorgaenger.naechster = vorgaenger.naechster.naechster) == null)
            ende = vorgaenger;

        return opfer;
    }

    // Liefert die Position eines bestimmten Elements oder -1 zurück.
    // Existiert ein Element mehrfach, wird die Position des ersten Vorkommens
    // zurückgegeben.
    public int suchen(final T daten) {
        // Liste leer?
        if (istLeer())
            return -1;

        Link<T> zeiger = anfang;
        int position = 0;

        // Abfrage auf Gleichheit ist müglich mit equals (Operation von der Klasse
        // Object)
        while ((zeiger != null) && !zeiger.daten.equals(daten)) {
            position++;
            zeiger = zeiger.naechster;
        }

        return (zeiger == null) ? -1 : position;
    }

    public ListeIterator<T> iterator() {
        return new ListeIterator<T>(anfang, ende);
    }

    // Prüfen, ob Liste leer ist
    public boolean istLeer() {
        // Diese Methode wird im Praktikum implementiert
        // TODO
        return false;
    }

    public void verketten(Liste<T> zweiteListe) {
        assert (zweiteListe != null);

        // Diese Methode wird im Praktikum implementiert
        // TODO
    }

    public int entferneWerte(final T opfer) {
        int anzGeloeschte = 0;

        // Diese Methode wird im Praktikum implementiert
        // TODO

        return anzGeloeschte;
    }
}