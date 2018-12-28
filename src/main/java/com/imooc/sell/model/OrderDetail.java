package com.imooc.sell.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "order_detail")
@Entity
@Data
@DynamicUpdate
public class OrderDetail {
    //详情id
    @Id
    private String detailId;
    //订单id
    private String orderId;
    //类目编号
    private Integer categoryType;
    //商品id
    private String productId;
    //商品名称
    private String productName;
    //商品单价
    private BigDecimal productPrice;
    //商品数量
    private Integer productQuantity;
    //商品小图
    private String productIcon;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

}
