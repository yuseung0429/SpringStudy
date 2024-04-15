package ioc.coupling.loosely.assambler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc/coupling/loosely/factory/assambler/beans.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getGender());
	}
}
