package com.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
