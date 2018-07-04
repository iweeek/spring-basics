package test.java.spring.ioc.beanAnnotation;


import main.java.spring.ioc.beanAnnotation.BeanAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class BeanAnnotationTest extends UnitTestBase {

    public BeanAnnotationTest() {
        super("classpath:main/resources/spring-beanannotation.xml");
    }

    @Test
    public void say() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("haha");
    }

    @Test
    public void testScope() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        System.out.println("beanAnnotation： " + beanAnnotation.hashCode());

        BeanAnnotation beanAnnotation2 = super.getBean("beanAnnotation");
        System.out.println("beanAnnotation2： " + beanAnnotation2.hashCode());

    }
}
