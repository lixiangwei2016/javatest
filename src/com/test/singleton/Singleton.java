package com.test.singleton;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class Singleton {

    private static  Singleton singleton =null;
    private Singleton(){};

    public static  Singleton getSingleton(){
        if(null==singleton){
            singleton = new Singleton();
        }
        return singleton;
    }
}
