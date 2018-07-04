package main.java.spring.ioc.beanAnnotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(2)
@Service
public class BeanImplOne implements BeanInterface{

    @Override
    public void say() {

    }
}
