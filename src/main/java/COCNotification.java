public class COCNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Clash of Clans Notification: " + message);
    }
}
