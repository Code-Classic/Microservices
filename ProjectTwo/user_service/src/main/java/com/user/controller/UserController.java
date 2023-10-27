package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = this.userService.getUser(userId);
		
		/* 
		 * We are calling the Contact service from user service by creating a bean for RestTemplate in UserServiceApplication class.
		 * We then autowire the RestTemplate here in the UserController class.
		 * Using the restTemplate variable we are calling the contact service endpoint on a different service 
		 * to fetch the contacts of the users. http://localhost:9002/contact/user/1311
		*/
		List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
		
		user.setContacts(contacts);
		return user;
	}
}
