package com.lazarojavier.LearnSpringOauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {
    @RequestMapping("/")
    public String home(){
        return "Welcome";
    }


    @RequestMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
