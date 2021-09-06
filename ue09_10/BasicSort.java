package ue09_10;

public class BasicSort {
    // Selectionsort:
    // Sortiere das Teilfeld von array beginnend mit Index links bis
    // einschließlich
    // Index rechts
    public static void selectionsort(int[] array, final int links, final int rechts) {
        for (int i = links; i < rechts; i++) {
            // Kleinstes Element im unsortierten Teil finden
            int min = i;

            for (int j = i + 1; j <= rechts; j++)
                if (array[min] > array[j])
                    min = j;

            // Elemente tauschen
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    // Insertionsort:
    // Sortiere das Teilfeld von array beginnend mit Index links bis
    // einschließlich
    // Index rechts
    public static void insertionsort(int[] array, final int links, final int rechts) {
        int zeiger;
        for (int i = links + 1; i < rechts + 1; i++) {
            int kandidat = array[i];
            for (zeiger = i - 1; zeiger >= links && array[zeiger] > kandidat; zeiger--)
                array[zeiger + 1] = array[zeiger];
            array[zeiger + 1] = kandidat;
        }
    }

    // Bubblesort:
    // Sortiere das Teilfeld von array beginnend mit Index links bis einschließlich
    // Index rechts
    public static void bubblesort(int[] array, final int links, final int rechts) {
        for (int i = links; i < rechts + 1; i++) {
            for (int j = links; j < rechts - i; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }
}