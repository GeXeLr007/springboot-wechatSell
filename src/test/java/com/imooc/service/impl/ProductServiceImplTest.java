package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;
    @Test
    public void findUpAll() {
        List<ProductInfo> all = productService.findUpAll();
        Assert.assertNotEquals(0,all.size());
    }

    @Test
    public void findOne() {
        ProductInfo one = productService.findOne("123456");
        Assert.assertEquals("123456",one.getProductId());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0, 1);
        Page<ProductInfo> all = productService.findAll(pageRequest);
        System.out.println(all.getTotalElements());
        System.out.println(all.getTotalPages());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("213321");
        productInfo.setProductName("烧仙草");
        productInfo.setProductPrice(new BigDecimal(10.8));
        productInfo.setProductDescription("好喝");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(3);
        productInfo.setProductIcon("htp://xxxx");
        productInfo.setProductStock(200);

        ProductInfo save = productService.save(productInfo);
        Assert.assertNotNull(save);

    }
}