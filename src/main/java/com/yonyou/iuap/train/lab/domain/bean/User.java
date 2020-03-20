package com.yonyou.iuap.train.lab.domain.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

@Getter
@Setter
@ToString
public class User implements Comparable{
    public User(String name,int age){
        this.id= UUID.randomUUID().toString();
        this.name=name;
        this.age=age;
        this.password="***";
    }
    private String id;
    private String name;
    private String password;
    private Integer age;

    /**
     * 比大小，如果前者大返回1，否则返回0.
     * @param u
     * @return
     */
    @Override
    public int compareTo(Object u) {
        if(this.age>((User)u).getAge())
            return 1;
        else return 0;
    }

    public static void main(String []args){
        User user1=new User("a",19);
        User user2=new User("b",15);
        testCompare(user1,user2);

        testListSort(user1,user2);

    }
    public static void testListSort(User user1,User user2){
        List<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        Collections.sort(list, new UserComparator());
        list.forEach(user -> System.out.println(user));
    }

    public static void testCompare(User user1,User user2){
        //输出年龄较长者信息(充血模型实现）
        if(user1.compareTo(user2)==1){
            System.out.println(user1);
        }else {
            System.out.println(user2);
        }
        //输出年龄较长者信息(比较器模型实现）
        if(new UserComparator().compare(user1,user2)==1){
            System.out.println(user1);
        }else {
            System.out.println(user2);
        }
    }
}
