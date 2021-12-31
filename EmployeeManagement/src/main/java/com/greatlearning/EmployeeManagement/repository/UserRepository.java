package com.greatlearning.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmployeeManagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User getUserByUsername(String username);

}
