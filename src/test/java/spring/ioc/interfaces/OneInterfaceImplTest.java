package test.java.spring.ioc.interfaces;

import main.java.spring.ioc.interfaces.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class OneInterfaceImplTest extends UnitTestBase {

    public OneInterfaceImplTest() {
        super("classpath*:main/resources/spring-ioc.xml");
    }

    @Test
    public void hello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("你好"));
    }
}