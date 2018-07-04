package main.java.spring.ioc.beanAnnotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:main/resources/spring-beanannotation.xml")
public class StoreConfig {
//
//    @Value("${url}")
//    private String url;
//
//    @Value("${username}")
//    private String username;
//
//    @Value("${password}")
//    private String password;
//
//    @Bean
//    public MyDriverManager myDriverManager() {
//        return new MyDriverManager(url, username, password);
//    }

    //    @Bean("store")
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public Store stringStore() {
//        return new StringStore();
//    }


//    @Bean(initMethod ="init", destroyMethod ="destroy")
//    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public Store stringStore() {
//        return new StringStore();
//    }

//    @Autowired
//    private Store<String> s1;
//
//    @Autowired
//    private Store<Integer> s2;
//
//    @Bean
//    public StringStore stringStore() {
//        return new StringStore();
//    }
//
//    @Bean
//    public Store stringStoreTest() {
//        System.out.println("s1: " + s1.getClass().getName());
//        return new StringStore();
//    }
//
//    @Bean
//    public IntegerStore integerStore() {
//        return new IntegerStore();
//    }
}
