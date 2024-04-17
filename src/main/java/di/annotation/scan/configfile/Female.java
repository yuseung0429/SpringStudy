package di.annotation.scan.configfile;

import java.util.Calendar;

import org.springframework.stereotype.Component;

// @Component
class Female extends Person{
	public Female(String name, Calendar birth) {
		super(name, birth);
	}

	public String getGender() {
		return "Female";
	}
}
