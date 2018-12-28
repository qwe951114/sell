package com.imooc.sell.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller_info")
@Data
@DynamicUpdate
public class SellerInfo {
    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;

}
