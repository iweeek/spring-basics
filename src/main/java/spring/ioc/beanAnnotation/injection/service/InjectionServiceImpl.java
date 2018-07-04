package main.java.spring.ioc.beanAnnotation.injection.service;

import main.java.spring.ioc.beanAnnotation.injection.dao.InjectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InjectionServiceImpl implements InjectionService {

//    @Autowired
    private InjectionDao injectionDao;

    // 设值方式
//    @Autowired
//    public void setInjectionDao(InjectionDao injectionDao) {
//        this.injectionDao = injectionDao;
//    }

    // 构造器方式
    // 不用加@Autowired
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

//    @Override
    public void save(String arg) {
        injectionDao.save(arg);
    }
}
