package aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("resource")

class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		BusinessLogic businessLogic = context.getBean("businessLogic", BusinessLogic.class);
		businessLogic.doLogic();
	}
}
