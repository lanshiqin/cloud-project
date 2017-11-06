package com.lanshiqin.authserver.core.entity;

import org.springframework.data.annotation.Id;

/**
 * 账户实体类
 */
public class Account {
    @Id
    private String id;          // 主键
    private String userName;    // 用户名
    private String passWord;    // 密码
    private String[] roles;     // 角色

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}
