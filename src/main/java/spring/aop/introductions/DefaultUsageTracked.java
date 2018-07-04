package main.java.spring.aop.introductions;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 6:37 PM
 */
public class DefaultUsageTracked implements UsageTracked {

    @Override
    public void incrementUseCount() {
        System.out.println("DefaultUsageTracked incrementUseCount");
    }
}
