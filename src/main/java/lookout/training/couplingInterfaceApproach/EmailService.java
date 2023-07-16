package lookout.training.couplingInterfaceApproach;

public class EmailService implements MessagingService {
	
	public void sendMessage(String message,String resp) {
		
		System.out.println("Sending messge to :"+resp+", and content is : "+message);
		
	}

}
