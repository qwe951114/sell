package com.imooc.sell.repository;

import com.imooc.sell.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 查询订单详情
 * 通过订单编号来查询订单详情
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    //通过订单id来查询订单详情
    List<OrderDetail> findByOrderId(String orderId);
}
