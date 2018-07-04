package main.java.spring.ioc.beanAnnotation.jsr;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
//@Named
public class JsrService {

    @Resource
//    @Inject
    private JsrDao jsrDao;

//    @Resource
    public void setJsrDao(JsrDao jsrDao) {
        this.jsrDao = jsrDao;
    }

    public void save() {
        jsrDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("jsr init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr destroy");
    }
}
