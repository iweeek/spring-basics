package test.java.spring.ioc.injection.service;

import main.java.spring.ioc.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionServiceImplTest extends UnitTestBase {

    public InjectionServiceImplTest() {
        super("classpath:main/resources/*.xml");
    }

    @Test
    public void save() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("haha");
    }
}