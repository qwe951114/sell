package com.imooc.sell.repository;

import com.imooc.sell.model.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    /**
     * 存入和更新
     */
    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("001");
        productInfo.setCategoryType(1);
        productInfo.setProductDescription("很美味");
        productInfo.setProductName("包子");
        productInfo.setProductPrice(new BigDecimal(8.2));
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStock(10);
        repository.save(productInfo);
    }

    /**
     * 根据类目编号来查询商品
     */
    @Test
    public void findProductInfoByCategoryType() {
      List<ProductInfo> productInfoList= repository.findProductInfoByCategoryType(1);
      System.out.println(productInfoList);
    }
}