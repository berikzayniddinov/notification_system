public class NotificationSystemDemo {
    public static void main(String[] args){
        NotificationService service = new NotificationService();
        service.addNotification(new SMSNotification());
        service.addNotification(new EmailNotification());
        service.addNotification(new PushNotification());
        service.addNotification(new COCNotification());
        service.sendNotification("System maintenance is scheduled");
    }
}
