package com.test.io;

import java.io.*;
import java.util.zip.InflaterInputStream;

/**
 * Created by lixiangwei2 on 2017/3/1.
 */
public class InputTest {

    public static void main(String[] args) {

        try {
            //OutputStreamWriter  ow = new OutputStreamWriter(new FileOutputStream(new File("D:"+File.separator+"song"+File.separator+"tst.txt")));
            InputStreamReader ir = new InputStreamReader(new FileInputStream(new File("D:"+File.separator+"song"+File.separator+"tst.txt")));
            //ow.write("中国姐呢分js");
            //ow.flush();
            System.out.println((char)ir.read());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
