package com.test.proxy;

/**
 * Created by lixiangwei2 on 2017/2/23.
 */
public class Client {

    public static void main(String[] args) {
        Subject sub = new TimeProxy(new RealSubject());
        Subject t = new SubjectProxy(sub);
        t.dorequest();
    }
}
