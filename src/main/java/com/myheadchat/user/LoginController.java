package com.myheadchat.user;


import com.fasterxml.jackson.annotation.JsonView;
import com.myheadchat.errors.ApiError;
import com.myheadchat.shared.CurrentUser;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.AccessDeniedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
                         //05__006( User View Model)
        @PostMapping("/api/1.0/login")
        @JsonView(Views.Base.class)
//    Map<String, Object> handleLogin(@CurrentUser User loggedInUser){
//        Map<String, Object> userMap = new HashMap<>();
//        userMap.put("id", loggedInUser.getId());
//        userMap.put("image", loggedInUser.getImage());
//        userMap.put("displayName", loggedInUser.getDisplayName());
//        return userMap;
    User handleLogin (@CurrentUser User loggedInUser){
    return loggedInUser;
}

    }

//    @ExceptionHandler({AccessDeniedException.class})
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    ApiError handleAccessDeniedException(){
//    return new ApiError(401, "api error", "/api/1.0/login");
//    }



