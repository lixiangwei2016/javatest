package com.test.factory;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class TestFactory {

    public static void main(String[] args) {
        //Duck duck=DuckFactory.getDuck("black");
       // Duck duck=DuckFactory.getRedDuckFactory();
        Provider provider=new RedDuckFactory();
        Duck duck=provider.getDuck();
        duck.run();
    }
}
