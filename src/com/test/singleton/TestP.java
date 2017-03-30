package com.test.singleton;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class TestP  {

    public static void main(String[] args) {
        People people = new People() {
            @Override
            public void eat() {
                System.out.println("eat something");
            }
        };
        people.eat();
    }
}
