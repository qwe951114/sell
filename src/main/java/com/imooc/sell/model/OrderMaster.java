package com.imooc.sell.model;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "order_master")
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    //订单编号
    private String orderId;
    //买家名称
    private String buyerName;
    //买家电话
    private String buyerPhone;
    //买家地址
    private String buyerAddress;
    //买家微信号
    private String buyerOpenid;
    //买家总金额(涉及到金额使用BigDecimal的类型)
    private BigDecimal orderAmount;
    //订单状态,默认0是新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    //支付状态,默认 0 是未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

}
