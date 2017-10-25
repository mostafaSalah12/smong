package com.pltfh.kitchen.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pltfh.kitchen.model.Kitchan;

@Repository
public interface KitchanRepository extends MongoRepository<Kitchan, String> {

}
