package main.java.spring.aop.api;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 3:26 PM
 */
public class DemoThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("DemoThrowsAdvice afterThrowing 1");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        System.out.println("DemoThrowsAdvice afterThrowing  2 " + method.getName() + " " +
                target.getClass().getName());
    }
}
