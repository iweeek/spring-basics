package main.java.spring.ioc.beanAnnotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(1)
@Service
public class BeanImplTwo implements BeanInterface{

    @Override
    public void say() {

    }
}
