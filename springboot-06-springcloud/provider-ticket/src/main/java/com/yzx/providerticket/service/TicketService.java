package com.yzx.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @program: springboot-06-springcloud
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-15 23:08
 */
@Service
public class TicketService {
    public String getTicket(){
        System.out.println("8001");
        return "《厉害了，我的国》";
    }
}
