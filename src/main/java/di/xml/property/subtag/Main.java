package di.xml.property.subtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/xml/property/subtag/beans.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}
}
