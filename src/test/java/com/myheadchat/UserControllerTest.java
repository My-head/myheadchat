package com.myheadchat;


import com.myheadchat.shared.GenericResponse;
import com.myheadchat.user.User;
import com.myheadchat.user.UserRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserControllerTest {


    public static final String API_1_0_USER = "/api/1.0/users";


@Autowired
    TestRestTemplate testRestTemplate;

@Autowired
    UserRepository  userRepository;
//fefef
@Before
public void cleanup(){
        userRepository.deleteAll();
}

@Test
        public void postUser_whenUserIsValid_receiveOk(){
        User user = createValidUser();
        ResponseEntity<Object> response = testRestTemplate.postForEntity(API_1_0_USER, user, Object.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
}

@Test
         public void postUser_whenUserISValid_userSabedToDatabase() {
         User user = createValidUser();
         testRestTemplate.postForEntity(API_1_0_USER, user, Object.class);
         assertThat(userRepository.count()).isEqualTo(1);

}

    @Test
    public void postUser_whenUserIsValid_receiveOkAndReceiveSuccessMesage(){
        User user = createValidUser();
        ResponseEntity<GenericResponse> response = testRestTemplate.postForEntity(API_1_0_USER, user, GenericResponse.class);
        assertThat(response.getBody().getMesage()).isNotNull();
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    }


    private User createValidUser() {
        User user = new User();
        user.setUsername("test-user");
        user.setDisplayName("test-display");
        user.setPassword("test-pass");
        return user;
    }

}

