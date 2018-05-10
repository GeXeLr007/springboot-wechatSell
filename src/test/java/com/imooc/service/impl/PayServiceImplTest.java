package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.PayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayServiceImplTest {

    @Autowired
    private PayService payService;
    
    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        payService.create(orderDTO);

    }

//    @Test
//    public void notify() {
//        
//    }

    @Test
    public void refund() {
    }
}