package com.imooc.sell.service.impl;

import com.imooc.sell.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @Test
    public void findAll() {
        List<ProductCategory> list =  categoryServiceImpl.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findOne() {
        ProductCategory category = categoryServiceImpl.findOne(1);
        Assert.assertNotEquals(null,category);
    }

   @Test
    public void findByCategoryTypeIn() {

    }

    @Test
    @Transactional
    public void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(5);
        productCategory.setCategoryName("男生爱吃");
        categoryServiceImpl.save(productCategory);
    }
}