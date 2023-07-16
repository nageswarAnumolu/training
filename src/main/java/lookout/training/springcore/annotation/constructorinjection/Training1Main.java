package lookout.training.springcore.annotation.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Training1Main {
	

	public static void main(String args[]) {
		
		ApplicationContext factory =new AnnotationConfigApplicationContext(JConfigurationConstructor.class);
		Writer  writer = (Writer)factory.getBean("writer");
		writer.write();
	}

}
