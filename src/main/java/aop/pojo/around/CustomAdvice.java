package aop.pojo.around;

import org.aspectj.lang.ProceedingJoinPoint;

class CustomAdvice {
	public Object processing(ProceedingJoinPoint joinpoint) {
		System.out.println("Preprocessing... Done");
		Object obj = null;
		try {
			obj = joinpoint.proceed();
		} catch (Throwable e) {
			System.out.println("[log] exception : " + e);
			return 0;
		}
		System.out.println("Postprocessing... Done");
		return obj;
	}
}
