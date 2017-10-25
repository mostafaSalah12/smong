package com.pltfh.kitchen.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class City {
	@Id
	private String id;
	@Indexed
	private String cityName;
	@DBRef
	private Country country;

}
