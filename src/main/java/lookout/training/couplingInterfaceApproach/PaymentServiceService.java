package lookout.training.couplingInterfaceApproach;

public class PaymentServiceService {
	public static void main(String args[]) {
		
		MessagingService service = new EmailService();
		NotificationService notificationService = new NotificationService(service);
		notificationService.sendMessage("Nageswar", "You paid your Bill");
	}
}
