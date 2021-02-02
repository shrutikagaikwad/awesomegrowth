package com.awesomegrowth.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.awesomegrowth.dto.User;


@Repository
public interface UserDao extends CrudRepository<User, Long> {

	List<User> findAll();
	
	User findByName(String name);
	Optional<User> findByUserId(Long id);
	
}
