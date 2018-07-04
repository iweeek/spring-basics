package test.java.spring.ioc.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanNameTest extends UnitTestBase {

    public BeanNameTest() {
        super("classpath:main/resources/spring-aware.xml");
    }

    @Test
    public void testBeanName() {
        System.out.println("testBeanName: " + super.getBean("bdeanName").hashCode());
    }
}