package com.test.state;

/**
 * Created by lixiangwei2 on 2017/3/1.
 */
public class OrderManager {

    private OrderState orderState;

    public void order(Integer productType){
        if(productType.toString().equals("1")){
            orderState = new FlyOrderState();
        }else if(productType.toString().equals("2")){
            orderState = new HotelOrderState();
        }
        orderState.order();
    }
}
