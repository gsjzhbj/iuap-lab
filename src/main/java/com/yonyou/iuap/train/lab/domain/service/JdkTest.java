package com.yonyou.iuap.train.lab.domain.service;

import com.yonyou.iuap.train.lab.domain.bean.User;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Stream;


public class JdkTest {
    static List<User> list = Arrays.asList(
            // name，age
            new User("张三", 11),
            new User("王五", 20),
            new User("王五", 91),
            new User("张三", 8),
            new User("李四", 44),
            new User("李四", 44),
            new User("李四", 44)
    );

    public static void testForEach(){
        // java 8 前
        System.out.println("java 8 前");
        for(User user: list){
            System.out.println(user);
        }
        // java 8 lambda
        System.out.println("java 8 lambda");
        list.forEach(user -> System.out.println(user));

        // java 8 stream lambda
        System.out.println("java 8 stream lambda");
        list.stream().forEach(user -> System.out.println(user));
    }

    public static void testSort() {
        System.out.println("-----排序前-----");
        list.forEach(user -> System.out.println(user));
        System.out.println("-----排序后-----");
        // java 8 前
        System.out.println("java 8 前");
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        for (User user : list) {
            System.out.println(user);
        }
        // java 8 stream 方法引用
        System.out.println("java 8 stream 方法引用");
        list.stream().sorted(Comparator.comparing(User::getAge)).forEach(user -> System.out.println(user));
    }

    public static void testStream(){
        // 1、数组
        String[] arr = new String[]{"ab", "cd", "ef"};
        Stream<String> arrStream = Arrays.stream(arr);
        // 2、集合
        List<String> list = Arrays.asList("ab", "cd", "ef");
        Stream<String> colStream = list.stream();
        // 3、值
        Stream<String> stream = Stream.of("ab", "cd", "ef");
        stream.forEach(str->System.out.println(str));
        System.out.println("-");
    }

    public static void testLambda(){
        //匿名内部类
        Comparator<Integer> cpt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> set = new TreeSet<>(cpt);
        set.add(1);set.add(18);set.add(9);
        //有序集合
        set.stream().forEach(i -> System.out.println(i));

        System.out.println("=========================");

        //使用lambda表达式
        Comparator<Integer> cpt2 = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> set2 = new TreeSet<>(cpt2);
        set2.add(2);set2.add(20);set2.add(-1);
        set2.stream().forEach(i-> System.out.println(i));

    }
    public static void main(String[]args){
        testForEach();
        testSort();
        testLambda();
        testStream();
    }
}
