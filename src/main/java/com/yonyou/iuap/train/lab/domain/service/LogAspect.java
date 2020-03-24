//package com.yonyou.iuap.train.lab.domain.service;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class LogAspect {
//    private static final Logger logger= LoggerFactory.getLogger(LogAspect.class);
//
//    /**
//     * 这里指定使用 @annotation 指定com.yonyou.iuap.train.lab.anotation.Log log注解
//     * */
//    @Pointcut("@annotation(com.yonyou.iuap.train.lab.anotation.Log)")
//    public void logPointCut(){
//        System.out.println("LogAspect-1");
//    }
//
//    public  Object around(ProceedingJoinPoint point) throws Throwable{
//        System.out.println("LogAspect-2");
//        long beginTime = System.currentTimeMillis();
//        // 执行方法
//        Object result = point.proceed();
//        // 执行时长(毫秒)
//        long time = System.currentTimeMillis() - beginTime;
//        //异步保存日志 这里是文本日志
//
//        return result;
//    }
//
//    void saveLog(ProceedingJoinPoint joinPoint, long time) throws InterruptedException{
//        System.out.println("LogAspect-3");
//    }
//}
