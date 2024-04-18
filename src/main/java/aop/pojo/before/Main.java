package aop.pojo.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/pojo/before/beans.xml");
		BusinessLogic businessLogic = context.getBean("businessLogic", BusinessLogic.class);
		businessLogic.doLogic();
	}
}
