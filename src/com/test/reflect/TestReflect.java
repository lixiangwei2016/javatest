package com.test.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Student{
    public  String id="1";
    public  String name="hello";


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/**
 * Created by lixiangwei2 on 2017/3/1.
 */
public class TestReflect {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
//        Class<?> cls = Class.forName("com.test.reflect.Student");
//        Object obj = cls.newInstance();
//        Method m1 = cls.getDeclaredMethod("setName",String.class);
//        Method m2 = cls.getDeclaredMethod("getName");
//        m1.invoke(obj,"test");
//
//        System.out.println(m2.invoke(obj));
        Integer num = 1;
        if("1".equals(num.toString())){
            System.out.println("111");
        }
    }
}
