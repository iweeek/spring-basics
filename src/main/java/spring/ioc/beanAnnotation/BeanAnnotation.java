package main.java.spring.ioc.beanAnnotation;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
//@Component("bean")
public class BeanAnnotation {

    public void say(String arg) {
        System.out.println("BeanAnnotationTest: " + arg);
    }
}
