package lookout.training.springcore.DI;

public class NotificationService {
	
	MessagingService service;
	
	public NotificationService() {
		
	}
	
	public NotificationService(MessagingService service) {
		this.service = service;
	}
	 
	 public void sendMessage(String recepient,String message) {
		 service.sendMessage(message, recepient);
	 }

	public MessagingService getService() {
		return service;
	}

	public void setService(MessagingService service) {
		this.service = service;
	}
	 
	 
	 
}
