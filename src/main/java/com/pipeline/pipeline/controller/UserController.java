package com.pipeline.pipeline.controller;

import com.pipeline.pipeline.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @GetMapping
    public List<User> findAllUsers() {
        User myuser=new User();
        myuser.setName("Mike");
        myuser.setOccupation("Wing Man");
        List<User> users=new ArrayList<>();
        users.add(myuser);
        return users;
    }
    @GetMapping
    public List<User> findUser() {
        User myuser=new User();
        myuser.setName("Mike1");
        myuser.setOccupation("Wing Man1");
        List<User> users=new ArrayList<>();
        users.add(myuser);
        return users;
    }


}
