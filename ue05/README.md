# Übung 5

## Aufgabe 1 a

Die zahlen werden rückwärts ausgegeben. So wird `1234` zu `4321` und `5678` zu `8765`

## Aufgabe 1 b

Die Ausgabe ist gleich zu Rev 1

## Aufgabe 1 Zusammenfassung

`Rev2` ist ein deutlich schnellerer Algorithmus als `Rev1`

## Aufgabe 2

Für funk1 mit `n=3` wird `tuwas()` 3 mal aufgerufen.    Allgemein wird n mal aufgerufen. O(n)

Für funk2 mit `n=3` wird `tuwas()` 15 mal aufgerufen.   tuwas() wird `2^(n+1)-1` mal aufgerufen O(2^n)

## Aufgabe 3

Ulam(2) = Ulam(2/2) = Ulam(1) = 1

Ulam(3) = Ulam(3 * 3 + 1) = Ulam(10) = Ulam(10 / 2) = Ulam(5) = Ulam(3 *5 + 1) = Ulam(16) = Ulam(16 / 2) = Ulam(8) = Ulam(4) = Ulam(2) = Ulam(1) = 1

## Aufgabe 5

Das Laufzeitverhalten ist O(n), wobei die Laufzeit nicht linear mit n steigt.

Dies wird durch den rekursiven Aufruf von `fibRekursiv` ausgelöst.