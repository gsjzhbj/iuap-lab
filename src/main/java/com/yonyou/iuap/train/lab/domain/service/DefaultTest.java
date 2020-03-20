package com.yonyou.iuap.train.lab.domain.service;

public class DefaultTest {
    public static void main(String[]args){
        IOrderService orderService=new OrderServiceImpl();
        orderService.setInfo();
    }
}
