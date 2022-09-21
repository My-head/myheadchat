package com.myheadchat;


import com.myheadchat.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")

public class UserControllerTest {

@Test
    public void postUser_whenUserIsValid_receiveOk(){

    User user = new User();

    user.setUsername("test-user");
    user.setDisplayName("test-display");
    user.setPassword("test-pass");
    }

}
