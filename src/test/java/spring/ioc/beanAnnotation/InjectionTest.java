package test.java.spring.ioc.beanAnnotation;


import main.java.spring.ioc.beanAnnotation.injection.service.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionTest extends UnitTestBase {

    public InjectionTest() {
        super("classpath:main/resources/spring-beanannotation.xml");
    }

    @Test
    public void testAutoWiring() {
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("haha");
    }
}
