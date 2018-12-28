package com.imooc.sell.service.impl;

import com.imooc.sell.dto.CartDTO;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.model.ProductInfo;
import com.imooc.sell.repository.ProductInfoRepository;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    /**
     * 查询一个商品
     * @param productId
     * @return
     */
    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    /**
     * 查询所有上架的商品
     * @return
     */
    @Override
    public List<ProductInfo> findUPAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    /**
     * 分页查询所有
     * @param pageable
     * @return
     */
    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    /**
     * 保存商品
     * @param productInfo
     * @return
     */
    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    /**
     * 增加库存
     * 1.检查商品是否存在
     * 2.增加商品库存
     * 3.更新数据
     * @param cartDTOList
     */
    @Override
    @Transactional
    public void increaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO:cartDTOList){
            //获取商品的对象
            ProductInfo productInfo = repository.findOne(cartDTO.getProductId());
            //查询商品是否存在
            if(productInfo == null){
                throw  new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            //增加商品库存(库存的值+增加的商品数)
            Integer result = productInfo.getProductStock() + cartDTO.getProductQuantity();
            //修改商品库存的值
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
    }

    /**
     * 减少库存
     * 1.查询这个商品的是否存在
     * 2.查询这个商品库存是否足够
     * 3.减少库存
     * @param cartDTOList
     */
    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO:cartDTOList){
            //获取商品的对象
            ProductInfo productInfo = repository.findOne(cartDTO.getProductId());
            //查看商品数量
            if(productInfo == null){
                throw  new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            //用库存数量减去商品的数量
            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if(result < 0){
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            //如果成功就修改商品数量
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
    }

    /**
     * 商品上架
     * @param cartDTOList
     * @return
     */
    @Override
    public ProductInfo onSale(List<CartDTO> cartDTOList) {
        return null;
    }

    /**
     * 商品下架
     * @param cartDTOList
     * @return
     */
    @Override
    public ProductInfo downSale(List<CartDTO> cartDTOList) {
        return null;
    }
}
