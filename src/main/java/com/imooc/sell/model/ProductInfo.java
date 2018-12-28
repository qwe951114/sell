package com.imooc.sell.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@Table(name="product_info")
@DynamicUpdate
public class ProductInfo {
    //商品id
    @Id
    private String productId;
    //商品名称
    private String productName;
    //商品单价
    private BigDecimal productPrice;
    //商品库存
    private Integer productStock;
    //类目编号
    private Integer categoryType;
    //商品小图
    private String productIcon;
    //商品描述
    private String productDescription;
    //商品状态
    private Integer productStatus;
}
