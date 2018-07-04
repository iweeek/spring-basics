package test.java.spring.ioc.beanAnnotation.javabased;


import main.java.spring.ioc.beanAnnotation.BeanAnnotation;
import main.java.spring.ioc.beanAnnotation.javabased.MyDriverManager;
import main.java.spring.ioc.beanAnnotation.javabased.Store;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.java.spring.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class StoreTest extends UnitTestBase {

    public StoreTest() {
        super("classpath:main/resources/spring-beanannotation.xml");
    }

    @Test
    public void say() {
        Store store = super.getBean("stringStore"); // 如果@Bean没有指定名称，注意这里是方法名称。
        System.out.println(store.getClass().getName());
    }

    @Test
    public void myDriverStoreTest() {
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());
    }

    @Test
    public void scopeTest() {
        Store store = super.getBean("stringStore");
        System.out.println(store.hashCode());

        Store store2 = super.getBean("stringStore");
        System.out.println(store2.hashCode());

    }

    @Test
    public void genericTest() {
        Store store = super.getBean("stringStoreTest");
    }


}
