import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Notification> notifications = new ArrayList<>();
    public void addNotification(Notification notification){
        notifications.add(notification);
    }
    public void sendNotification(String message){
        for (Notification notification : notifications){
            notification.sendNotification(message);
        }
    }
}
