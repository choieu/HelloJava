package com.example.start.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {

/**	@GetMapping(value = "/save")
	public String saveForm() {
		System.out.println("왔다!");
		return "save";
	}
**/	
	@PostMapping(value = "/save")
	public String save(@RequestParam("userId") String userId,
			@RequestParam("userPassword") String userPassword,
            @RequestParam("userName") String userName) {
		  System.out.println("UserController.save");
	      System.out.println("userId = " + userId + ", userPassword = " + userPassword + ", userName = " + userName);
	      return "값 얻기 성공"; //추후 연결
		
	}
		
}
