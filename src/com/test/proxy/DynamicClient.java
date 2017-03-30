package com.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by lixiangwei2 on 2017/2/23.
 */
public class DynamicClient {

    public static void main(String[] args) {
        Subject realsubject = new RealSubject();

        InvocationHandler invocationHandler = new DynamicProxy(realsubject);

        Subject subject = (Subject) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),realsubject.getClass().getInterfaces(),invocationHandler);

        subject.dorequest();
    }
}
