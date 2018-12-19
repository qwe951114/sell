package com.imooc.sell.service.impl;



import com.imooc.sell.model.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import com.imooc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :郭辉
 * @Date:2018/12/13 20:37
 * @Version 1.0
 */
@Service
public class CateServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public  List<ProductCategory> findAll(){
        List<ProductCategory> list = productCategoryRepository.findAll();
        return list;
    }
    @Override
    public ProductCategory findOne(Integer categoryId){
        return productCategoryRepository.findOne(categoryId);
    }
    @Override
    public void save(ProductCategory productCategory){
         productCategoryRepository.save(productCategory);
    }
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categryTypeList){
       return productCategoryRepository.findByCategoryTypeIn(categryTypeList);
    }
}
