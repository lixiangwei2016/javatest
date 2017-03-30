package com.test.thread;

/**
 * Created by lixiangwei2 on 2017/3/3.
 */
class ThreadTest implements Runnable{
    private String name;
    private byte[] lock = new byte[0]; // 特殊的instance变量
    public ThreadTest(String name){
        this.name = name ;
    }
    @Override
    public   void run() {
        synchronized (lock) {
            for (int i = 0; i < 100000; i++) {
                lock.notify();
                System.out.println(this.name);
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class ThreadSecurity {
    public static void main(String[] args) {
        Thread tread1 = new Thread(new ThreadTest("我是"));
        Thread tread2 = new Thread(new ThreadTest("you"));
        tread1.start();
        tread2.start();
    }

}

