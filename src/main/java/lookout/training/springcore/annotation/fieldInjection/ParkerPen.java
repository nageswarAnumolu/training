package lookout.training.springcore.annotation.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkerPen implements Pen {

	@Autowired
	private Ink ink;
	
	public Ink getInk() {
		return ink;
	}

	
	public void setInk(Ink ink) {
		this.ink = ink;
	}

	@Override
	public String getBrandName() {
		return "Parker Pen";
	}

	@Override
	public void write() {
		System.out.println("Writing with :"+getBrandName()+", and colout is :"+ink.getColour());
		
	}

}
