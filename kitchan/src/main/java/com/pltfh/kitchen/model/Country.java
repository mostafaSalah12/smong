package com.pltfh.kitchen.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Country {
	@Id
	private String id;
	@Indexed
	private String countryName;

}
