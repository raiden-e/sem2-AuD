# Übung 11

## Aufgabe 1 a

| Verfahren           | Max Aufwand | Anwendungsfall                        |
| ------------------- | ----------- | ------------------------------------- |
| Binäre Suche        | O(log2(n))  | Schlüssel sind geordnet in einem Feld |
| Interpolationssuche | O(n)        | Schlüssel müssen geordnet sein        |
| Lineare Suche       | O(n)        | Bei **un**geordneten Feldern          |

## Aufgabe 1 b

### Lineare Suche

Man geht der Reihe nach alle Elemente der Liste durch. Ist das Element das Gesuchte, so wird die Suche beendet. Falls das Element nicht in der Liste ist, wird am Ende erst abgebrochen.

Das Verfahren ist auf alle Listen anwendbar, und gibt die jeweiligen Indeces zurück.
- 5.
- 8.
- 6.

### Binäre Suche

1. In einer geordneten Liste liest man zunächst das Mittlere Element, also hier die 20. 32 ist größer, also betrachtet man nun die rechte Hälfte, und halbiert sie erneut. So betrachtet man 160. da 32 kleiner ist gukt man sich die erneute linke Häflte an. 32 ist der gesuchte wert, so gibt man den Index 5 zurück.
2. Die Liste ist unsortiert, man kann keine Binäre Suche anwenden.
3. Der Vorgang ist wie bei 1., es wird der Index 6. zurückgegeben

### Interpolationssuche

## Aufgabe 2 i

O(n^2 + n/2 * log(n))

## Aufgabe 2 ii

O(n*log(n) + n/2 * n)

## Aufgabe 2 iii

O(sum_i=n/2^n(i))

## Aufgabe 2 iv

O(n*log(n) + n/2 * log(n))

## Aufgabe 3 a

| 0          | 1   | 2   | 3   | 4   | 5   | 6        | 7     | 8   | 9          | 10  |
| ---------- | --- | --- | --- | --- | --- | -------- | ----- | --- | ---------- | --- |
| GOLDHAMMER | 1   | 2   | 3   | 4   | 5   | STARK    | MEYER | 8   | ZEPPENFELD | 10  |
| 0          | 1   | 2   | 3   | 4   | 5   | PATZELT  | 7     | 8   | 9          | 10  |
| 0          | 1   | 2   | 3   | 4   | 5   | THIESING | 7     | 8   | 9          | 10  |

## Aufgabe 3 b

| 0          | 1   | 2   | 3   | 4        | 5   | 6       | 7     | 8   | 9          | 10    |
| ---------- | --- | --- | --- | -------- | --- | ------- | ----- | --- | ---------- | ----- |
| GOLDHAMMER | 1   | 2   | 3   | THIESING | 5   | PATZELT | MEYER | 8   | ZEPPENFELD | STARK |

## Aufgabe 4

86 wird direkt gefunden da 86 mod 7 = 2

100 mod 7 = 2, was belegt ist also wird nach i+1 geguckt, welches ebenfalls belegt ist. Daher wird dann i+4 nachgeguckt was mit 100 belegt ist, also wird der index 6 zurückgegeben.
