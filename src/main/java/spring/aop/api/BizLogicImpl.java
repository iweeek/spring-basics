package main.java.spring.aop.api;

/**
 * Created by IntelliJ IDEA.
 * User: nijun
 * Date: 2018/7/4
 * Time: 3:20 PM
 */
public class BizLogicImpl implements BizLogic {

    @Override
    public String save() {
        System.out.println("BizLogicImpl: Logic save.");
        return "BizLogicImpl save";
    }
}
