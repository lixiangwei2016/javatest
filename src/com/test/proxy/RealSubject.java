package com.test.proxy;

/**
 * Created by lixiangwei2 on 2017/2/23.
 */
public class RealSubject implements Subject {
    @Override

    public void dorequest() {
        System.out.println("计算中.....");
    }
}
