package com.servlet.store.entity;

/**
 * 订单项实体类
 * @author leijunjun18@163.com
 * @create 2020-02-23 14:15
 */
public class OrderItem {

    /**
     * 订单项Id
     */
    private String itemId;
    /**
     * 数量
     */
    private int quantity;
    /**
     * 总合
     */
    private double total;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
