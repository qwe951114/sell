package com.imooc.sell.service;

//类目表

import com.imooc.sell.model.ProductCategory;

import java.util.List;

/**
 * 需要提供的服务
 */
public interface CategoryService {
    //查询出所有的类目
    List<ProductCategory> findAll();

    //通过id来查询一个类目
    ProductCategory findOne(Integer categoryId);

    //通过类目编号来查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categryTypeList);

    //保存类目
    void save(ProductCategory productCategory);

}
