package com.myheadchat.user;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController

public class UserController {

    private AtomicInteger atomicInteger = new AtomicInteger(0);
@PostMapping("/api/1.0/users")
     synchronized int createUser (){
    atomicInteger.set(0);

    return atomicInteger.incrementAndGet();


}


}
