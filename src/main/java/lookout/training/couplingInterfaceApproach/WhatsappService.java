package lookout.training.couplingInterfaceApproach;

public class WhatsappService implements MessagingService{

	@Override
	public void sendMessage(String messages, String recp) {
		System.out.println("Message :"+messages);
		System.out.println("recp :"+recp);
	}

}
