package main.java.spring.ioc.resources;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

public class DemoResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void say() {
//        Resource resource = applicationContext.getResource(ResourceLoader.CLASSPATH_URL_PREFIX + "main/resources/config");
        Resource resource = applicationContext.getResource("file:/Users/nijun/GitHub/Java-Turorails/code/Spring-basics/src/main/resources/config");
        System.out.println(resource.getFilename());
        try {
            System.out.println(resource.contentLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
