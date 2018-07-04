package test.java.spring.ioc.jsr;


import main.java.spring.ioc.beanAnnotation.javabased.MyDriverManager;
import main.java.spring.ioc.beanAnnotation.javabased.Store;
import main.java.spring.ioc.beanAnnotation.jsr.JsrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class JsrTest extends UnitTestBase {

    public JsrTest() {
        super("classpath:main/resources/spring-beanannotation.xml");
    }

    @Test
    public void testSave() {
        JsrService service = super.getBean("jsrService"); // 如果@Bean没有指定名称，注意这里是方法名称。
        service.save();
    }
}
