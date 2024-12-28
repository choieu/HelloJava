package com.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.start.dto.UserDto;
import com.start.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
public class Usercontroller {
	
	private UserService userService;

	@GetMapping(value = "/save")
	public String saveForm() {
		
		return "save";
	}
	
	@PostMapping(value = "/save")
	public String save(UserDto userDto) {
		  System.out.println("UserController.save");
	      System.out.println("userDto = " + userDto);
	      return "index"; //추후 연결
		
	}
	
	/**	@PostMapping(value = "/save")
	public String save(@RequestParam("userId") String userId,
			@RequestParam("userPassword") String userPassword,
            @RequestParam("userName") String userName) {
		  System.out.println("UserController.save");
	      System.out.println("userId = " + userId + ", userPassword = " + userPassword + ", userName = " + userName);
	      return "값 얻기 성공"; //추후 연결
		
	}**/
}

