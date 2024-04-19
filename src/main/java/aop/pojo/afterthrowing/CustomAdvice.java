package aop.pojo.afterthrowing;

import org.aspectj.lang.JoinPoint;

class CustomAdvice {
	public void errprocessing(JoinPoint joinpoint, Exception exception) {
		System.out.println("Errprocessing...");
		System.out.println("[log] exception : " + exception);
		System.out.println("Done");
	}
}
