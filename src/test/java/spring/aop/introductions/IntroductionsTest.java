package test.java.spring.aop.introductions;

import main.java.spring.aop.aspectj.biz.DemoBiz;
import main.java.spring.aop.introductions.BizService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class IntroductionsTest extends UnitTestBase {

    public IntroductionsTest() {
        super("classpath:main/resources/spring-aop-introductions.xml");
    }

    @Test
    public void say() throws Exception {
        BizService bizService = super.getBean("bizService");
        bizService.say("good");
    }

}