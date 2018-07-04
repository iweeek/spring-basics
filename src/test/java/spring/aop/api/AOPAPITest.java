package test.java.spring.aop.api;

import main.java.spring.aop.api.BizLogic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AOPAPITest extends UnitTestBase {

    public AOPAPITest() {
        super("classpath:main/resources/spring-aop-api.xml");
    }

    @Test
    public void biz() throws Exception {
        BizLogic bizLogic = super.getBean("bizLogicImpl");
        bizLogic.save();
    }

}