package com.imooc.sell.model;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Table(name = "product_category")
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    /**id**/
    private Integer categoryId;

    /**类目名称*/
    private String categoryName;
    /*类目编号*/
    private Integer categoryType;

}
