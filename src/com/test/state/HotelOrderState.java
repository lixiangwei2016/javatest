package com.test.state;

/**
 * Created by lixiangwei2 on 2017/3/1.
 */
public class HotelOrderState implements OrderState {
    @Override
    public void order() {
        System.out.println("购买酒店!");
    }
}
