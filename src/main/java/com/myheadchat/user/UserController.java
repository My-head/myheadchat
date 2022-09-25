package com.myheadchat.user;


import com.myheadchat.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.atomic.AtomicInteger;

@RestController

public class UserController {

     @Autowired
     UserService userService;

     @PostMapping("/api/1.0/users")
      GenericResponse createUser (@Valid @RequestBody User user){
          userService.save(user);
//          GenericResponse body = new GenericResponse();
//          body.setMesage("User saved");
          return new GenericResponse("User saved");

}


}
