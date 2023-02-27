package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		Exam proxy = (Exam) context.getBean("proxy");
		System.out.println(proxy.total());
		System.out.println(proxy.avg());
		/*
		 * Exam exam = new Exam2023(1,1,1,1); Exam proxy =
		 * (Exam)Proxy.newProxyInstance(Exam2023.class.getClassLoader(), new Class[]
		 * {Exam.class}, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable { long start = System.currentTimeMillis(); Object result =
		 * method.invoke(exam, args); long end = System.currentTimeMillis();
		 * System.out.printf("걸린 시간 : %d\n", end-start); return result; } });
		 * System.out.printf("total is %d \n", proxy.total());
		 */
		
	}
}