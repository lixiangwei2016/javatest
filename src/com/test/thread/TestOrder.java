package com.test.thread;

import net.sf.cglib.Enhancer;

/**
 * Created by lixiangwei2 on 2017/3/6.
 */
public class TestOrder {

   public static  Runnable runnable = new Runnable() {
       @Override
       public void run() {
           System.out.println("线程名"+Thread.currentThread().getName());
       }
   };

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        Thread t3=new Thread(runnable);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
