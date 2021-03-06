package main.java.spring.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanName implements BeanNameAware, ApplicationContextAware {

    private  String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println(name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext: " + applicationContext.getBean(beanName).hashCode());
    }
}
