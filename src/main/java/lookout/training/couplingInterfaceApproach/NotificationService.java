package lookout.training.couplingInterfaceApproach;

public class NotificationService {
	
	MessagingService service;
	
	public NotificationService(MessagingService service) {
		this.service = service;
	}
	 
	 public void sendMessage(String recepient,String message) {
		 service.sendMessage(message, recepient);
	 }
}
