package com.servlet.store.entity;

import java.util.Date;

/**
 * 用户实体类
 * @author leijunjun18@163.com
 * @create 2020-02-23 14:00
 */
public class User {
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户电话
     */
    private String telephone;
    /**
     * 用户生日
     */
    private Date birthday;
    /**
     * 用户性别
     */
    private String sex;
    /**
     * 用户状态
     *  1:激活 0:未激活
     */
    private int state;
    /**
     * 激活码
     */
    private String code;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
