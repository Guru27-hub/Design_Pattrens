package Factory;

public class NotificationFactory {
    public static Notification createNotification(String type){
        return switch(type.trim().toLowerCase()){
            case "sms" -> new SMSNotification();
            case "email" -> new EmailNotification();      
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);    
        };
    }
    // public static void main(String[] args) {
    //     Notification smsNotification = NotificationFactory.createNotification("sms");
    //     smsNotification.notifyUser();
        
    //     Notification emailNotification = NotificationFactory.createNotification("email");
    //     emailNotification.notifyUser();
    // }
}
