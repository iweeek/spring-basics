package main.java.spring.aop.schema.advice;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 12:03 PM
 */
public class FitImpl implements Fit {

    @Override
    public void filter() {
        System.out.println("FitImpl filter");
    }
}
