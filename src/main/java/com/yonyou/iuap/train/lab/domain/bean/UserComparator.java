package com.yonyou.iuap.train.lab.domain.bean;

import java.util.Comparator;

/***
 * 自定义用户比较器
 */
public class UserComparator implements Comparator<User>{

    @Override
    public int compare(User u1, User u2) {
        //利用JDK Integer比较数值大小实现用户年龄比较
        return u1.getAge().compareTo(u2.getAge());
    }
}
