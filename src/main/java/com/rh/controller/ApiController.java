package com.rh.controller;

import com.rh.domain.PostJson;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String JSON(@RequestBody PostJson postJson) {

        return ("Parameter 1: " + postJson.getParam1() + "\n" + "Parameter 2: " + postJson.getParam2() + "\n" + "Parameter 3: " + postJson.getParam3());
    }



}
