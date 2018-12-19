package com.imooc.sell.service.impl;

import com.imooc.sell.model.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import com.imooc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目表的实现类
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

   @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categryTypeList) {
        return repository.findByCategoryTypeIn(categryTypeList);
    }

    @Override
    public void save(ProductCategory productCategory) {
         repository.save(productCategory);
    }
}
