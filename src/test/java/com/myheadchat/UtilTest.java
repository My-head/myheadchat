package com.myheadchat;

import com.myheadchat.user.User;

public class UtilTest {

    public static User createValidUser() {
        User user = new User();
        user.setUsername("test-user");
        user.setDisplayName("test-display");
        user.setPassword("test-pass");
        user.setPassword("test-image.png");

        return user;
    }

}
