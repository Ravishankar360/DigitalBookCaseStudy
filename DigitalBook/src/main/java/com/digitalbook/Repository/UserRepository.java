package com.digitalbook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.digitalbook.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("Select u from User u where u.userEmail =:userEmail")
	User findByEmailUser(String userEmail);

}
