package main.java.spring.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.dao.PessimisticLockingFailureException;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 2:29 PM
 */
public class ConcurrentOperationExecutor implements Ordered {

    private static final int DEAFAULT_MAX_RETRIES = 2;

    private int maxRetries = DEAFAULT_MAX_RETRIES;

    private int order = 1;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return order;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        int numAttempts = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            numAttempts++;
            System.out.println("try times: " + numAttempts);
            try {
                return proceedingJoinPoint.proceed();
            } catch (PessimisticLockingFailureException ex) {
                lockingFailureException = ex;
            }
        } while (numAttempts <= this.maxRetries);
        System.out.println("Try error: " + numAttempts);
        throw lockingFailureException;
    }
}
