package di.annotation.scan.xml;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Male extends Person{
	@Autowired
	public Male(String name, Calendar birth) {
		super(name, birth);
	}

	public String getGender() {
		return "Male";
	}
}
