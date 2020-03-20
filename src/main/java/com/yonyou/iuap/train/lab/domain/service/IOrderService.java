package com.yonyou.iuap.train.lab.domain.service;

public interface IOrderService {
    public default void setInfo(){
        System.out.println("hello");
        //() -> System.out.println("Hello");
    }
    public void setOrdersInfo();
}
