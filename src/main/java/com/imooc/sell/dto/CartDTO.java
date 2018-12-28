package com.imooc.sell.dto;

import lombok.Data;

/**
 * 购物车(需要记录商品id和商品数量)
 */
@Data
public class CartDTO {

    //商品id
    private String productId;

    //商品数量
    private Integer productQuantity;

    public CartDTO(String productId,Integer productQuantity){
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
