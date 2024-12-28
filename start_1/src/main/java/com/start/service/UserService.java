package com.start.service;

import org.springframework.stereotype.Service;

import com.start.dto.UserDto;
import com.start.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private UserRepository userRepository;
	
	public void save(UserDto userDto) {
		
	}
}
