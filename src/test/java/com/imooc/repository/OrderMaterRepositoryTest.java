package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMaterRepositoryTest {
    @Autowired
    OrderMaterRepository orderMaterRepository;

    private final String OPENID = "110110";
    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("幕课网");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        
        OrderMaster result = orderMaterRepository.save(orderMaster);
        Assert.assertNotNull(result);

    }
    
    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(1,1);
        Page<OrderMaster> result = orderMaterRepository.findByBuyerOpenid(OPENID, request);
        System.out.println(result.getTotalElements());
    }
}