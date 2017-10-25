package com.pltfh.kitchen.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class KitchanImages {

	@Id
	private String id;
	private String imageURL;
	
}
