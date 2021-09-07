package ue06;

public class BaumInfo {
    public int anzKnoten;
    public int anzBlaetter;
    public int hoehe;

    public BaumInfo() {
    }

    public BaumInfo(int anzKnoten, int anzBlaetter, int hoehe) {
        this.anzKnoten = anzKnoten;
        this.anzBlaetter = anzBlaetter;
        this.hoehe = hoehe;
    }

    public String toString() {
        return Integer.toString(anzBlaetter);
    }
}