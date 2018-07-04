package main.java.spring.aop.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 6:38 PM
 */
@Component
@Aspect
public class UsageTracking {

    @DeclareParents(value = "main.java.spring.aop.introductions.*+", defaultImpl = DefaultUsageTracked.class)
    public static UsageTracked mixin;

    @Pointcut("execution(* main.java.spring.aop.introductions.BizService.*(..))")
    public void pointcut() {}

    @Before("pointcut() && this(usageTracked)")
    public void recordUsage(UsageTracked usageTracked) {
        usageTracked.incrementUseCount();
    }
}

