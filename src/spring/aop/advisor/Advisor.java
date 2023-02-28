package spring.aop.advisor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advisor {
	@Around("within(spring.aop.entity.*)")
	public Object AroundAdvice(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("[Around] start");
		Object result = joinpoint.proceed();
		System.out.println("[Around] end");
		return result;
	}
//	@Before("within(spring.aop.entity.*)")
//	public void BeforeAdvice(JoinPoint joinpoint) throws Throwable
//	{
//		System.out.println("[Before] test");
//	}
//	@AfterReturning("within(spring.aop.entity.*)")
//	public void AfterReturningAdvice(JoinPoint joinpoint) throws Throwable
//	{
//		System.out.println("[AfterReturning] test");
//	}
//	@AfterThrowing("within(spring.aop.entity.*)")
//	public void AfterThrowingAdvice(JoinPoint joinpoint) throws Throwable
//	{
//		System.out.println("[AfterThrowing] test");
//	}
}
