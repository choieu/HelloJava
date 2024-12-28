package com.start.entity;

import com.start.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usertb")
public class UserEntity {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private String Name;
	
	@Column
	private String Email;
	
	@Column
	private String Password;
	
	@Column
	private String phone;

}
