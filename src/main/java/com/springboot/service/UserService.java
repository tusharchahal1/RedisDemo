package com.springboot.service;

import java.util.List;

import com.springboot.model.User;

public interface UserService {

	boolean saveUser(User user);

	List<User> fetchAllUsers();

	User fetchUserById(Long id);

	boolean deleteUser(Long id);

}
