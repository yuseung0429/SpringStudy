package di.scope.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Person personMale1 = context.getBean("male", Person.class);
		Person personMale2 = context.getBean("male", Person.class);
		Person personFemale1 = context.getBean("female", Person.class);
		Person personFemale2 = context.getBean("female", Person.class);
		System.out.println("Singleton : " + (personMale1 == personMale2));
		System.out.println("Prototype : " + (personFemale1 == personFemale2));
	}
}
