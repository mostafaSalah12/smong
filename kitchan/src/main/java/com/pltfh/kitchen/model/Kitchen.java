package com.pltfh.kitchen.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Kitchen {
	@Id
	private String id;
	@Indexed
	private String kitchanName;
	private String kitchenPhoto;
	private String kitchenDescription;
	private boolean hasDelivery;
	@DBRef
	private List<KitchenImages> kitchanImages;
	@DBRef
	private Location kitchanLocation;
	

}
