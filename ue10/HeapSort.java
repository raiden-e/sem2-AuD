package ue10;

public class HeapSort {
    // Versickere das Element mit Index pos in dem Teilfeld von Index links bis
    // einschließlich Index rechts
    public static void versickere(int[] array, final int links, int pos, final int rechts) {
        // Im Gegensatz zur Vorlesung benötigt diese Methode vier Parameter, da der zu
        // sortierende Bereich
        // nicht bei 0, sondern bei links anfängt. Linkes Kind von Knoten i:
        // (i-links)*2+links+1

        int i = pos;
        int x = array[pos];
        boolean versinkenErforderlich = true;
        while ((i - links) * 2 + links + 1 <= rechts) {
            int j = (i - links) * 2 + links + 1;
            if (j + 1 <= rechts && array[j] < array[j + 1])
                j++;
            if (x < array[j]) {
                array[i] = array[j];
                i = j;
            } else {
                array[i] = x;
                i = rechts;
                versinkenErforderlich = false;
            }
        }
        if (versinkenErforderlich)
            array[i] = x;
    }

    public static void heapsort(int[] array, final int links, final int rechts) {
        for (int i = (rechts + links - 1) / 2; i >= links; i--)
            versickere(array, links, i, rechts);

        for (int i = rechts; i >= links + 1; i--) {
            int tmp = array[links];
            array[links] = array[i];
            array[i] = tmp;
            versickere(array, links, links, i - 1);
        }
    }
}