package com.imooc.sell.service;

import com.imooc.sell.model.ProductInfo;

import java.util.List;

/**
 * 商品的服务层
 */
public interface ProductService {

    //添加商品

    //删除商品

    //增加库存

    //减少库存

    //修改商品


    List<ProductInfo> findProductInfoByCategoryType(Integer categoryId);

}
