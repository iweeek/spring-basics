package test.java.spring.ioc.beanAnnotation.multibean;

import main.java.spring.ioc.beanAnnotation.BeanAnnotation;
import main.java.spring.ioc.beanAnnotation.multibean.BeanInterface;
import main.java.spring.ioc.beanAnnotation.multibean.BeanInvoker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class MultiBeanTest extends UnitTestBase {

    public MultiBeanTest() {
        super("classpath:main/resources/spring-beanannotation.xml");
    }

    @Test
    public void say() {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
    }

}
