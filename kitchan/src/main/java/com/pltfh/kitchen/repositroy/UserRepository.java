package com.pltfh.kitchen.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pltfh.kitchen.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
