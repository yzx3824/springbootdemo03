package com.yzx.providerticket.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yzx.providerticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-06-dubbo
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-15 22:32
 */
@Component
@Service     //将服务发布出去
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
