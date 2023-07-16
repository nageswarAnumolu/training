package lookout.training.springcore.annotation.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkerPen implements Pen {

	private Ink ink;
	
	@Autowired
	public ParkerPen (Ink ink) {
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
