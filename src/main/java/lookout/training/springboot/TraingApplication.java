package lookout.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TraingApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context  = SpringApplication.run(TraingApplication.class, args);
		Writer writer = (Writer)context.getBean("writer");
		writer.write();
	}
}
