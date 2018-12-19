package com.imooc.sell.repository;

import com.imooc.sell.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 类目的dao层
 * 需要做的事
 * 1.查询所有类目(用于后台显示)
 * 2.查询单个类目的(通过类目插某一个类目的所有的商品)
 * 3.根据类目编号来查询类目
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
     List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
