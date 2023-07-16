package lookout.training.springcore.xmlconfiguration.constructorinjection;

public class ParkerPen implements Pen {

	private Ink ink;
	
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
