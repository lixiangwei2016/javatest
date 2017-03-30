package com.test.thread;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lixiangwei2 on 2017/2/27.
 */
public class TestThreadPool {
    private static int produceTaskSleepTime = 2;
    private static int produceTaskMaxNumber = 1000;

    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 3, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        List<String> lists1 = new ArrayList<>();
        for(int i = 0;i < 5000000;i++) {
            lists1.add("操作a"+i);
        }

        List<String> lists2 = new ArrayList<>();
        for(int i = 0;i < 5000000;i++) {
            lists2.add("操作b"+i);
        }

        ThreadPoolTask taskpool = new ThreadPoolTask(lists1);
        ThreadPoolTask taskpoo2 = new ThreadPoolTask(lists2);
        executor.execute(taskpool);
        executor.execute(taskpoo2);

        Long end=System.currentTimeMillis();

        System.out.println(end-start);
    }
}


class ThreadPoolTask implements Runnable,Serializable{

    private static final long serialVersionUID = 0;
    private static int consumeTaskSleepTime = 20000;

    // 保存任务所需要的数据
    private List<String> list;

    public ThreadPoolTask(List<String> list){
        this.list = list;
    }
    @Override
    public void run() {
        try{
            // //便于观察，等待一段时间
            OutputStream out = new FileOutputStream(new File("D:/addnew.txt"),true);

            for (int i = 0; i < list.size(); i++) {

                String a=list.get(i);
                out.write((a+"\r\n").getBytes());

            }

            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
