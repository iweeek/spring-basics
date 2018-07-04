package main.java.spring.aop.introductions;

import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 6:40 PM
 */
@Service
public class BizService {

    public void say(String word) {
        System.out.println(word);
    }
}
