package com.imooc.sell.service;

import com.imooc.sell.dto.CartDTO;
import com.imooc.sell.model.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品的服务层
 */
public interface ProductService {

    //根据商品呢id查询某个商品
    ProductInfo findOne(String productId);
    //查询所有在架商品列表
    List<ProductInfo> findUPAll();
    //查询所有的商品分页
    Page<ProductInfo> findAll(Pageable pageable);
    //添加商品
    ProductInfo save(ProductInfo productInfo);
    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
    //上架
    ProductInfo onSale(List<CartDTO> cartDTOList);
    //下架
    ProductInfo downSale(List<CartDTO> cartDTOList);
    //通过类目编号来查询商品
    List<ProductInfo> findProductInfoByCategoryType(Integer categoryId);

}
