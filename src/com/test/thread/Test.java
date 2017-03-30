package com.test.thread;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lixiangwei2 on 2017/2/27.
 */
public class Test {

    public static void main(String[] args) {

        Long start=System.currentTimeMillis();
        List<String> lists1 = new ArrayList<>();
        for(int i = 0;i < 10000000;i++) {
            lists1.add("操作a"+i);
        }

        try{
            // //便于观察，等待一段时间
            OutputStream out = new FileOutputStream(new File("D:/add.txt"));

            for (int i = 0; i < lists1.size(); i++) {

                String a=lists1.get(i);
                out.write((a+"\r\n").getBytes());

            }

            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Long end=System.currentTimeMillis();

        System.out.println(end-start);
    }
}
