package aop.pojo.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/pojo/around/beans.xml");
		BusinessLogic businessLogic = context.getBean("businessLogic", BusinessLogic.class);
		System.out.println(businessLogic.doLogic());
	}
}