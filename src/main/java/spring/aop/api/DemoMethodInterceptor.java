package main.java.spring.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 3:33 PM
 */
public class DemoMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("DemoMethodInterceptor 1 : " + methodInvocation.getMethod().getName() +
                methodInvocation.getStaticPart().getClass().getName());
        Object obj = methodInvocation.proceed();
        System.out.println("DemoMethodInterceptor 2 : " + obj);
        return obj;
    }
}
