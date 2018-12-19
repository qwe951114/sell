package com.imooc.sell.repository;

import com.imooc.sell.model.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 买家的到层
 * 包括用户名、密码、微信号
 * 1.可以登录
 * 2.可以通过微信号查询某个用户可以查到的所有订单
 */
@Repository
public interface SellerInfoRepository  extends JpaRepository<SellerInfo,String>{
}
