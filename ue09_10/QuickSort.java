package ue09_10;

public class QuickSort {
    public static void quicksort(int[] array, final int links, final int rechts) {
        int vergleich = array[(links + rechts) / 2];
        int li = links;
        int re = rechts;
        do {
            while (array[li] < vergleich)
                li++;
            while (array[re] > vergleich)
                re--;
            if (li <= re) {
                int x = array[li];
                array[li++] = array[re];
                array[re--] = x;
            }
        } while (re > li);

        if (links < re)
            quicksort(array, links, re);
        if (rechts > li)
            quicksort(array, li, rechts);
    }
}