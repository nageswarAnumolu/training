package lookout.training.springcore.xmlconfiguration.constructorinjection;

public class Writer {
	
	private Pen pen;
	
	public Writer(Pen pen) {
		this.pen = pen;
	}
	
	public void write() {
		pen.write();
	}
}
