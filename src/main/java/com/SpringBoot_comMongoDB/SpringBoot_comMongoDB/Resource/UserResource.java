package com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.Resource;

import com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping
    //findAll busca todos
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "Maria DGG", "MARIA@GFGFG");
        User DUDU = new User("2", "Dudu DGG", "dudu@zIN");
        User eu = new User("3", "Gustavo", "Eduardo@hghgh.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, DUDU, eu));
        return ResponseEntity.ok().body(list);
    }
}
