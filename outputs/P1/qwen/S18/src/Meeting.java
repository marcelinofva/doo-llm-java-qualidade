import java.time.LocalDateTime;

public class Meeting {
    private LocalDateTime scheduledTime;
    private boolean isCancelled;

    public void scheduleMeeting(LocalDateTime time) {
        scheduledTime = time;
        isCancelled = false;
    }

    public void cancelMeeting() {
        isCancelled = true;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public boolean isCancelled() {
        return isCancelled;
    }
}
