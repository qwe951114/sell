package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.service.BuyerService;
import com.imooc.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;       //订单service层


    @Override
    public OrderDTO findOrderOne(String openid, String orderid) {
        return null;
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        return null;
    }
}
