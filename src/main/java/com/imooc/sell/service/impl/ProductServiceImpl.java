package com.imooc.sell.service.impl;

import com.imooc.sell.model.ProductInfo;
import com.imooc.sell.repository.ProductInfoRepository;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    /**
     * 根据类目编号来查询商品
     * @param categoryId
     * @return
     */
    @Override
    public List<ProductInfo> findProductInfoByCategoryType(Integer categoryId) {
        return repository.findProductInfoByCategoryType(categoryId);
    }
}
