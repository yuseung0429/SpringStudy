package aop.pojo.afterreturning;

import org.aspectj.lang.JoinPoint;

class CustomAdvice {
	public void postprocessing(JoinPoint joinpoint, Object returnObject) {
		System.out.println("Postprocessing...");
		System.out.println("[log] return : " + returnObject);
		System.out.println("Done");
	}
}
