package di.configfile;

import java.util.Calendar;

class Male extends Person{
	public Male(String name, Calendar birth) {
		super(name, birth);
	}

	public String getGender() {
		return "Male";
	}
}
