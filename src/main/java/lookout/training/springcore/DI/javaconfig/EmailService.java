package lookout.training.springcore.DI.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessagingService {
	
	public void sendMessage(String message,String resp) {
		
		System.out.println("Sending messge to :"+resp+", and content is : "+message);
		
	}

}
