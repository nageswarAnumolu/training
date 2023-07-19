package lookout.training.springcore.DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Training1Main {
	

	public static void main(String args[]) {
		
		//String path = "D:\\work\\mylookout\\Training\\traing\\src\\main\\java\\lookout\\training\\application-context.xml";
		BeanFactory factory = 
				new ClassPathXmlApplicationContext("application-context-constructor-notificationservice.xml");
		PaymentServiceService  service = (PaymentServiceService)factory.getBean("paymentService");
		
		service.sendMessage("Srija", "Paid 500 rs amount");
		
		
		//MessagingService service = new PaymentServiceService(null)
	
		
		/*
		 * ApplicationContext context = new FileSystemXmlApplicationContext(path);
		 * Writer writer = (Writer)context.getBean("writer"); writer.write();
		 */
	}

}
