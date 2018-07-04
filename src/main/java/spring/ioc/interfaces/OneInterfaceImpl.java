package main.java.spring.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String word) {
        return "Hello " + word;
    }
}
