package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository productInfoRepository;
    
    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(80.8));
        productInfo.setProductDescription("很好喝");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(2);
        productInfo.setProductIcon("htp://xxxx");
        productInfo.setProductStock(100);

        ProductInfo save = productInfoRepository.save(productInfo);
        Assert.assertNotNull(save);
    }
    
    
    @Test
    public void findByProductStatus() {
//        productInfoRepository.findByProductStatus();
    }
}