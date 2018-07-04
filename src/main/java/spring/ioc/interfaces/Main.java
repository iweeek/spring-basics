package main.java.spring.ioc.interfaces;

public class Main {

    public static void main(String[] args) {
        OneInterface oif = new OneInterfaceImpl();

        System.out.println(oif.hello("nijun"));
    }
}
