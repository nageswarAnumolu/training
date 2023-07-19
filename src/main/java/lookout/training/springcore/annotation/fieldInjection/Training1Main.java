package lookout.training.springcore.annotation.fieldInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Training1Main {
	public static void main(String args[]) {
		ApplicationContext context =new AnnotationConfigApplicationContext(JConfigurationSetter.class);
		Writer  writer = (Writer)context.getBean("writer");
		System.out.println("writer object:"+writer);
		
		Writer  writer1 = (Writer)context.getBean("writer");
		System.out.println("writer object:"+writer1);
		
		Writer  writer2 = (Writer)context.getBean("writer");
		System.out.println("writer object:"+writer2);
		Writer  writer3 = (Writer)context.getBean("writer");
		System.out.println("writer object:"+writer3);
		
		writer.write();
	}

}
