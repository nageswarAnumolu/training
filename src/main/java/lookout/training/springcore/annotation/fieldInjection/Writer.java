package lookout.training.springcore.annotation.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Writer {
	
	@Autowired
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
