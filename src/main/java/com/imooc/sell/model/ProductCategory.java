package com.imooc.sell.model;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Table(name = "product_category")
@Entity
@DynamicUpdate
public class ProductCategory {
    @Id
    @GeneratedValue
    /**id**/
    private Integer categoryId;
    /**类目名称*/
    private String categoryName;
    /*类目编号*/
    private Integer categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
}
