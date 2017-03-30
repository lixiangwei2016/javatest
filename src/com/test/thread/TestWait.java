package com.test.thread;

/**
 * Created by lixiangwei2 on 2017/3/3.
 */
public class TestWait {

    private Object lock = new Object();

    public static void main(String[] args) {
        TestWait testWait = new TestWait();
        testWait.print();
        testWait.startWakenThread();
    }
    public void  print(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行线程。。。");
                System.out.println("进入等待状态。。。");
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程结束。。。");
            }
        });

        thread.start();
    }

    /**
     * 该线程作为一个唤醒线程
     */
    public void startWakenThread() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("唤醒线程开始执行...");
                    // 首先释放线程A
                    quitThreadA();
                }
            }
        });
        t.start();
    }
    public void quitThreadA(){
        lock.notify();
    }
}
