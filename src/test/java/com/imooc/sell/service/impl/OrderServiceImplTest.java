package com.imooc.sell.service.impl;

import com.imooc.sell.dto.CartDTO;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.OrderStatusEnum;
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

    /**
     * 测试订单取消
     * 1.执行取消订单
     * 2.查看订单库存和订单状态的变化
     */
    @Test
    public void cancel() {
        OrderDTO orderDTO = orderService.findOne("154598301711119417");
        OrderDTO Result  = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),orderDTO.getOrderStatus());
    }

    /**
     * 1.查询一个订单
     * 2.包括主表信息和详情信息
     */
    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    /**
     * 测试要点:查询支付完成后,订单状态的变化
     */
    @Test
    public void paid() {
    }

    /**
     *测试要点:查询订单完结后，测试状态的变化
     */
    @Test
    public void finish() {
        OrderDTO orderDTO = orderService.findOne("154598301711119417");
        OrderDTO Result  = orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),orderDTO.getOrderStatus());
    }

    @Test
    public void findList1() {
    }
}