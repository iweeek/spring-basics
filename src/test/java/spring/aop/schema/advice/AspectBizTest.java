package test.java.spring.aop.schema.advice;

import main.java.spring.aop.schema.advice.AspectBiz;
import main.java.spring.aop.schema.advice.Fit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class AspectBizTest extends UnitTestBase {

    public AspectBizTest() {
        super("classpath:main/resources/spring-aop-schema-advice.xml");
    }

    @Test
    public void biz() throws Exception {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

    @Test
    public void init() throws Exception {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("demo ", 3);
    }

    /**
     * 将 AspectBiz 对象转化为 Fit 对象而且不会报错，
     * <api:aspect>中的<api:declare-parents>元素
     * 声明该元素用于声明所匹配的类型拥有一个新的parent
     * @throws Exception
     */
    @Test
    public void fit() throws Exception {
        Fit fit = (Fit)super.getBean("aspectBiz");
        fit.filter();
    }
}