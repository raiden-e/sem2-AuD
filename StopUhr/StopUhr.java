package StopUhr;

public class StopUhr {
    private long startTime, stopTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        stopTime = System.nanoTime();
    }

    public long getDuration() {
        return stopTime - startTime;
    }

    public long getCurrentDuration() {
        return System.nanoTime() - startTime;
    }
}