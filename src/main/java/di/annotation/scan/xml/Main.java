package di.annotation.scan.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/annotation/scan/xml/beans.xml");
		Person person = context.getBean("male", Person.class);
		System.out.println(person.toString());
	}
}
