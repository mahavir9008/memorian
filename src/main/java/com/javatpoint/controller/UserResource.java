package com.javatpoint.controller;
import java.util.ArrayList;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.dao.UserDaoService;
import com.javatpoint.pojo.Users;  
@RestController  
public class UserResource   
{  
//private UserDaoService service;  
@GetMapping("/users")  
public List<Users> retriveAllUsers()  
{  
	
	
return null;
//List<Users> dat= new ArrayList
//return service.findAll();  
}  
//retrieves a specific user detail  
@GetMapping("/users/{id}")  
public Users retriveUser(@PathVariable int id)  
{  
	
	Users a = new Users();
	a.setId(1);
	a.setLastName("hello");
	a.setName("asddd");
	return a;
//return service.findOne(id);  
}  
//method that posts a new user detail   
@PostMapping("/users")  
public void createUser(@RequestBody Users user)  
{  
//Users sevedUser=service.save(user);    
System.out.println("asdd"+user.id);
}  
}  