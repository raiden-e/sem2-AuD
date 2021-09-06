package ue12_13;

public class Graph {
    private static final int KNOTENZAHL = 7;
    private static boolean[] besucht;
    private Knoten[] knoten;
    private boolean[][] matrix = { { false, true, false, false, false, false, false },
            { false, false, true, false, false, false, false }, { false, true, false, false, false, false, false },
            { false, false, false, false, false, false, false }, { false, false, false, true, false, false, false },
            { false, true, true, false, false, false, false }, { false, false, false, false, false, false, false }, };

    public Graph() {
        knoten = new Knoten[KNOTENZAHL];
        knoten[0] = new Knoten("A");
        knoten[1] = new Knoten("B");
        knoten[2] = new Knoten("C");
        knoten[3] = new Knoten("D");
        knoten[4] = new Knoten("E");
        knoten[5] = new Knoten("F");
        knoten[6] = new Knoten("G");
    }

    private boolean isKante(int k1, int k2) {
        return (matrix[k1][k2] || matrix[k2][k1]) ? true : false;
    }

    // Tiefensuche
    private void rekDfs(final int k) {
        Graph.besucht[k] = true;
        System.out.println(knoten[k].getName());

        for (int i = 0; i < KNOTENZAHL; i++)
            if (isKante(k, i) && !Graph.besucht[i])
                rekDfs(i);
    }

    public void zusammenhangskomponenten() {
        besucht = new boolean[KNOTENZAHL];
        int counter = 0;

        for (int i = 0; i < KNOTENZAHL; i++) {
            if (!besucht[i]) {
                System.out.println("Zusammenhangskomponente: " + ++counter);
                rekDfs(i);
            }
        }
    }

    public static void main(String[] args) {
        new Graph().zusammenhangskomponenten();
    }
}