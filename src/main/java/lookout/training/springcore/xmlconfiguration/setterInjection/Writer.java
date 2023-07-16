package lookout.training.springcore.xmlconfiguration.setterInjection;

public class Writer {
	
	private Pen pen;
	public void write() {
		pen.write();
	}
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
