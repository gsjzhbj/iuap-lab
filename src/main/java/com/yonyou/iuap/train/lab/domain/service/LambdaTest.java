package com.yonyou.iuap.train.lab.domain.service;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void testRunable(){
        // 2.2使用 lambda直接获得接口对象
        Runnable race2 = () -> System.out.println("Hello world !");

        // 直接调用 run 方法(没开新线程哦!)
        race2.run();
    }

    public static void test(){
        List<String> list = Arrays.asList("a","ad","dr");
        list.stream().forEach(System.out::println);
        //或者如下也可以
        list.stream().forEach(a -> System.out.println(a));
        //或者不创建流也可以直接使用函数
        list.forEach(System.out::println);
        //或者
        list.forEach(a -> System.out.println(a));
    }

    public static void main(String[]args){
//        test();
        testRunable();
    }
}
