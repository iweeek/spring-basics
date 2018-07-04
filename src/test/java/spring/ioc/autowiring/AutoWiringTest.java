package test.java.spring.ioc.autowiring;

import main.java.spring.ioc.autowiring.AutoWiringDao;
import main.java.spring.ioc.autowiring.AutoWiringService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringTest extends UnitTestBase {

    public AutoWiringTest() {
        super("classpath:main/resources/spring-autowiring.xml");
    }

    @Test
    public void testAutoWiring() {
        AutoWiringService autoWiringService = super.getBean("autoWiringService");
        autoWiringService.say("haha");
    }
}
