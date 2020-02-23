package com.servlet.store.entity;

/**
 * 商品分类实体类
 * @author leijunjun18@163.com
 * @create 2020-02-23 14:11
 */
public class Category {
    private Long categoryId;
    private String categoryName;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
