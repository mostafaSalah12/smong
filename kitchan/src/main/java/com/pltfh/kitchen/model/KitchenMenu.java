package com.pltfh.kitchen.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class KitchenMenu {
	
	@Id
	private String id;
	private List<MenuSection> menuSections;
	

}
