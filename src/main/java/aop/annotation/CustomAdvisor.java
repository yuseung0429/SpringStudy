package aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
class CustomAdvisor {
	@Pointcut("execution(public * aop.annotation.BusinessLogic.*(..))")
	public void commonPointcut() { };
	
	@Before("commonPointcut()")
	public void beforeCustom(JoinPoint joinPoint) {
		System.out.println("Preprocessing... Done");
	}
	
//	@AfterReturning(pointcut = "commonPointcut()", returning = "returnObject")
//	public void afterReturningCustom(JoinPoint joinPoint, Object returnObject) {
//		System.out.println("Postprocessing... Done");
//		System.out.println("Return Value : " + returnObject);
//	}
//	
//	@AfterThrowing(pointcut = "commonPointcut()", throwing = "exception")
//	public void afterThrowingCustom(JoinPoint joinPoint, Exception exception) {
//		System.out.println("Postprocessing... Done");
//		System.out.println("exception : " + exception);
//	}
//	
//	@After("commonPointcut()")
//	public void afterCustom(JoinPoint joinPoint) {
//		System.out.println("Postprocessing... Done");
//	}
//	
//	@Around("commonPointcut()")
//	public Object aroundCustom(ProceedingJoinPoint joinPoint) {
//		System.out.println("Preprocessing... Done");
//		Object returnObject=null;
//		try {
//			returnObject = joinPoint.proceed();
//		} catch(Throwable e) {
//			System.out.println(e);
//		}
//		System.out.println("Postprocessing... Done");
//		return returnObject;
//	}
}
