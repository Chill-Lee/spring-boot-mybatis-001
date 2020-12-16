package cn.mybatis.entity;

import java.io.Serializable;

/**
 * account
 * @author 
 */
public class Account implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户
     */
    private String username;

    /**
     * 余额
     */
    private float balance;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}