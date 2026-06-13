package section4;
// 	// Create Notification interface
interface notification{
	public void sendNotification();
}

class EmailNotification implements notification{
	public void sendNotification() {
		System.out.println("Email notification sent.");
	}
	
}

class SMSNotification extends EmailNotification{
	
	public void sendNotification() {
	System.out.println("SMS notification sent.");
	}
}
public class interfaces {

	public static void main(String[] args) {
		EmailNotification obj = new EmailNotification();
		obj.sendNotification();
		
		SMSNotification smsobj = new SMSNotification();
		smsobj.sendNotification();
		
		

	}

}
