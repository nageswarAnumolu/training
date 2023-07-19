package lookout.training.couplingInterfaceApproach;

public class PaymentServiceService {
	public static void main(String args[]) {
		
		//MessagingService service = new EmailService();
		
		MessagingService whatsappService = new WhatsappService();
		
		NotificationService notificationService = new NotificationService();
		notificationService.setService(whatsappService);
		
		notificationService.sendMessage("Nageswar", "You paid your Bill");
	}
}
