package com.test;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class FilterChain {

    Filter filters[]={new HtmlFilter()};

    public String doFilter(String msg){
        int length=filters.length;
        for(int i=0;i<length;i++){
            Filter filter=filters[i];
            msg=filter.doFilter(msg);
        }
        return msg;
    }
}
