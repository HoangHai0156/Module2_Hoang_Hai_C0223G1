package StopWatch;


import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public Duration getElapsedTime() {
        Duration elapsedTime = Duration.between(this.startTime, this.endTime);
        return elapsedTime;
    }
}
