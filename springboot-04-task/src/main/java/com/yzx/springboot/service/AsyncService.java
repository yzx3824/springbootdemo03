package com.yzx.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-04-task
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-22 22:59
 */
@Service
public class AsyncService {
    //告诉Spring这是一个异步方法
    @Async
    public void hello(){
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理数据中......");
    }
}
