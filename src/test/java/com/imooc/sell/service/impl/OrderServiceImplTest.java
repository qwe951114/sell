package com.imooc.sell.service.impl;

import com.imooc.sell.dto.CartDTO;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.model.OrderDetail;
import org.hibernate.annotations.AttributeAccessor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    /**
     * 测试方法:
     * 1.创建一个OrderDTD对象
     * 2.给这个对象设置属性
     * 3.执行这个方法
     * 4.观察执行的情况
     */
    @Test
    public void create() {
        //创建一个OrderDTD对象
        // create()自动生成了orderId、detailId
        //自动计算总和orderAmount
        OrderDTO orderDTO = new OrderDTO();
        //orderDTO.setOrderId("0002");
        orderDTO.setBuyerAddress("用来测试的某个不可知的地点");
        orderDTO.setBuyerName("你猜");
        orderDTO.setBuyerOpenid("0000000002");
        orderDTO.setBuyerPhone("15271615854");

        //创建一个订单详情对象
        OrderDetail orderDetail =  new OrderDetail();
        orderDetail.setProductId("001");
        orderDetail.setProductQuantity(5);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
        orderDetailList.add(orderDetail);
        orderDTO.setOrderDetailList(orderDetailList);


        //执行创建订单方法
        OrderDTO orderDTO1 =orderService.create(orderDTO);
        Assert.assertNotEquals(null,orderDetail);
    }

    @Test
    public void cancel() {
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void paid() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void findList1() {
    }
}