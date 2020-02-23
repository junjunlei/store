package com.servlet.store.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单实体类
 * @author leijunjun18@163.com
 * @create 2020-02-23 14:18
 */
public class Order {
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 总计
     */
    private BigDecimal total;
    /**
     * 状态
     */
    private int state;
    /**
     * 收货人地址
     */
    private String address;
    /**
     * 收货人姓名
     */
    private String name;
    /**
     * 收货人电话
     */
    private String telephone;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
