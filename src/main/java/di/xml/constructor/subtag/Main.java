package di.xml.constructor.subtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/xml/constructor/subtag/beans.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}
}
