package com.servlet.store.entity;

import java.util.Date;

/**
 * 商品实体类
 * @author leijunjun18@163.com
 * @create 2020-02-23 14:20
 */
public class Product {
    /**
     * 商品编号
     */
    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品市场价格
     */
    private double marketPrice;
    /**
     * 商品商场价格
     */
    private double shopPrice;
    /**
     * 商品图片路径
     */
    private String productImagePath;
    /**
     * 商品上架日期
     */
    private Date productDate;
    /**
     * 商品是否热门
     */
    private int isHot;
    /**
     * 商品描述
     */
    private String productDesc;
    /**
     * 商品是否在货架上  0:在货架上 1:下架
     */
    private int flag;
    /**
     * 商品所在分类id
     */
    private String categoryId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public int getIsHot() {
        return isHot;
    }

    public void setIsHot(int isHot) {
        this.isHot = isHot;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
