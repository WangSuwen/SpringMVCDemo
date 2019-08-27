package com.wxq.controller;

import com.google.gson.Gson;
import com.wxq.entity.User;
import com.wxq.serviceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class LoginController {
    Gson gson = new Gson();
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET}, produces = "text/html;charset=UTF-8")
    public String login(String account) {
        return gson.toJson(account);
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String getUserById (int id) {
        User user = userService.getUserById(id);
        String jsonUser = gson.toJson(user);
        return jsonUser;
    }
}
