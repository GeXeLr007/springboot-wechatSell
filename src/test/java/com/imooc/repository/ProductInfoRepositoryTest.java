package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository productInfoRepository;
    
    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1658764");
        productInfo.setProductName("蜂蜜柚子茶");
        productInfo.setProductPrice(new BigDecimal(10.8));
        productInfo.setProductDescription("好喝");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(3);
        productInfo.setProductIcon("htp://xxxx");
        productInfo.setProductStock(200);

        ProductInfo save = productInfoRepository.save(productInfo);
        Assert.assertNotNull(save);
    }
    
    @Test
    public void findByProductStatus() {
        List<ProductInfo> result = productInfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0,result.size());
    }
}