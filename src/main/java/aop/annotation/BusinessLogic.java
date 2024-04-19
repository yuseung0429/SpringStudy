package aop.annotation;

import org.springframework.stereotype.Component;

@Component
class BusinessLogic {
	public void doLogic() {
		System.out.println("Business Logic");
	}
}
