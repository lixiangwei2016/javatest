package com.test;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class Test {

    public static void main(String[] args) {
        String msg="hello world";
        FilterChain chain=new FilterChain();
        System.out.printf(chain.doFilter(msg));
    }
}
