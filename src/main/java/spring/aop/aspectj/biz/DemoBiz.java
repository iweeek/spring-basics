package main.java.spring.aop.aspectj.biz;

import main.java.spring.aop.aspectj.DemoMethod;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 5:27 PM
 */
@Service
public class DemoBiz {

    @DemoMethod("DemoBiz save with DemoMethod")
    public String save(String arg) {
        System.out.println("DemoBiz save: " + arg);
//        throw new RuntimeException("错误");
        return "Save Success!";
    }
}
