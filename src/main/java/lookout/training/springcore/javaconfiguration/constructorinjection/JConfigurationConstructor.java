package lookout.training.springcore.javaconfiguration.constructorinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JConfigurationConstructor {
	
	@Bean
	public Ink blackInk() {
		return new BlackInk();
	}
	
	@Bean
	public Pen parkerPen(BlackInk blackInk) {
		return new ParkerPen(blackInk);
	}
	
	@Bean
	public Writer writer(Pen pen) {
		return new Writer(pen);
	}
}
