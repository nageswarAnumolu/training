package lookout.training.springcore.annotation.fieldInjection;

import org.springframework.stereotype.Component;

@Component
public class BlackInk implements Ink{
	
	@Override
	public String getColour() {
		return "Black";
	}
	
}
