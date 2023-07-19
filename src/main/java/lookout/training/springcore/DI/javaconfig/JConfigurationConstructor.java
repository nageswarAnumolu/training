package lookout.training.springcore.DI.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JConfigurationConstructor {
	
	/*
	 * @Bean public EmailService emailService() { return new EmailService(); }
	 * 
	 * @Bean public NotificationService notificationService(EmailService blackInk) {
	 * return new NotificationService(blackInk); }
	 * 
	 * @Bean public PaymentServiceService paymentService(NotificationService
	 * notificationService) { return new PaymentServiceService(notificationService);
	 * }
	 */
}
