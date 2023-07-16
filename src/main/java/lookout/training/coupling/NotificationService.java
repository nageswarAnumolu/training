package lookout.training.coupling;

public class NotificationService {
	
	 EmailService emailService = new EmailService();
	 
	 public void sendMessage(String recepient,String message) {
		 emailService.sendMessage(message, recepient);
	 }
}
