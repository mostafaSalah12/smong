package com.pltfh.kitchen.model;



import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection = "users")
@Data
public class User {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	@Indexed(unique = true)
	private String email;
	private String password;
	private String facebookToken;
	private String googleToken;
	private String activationText;
	private String activationUrl;
	private String resetPasswordText;
	private String resetPasswordUrl;
	@Indexed
	private String mobile;
	private Date creationDate;
	private Date resetPasswordDate;
	private Date lastLoginDate;
	private String profileImage;
	private String gender;
	@DBRef
	List<UserRole> roles;
	private List<Location> locations;
	
	
	

}
