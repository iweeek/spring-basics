package main.java.spring.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 5:20 PM
 */
@Component
@Aspect
public class DemoAspect {

    @Pointcut("execution(* main.java.spring.aop.aspectj.biz.*.*(..))")
    public void pointcut() {}

    @Pointcut("within(main.java.spring.aop.aspectj.biz.*)")
    public void bizPointcut() {}

//    @Before("execution(* main.java.spring.aop.aspectj.biz.*.*(..))")
    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }

    /**
     *
     * @param arg 获取到方法上的参数
     */
    @Before("pointcut() && args(arg)")
    public void beforeWithParam(String arg) {
        System.out.println("beforeWithParam: " + arg);
    }

    @Before("pointcut() && @annotation(demoMethod)")
    public void beforeWithAnnotation(DemoMethod demoMethod) {
        System.out.println("beforeWithAnnotation: " + demoMethod.value());
    }

    @AfterReturning(pointcut = "bizPointcut()", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("afterReturning " + returnValue);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void afterThrowing(RuntimeException e) {
        System.out.println("afterThrowing: " + e.getMessage());
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around 1");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("around 2");
        System.out.println("obj: " + obj);
        return obj;
    }
}
