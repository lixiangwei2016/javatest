package com.test.factory;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class DuckFactory {

//    public static Duck getDuck(String type){
//        if(type.equals("red")) {
//            return new RedDuck();
//        }else{
//            return new BlackDuck();
//        }
//    }
    public static Duck getRedDuckFactory(){
        return new RedDuck();
    }

    public static Duck getBlackDuckFactory(){
        return new BlackDuck();
    }
}
