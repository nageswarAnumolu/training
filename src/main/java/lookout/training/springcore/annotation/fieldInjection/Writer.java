package lookout.training.springcore.annotation.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope("singleton")
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
