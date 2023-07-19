package lookout.training.springcore.DI;

public class PaymentServiceService {
	
	NotificationService notificationService;

	public PaymentServiceService(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
	
	public void sendMessage(String recp, String content) {
		notificationService.sendMessage(recp, content);
	}
}
