package aop.pojo.before;

import org.aspectj.lang.JoinPoint;

class CustomAdvice {
	public void preprocessing(JoinPoint joinpoint) {
		System.out.println("Preprocessing... Done");
	}
}
