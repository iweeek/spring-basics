package main.java.spring.ioc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle /*implements InitializingBean, DisposableBean*/ {

//    public void init() {
//        System.out.println("init");
//    }
//
//    public void stop() {
//        System.out.println("stop");
//    }

    public void defaultInit() {
        System.out.println("defaultInit");
    }

    public void defaultStop() {
        System.out.println("defaultStop");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("stop");
//    }
}
