package lookout.training.springcore.DI.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceService {
	
	@Autowired
	NotificationService notificationService;
	
	public PaymentServiceService() {
		
	}

	//@Autowired
	public PaymentServiceService(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
	
	
	
	public NotificationService getNotificationService() {
		return notificationService;
	}


	//@Autowired
	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}



	public void sendMessage(String recp, String content) {
		notificationService.sendMessage(recp, content);
	}
}
