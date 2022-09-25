package com.myheadchat.user;


import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String displayName;
    private String password;


//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//
//    public void setDisplayName(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//
//    public User(String username, String displayName, String password) {
//        this.username = username;
//        this.displayName = displayName;
//        this.password = password;
//    }
}
