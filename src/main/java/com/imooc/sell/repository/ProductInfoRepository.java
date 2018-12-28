package com.imooc.sell.repository;

import com.imooc.sell.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *商品的dao层
 * 1.可以查询所有的商品
 * 2.增加商品、更新商品
 * 3.更新库存(增加、减少库存)
 *
 */
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{
    //根据类目编号来查询
    List<ProductInfo> findProductInfoByCategoryType(Integer categoryId);
    //根据商品状态来查询
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
