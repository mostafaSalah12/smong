package com.pltfh.kitchen.repositroy;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pltfh.kitchen.model.KitchenImages;

@Repository
public interface KitchanImagesRepository extends MongoRepository<KitchenImages, String>{

}
