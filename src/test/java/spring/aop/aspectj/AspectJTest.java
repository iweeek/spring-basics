package test.java.spring.aop.aspectj;

import main.java.spring.aop.api.BizLogic;
import main.java.spring.aop.aspectj.biz.DemoBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AspectJTest extends UnitTestBase {

    public AspectJTest() {
        super("classpath:main/resources/spring-aop-aspectj.xml");
    }

    @Test
    public void biz() throws Exception {
        DemoBiz demoBiz = super.getBean("demoBiz");
        demoBiz.save("good");
    }

}