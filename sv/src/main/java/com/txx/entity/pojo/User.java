package com.txx.entity.pojo;

import com.txx.entity.enums.RoleEnum;

import java.io.Serializable;

/**
 * 帅气的创建
 * <p>
 * <p>
 * feature;
 */
public class User implements Serializable{


    private static final long serialVersionUID = 2890827297867256990L;

    private Long id;
    private String name;
    private Integer role;
    private String loginName;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
