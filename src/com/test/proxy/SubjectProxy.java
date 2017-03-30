package com.test.proxy;

/**
 * Created by lixiangwei2 on 2017/2/23.
 */
public class SubjectProxy implements Subject{
    private Subject subject;

    public SubjectProxy(Subject subject){
        this.subject=subject;
    }
    @Override
    public void dorequest() {
        System.out.println("日志记录开始....");
        subject.dorequest();
        System.out.printf("日志记录结束....");
    }
}
