package com.imooc.sell.repository;

import com.imooc.sell.model.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    /**
     * 插入数据(更新数据)
     */
    public void save(){
        ProductCategory productCategory =  repository.findOne(2);
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    /**
     * 通过类目编号来查询
     */
  @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        List<ProductCategory> productCategoryList=repository.findByCategoryTypeIn(list);
        System.out.println(productCategoryList);
    }

    /**
     * 通过id来查询一条数据
     */
    @Test
    public void findOne(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory);
    }

    /**
     * 来查询全部的数据
     */
    @Test
    public  void findAll(){
        List<ProductCategory> list = repository.findAll();
        System.out.println(list);
    }
}