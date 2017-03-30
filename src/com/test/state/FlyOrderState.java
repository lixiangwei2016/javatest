package com.test.state;

/**
 * Created by lixiangwei2 on 2017/3/1.
 */
public class FlyOrderState implements OrderState {
    @Override
    public void order() {
        System.out.println("购买飞机票!");
    }
}
