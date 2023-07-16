package lookout.training.springcore.xmlconfiguration.setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Training1Main {
	

	public static void main(String args[]) {
		
		String path = "D:\\work\\mylookout\\Training\\traing\\src\\main\\java\\lookout\\training\\application-context.xml";
		BeanFactory factory =new ClassPathXmlApplicationContext("application-context-setter.xml");
		Writer  writer = (Writer)factory.getBean("writer");
		writer.write();
		
		
		/*
		 * ApplicationContext context = new FileSystemXmlApplicationContext(path);
		 * Writer writer = (Writer)context.getBean("writer"); writer.write();
		 */
	}

}
