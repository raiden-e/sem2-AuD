package ue12und13;

public class KnotenLink {
    private int laenge;
    private int ziel;
    private KnotenLink naechsterNachfolger;

    public KnotenLink(int l, int z, KnotenLink n) {
        laenge = l;
        ziel = z;
        naechsterNachfolger = n;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getZiel() {
        return ziel;
    }

    public KnotenLink getNaechsterNachfolger() {
        return naechsterNachfolger;
    }

}
