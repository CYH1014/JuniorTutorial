package com.rh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sweehaw
 */
@RestController
public class ApiController {

    @GetMapping("user")
    public List<String> listAllUser() {
        List<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");
        userList.add("user4");
        userList.add("user5");
        userList.add("user6");
        userList.add("user7");
        userList.add("user8");
        userList.add("user9");
        userList.add("user10");

        return userList;
    }

    @GetMapping("user/{user}")
    public String listAllUser(@PathVariable String user) {
        return user;
    }
}
