package com.pltfh.kitchen.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class OrderStatus {
	@Id
	private String id;
	private String status;
}
