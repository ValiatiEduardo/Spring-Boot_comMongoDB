package com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.Repository;

import com.SpringBoot_comMongoDB.SpringBoot_comMongoDB.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
