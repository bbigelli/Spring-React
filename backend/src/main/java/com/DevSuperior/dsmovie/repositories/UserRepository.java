package com.DevSuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
	
	User findByEmail(String email);
}
