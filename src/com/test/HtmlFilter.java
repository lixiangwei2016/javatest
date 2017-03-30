package com.test;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class HtmlFilter implements Filter {


    @Override
    public String doFilter(String msg) {
        return msg.replace("<","[").replace(">","]");
    }
}
