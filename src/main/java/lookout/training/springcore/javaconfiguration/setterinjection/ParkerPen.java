package lookout.training.springcore.javaconfiguration.setterinjection;

public class ParkerPen implements Pen {

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
