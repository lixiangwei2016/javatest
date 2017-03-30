package com.test.thread;

import java.util.concurrent.*;

/**
 * Created by lixiangwei2 on 2017/2/27.
 */
public class TestFutureTask {

    public static void main(String[] args) {
        System.out.println("start............");
        ExecutorService executorService = Executors.newCachedThreadPool();

        FutureTask<String> future = new FutureTask<String>(new Callable<String>(){
            public String call() throws Exception {
                System.out.println("yi bufang...");
                Thread.sleep(20000);
                System.out.println("yi bufang end...");
                return "success";
            }
        });

        System.out.println("end............");
        executorService.execute(future);
        // 测试后台的计算线程是否完成，如果未完成则等待
        while (!future.isDone()) {
            try {
                Thread.sleep(500);
                System.out.println("私有账户计算未完成继续等待...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end ssss............");
    }

}
