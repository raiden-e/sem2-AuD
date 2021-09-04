# Übung 04

## Aufgabe 1

| LinkedList                         | ArrayList                              |
| ---------------------------------- | -------------------------------------- |
| Konkrete Datenstruktur             | Array, dass bei Bedarf vergrößert wird |
| doppelt verkettete zyklische Liste | ---------                              |

Beides sind Listen, die Daten chronologisch speichern.

| Operation                       | ArrayList | LinkedList |
| ------------------------------- | --------- | ---------- |
| Einfügen/Entfernen am Anfang    | O(n)      | O(1)       |
| Einfügen/Entfernen in der Mitte | O(n)      | O(n)       |
| Anhängen ans Ende               | O(1)      | O(1)       |
| Element suchen                  | O(n)      | O(n)       |
| Zugriff auf i-tes Element       | O(1)      | O(n)       |

## Aufgabe 2

### Es soll eine Listeerzeugt werden, die allgemeinaus sehr wenigen Elementen besteht, zwischenzeitlich aber auch aus sehr vielen Elementen.

Empfehlung: LinkedList, da sich die Anzahl d Elemente dynamisch verändert. Das Einfügen am Anfagn ist bei einer ArrayList aufwändiger, daher nicht zu empfehlen.

### Sie benötigen einen Stack (Stapel).

Beides gleich schlecht.

| ⚡ TODO |
| ------ |

### Sie benötigen eine Queue (Warte-schlange).

Hierfür sollte man eine Liste nehmen, da man oft das Anfangselement entfernen möchte, was bei einem Array O(n) an Zeit benötigt.

### Sie benötigen eine Liste aus fortlaufend nummerierten Einträgen, wobei Sie überwiegend über den Index auf einzel-ne Elemente zugreifen.

Da man über auf Elemente über den Index zugreifen möchte, sollte man hier ein Array wählen.

### Sie müssen stets mit einem möglichst geringen Speicherplatz auskommen.

Bei einer Liste benötigt man ein Anfagnsattribut, einen Payload und ein Refenzattribut pro Element, was Speicherplatz kostet. Daher sollte man hier ein Array wählen, hier muss lediglich der index gespeichert werden.

> ML: LinkedList: Nur  der  tatsächlich  benötigte  Speicher-platz wird belegt.
