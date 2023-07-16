package lookout.training.springcore.annotation.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer {
	
	private Pen pen;
	public void write() {
		pen.write();
	}
	public Pen getPen() {
		return pen;
	}
	@Autowired
	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
