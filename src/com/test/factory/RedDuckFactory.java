package com.test.factory;

/**
 * Created by lixiangwei2 on 2017/2/17.
 */
public class RedDuckFactory implements Provider {
    @Override
    public Duck getDuck() {
        return new RedDuck();
    }
}
