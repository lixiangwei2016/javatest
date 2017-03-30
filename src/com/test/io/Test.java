package com.test.io;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiangwei2 on 2017/3/1.
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", 6978);
        Integer id = (Integer) map.get("id");
        Integer i=6978;
        if(id == 6978){
            System.out.printf("id:"+id);
        }

    }
}
