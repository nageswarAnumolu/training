package lookout.training.coupling;

public class PaymentServiceService {
	static NotificationService notificationService = new NotificationService();
	public static void main(String args[]) {
		notificationService.sendMessage("Nageswar", "You paid your Bill");
	}
}
