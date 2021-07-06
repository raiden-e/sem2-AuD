package ue11;

public class HashTableTest {
    private static String[][] Profs = { { "Bab", "8305" }, { "Böckmann", "6728" }, { "Cleven", "6732" },
            { "Ecke-Schüth", "6784" }, { "Engels", "6777" }, { "Friedrich", "6796" }, { "Haake", "6766" },
            { "Haas", "6719" }, { "Hagen", "6782" }, { "Hamburg", "6708" }, { "Harrer", "6748" },
            { "Hesseler", "6732" }, { "Hirsch", "6835" }, { "Hoffmann", "0" }, { "Jörges", "6741" },
            { "Kamsties", "6816" }, { "Kienle", "9777" }, { "Könisgmann", "6776" }, { "Kuhnt", "8935" },
            { "Kukuk", "6715" }, { "Kunau", "8906" }, { "Künemund", "6764" }, { "Lenze", "6729" }, { "Preis", "6756" },
            { "Recker", "6783" }, { "Reimann", "6786" }, { "Rettinger", "6797" }, { "Röhrig", "8100" },
            { "Saatz", "6765" }, { "Sachweh", "6760" }, { "Schönberg", "8919" }, { "Schuster", "8903" },
            { "Stark", "6747" }, { "Teschler-Nunkesser", "6785" }, { "Vollmer", "6737" }, { "Wiesmann", "8918" },
            { "Wolff", "0" }, { "Zeppenfeld", "0" } };

    private static String[] worte = new String[Profs.length];

    public static void main(String[] args) {
        HashTable h = new HashTable(Profs.length);

        System.out.println("Hashtablle mit " + Profs.length + " Objekten anlegen:");

        for (int a = 0; a < Profs.length; a++)
            worte[a] = Profs[a][0];

        System.out.println("Hagen: " + binaereSuche(worte, "Hagen"));
        System.out.println("San Diego: " + binaereSuche(worte, "San Diego"));

        // Professorendaten in Hashtabelle eintragen
        for (int a = 0; a < Profs.length; a++)
            h.insert(new Professor(Profs[a][0], Integer.parseInt(Profs[a][1])));

        // Gespeicherte Professorendaten nacheinander aus der Tabelle
        // auslesen und den jeweils zugehörigen Namen ausgeben
        System.out.println("\nHash-Tabelle:");
        for (int a = 0; a < h.getSize(); a++) {
            final Professor p = (Professor) h.getEntry(a);
            if (p != null)
                System.out.println(a + " " + p.getName());
        }

        System.out.println("\nZuordnung per Roundtrip über den Hashwert testen:");
        for (int a = 0; a < h.getSize(); a++)
            if ((Professor) h.getEntry(a) != null)
                System.out.println("" + a + " <---> " + h.findePosition(h.getEntry(a)));
    }

    public static boolean binaereSuche(final String[] worte, final String begriff) {
        int links = 0;
        int rechts = worte.length - 1;

        while (links <= rechts) {
            int m = (links + rechts) / 2;
            int cmp = begriff.compareTo(worte[m]);

            if (cmp > 0)
                links = m + 1;
            else if (cmp < 0)
                rechts = m - 1;
            else
                return true;
        }
        return false;
    }
}
