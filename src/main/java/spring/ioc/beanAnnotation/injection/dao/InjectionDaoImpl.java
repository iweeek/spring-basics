package main.java.spring.ioc.beanAnnotation.injection.dao;


import org.springframework.stereotype.Repository;

@Repository
public class InjectionDaoImpl implements InjectionDao {
    @Override
    public void save(String arg) {
        System.out.println(arg);
    }
}
