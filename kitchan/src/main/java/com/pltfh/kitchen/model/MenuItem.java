package com.pltfh.kitchen.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class MenuItem {
	
	@Id
	private String id;
	@Indexed
	private String itemName;
	private String itemImage;
	private double qty;
	private double unitPrice;

}
