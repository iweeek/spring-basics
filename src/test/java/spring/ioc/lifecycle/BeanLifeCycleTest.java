package test.java.spring.ioc.lifecycle;

import main.java.spring.ioc.lifecycle.BeanLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycleTest extends UnitTestBase {

    public BeanLifeCycleTest() {
        super("classpath:main/resources/*.xml");
    }

    @Test
    public void init() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
    }
}