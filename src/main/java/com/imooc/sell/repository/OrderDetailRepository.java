package com.imooc.sell.repository;

import com.imooc.sell.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 查询订单详情
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
}
