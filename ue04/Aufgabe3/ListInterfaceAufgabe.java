package ue04.Aufgabe3;

import java.util.*;

public class ListInterfaceAufgabe {
    // Elemente in Liste einfügen
    static void fillList(List<String> list) {
        // Zahlen von 0 bis 20 als Zeichenketten (Strings) einfügen
        for (int a = 0; a <= 20; a++)
            list.add("" + a);

        // Element an der Position 3 entfernen
        list.remove(3);

        // Erstes Element in der Liste entfernen, das gleich "6" ist
        list.remove("6");
    }

    // Liste vom Anfang bis zum Ende mit einer
    // foreach-Schleife iterieren und Elemente ausgeben
    static void printList(List<String> list) {
        for (var element : list)
            System.out.println(element);
    }

    // Alle Elemente aus der Liste entfernen, die durch 5 teilbar sind
    static void remove5List(List<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            var element = iter.next();
            if (element.endsWith("5") || element.endsWith("0") && element != "0")
                iter.remove();
        }
    }

    public static void main(String[] args) {
        // Erzeugen der LinkedList
        LinkedList<String> list1 = new LinkedList<String>();
        fillList(list1);
        System.out.println("\nAusgabe der ersten Liste(list1)");
        printList(list1);

        remove5List(list1);
        System.out.println("\nlist1 nach dem Entfernen der durch 5 teilbaren Zahlen");
        printList(list1);

        // Erzeugen der ArrayList
        ArrayList<String> list2 = new ArrayList<String>();
        fillList(list2);

        System.out.println("\nAusgabe der zweiten Liste(list2)");
        printList(list2);

        List<String> sublist = list1.subList(list1.indexOf("7"), list1.indexOf("13") + 1);

        System.out.println("Subliste:");
        printList(sublist);

        sublist.remove("11");

        System.out.println("Subliste:");
        printList(sublist);
        System.out.println("Liste2");
        printList(list1);
    }
}