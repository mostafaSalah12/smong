package com.pltfh.kitchen.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pltfh.kitchen.model.UserRole;


@Repository
public interface UserRoleRepository extends MongoRepository<UserRole, String> {

}
