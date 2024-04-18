package di.annotation.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Home home = context.getBean("home", Home.class);
		System.out.println(home.getOwner());
	}
}
