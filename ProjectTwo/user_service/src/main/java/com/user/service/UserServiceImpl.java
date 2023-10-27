package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> list = List.of(
			new User(1311L,"Person 1","4234527111"),
			new User(1312L,"Person 2","4234527222"),
			new User(1313L,"Person 3","4234527333")
			);
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	

}
