package main.java.spring.ioc.injection.service;

import main.java.spring.ioc.injection.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDao injectionDao;

    // 设值注入
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }
    // 构造器注入
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    @Override
    public void save(String arg) {
        System.out.println("Service接收参数： " + arg);
        arg = arg + ":" + this.hashCode();
    }
}
