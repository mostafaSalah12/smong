package com.pltfh.kitchen.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class OrderItem {
	@Id
	private String id;
	@Indexed
	private String itemName;
	private String note;
	private double itemPrice;
	private double priceAfterDiscount;
	private Date orderItemDate;
	private int qty;
	private double weight;
	
	
}
