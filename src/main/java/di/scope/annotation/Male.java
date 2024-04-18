package di.scope.annotation;

import java.util.Calendar;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
class Male extends Person{

	public Male(String name, Calendar birth) {
		super(name, birth);
	}

	public String getGender() {
		return "Male";
	}
}
