package com.imooc.sell.repository;

import com.imooc.sell.model.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 订单主表所做的事
 * 1.生成订单
 * 2.取消订单
 * 3.查询订单(根据微信号)
 * 4.完结订单
 * 5.支付订单
 */
@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{
    //通过微信id来查询订单
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
