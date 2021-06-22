# Übung 7

## Aufgabe 1 a

Jeder AVL-Baum ist auch ein Binärer Suchbaum. Daher unterscheiden sich die
Algorithmen für die Suche und das Traversieren nicht. Die Suche in einem AVLBaum ist jedoch in der Regel effizienter, da die Höhe auf O(log n) begrenzt ist.
Für das Travervieren gilt dies nicht, da dort ohnehin alle Knoten besucht werden.

## Aufgabe 1 b

Die Suche in einem AVL-Baum (und einem Binären Suchbaum) verfolgt nur einen einzigen Pfad von der Wurzel bis zum gesuchten Knoten bzw. über ein Blatt
hinaus. Eine Rückkehr zu Elternknoten ist nicht notwendig. Eine rekursive Implementierung enthält daher nur eine Endrekursion, die leicht durch eine whileSchleife ersetzt werden kann (siehe Aufgabe 5).

## Aufgabe 1 c

Bei der vollständigen Traversierung eines Baumes (einschließlich AVL-Bäume
und Binärer Suchbäume) muss bei einer rekursiven Implementierung regelmäßig
zum Elternknoten eines Teilbaums zurückgekehrt werden (Backtracking), um danach weitere Teilbäume zu besuchen. Daher ist eine iterative Implementierung
aufwändiger, ggf. unter Benutzung eines eigenen Stacks (siehe Aufgabe 6).

## Aufgabe 2 a

Es handelt sich um einen AVL-Baum. Der Balance-Faktor ist an jedem Knoten
-1, 0 oder +1. Außerdem ist die Suchbaum-Eigenschaft erfüllt (die Schlüssel im
linken Teilbaum eines Knotens sind alle kleiner als der Schlüssel des Knotens,
und die Schlüssel im rechten Teilbaum sind alle größer als der Schlüssel des
Knotens).

## Aufgabe 2 b

Der Baum ist zwar so ausbalanciert, dass alle Balance-Faktoren -1, 0 oder +1
sind. Allerdings ist der Knoten 34 falsch einsortiert, so dass die SuchbaumEigenschaft verletzt ist. Es handelt sich somit nicht um einen AVL-Baum.

## Aufgabe 2 c

Der Balance-Faktor am Knoten mit dem Schlüssel 50 beträgt +2 und ist somit
ungültig. Es handelt sich daher nicht um einen AVL-Baum.

Da der rechte Teilbaum von Knoten 60 größer ist als dessen linker Teilbaum,
wird eine einfache Linksrotation ausgeführt: