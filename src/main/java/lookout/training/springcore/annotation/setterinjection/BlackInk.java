package lookout.training.springcore.annotation.setterinjection;

import org.springframework.stereotype.Component;

@Component
public class BlackInk implements Ink{
	
	@Override
	public String getColour() {
		return "Black";
	}
	
}
