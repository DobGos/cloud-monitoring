package com.hearuexperts.cloud.monitoring.backend.api;

import com.hearuexperts.cloud.monitoring.backend.domain.User;
import com.hearuexperts.cloud.monitoring.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/users", produces = "application/json")
    public List<User> getUserList() {
        return userService.getUsers();
    }
}