package di.scope.annotation;

import java.util.Calendar;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Female extends Person{
	public Female(String name, Calendar birth) {
		super(name, birth);
	}

	public String getGender() {
		return "Female";
	}
}
