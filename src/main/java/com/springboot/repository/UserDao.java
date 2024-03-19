package com.springboot.repository;

import java.util.List;

import com.springboot.model.User;

public interface UserDao {

	boolean saveUser(User user);

	List<User> fetchAllUsers();

	User fetchUserById(Long id);

	boolean deleteUser(Long id);

}
