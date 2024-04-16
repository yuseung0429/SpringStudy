package di.xml.constructor.property;

import java.util.Calendar;

class Female extends Person{
	public Female(String name, Calendar birth) {
		super(name, birth);
	}

	public String getGender() {
		return "Female";
	}
}
