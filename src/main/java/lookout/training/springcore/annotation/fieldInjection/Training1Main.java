package lookout.training.springcore.annotation.fieldInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Training1Main {
	public static void main(String args[]) {
		ApplicationContext context =new AnnotationConfigApplicationContext(JConfigurationSetter.class);
		Writer  writer = (Writer)context.getBean("writer");
		writer.write();
	}

}
