package assignment_2;
// EmailNotification, SMSNotification, and PushNotification
interface EmailNotification{
    void sendemail();
}
interface SMSNotification{
    void sendsms();
}
interface PushNotification{
    void sendpush();
}
class service implements EmailNotification, SMSNotification, PushNotification{
    @Override
    public void sendemail() {
        System.out.println("Email sent successfully");
    }

    @Override
    public void sendsms() {
        System.out.println("SMS send successfully");
    }

    @Override
    public void sendpush() {
        System.out.println("Push Notification sent successfully");
    }
}
public class interfaces {
    public static void main (String[] args){
        service objservice = new service();
        objservice.sendemail();
        objservice.sendsms();
        objservice.sendpush();
    }
}
