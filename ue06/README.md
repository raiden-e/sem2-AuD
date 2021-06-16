# Übung 6

## Aufgabe 1 a

5

## Aufgabe 1 b

5 Blätter: 19, 50, 78, 201, 444

## Aufgabe 1 c

Ja, jeder Knoten hat ≤ 2 nachfolger

## Aufgabe 1 d

Ja, für jeden Knoten ist das kleinere Blatt im linken Teilbaum und entsprechend.

## Aufgabe 1 e

- ist der Baum leer? ende : weiter
- ist der Schlüssel im aktuellen Teilbaum enthalten? ende : weiter
- ist der aktuelle Schlüssel kleiner? Schritt auf L wiederholen: Schritt auf R wiederholen

## Aufgabe 1 e

Durch Rotation von 200, 210, 201, sodass 201(200,210) entsteht, kann der Baum vervollständigt werden.

## Aufgabe 3

Für inverses Travasieren muss die Richtung geändert werden, sodass zuerst der rechte Teilbaum und dessen Teilbäume durchsucht wird und anschließend der Linke entsprechend. Das bedeuted, die Reihenfolge von einKnoten.getKnotenRechts() und einKnoten.getKnotenLinks() muss getauscht werden.
