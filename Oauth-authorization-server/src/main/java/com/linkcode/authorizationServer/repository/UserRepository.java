package com.linkcode.authorizationServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkcode.authorizationServer.model.User;

//here in jpa we need to pass model and its ID(PK)
public interface UserRepository extends JpaRepository<User,Integer>{

	User findByUsername(String username);
	User findByEmail(String email);

}
