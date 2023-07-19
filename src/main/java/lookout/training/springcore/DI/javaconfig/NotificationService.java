package lookout.training.springcore.DI.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	@Autowired
	@Qualifier("sanju")
	MessagingService service;
	
	public NotificationService() {
		
	}
	
	//@Autowired
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
