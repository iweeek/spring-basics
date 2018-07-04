package main.java.spring.aop.schema.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class DemoAspect {

    public void before() {
        System.out.println("DemoAspect before");
    }

    public void afterReturning() {
        System.out.println("DemoAspect afterReturning");
    }

    public void afterThrowing(JoinPoint joinPoint) throws Throwable {
        System.out.println("DemoAspect afterThrowing");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("DemoAspect after");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("DemoAspect around first");
        Object retValue = proceedingJoinPoint.proceed();
        System.out.println("DemoAspect around last");
        return retValue;
    }

    public Object aroundInit(ProceedingJoinPoint proceedingJoinPoint, String bizName, int times) throws Throwable {
        System.out.println(bizName + " " + times);

        System.out.println("DemoAspect aroundInit first");
        Object retValue = proceedingJoinPoint.proceed();
        System.out.println("DemoAspect aroundInit last");
        return retValue;
    }
}
