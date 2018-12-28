package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import com.imooc.sell.model.OrderDetail;
import com.imooc.sell.util.EnumUtil;
import com.imooc.sell.util.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单的dto对象（数据传输对象），展示层与服务层之间传输对象
 * 用于远程传输（一般数据来自多个表）
 * 用于客户端与服务端的传输（一般用于分布式系统）
 */
@Data
public class OrderDTO {
    //订单
    private String orderId;
    //买家姓名
    private String buyerName;
    //买家手机号
    private String buyerPhone;
    //买家地址
    private String buyerAddress;
    //买家微信openId
    private String buyerOpenid;
    //订单总金额
    private BigDecimal orderAmount;
    //订单状态,默认0 为新下单
    private Integer orderStatus;
    //支付状态,默认0 为未支付
    private Integer payStatus;
    //创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    //更新时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
    @JsonIgnore
    public OrderStatusEnum  getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }
    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }
}
