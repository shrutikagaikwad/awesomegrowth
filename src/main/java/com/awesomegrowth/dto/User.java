package com.awesomegrowth.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Users")

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	Long user_id;
	String name;
	Long phone_number;
	String email;
	String password;
	

}
