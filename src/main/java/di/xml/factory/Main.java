package di.xml.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/xml/factory/beans.xml");
		Earth earthConstructor = context.getBean("earthConstructor", Earth.class);
		Earth earthFactory = context.getBean("earthFactory", Earth.class);
		System.out.println(earthConstructor == earthFactory);
		System.out.println(earthFactory == Earth.getInstance());
	}
}
