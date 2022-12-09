package com.linkcode.userregister.services;

import java.util.Set;

import com.linkcode.userregister.model.User;
import com.linkcode.userregister.model.UserRole;

public interface UserService {
	//crerate here 1 user can have many roles
		public User createUser(User user, Set<UserRole> userRoles) throws Exception;
		
		//user by usernmae
		public User getUser(String username);
		
		//delete user id
		public void deleteUser(int id);

}
