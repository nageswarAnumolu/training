package lookout.training.springcore.javaconfiguration.setterinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JConfigurationSetter {
	
	@Bean
	public Ink blackInk() {
		return new BlackInk();
	}
	
	@Bean
	public Pen parkerPen(BlackInk blackInk) {
		ParkerPen p = new ParkerPen();
		p.setInk(blackInk);
		return p;
	}
	
	@Bean
	public Writer writer(Pen pen) {
		Writer w =  new Writer();
		w.setPen(pen);
		return w;
	}
}
