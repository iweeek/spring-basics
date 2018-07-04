package main.java.spring.ioc.beanAnnotation.jsr;


import org.springframework.stereotype.Repository;

@Repository
public class JsrDao {

    public void save() {
        System.out.println("JsrDao");
    }
}
