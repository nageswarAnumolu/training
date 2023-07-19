package lookout.training.springcore.DI.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lookout.training.springcore.DI.javaconfig.JConfigurationConstructor;

public class Training1Main {
	

	public static void main(String args[]) {
		
		//String path = "D:\\work\\mylookout\\Training\\traing\\src\\main\\java\\lookout\\training\\application-context.xml";
		ApplicationContext factory =new AnnotationConfigApplicationContext(JConfigurationConstructor.class);
		PaymentServiceService  service = (PaymentServiceService)factory.getBean("paymentServiceService");
		
		service.sendMessage("Srija", "Paid 500 rs amount");
		
		
		//MessagingService service = new PaymentServiceService(null)
	
		
		/*
		 * ApplicationContext context = new FileSystemXmlApplicationContext(path);
		 * Writer writer = (Writer)context.getBean("writer"); writer.write();
		 */
	}

}
