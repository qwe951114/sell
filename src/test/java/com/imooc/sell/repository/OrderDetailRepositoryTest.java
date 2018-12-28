package com.imooc.sell.repository;

import com.imooc.sell.model.OrderDetail;
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
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

   @Test
    public void findByOrderId() {
       List<OrderDetail> orderDetailList = repository.findByOrderId("0001");
       //Assert.assertNotEquals(null,orderDetailList.size());
       System.out.println(orderDetailList);
    }

    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("0002");
        orderDetail.setCategoryType(2);
        orderDetail.setOrderId("0001");
        orderDetail.setProductId("002");
        orderDetail.setProductName("面条");
        orderDetail.setProductQuantity(3);
        orderDetail.setProductIcon("http://xxxxxxx2.jpg");
        orderDetail.setProductPrice(new BigDecimal(8.5));
        repository.save(orderDetail);
    }


}