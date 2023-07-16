package lookout.training.springcore.javaconfiguration.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Training1Main {
	

	public static void main(String args[]) {
		
		ApplicationContext factory =new AnnotationConfigApplicationContext(JConfigurationConstructor.class);
		Writer  writer = (Writer)factory.getBean("writer");
		writer.write();
	}

}
