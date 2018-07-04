package test.java.spring.ioc.bean;

import main.java.spring.ioc.bean.BeanScope;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeTest extends UnitTestBase {

    public BeanScopeTest() {
        super("classpath:main/resources/*.xml");
    }

    @Test
    public void say() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }
}