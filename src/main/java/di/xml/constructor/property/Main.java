package di.xml.constructor.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/xml/constructor/property/beans.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}
}
