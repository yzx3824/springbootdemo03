package com.yzx.springboot.service;

import com.yzx.springboot.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-02-amqp
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-09 23:45
 */
@Service
public class BookService {
    @RabbitListener(queues = "yzx.news")
    public void receive(Book book){
        System.out.println("收到消息："+book);
    }

    @RabbitListener(queues = "yzx")
    public void receive02(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
