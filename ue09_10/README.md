# Übung 9

## Aufgabe 1 a

Es handelt sich um ein stabiles Sortierverfahren. Die relative Reihenfolge von Daten wird durch `A[j] > x` beibehalten.

## Aufgabe 1 b

Im besten Fall werden `n-1` Vergleiche durchgeführt.

## Aufgabe 1 c

Im ungünstigsten Fall ist das einzusortierende Element kleiner als alle bereits im Zielteil  befindlichen  Elemente.  Es  wird  dann  mit  allen  bereits  im  Zielteil  befindlichen  Elementen  verglichen,  also  im  k-ten  Durchlauf  `(i == k+1)`  mit  allen  Elementen der Indizes `i-1 (==k)` bis `1`. Das sind genau `k` Vergleiche im k-ten Sortierschritt. Da es `n-1` Durchläufe/Sortierschritte gibt (die erste Zahl ist bereits korrekt einsortiert),  ergibt  sich  als  Gesamtzahl  die  Summe  aller  Zahlen  von `1` bis `n-1`. Dies ist bekanntlich `½n*(n-1)` (Gaußsche Summe). Dieser Fall tritt ein, wenn das Array zu Anfang in **umgekehrter Reihenfolge** sortiert war.

# Übung 10

## Aufgabe 1

### Aufgabe 1 a

Ein Heap ist ein Binärbaum, dessen Knoten absteigend immer kleiner werden.

### Aufgabe 1 b

- ja
- ja
- nein

### Aufgabe 1 c

2(1,<>)

## Aufgabe 2

## Aufgabe 3

Bei dem Bottem-Up Heapsort wird das zu versickernde Element bis nach unten versickert, ohne einen Größenvergleich zu machen. Somit wird die Heapeigenschaft während des Sortierens vernachlässigt. Das Verfahren kann situativ schneller sein und ist statistisch schneller als das einach Heapsortverfahren.

## Aufgabe 4