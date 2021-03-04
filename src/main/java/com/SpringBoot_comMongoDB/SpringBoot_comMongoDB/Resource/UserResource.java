package com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.Resource;

import com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @Autowired
    private UserResource services;

    @GetMapping
    //findAll busca todos.
    public ResponseEntity<List<User>> findAll() {
        List<User> list = (List<User>) services.findAll();
        return ResponseEntity.ok().body(list);
    }
}
