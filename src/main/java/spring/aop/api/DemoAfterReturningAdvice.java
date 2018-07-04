package main.java.spring.aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.management.MemoryType;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 3:28 PM
 */
public class DemoAfterReturningAdvice implements AfterReturningAdvice {

    /**
     *
     * @param returnValue 返回值
     * @param method 被调用的方法
     * @param objects 方法的参数
     * @param target 目标
     * @throws Throwable 如果抛出异常，将会抛出拦截器链，代替返回值
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("DemoAfterReturningAdvice： " + method + "  " +
                target.getClass().getName() + "  " + returnValue);
    }
}
