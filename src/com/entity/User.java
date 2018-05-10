package com.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 〈〉
 *
 * @author Administrator
 * @create 2018/5/10
 * @since 1.0.0
 */
@Entity
@Table(name="user")
public class User {
    private int userID;
    private String username;
    private String password;
    private String email;
    private String address;
    public User(){
    }
    public User(int userID, String username, String password, String email, String address) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Id
    @GeneratedValue
    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

}