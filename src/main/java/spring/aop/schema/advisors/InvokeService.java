package main.java.spring.aop.schema.advisors;

import org.springframework.dao.PessimisticLockingFailureException;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 2:46 PM
 */
public class InvokeService {

    public void invoke() {
        System.out.println("InvokeService ......");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("");
    }
}
