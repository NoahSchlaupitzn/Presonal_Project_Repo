package com.repository;

import com.models.UserCredentials;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserCredentials, Integer>{

	
}
