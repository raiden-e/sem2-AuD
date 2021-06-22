package ue09;

public class QuickSort {
    public static void quicksort(int[] array, final int links, final int rechts) {
        int li = links;
        int re = rechts;
        int mid = array[(links + rechts) / 2];
        do {
            while (array[li] < mid)
                li++;
            while (array[re] > mid)
                re--;
            if (li <= re) {
                int t = array[re];
                array[re] = array[li];
                array[li] = t;
                li++;
                re--;
            }
        } while (li <= re);
        if (links < re)
            quicksort(array, links, re);
        if (rechts > li)
            quicksort(array, li, rechts);
    }
}