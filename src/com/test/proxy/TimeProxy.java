package com.test.proxy;

/**
 * Created by lixiangwei2 on 2017/2/23.
 */
public class TimeProxy implements Subject {
    private Subject subject;

    public TimeProxy(Subject subject){
        this.subject=subject;
    }
    @Override
    public void dorequest() {
        System.out.println("开始时间:"+System.currentTimeMillis());
        subject.dorequest();
        System.out.printf("结束时间:"+System.currentTimeMillis());
    }
}
