import java.time.LocalDateTime;

public class Hearing {
    private LocalDateTime scheduledTime;
    private boolean isCancelled;

    public void scheduleHearing(LocalDateTime time) {
        scheduledTime = time;
        isCancelled = false;
    }

    public void cancelHearing() {
        isCancelled = true;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public boolean isCancelled() {
        return isCancelled;
    }
}
