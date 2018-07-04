package test.java.spring.ioc.aware;

import main.java.spring.ioc.lifecycle.BeanLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class DemoApplicationContextTest extends UnitTestBase {

    public DemoApplicationContextTest() {
        super("classpath:main/resources/spring-aware.xml");
    }

    @Test
    public void testApplicationContext() {
        System.out.println("testApplicationContext: " + super.getBean("applicationContext"));
    }
}