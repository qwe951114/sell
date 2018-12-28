package com.imooc.sell.repository;

import com.imooc.sell.model.OrderMaster;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

   @Test
    public void findByBuyerOpenid() {
       PageRequest pageRequest = new PageRequest(0,3);
       Page<OrderMaster> result=repository.findByBuyerOpenid("000000000000111",pageRequest);
       Assert.assertNotEquals(null,result.getTotalElements());
    }

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("0001");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerAddress("某国某省某市某县某村");
        orderMaster.setBuyerOpenid("000000000000111");
        orderMaster.setBuyerPhone("15271615458");
        orderMaster.setOrderAmount(new BigDecimal(9.7));
        repository.save(orderMaster);
    }


}