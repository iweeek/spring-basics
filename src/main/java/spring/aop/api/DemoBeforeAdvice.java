package main.java.spring.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 3:24 PM
 */
public class DemoBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("DemoBeforeAdvice" + method.getName() + " " +
        target.getClass().getName());
    }
}
