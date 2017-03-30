package com.test.state;

/**
 * Created by lixiangwei2 on 2017/3/1.
 */
public class Client {

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        orderManager.order(2);
    }
}
