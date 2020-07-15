package com.yzx.consumeruser.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yzx.providerticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-06-dubbo
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-15 22:45
 */
@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了："+ticket);
    }

}
