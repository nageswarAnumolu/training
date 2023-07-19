package lookout.training.springcore.DI.javaconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sanju")
@Primary
public class WhatsappService implements MessagingService{

	@Override
	public void sendMessage(String messages, String recp) {
		System.out.println("Message :"+messages);
		System.out.println("recp :"+recp);
	}

}
