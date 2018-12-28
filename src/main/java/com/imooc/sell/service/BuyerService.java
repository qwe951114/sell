package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 买家
 * 1.可以查询一个订单
 * 2.可以取消一个订单
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderid);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
