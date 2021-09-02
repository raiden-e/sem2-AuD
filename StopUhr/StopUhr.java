package StopUhr;

public class StopUhr {
    private long startTime, stopTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        stopTime = System.nanoTime();
    }

    public long getStop() {
        stop();
        return getDuration();
    }

    public long getDuration() {
        return stopTime - startTime;
    }
}