package com.yonyou.iuap.train.lab.controller;

import com.yonyou.iuap.train.lab.domain.bean.MetaSpace;
import com.yonyou.iuap.train.lab.domain.bean.MetaUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class HeapTestController {
    private List<MetaUser> userList = new ArrayList<>();
    private List<Class<?>> classList = new ArrayList<Class<?>>();

    /**
     * 模拟堆内存溢出的情况 -Xms32M -Xmx32M
     * Exception in thread "http-nio-8080-exec-1" java.lang.OutOfMemoryError: GC overhead limit exceeded
     */
    @GetMapping("/heap")
    public void heap(){
        int i = 0;
        while (true){
            userList.add(new MetaUser(i++, UUID.randomUUID().toString()));
        }
    }

    /**
     * 模拟元空间内存溢出 -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
     * Exception in thread "http-nio-8080-exec-1" java.lang.OutOfMemoryError: Metaspace
     */
    @GetMapping("/nonHeap")
    public void nonHeap(){
        int i = 0;
        while (true){
            classList.addAll(MetaSpace.createClasses());
        }
    }

}
