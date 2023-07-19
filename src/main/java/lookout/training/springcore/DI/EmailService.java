package lookout.training.springcore.DI;

public class EmailService implements MessagingService {
	
	public void sendMessage(String message,String resp) {
		
		System.out.println("Sending messge to :"+resp+", and content is : "+message);
		
	}

}
