package main.java.spring.aop.schema.advice;

public class AspectBiz {


    public void biz() throws Exception {
        System.out.println("AspectBiz biz");
//        throw new RuntimeException();
    }

    public void init(String bizName, int times) {
        System.out.println("AspectBiz init: " + bizName + " " + times);
    }
}
