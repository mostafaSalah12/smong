package com.pltfh.kitchen.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Order {
	
	@Id
	private String id;
	@Indexed
	private String orderCode;
	private List<OrderItem> items;
	private double totalPriceBeforDiscount;
	private double totalPriceAfterDiscount;
	private double price;
	private Date orderDate;
	private OrderStatus orderStatus;
	
	

}
