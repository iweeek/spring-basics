package test.java.spring.ioc.resource;

import main.java.spring.ioc.autowiring.AutoWiringService;
import main.java.spring.ioc.resources.DemoResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class ResourceTest extends UnitTestBase {

    public ResourceTest() {
        super("classpath:main/resources/spring-resource.xml");
    }

    @Test
    public void testResource() {
        DemoResource demoResource = super.getBean("demoResource");
        demoResource.say();
    }
}
