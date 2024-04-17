package di.annotation.scan.configfile;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Male extends Person{

	public Male(String name, Calendar birth) {
		super(name, birth);
	}

	public String getGender() {
		return "Male";
	}
}
