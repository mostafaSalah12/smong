package com.pltfh.kitchen.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {
	@Id
	private String id;
	@Indexed
	private String locationName;
	@DBRef
	private City city;
	@DBRef
	private List<Kitchan> kitchans;
	

}
