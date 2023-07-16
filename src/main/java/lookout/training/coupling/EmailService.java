package lookout.training.coupling;

public class EmailService {
	
	public void sendMessage(String message,String resp) {
		
		System.out.println("Sending messge to :"+resp+", and content is : "+message);
		
	}

}
