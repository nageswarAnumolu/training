package lookout.training.springcore.annotation.constructorinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JConfigurationConstructor {
	
	/*
	 * @Bean public Ink blackInk() { return new BlackInk(); }
	 * 
	 * @Bean public Pen parkerPen(BlackInk blackInk) { return new
	 * ParkerPen(blackInk); }
	 * 
	 * @Bean public Writer writer(Pen pen) { return new Writer(pen); }
	 */
}
