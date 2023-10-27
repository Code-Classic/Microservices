package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	//Manually Creating a list of contacts
	List<Contact> list = List.of(
			new Contact(1L,"abc@123.com","Person 1",1311L),
			new Contact(1L,"def@123.com","Person 1",1311L),
			new Contact(1L,"ghi@123.com","Person 1",1311L),
			new Contact(1L,"jkl@123.com","Person 2",1312L),
			new Contact(1L,"mno@123.com","Person 2",1312L),
			new Contact(1L,"pqr@123.com","Person 2",1312L),
			new Contact(1L,"stu@123.com","Person 3",1313L),
			new Contact(1L,"vwx@123.com","Person 3",1313L),
			new Contact(1L,"xyz@123.com","Person 3",1313L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return this.list.stream()
				.filter(contact -> contact
						.getUserId().equals(userId))
				.collect(Collectors.toList());
	}
	
}
