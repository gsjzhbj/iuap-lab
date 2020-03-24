package com.yonyou.iuap.train.lab.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 使用@interface将定义一个注解 这里是log
 * 用于日志aop编程
 * */
@Target(ElementType.METHOD)//方法级注解
@Retention(RetentionPolicy.RUNTIME)//运行时关联
public @interface Log {
    String value() default "";
}
