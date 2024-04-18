package aop.pojo.after;

import org.aspectj.lang.JoinPoint;

class CustomAdvice {
	public void postprocessing(JoinPoint joinpoint) {
		System.out.println("Postprocessing... Done");
	}
}
