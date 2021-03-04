package com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.Servises;

import com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.Repository.UserRepository;
import com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.domain.User;

import java.util.List;

public class UserServises {

    private UserRepository repository;

    public List<User> findall(){
        return repository.findAll();
    }
}
